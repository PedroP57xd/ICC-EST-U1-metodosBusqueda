package views;
import java.util.Scanner;
public class ShowConsole {
    private Scanner scanner;

    public ShowConsole() {
        this.scanner = new Scanner(System.in);
        ShowBanner();
    }
    public void ShowBanner(){
        System.out.println("*** Metodos de Busqueda ***");
        
    }
    public int inputCode(){
        System.out.println("Ingrese el codigo de la Persona");
        int code = scanner.nextInt();
        return code;
    }
    public void showMessage(String message){
        System.out.println(message);
    }

}

