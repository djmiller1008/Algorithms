var spiralOrder = function(matrix) {
    let answer = [];
    let count = 0;
    let total = matrix.length * matrix[0].length
    let startRow = 0;
    let endRow = matrix.length - 1;
    let startCol = 0;
    let endCol = matrix[0].length - 1;

    while (count < total) {
        for (let i = startCol; i <= endCol; i++) {
            answer.push(matrix[startRow][i]);
            count++;
        }
        startRow++;

        for (let i = startRow; count < total && i <= endRow; i++) {
            answer.push(matrix[i][endCol]);
            count++;
        }
        endCol--;

        for (let i = endCol; count < total && i >= startCol; i--) {
            answer.push(matrix[endRow][i]);
            count++;
        }
        endRow--;

        for (let i = endRow; count < total && i >= startRow; i--) {
            answer.push(matrix[i][startCol]);
            count++;
        }
        startCol++;
    }
    return answer;
};