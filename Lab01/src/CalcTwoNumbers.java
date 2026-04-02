import javax.swing.JOptionPane;

public class CalcTwoNumbers {
    public static void main(String[] args){
        String strNum1, strNum2;

        strNum1 = JOptionPane.showInputDialog(null,"Please input your first number");
        strNum2 = JOptionPane.showInputDialog(null,"Please input your second number");
        double num1= Double.parseDouble(strNum1);
        double num2= Double.parseDouble(strNum2);
       
        JOptionPane.showMessageDialog(null,num1+num2,"This is your sum",JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null,Math.abs(num1-num2),"This is your difference",JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null,num1*num2,"This is your product",JOptionPane.INFORMATION_MESSAGE);
        if(num2!=0){
            JOptionPane.showMessageDialog(null,num1/num2,"This is your quotient",JOptionPane.INFORMATION_MESSAGE);
        }else {
            JOptionPane.showMessageDialog(null, "Cannot divided by zero");
        }
        System.exit(0);
    }
}
