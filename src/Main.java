
import java.util.Scanner;

/*
La superclase guardará en un atributo privado el texto, y deberá definir los respectivos métodos get y set.
Deberá tener dos constructores, uno sin argumentos que inicialice la cadena con el texto “práctica” y otro
con un argumento de tipo string para que al momento de crear el objeto, el usuario pueda asignar el valor.
o Extender la superclase, y en la nueva clase “CadenaTexto”:
• Capturar del usuario un número entero. Se guardará el número en un atributo privado, y deberá
definir los respectivos métodos get y set.
• Preguntar al usuario si quiere imprimir de manera horizontal o vertical. Usar el texto “V” para
vertical y “H” para horizontal. Guardar la petición en un atributo de tipo string. Con sus métodos
get y set.
• Deberá tener dos constructores, uno sin argumentos que inicialice el entero con el valor 10 y la
cadena con “H”, y otro con dos argumentos de tipo int y string para que al momento de crear el
objeto, el usuario pueda asignar los valores del atributo.
• Agregar un método “imprimeCadena”, sin argumentos, que imprima el texto de la super clase
“Captura”, en la cantidad y orientación definidos en la subclase “CadenaTexto”.
 */

/**
 *
 * @author Equipo Lollipop
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a;
        String b;
        String z;
        Scanner leer = new Scanner(System.in);
        CadenaTexto bObj= new CadenaTexto();
        bObj.imprimirCadena();
        CadenaTexto ob = new CadenaTexto();
        System.out.println("\nPosicion a escribir:"
        + "\n H (Horizontal)"
        + "\n V(Vertical)");
        z = leer.nextLine();
        ob.setPosicion(z);
        System.out.println("Texto a imprimir: ");
        b = leer.nextLine();
        ob.setTexto(b);
        System.out.println("Numero de veces: ");
        a = leer.nextInt();
        ob.setCantidad(a);
        ob.imprimirCadena();
        
    }
    
}
class CadenaTexto extends Captura{
    private int cantidad;
    private String posicion;

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }
    public CadenaTexto(){
        cantidad=10;
        posicion ="H";
    }
    public CadenaTexto(int cantidad, String posicion){
        this.cantidad = cantidad;
        this.posicion = posicion;
    }
    public void imprimirCadena(){
        if ("H".equals(posicion)){
            for (int i = 0; i < this.cantidad; i++) {
                System.out.print(" " + getTexto() + ",");
            }
        }
        else{
            if("V".equals(posicion)){
                for (int i = 0; i < this.cantidad; i++) {
                System.out.println(getTexto());
        }
        }
            else{
                System.out.println("Posicion incorrecta, digitar H o V ");
            }
}
    }
}
class Captura{
    private String texto;
    public Captura() {
        texto = " Practica";
    }
    public Captura(String x){
    texto = x;
    }
            
    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
   
    
}
