# Last updated: 7/14/2026, 2:43:37 PM
class Solution:
    def singleNumber(self, nums: List[int]) -> List[int]:
        xor = 0
        for num in nums:
            xor ^= num
        diff = xor & -xor

        a = 0
        b = 0
        for num in nums:
            if num & diff:
                a ^= num
            else:
                b ^= num

        return [a, b]