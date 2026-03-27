import javax.swing.JOptionPane;
import java.util.Arrays;

public class ArrayProcess {
    public static void main(String[] args) {

        // input number of elements
        int n = Integer.parseInt(
                JOptionPane.showInputDialog("Enter number of elements:")
        );

        int[] arr = new int[n];

        // input elements
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(
                    JOptionPane.showInputDialog("Enter element " + (i + 1) + ":")
            );
        }

        // sort array
        Arrays.sort(arr);

        // calculate sum
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }

        // calculate average
        double avg = (double) sum / n;

        // show result
        JOptionPane.showMessageDialog(null,
                "Sorted array: " + Arrays.toString(arr) +
                "\nSum: " + sum +
                "\nAverage: " + avg
        );

        System.exit(0);
    }
}