import java.util.Scanner;

public class Normalizacion {

    // Valores de prueba
    final static String USUARIO_PRUEBA = "@recky59";
    final static String CONTRASENIA_PRUEBA = "SuperSafe123";


    public static void main(String[] args) {

        // Creamos objeto Scanner
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa tu nombre de usuario: ");
        String usuario = sc.nextLine();

        System.out.print("Ingresa tu contraseña: ");
        String contrasenia = sc.nextLine();

        // Validamos que se haya ingresado tanto el usuario como la contraseña
        if(usuario.isBlank() || contrasenia.isBlank()){
            System.out.println("ERROR: No se ingresó alguno de los datos. Inténtalo de nuevo.");
        } else {
            System.out.println("Valor ingresado: " + usuario);
            System.out.println("Usuario normalizado: " + normalizarUsuario(usuario));
            System.out.println("Datos válidos?: " + validarAcceso(usuario, contrasenia));
        }// else


        sc.close();
    }// main

    // Ejercicio 1: Normalización de usuarios
    static String normalizarUsuario(String usuario){
        String usuarioNormalizado = usuario.trim().toLowerCase();
        return usuarioNormalizado;
    }// normalizarUsuario

    // Ejercicio 2: Validación de claves de acceso
    static boolean validarAcceso(String usuario, String contrasenia){
        String usuarioNormalizado = normalizarUsuario(usuario);

        if(!usuarioNormalizado.equals(USUARIO_PRUEBA) || !contrasenia.equals(CONTRASENIA_PRUEBA)){
            return false;
        }// if

        return true;
    }// validarUsuario
}// class Normalizacion
