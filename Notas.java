package Triangulo;
import javax.swing.JOptionPane;

public class Notas {
    public static void main(String[] args) {
        String valor1;
        String valor2;
        String valor3;
        int n1;
        int n2;
        int n3;
    
        valor1 = JOptionPane.showInputDialog("Digite sua primeira nota");
        valor2 = JOptionPane.showInputDialog("Digite sua segunda nota");
        valor3 = JOptionPane.showInputDialog("Digite sua terceira nota");
        n1 = Integer.parseInt(valor1);
        n2 = Integer.parseInt(valor2);
        n3 = Integer.parseInt(valor3);


        JOptionPane.showMessageDialog(null, (n1+ n2 + n3) / 3 );


    }
    
}
