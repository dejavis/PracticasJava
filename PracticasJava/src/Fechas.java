import java.time.LocalDate;
import java.time.LocalTime;

import javax.swing.JOptionPane;

public class Fechas {
    public static void main(String[] args) {
        LocalDate ld = LocalDate.now();
        JOptionPane.showMessageDialog(null,"La fecha es: "+ld);
        //System.out.println("La fecha es: "+lt);
        LocalTime lt = LocalTime.now();
        JOptionPane.showMessageDialog(null,"La hora es: "+lt);
        
    }

}