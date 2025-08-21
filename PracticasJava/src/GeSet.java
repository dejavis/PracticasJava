import javax.swing.JOptionPane;
public class GeSet {
//private String nombre;
private int edad;
public GeSet(){

}
public void Geset(int edad){
this.edad=edad;
}
public int getEdad(){
    return edad;
}
public void setEdad(int edad){
    this.edad=edad;
}
public static void main(String[] args) {
    GeSet gs = new GeSet();
    gs.Geset(20);
    System.out.println("La edad es: "+gs.getEdad());
}
}