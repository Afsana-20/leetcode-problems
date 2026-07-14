# Last updated: 7/14/2026, 2:43:21 PM
from collections import Counter
from typing import List

class Solution:
    def equalPairs(self, grid: List[List[int]]) -> int:
        rows = Counter(tuple(row) for row in grid)

        count = 0

        for col in zip(*grid):
            count += rows[col]

        return count