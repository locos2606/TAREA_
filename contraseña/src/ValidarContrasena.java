public class ValidarContrasena {

    public static void validarContrasena(String contrasena1, String contrasena2) {
        if (contrasena1.length() < 8) {
            throw new IllegalArgumentException("las contraseñas deben tener al menos 8 caracteres.");
        }
        if (contrasena1.contains(" ")) {
            throw new IllegalArgumentException("no se aseptan los espacios en blanco .");
        }
        if (!contrasena1.matches(".*[A-Z].*")) {
            throw new IllegalArgumentException("La contraseña debe contener al menos un carácter en mayúscula.");
        }
        if (!contrasena1.matches(".*\\d.*")) {
            throw new IllegalArgumentException("La contraseña debe contener al menos un número.");
        }
        if (!contrasena1.matches(".*[!@#$%^&*()_+\\[\\]{}|;:,.<>?~].*")) {
            throw new IllegalArgumentException("La contraseña debe contener al menos un carácter especial.");
        }
        if (!contrasena1.equals(contrasena2)) {
            throw new IllegalArgumentException("Las contraseñas no coinciden.");
        }
    }
}