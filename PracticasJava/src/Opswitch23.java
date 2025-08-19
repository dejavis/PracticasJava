import javax.swing.JOptionPane;
public class Opswitch23 {
    public static void main(String[] args) throws Exception {
        String a=JOptionPane.showInputDialog(null,"Introduce dia: ");
        int opcion = Integer.parseInt(a);
        switch (opcion) {
            case 1 -> JOptionPane.showMessageDialog(null,"Lunes");
            case 2 -> JOptionPane.showMessageDialog(null,"Martes");
            case 3 -> JOptionPane.showMessageDialog(null,"Miercoles");
            case 4 -> JOptionPane.showMessageDialog(null,"Jueves");
            case 5 -> JOptionPane.showMessageDialog(null,"Viernes");
            case 6 -> JOptionPane.showMessageDialog(null,"Sabado");
            case 7 -> JOptionPane.showMessageDialog(null,"Domingo");
            default -> JOptionPane.showMessageDialog(null,"Sales del rango de dias");
        }
    }
}