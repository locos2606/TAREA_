import java.util.Scanner;

public class ContraseMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ingresar contraceña: ");
        String contrasena1 = scanner.nextLine();
        System.out.print("Confirmacion de contraseña: ");
        String contrasena2 = scanner.nextLine();

        try {
            ValidarContrasena.validarContrasena(contrasena1, contrasena2);
            System.out.println("¡Contraseña válida!");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}