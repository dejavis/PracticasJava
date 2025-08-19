import javax.swing.JOptionPane;
public class Casteo13 {
    public static void main(String[] args) throws Exception {
        //int a,b;
        String a=JOptionPane.showInputDialog(null,"Introduce primer numero: ");
        int numa = Integer.parseInt(a);
        double doble1 = (double)numa;
        String b=JOptionPane.showInputDialog(null,"Introduce otro numero: ");
        int numb = Integer.parseInt(b);
        double doble2 = (double)numb;
        JOptionPane.showMessageDialog(null, "La suma es: "+(doble1+doble2));
    }
}