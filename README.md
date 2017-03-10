# Batwoman 
Bayan Berri, Alison Lee, Truc Dao

## BIG OH HYPOTHESIS: 
### Best Case: 
<p> In the best case, the runtime would be O( nlogn ). The array would be split fairly evenly in half every time the recursive function is called, and the function will be called logn times to reach array.length arrays of size 1. It will require O(n) time to process since the timing depends on the number of elements in the array. Therefore, the best case would be O( nlogn ).
</p>
### Average Case: 
<p> The average runtime would be O( nlogn ).
</p>
### Worst Case: 
<p> In a worse case scenario, the runtime would be O( n^2 ). It happens when the pivot happens to be the leftmost (smallest) or rightmost (largest) element in the array. In each recursive step of the partition method, the size of the sub-array decreases by 1. The partition method has to be run n times, and the partition itself is of n runtime. 
</p>
	
## METHODOLOGY: 
<p> 
We found the average runtimes by using a while loop that would find the time prior to sorting the array and the time afterwards and then subtract the start from the end time to get the duration. This while loop would run 1000 times and input the duration times into an array. We then averaged every number in the array to get an average runtime of 1000 runs. We also ran the method calls multiple times so that we can make sure there are no outliers and that the numbers are accurate.
Similar to the merge sort lab, the reason we had such a large batch size is because Java has to warm up in order to have accurate results and by averaging 1000 numbers it'll make the outliers insignificant. 
</p>

## TIME: </h2>
### Measurements (in nanoseconds): 
<ul>
<li> Size 1: 152.75 ns </li>
<li> Size 10: 1692.77 ns </li>
<li> Size 100: 14529.31 ns </li>
<li> Size 1000: 181790.26 ns </li>
<li> Size 10000: 3408381.90 ns </li>
<li> Size 100000: 26873799.17 ns </li>
</ul>
[Here's the link to our graph](https://docs.google.com/spreadsheets/d/13wZUcwG4aK7ntx7dYntibAHIJjl5OnhcnOA6HPk6tEw/edit?usp=sharing) 

### Effects of pivot selection and data arrangement on execution time 
<p> Execution time takes longer if the selected pivot's value is the least or greatest element in the array. The best case would be if the pivot was the center value (median). 
</p>
