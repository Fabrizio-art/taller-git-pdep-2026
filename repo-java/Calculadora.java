/* Calculadora del taller de Git — Semana de la Ingeniería 2026
 *
 * Compilar y ejecutar:
 *     javac Calculadora.java
 *     java Calculadora
 */

public class Calculadora {

    public static int suma(int a, int b) {
        return a + b;
    }
    public static int resta(int a, int b) {
        return a - b;
    }
    public static int multiplicacion(int a, int b) {
        return a * b;
    }
    /* TODO: division — Día 2
     * Implementá division(a, b) justo debajo de este comentario.
     * Pensá qué tiene que pasar si b vale 0. */
        
    
    //fabrixhardcodingtutorials//normingelite
    
    
    
    public static void main(String[] args) {
        System.out.println("suma(2, 3) = " + suma(2, 3) + "   (esperado: 5)");
        System.out.println("resta(5, 3) = " + resta(5, 3) + "   (esperado: 2)");
        
        /* Cuando implementes una función, descomentá su línea de acá abajo. */
         System.out.println("multiplicacion(4, 3) = " + multiplicacion(4, 3) + "   (esperado: 12)");
        // System.out.println("division(10, 2) = " + division(10, 2) + "   (esperado: 5)");
    }
}
