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
	/*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ slide the bar- you know what to do~~~~~~~~~~~~~~~
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
	
	int[] arr10=new int[10];
	System.out.println("average for n=10)");	
	System.out.println(getAvg(getSum(getVals(pop(arr10)))));
	System.out.println("average for n=10)");	
	System.out.println(getAvg(getSum(getVals(pop(arr10)))));
	System.out.println("average for n=10)");	
	System.out.println(getAvg(getSum(getVals(pop(arr10)))));
	System.out.println("average for n=10)");	
	System.out.println(getAvg(getSum(getVals(pop(arr10)))));
	System.out.println("average for n=10)");	
	System.out.println(getAvg(getSum(getVals(pop(arr10)))));
	System.out.println("average for n=10)");	
	System.out.println(getAvg(getSum(getVals(pop(arr10)))));
	System.out.println("average for n=10)");	
	System.out.println(getAvg(getSum(getVals(pop(arr10)))));


	int[] arr100=new int[100];
	System.out.println("average for n=100)");
	System.out.println(getAvg(getSum(getVals(pop(arr100)))));
	System.out.println("average for n=100)");
	System.out.println(getAvg(getSum(getVals(pop(arr100)))));
	System.out.println("average for n=100)");
	System.out.println(getAvg(getSum(getVals(pop(arr100)))));
	System.out.println("average for n=100)");
	System.out.println(getAvg(getSum(getVals(pop(arr100)))));
	System.out.println("average for n=100)");
	System.out.println(getAvg(getSum(getVals(pop(arr100)))));

	

	int[] arr1000=new int[1000];
	System.out.println("average for n=1,000)");
	System.out.println(getAvg(getSum(getVals(pop(arr1000)))));

	System.out.println("average for n=1,000)");
	System.out.println(getAvg(getSum(getVals(pop(arr1000)))));

	System.out.println("average for n=1,000)");
	System.out.println(getAvg(getSum(getVals(pop(arr1000)))));

	System.out.println("average for n=1,000)");
	System.out.println(getAvg(getSum(getVals(pop(arr1000)))));

	System.out.println("average for n=1,000)");
	System.out.println(getAvg(getSum(getVals(pop(arr1000)))));

	System.out.println("average for n=1,000)");
	System.out.println(getAvg(getSum(getVals(pop(arr1000)))));
	
	System.out.println("average for n=1,000)");
	System.out.println(getAvg(getSum(getVals(pop(arr1000)))));
	*/
	/*
	int[] arr10000=new int[10000];
	System.out.println("average for n=10,000)");
	System.out.println(getAvg(getSum(getVals(pop(arr10000)))));

	
	System.out.println("average for n=10,000)");
	System.out.println(getAvg(getSum(getVals(pop(arr10000)))));
	
	System.out.println("average for n=10,000)");
	System.out.println(getAvg(getSum(getVals(pop(arr10000)))));
	
	System.out.println("average for n=10,000)");
	System.out.println(getAvg(getSum(getVals(pop(arr10000)))));
	
	System.out.println("average for n=10,000)");
	System.out.println(getAvg(getSum(getVals(pop(arr10000)))));
        */
	int[] arr100000=new int[100000];
	System.out.println("average for n=100,000)");
	System.out.println(getAvg(getSum(getVals(pop(arr100000)))));
	
	System.out.println("average for n=100,000)");
	System.out.println(getAvg(getSum(getVals(pop(arr100000)))));
	
	System.out.println("average for n=100,000)");
	System.out.println(getAvg(getSum(getVals(pop(arr100000)))));
	
	System.out.println("average for n=100,000)");
	System.out.println(getAvg(getSum(getVals(pop(arr100000)))));
	
	System.out.println("average for n=100,000)");
	System.out.println(getAvg(getSum(getVals(pop(arr100000)))));
	
	/*
	int[] arr1000000=new int[1000000];
	System.out.println("average for n=1,000,000)");
	System.out.println(getAvg(getSum(getVals(pop(arr1000000)))));
        
	System.out.println("average for n=1,000,000)");
	System.out.println(getAvg(getSum(getVals(pop(arr1000000)))));
        
	System.out.println("average for n=1,000,000)");
	System.out.println(getAvg(getSum(getVals(pop(arr1000000)))));
        
	System.out.println("average for n=1,000,000)");
	System.out.println(getAvg(getSum(getVals(pop(arr1000000)))));
        
	System.out.println("average for n=1,000,000)");
	System.out.println(getAvg(getSum(getVals(pop(arr1000000)))));
        */

    }
}
