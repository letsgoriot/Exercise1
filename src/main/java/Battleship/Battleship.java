package Battleship;

public class Battleship {
    public int[][] createBoard(int matrixLength) {
        int[][] matrix = new int[matrixLength][matrixLength];
        for (int i = 0; i < matrixLength; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = j;
            }
        }
        return matrix;
    }
    //TODO later after class ship is created
    public static void fillBoardWithShips() {

    }

    public static void checkShipPlacement(int[][] matrix, int a, int b) {
        if (matrix[a][b] == 1) {
            matrix[a][b] = 2;
            System.out.println("Hit");
        }
        if (matrix[a][b] == 0) {
            System.out.println("Missed");
        }

    }
}
