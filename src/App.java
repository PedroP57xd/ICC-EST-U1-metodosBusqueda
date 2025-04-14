import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int[] numeros = new int[20];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i + 1;
        }

        Scanner sc = new Scanner(System.in);
        MetodosBusqueda bL = new MetodosBusqueda();
        System.out.print("Ingrese el número a buscar (del 1 al 20): ");
        int valor = sc.nextInt();

        if (bL.busquedaLineal(numeros, valor) != -1) {
            System.out.println("El número buscado esta en la pocision: " + bL.busquedaLineal(numeros, valor));
        } else {
            System.out.println("Error 404. Número no encontrado.");
        }

    }
}
