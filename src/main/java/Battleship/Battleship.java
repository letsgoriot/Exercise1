package Battleship;

import jdk.nashorn.internal.runtime.regexp.joni.exception.JOniException;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Battleship {
    public static void main(String[] args) {
        Person p1 = new Person("Joe", "src/main/resources/data/battleship/test.txt");
        Person p2 = new Person("Amy", "src/main/resources/data/battleship/test2.txt");
        printMatrixForAPerson(p1);
        System.out.println();
        printMatrixForAPerson(p2);
    }


    //TODO Создать 2 экземпляра класса Person, в конструктор передать переменные экземпляра, вывести полученную матрицу на экран
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

    public static void printMatrixForAPerson(Person person) {
        try {
            File PathToCard = new File(person.getPathToCard());
            FileReader fileReader = new FileReader(PathToCard);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

            bufferedReader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
