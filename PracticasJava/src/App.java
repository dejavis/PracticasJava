import javax.swing.JOptionPane;
public class App {
    public static void main(String[] args) throws Exception {
        //int a,b;
        String a=JOptionPane.showInputDialog(null,"Introduce primer numero: ");
        int numa = Integer.parseInt(a);
        String b=JOptionPane.showInputDialog(null,"Introduce otro numero: ");
        int numb = Integer.parseInt(b);
        JOptionPane.showMessageDialog(null, "La suma es: "+(numa+numb));
    }
}