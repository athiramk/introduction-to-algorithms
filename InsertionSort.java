/** 
 * Implementation of Insertion Sort algorithm.
 * This algorithm sorts an array of integers in ascending order.
 * It works by building a sorted portion of the array one element at a time.
 * * Time Complexity: O(n^2) in the worst case, O(n) in the best case. 
 *      c1 n + c2 n
 * * where n is the number of elements in the array.
 * * Space Complexity: O(1) as it sorts the array in place.
 * * Example usage:
 *   int[] array = {5, 2, 9, 1, 5, 6};
 *   InsertionSort.sort(array); 
 * 
 * 
A faster computer (computer A)
running insertion sort against a slower computer (computer B) running
merge sort. They each must sort an array of 10 million numbers.
(Although 10 million numbers might seem like a lot, if the numbers are
eight-byte integers, then the input occupies about 80 megabytes, which
fits in the memory of even an inexpensive laptop computer many times
over.) Suppose that computer A executes 10 billion instructions per
second (faster than any single sequential computer at the time of this
writing) and computer B executes only 10 million instructions per
second (much slower than most contemporary computers), so that
computer A is 1000 times faster than computer B in raw computing
power. To make the difference even more dramatic, suppose that the
world’s craftiest programmer codes insertion sort in machine language
for computer A, and the resulting code requires 2n2 instructions to sort
n numbers. Suppose further that just an average programmer
implements merge sort, using a high-level language with an inefficient
compiler, with the resulting code taking 50 n lg n instructions. To sort 10
million numbers, computer A takes 20,000 seconds(more than 5.5 hours) 
while computer B takes ~1162.5 seconds(under 20 minutes).
 * 
 * In this case, the faster computer A running insertion sort is
 * significantly slower than the slower computer B running merge sort.
*/
public class InsertionSort {
    public int[] sortArray(int[] nums) {
		int key,j;
        for(int i=1; i<nums.length; i++)
		{
			key = nums[i];
			for(j=i-1; j>=0 && nums[j]>key; j--)
			{
				nums[j+1] = nums[j];
			}
			nums[j+1] = key;
		}
		return nums;
    }

    public static void main(String[] args) {
        InsertionSort sorter = new InsertionSort();
        int[] nums = {5, 2, 9, 1, 5, 6};
        int[] sortedArray = sorter.sortArray(nums);
        for (int num : sortedArray) {
            System.out.print(num + " ");
        }
    }
}
