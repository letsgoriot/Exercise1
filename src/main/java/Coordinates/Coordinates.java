package Coordinates;

//TODO Посчитать сумму смежных координат: [i-1][j], [i+1][j], [i][j-1], [i][j+1].
public class Coordinates {
    public static void main(String[] args) {
        int[][] matrix = createMatrix(10);
        System.out.println(sumMatrix(matrix));
        printMatrixDiagonal(matrix);
        printCellCoordinate(matrix);
    }

    public static int[][] createMatrix(int matrixLength) {
        int[][] matrix = new int[matrixLength][matrixLength];
        for (int i = 0; i < matrixLength; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = j;
            }
        }
        return matrix;
    }

    public static int sumMatrix(int[][] matrix) {
        int sum = 0;
        int coordinate = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < coordinate; j++) {
                sum += matrix[i][j];
            }
            coordinate += 1;
        }
        return sum;
    }

    public static void printMatrixDiagonal(int[][] matrix) {
        int coordinate = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == coordinate && j == coordinate) {
                    System.out.println(matrix[i][j]);
                }
            }
            coordinate += 1;
        }
    }

    public static void printCellCoordinate(int[][] matrix) {
        int coordinate = 0;
        for (int i = 0; i < matrix.length; i++) {
            if (coordinate == 0) {
                System.out.println(coordinate + 1);
            } else if (coordinate == matrix.length) {
                System.out.println(coordinate - 1);
            } else {
                System.out.println((coordinate - 1) + "," + (coordinate + 1));
            }
            coordinate += 1;
        }
    }
}








