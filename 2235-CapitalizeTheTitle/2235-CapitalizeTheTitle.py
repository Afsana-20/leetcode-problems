# Last updated: 7/14/2026, 2:43:24 PM
class Solution:
    def capitalizeTitle(self, title: str) -> str:
        words = []

        for word in title.split():
            if len(word) <= 2:
                words.append(word.lower())
            else:
                words.append(word.capitalize())

        return " ".join(words)