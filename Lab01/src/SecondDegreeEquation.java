import javax.swing.JOptionPane;

public class SecondDegreeEquation {
    public static void main(String[] args) {

        double a = Double.parseDouble(
            JOptionPane.showInputDialog(null, "Enter a:")
        );
        double b = Double.parseDouble(
            JOptionPane.showInputDialog(null, "Enter b:")
        );
        double c = Double.parseDouble(
            JOptionPane.showInputDialog(null, "Enter c:")
        );

        // Case 1: quadratic (a ≠ 0)
        if (a != 0) {
            double delta = b * b - 4 * a * c;

            if (delta > 0) {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);

                JOptionPane.showMessageDialog(
                    null,
                    "Two solutions:\n" +
                    "x1 = " + x1 + "\n" +
                    "x2 = " + x2
                );
            }
            else if (delta == 0) {
                double x = -b / (2 * a);

                JOptionPane.showMessageDialog(
                    null,
                    "Double root:\n x = " + x
                );
            }
            else {
                JOptionPane.showMessageDialog(null, "No real solution");
            }

            return;
        }

        // Case 2: linear (b ≠ 0)
        if (b != 0) {
            double x = -c / b;
            JOptionPane.showMessageDialog(null, "Linear solution: x = " + x);
            return;
        }

        // Case 3: no solution
        if (c != 0) {
            JOptionPane.showMessageDialog(null, "No solution");
            return;
        }

        // Case 4: infinite solutions
        JOptionPane.showMessageDialog(null, "Infinite solutions");

        System.exit(0);
    }
}