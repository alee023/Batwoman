/*Team Batwoman: Bayan Berri, Alison Lee, Truc Dao
  APCS2 pd4
  Lab01 -- What Does the Data Say?
  2017-03-10*/

public class QuickSortTester{

    // populates array w/ random nums 
public static int[] pop(int[] arr){
	for(int i=0; i<arr.length; i++){
	    arr[i]= (int) (Math.random()*100);
	}
	return arr;
    }
    // adds duration times into the array. Input is the array from pop
    public static long[] getVals(int[] arrpop){
	long[] data= new long[1000];
	int ctr= 1;
	while(ctr<=1000){
	    long startTime=System.nanoTime();
	    QuickSort.qsort(pop(arrpop));
	    long endTime=System.nanoTime();
	    long duration= (endTime-startTime);
	    data[ctr-1]=duration;
	    ctr+=1;
	}
	return data;
    } // sum of all times
    public static double getSum(long[] dataSet){
	double sum=0;
	int ctr=0;
	while (ctr<1000){
	    sum+= dataSet[ctr];
	    ctr+=1;
	}
	return sum;
    } // divides sum by num of duration times 
    public static double getAvg(double sum){
	return sum/1000;
    }

    public static long time(){ // returns duration times
	long time = System.nanoTime();
	time = System.nanoTime() - time;
	return time;
    }
    public static void main(String[] args){
	int[] arr1=new int[1];
	System.out.println("average for n=1)");
	System.out.println(getAvg(getSum(getVals(pop(arr1)))));
	System.out.println("average for n=1)");
	System.out.println(getAvg(getSum(getVals(pop(arr1)))));
	System.out.println("average for n=1)");
	System.out.println(getAvg(getSum(getVals(pop(arr1)))));
	System.out.println("average for n=1)");
	System.out.println(getAvg(getSum(getVals(pop(arr1)))));
	System.out.println("average for n=1)");
	System.out.println(getAvg(getSum(getVals(pop(arr1)))));
        

    }
}
