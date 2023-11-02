public class validatematrix {
    public static void main(String[] args) {
        int[][] matrix1 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int[][] matrix2 = {
            {1, 2, 3},
            {4, 5, 6},
        };

        try {
            validateSquareMatrix(matrix1);
            System.out.println("Matrix 1 is a square matrix.");
        } catch (NonSquareMatrixException e) {
            System.out.println("Matrix 1 is not a square matrix. " + e.getMessage());
        }

        try {
            validateSquareMatrix(matrix2);
            System.out.println("Matrix 2 is a square matrix.");
        } catch (NonSquareMatrixException e) {
            System.out.println("Matrix 2 is not a square matrix. " + e.getMessage());
        }
    }

    public static void validateSquareMatrix(int[][] matrix) throws NonSquareMatrixException {
        int rows = matrix.length;
        if (rows == 0) {
            throw new NonSquareMatrixException("The matrix is empty.");
        }

        int columns = matrix[0].length;
        if (rows != columns) {
            throw new NonSquareMatrixException("The matrix is not square.");
        }
    }
}

class NonSquareMatrixException extends Exception {
    public NonSquareMatrixException(String message) {
        super(message);
    }
}
