/*Team Batwoman: Bayan Berri, Alison Lee, Truc Dao
  APCS2 pd4
  Lab01 -- What Does the Data Say?
  2017-03-10*/

public class QuickSortTester{
public static int[] pop(int[] arr){
	for(int i=0; i<arr.length; i++){
	    arr[i]= (int) (Math.random()*100);
	}
	return arr;
    }
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
    }
    public static double getSum(long[] dataSet){
	double sum=0;
	int ctr=0;
	while (ctr<1000){
	    sum+= dataSet[ctr];
	    ctr+=1;
	}
	return sum;
    }
    public static double getAvg(double sum){
	return sum/1000;
    }

    public static long time(){
	long time = System.nanoTime();
	time = System.nanoTime() - time;
	return time;
    }
    public static void main(String[] args){
    }
}
