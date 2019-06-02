'''
Time Complexity: O(N)
Space Complexity: O(1)

Author: Naveen Lalwani
'''
class Solution:    
    def maxSubArray(self, nums: List[int]) -> int:

        summation = nums[0]     # Variable to store maximum subarray sum.
        maximum = nums[0]       # Variable to store the sum on the subarray.
        
        '''
        Algorithm: We start with the second element in the list and we find if the new sum is greater than the current value or not, 
        if not, we choose the current value which implies, we start a new subarray from this number forward. We then compare if the
        current sum is bigger than the current maximum or not, and update maximum accordingly.
        '''
        for i in range(1, len(nums)):
            summation = max(summation + nums[i], nums[i])
            maximum = max(summation, maximum)
        return maximum 
