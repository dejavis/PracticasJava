import javax.swing.JOptionPane;

public class MetodosCadenas24 {
    public static void main(String[] args) throws Exception {
        final String frase = "hola";
        String cadena = JOptionPane.showInputDialog(null, "Introduce palabra");
        int contarletras = cadena.length();
        if(cadena.equals(frase)){
        JOptionPane.showMessageDialog(null,"Son las mismas palabras");
        }else{
        JOptionPane.showMessageDialog(null,"No son las mismas palabras");    
        }
        JOptionPane.showMessageDialog(null, "Tiene: " + contarletras+" letras\n"+"En mayusculas es: "+cadena.toUpperCase());
    }
}