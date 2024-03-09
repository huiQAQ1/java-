import java.util.Scanner;
import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args){
      String name = JOptionPane.showInputDialog("sb");
        JOptionPane.showMessageDialog(null,"hello" + name);
        int age = Integer.parseInt (JOptionPane.showInputDialog("多大？"));
        String moot = age + "岁";
        JOptionPane.showMessageDialog(null,moot);
    }
}