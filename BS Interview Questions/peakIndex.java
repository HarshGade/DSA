 /*
    https://leetcode.com/problems/peak-index-in-a-mountain-array/    


    Question :- Peak Index in a Mountain Array  (Does not contains Duplicates)

    Also Known As BITONIC ARRAY :- Where the elements first Increases and then Decreases : example : [1,2,3,5,7,6,3,2]
    and in this we are asked to find the Largest element = 7 (for this question)
 
    Logic :- 
    1) The array is first sorted in Ascending and after taht is in Descending an in that only the Largest ele is there
    2) If element at middle-element > middle-element + 1 = You are in Decreasing part = The answer is going to lie on the Left hand side  = end = mid (checking left side) (not take end = mid-1 bcs might be possible that middle is the potential answer so we dont want to miss it ) 
    3) middle-element < mid-ele +1 = You are in Ascending part of array  (It is possible that greater element will lie on right hand side of the array) = start = mid+1 (here mid+1 cause we know we are in Ascending order so the we will get element which is greater on right hand side )
    4) When will loop break : bothe start and end pointer will lie on the same element 



    Code :- 
    class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int start = 0; 
        int end = arr.length-1;

        while(start<end){
            // middle element 
            int mid = start + (end-start)/2;
            if(arr[mid]>arr[mid+1]){
                // you are in descendin part of array 
                // this may be potential ans, but look at left 
                // this is why end != mid-1 (cause mid may be the potential anser)
                end = mid;
            }else{
                // u are in ascending part 
                start = mid+1; // we know mid+1 > mid
            }
        }
        // in end both the pointers are searching for max element 
        // hence when they are pointing to just one element that is the max element
        // so we can return start or end both are pointing to index of max element
        return start;
    }
}

*/



