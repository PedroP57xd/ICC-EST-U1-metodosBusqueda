import models.Persona;
import controllers.MetodosBusqueda;

public class App {
    public static void main(String[] args) throws Exception {
        Persona[] personass = new Persona[7];
        personass[0]=new Persona(101, "Juan");
        personass[1]=new Persona(102, "Maria");
        personass[2]=new Persona(103, "Carlos");
        personass[3]=new Persona(104, "Ana");
        personass[4]=new Persona(105, "Luis");
        personass[5]=new Persona(106, "Sofia");
        personass[6]=new Persona(107, "Pedro");
        MetodosBusqueda mB=new MetodosBusqueda(personass);
        




        /*
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
        }*/

    }
}
