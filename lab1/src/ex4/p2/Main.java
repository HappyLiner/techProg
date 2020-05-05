package ex4.p2;

public class Main {

    public static void main(String[] args) {
        int[][] matrix = new int[3][3];
        fillMatrix(matrix);
        printMatrix(matrix);

        int[][] transpose_matrix = transpose(matrix);
        printMatrix(transpose_matrix);
    }

    public static void printMatrix(int[][] matrix) {
        for(int columns = 0; columns < 3; columns++){
            for(int rows = 0; rows < 3; rows++){
                System.out.print(matrix[columns][rows] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void fillMatrix(int[][] matrix){
        for(int columns = 0; columns < 3; columns++){
            for(int rows = 0; rows < 3; rows++){
                matrix[columns][rows] = (int) Math.round(Math.random() * 10);
            }
        }
    }

    public static int[][] transpose(int[][] matrix){
        int columns = matrix.length;
        int rows = matrix[0].length;
        int[][] transposeMatrix = new int[rows][columns];
        for(int i = 0; i < columns; i++){
            for(int j = 0; j < rows; j++){
                transposeMatrix[j][i] = matrix[i][j];
            }
        }
        return transposeMatrix;
    }
}