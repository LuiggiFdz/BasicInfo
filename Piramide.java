import java.util.*;
/**
 *
 * @author LuiggiFernandez
 */
public class ActividadesInfo {

    /**
     * @param args the command line arguments
     */
    private static int r() {
        int x = (int) (Math.random()*8);
        return x;
    }
    public static void main(String[] args) {
        Scanner TECLADO = new Scanner (System.in);
        System.out.println("Ingrese el valor máximo de su pirámide");
        int V = TECLADO.nextInt();
        while (V >60 || V < 1) {
            System.out.println("Ingrese un valor numérico entre 1 y 60");
            V = TECLADO.nextInt();
        }
        String black="\033[30m"; 
        String red="\033[31m"; 
        String green="\033[32m"; 
        String yellow="\033[33m"; 
        String blue="\033[34m"; 
        String purple="\033[35m"; 
        String cyan="\033[36m"; 
        String white="\033[37m";
        String color[] = new String[]{black, red, green, yellow, blue, purple, cyan, white};
        String reset="\u001B[0m";
        int r = r();
        // triangulo original
        for (int i = 0; i <= V; i++) {
            for (int k = V - i; k > 0; k--) {
                System.out.print("");
            }
            for (int k = 0; k < i; k++) {
                System.out.print(color[r]+"* "+reset);
                r = r();
            }
            System.out.println("");
        }
        for (int i = V-1; i >= 0; i--) {
            for (int k = V - i; k > 0; k--) {
                System.out.print("");
            }
            for (int k = 0; k < i; k++) {
                System.out.print(color[r]+"* "+reset);
                r = r();
            }
            System.out.println("");
        }
        //triangulo invertido
        for (int i = 0; i <= V; i++) {
            for (int k = V - i; k > 0; k--) {
                System.out.print("  ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print(color[r]+" *"+reset);
                r = r();
            }
            System.out.println();
        }
        for (int i = V-1; i >= 0; i--) {
            for (int k = V - i; k > 0; k--) {
                System.out.print("  ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print(color[r]+" *"+reset);
                r = r();
            }
            System.out.println();
        }
        // piramide
        for (int i = 0; i <= V; i++) {
            for (int k = V - i; k > 0; k--) {
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print(color[r]+" *"+reset);
                r = r();
            }
            for (int k = V - i; k > 0; k--) {
                System.out.print("  ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print(color[r]+" *"+reset);
                r = r();
            }
            System.out.println();
        }
        // piramide invertida
        V *= 2;
        for (int i = V-1; i >= 0; i--) {
            for (int k = V - i; k > 0; k--) {
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print(color[r]+" *"+reset);
                r = r();
            }
            System.out.println();
        }
        V /= 2;
        // cuadrado
        for (int i = 0; i < V; i++) {
            for (int k = V - i; k > 0; k--) {
                System.out.print(color[r]+" *"+reset);
                r = r();
            }
            for (int k = 0; k < i; k++) {
                System.out.print(color[r]+" *"+reset);
                r = r();
            }
            System.out.println();
        }
    }
}
