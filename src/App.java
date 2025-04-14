import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int[] numeros = {10, 20, 30, 40, 50};

        Scanner sc = new Scanner(System.in);
        MetodosBusqueda bL = new MetodosBusqueda();
        System.out.print("Ingrese el número a buscar: ");
        int valor = sc.nextInt();

        // Llamada al método de la otra clase
        int posicion = bL.busquedaLineal(numeros, valor);

        if (posicion != -1) {
            System.out.println("Número encontrado en la posición: " + posicion);
        } else {
            System.out.println("Número no encontrado.");
        }

        sc.close();
    }
}
