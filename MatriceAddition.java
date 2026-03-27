import javax.swing.JOptionPane;

public class MatriceAddition {
    public static void main(String[] args) {

        // input rows and columns
        int rows = Integer.parseInt(
                JOptionPane.showInputDialog("Enter number of rows:")
        );
        int cols = Integer.parseInt(
                JOptionPane.showInputDialog("Enter number of columns:")
        );

        int[][] A = new int[rows][cols];
        int[][] B = new int[rows][cols];
        int[][] C = new int[rows][cols];

        // input matrix A
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                A[i][j] = Integer.parseInt(
                        JOptionPane.showInputDialog("A[" + i + "][" + j + "] = ")
                );
            }
        }

        // input matrix B
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                B[i][j] = Integer.parseInt(
                        JOptionPane.showInputDialog("B[" + i + "][" + j + "] = ")
                );
            }
        }

        // add matrices
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                C[i][j] = A[i][j] + B[i][j];
            }
        }

        // build result string
        String result = "Matrix A:\n";
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result += A[i][j] + " ";
            }
            result += "\n";
        }

        result += "\nMatrix B:\n";
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result += B[i][j] + " ";
            }
            result += "\n";
        }

        result += "\nSum (A + B):\n";
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result += C[i][j] + " ";
            }
            result += "\n";
        }

        // show result
        JOptionPane.showMessageDialog(null, result);

        System.exit(0);
    }
}