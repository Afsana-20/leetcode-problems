# Last updated: 7/14/2026, 2:43:19 PM
class Solution:
    def runningSum(self, nums: List[int]) -> List[int]:

        for i in range(1, len(nums)):
            nums[i] = nums[i] + nums[i - 1]

        return nums