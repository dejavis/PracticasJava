import javax.swing.JOptionPane;
public class Ciclofor {
    public static void main(String[] args) throws Exception {
        //int a,b;
        String a=JOptionPane.showInputDialog(null,"Cuantos numeros introduciras? ");
        int numa = Integer.parseInt(a);
        int numeros[] = new int[numa];
        int i=0;
        for (i = 0; i < numeros.length; i++) {
            String nums= JOptionPane.showInputDialog(null,"Numero ["+i+"]: ");
            numeros[i] = Integer.parseInt(nums);
        }
        for (i = 0; i < numeros.length; i++) {
            JOptionPane.showMessageDialog(null," "+numeros[i]);
        }
    }
}