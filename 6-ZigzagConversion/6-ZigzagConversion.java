// Last updated: 7/14/2026, 2:43:50 PM
class Solution {
    public String convert(String s, int numRows) {

        if (numRows == 1) return s;

        String[] rows = new String[numRows];

        for (int i = 0; i < numRows; i++) {
            rows[i] = "";
        }

        int currentRow = 0;
        boolean goingDown = false;

        for (char c : s.toCharArray()) {

            rows[currentRow] += c;

            if (currentRow == 0 || currentRow == numRows - 1) {
                goingDown = !goingDown;
            }

            if (goingDown) {
                currentRow++;
            } else {
                currentRow--;
            }
        }

        String result = "";

        for (int i = 0; i < numRows; i++) {
            result += rows[i];
        }

        return result;
    }
}