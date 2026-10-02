import java.util.Scanner;

public class Accesos {

    // Acceso correcto
    static final String USUARIO_PRUEBA = "@recky59";
    static final String CONTRASENIA_PRUEBA = "SuperSafe123!";

    public static void main(String[] args) {

        //Creamos objeto Scanner
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa tu nombre de usuario: ");
        String usuario = sc.nextLine();

        System.out.print("Ingresa tu contraseña: ");
        String contrasenia = sc.nextLine();

        // Variable que va a guardar los intentos
        byte intentos = 1;
        final byte MAX_INTENTOS = 3;

        // Permite que intentos sea: 1, 2
        while(intentos <= MAX_INTENTOS){

            // validarCredenciales debería devolver false para ejecutar este bloque
            if(!validarCredenciales(usuario, contrasenia)){

                if(intentos == MAX_INTENTOS){
                    System.out.println("\nERROR: Haz alcanzado tu límite de intentos. Prueba más tarde.");
                    break;
                }// if

                System.out.println("\nERROR: Datos incorrectos. Intenta nuevamente.");
                System.out.println("Intentos restantes: " + (MAX_INTENTOS-intentos));
                System.out.println("=============================================");
                System.out.print("Ingresa tu usuario nuevamente: ");
                usuario = sc.nextLine();
                System.out.print("Ingresa tu contraseña nuevamente: ");
                contrasenia = sc.nextLine();
                intentos++;
            } else {
                System.out.println("Acceso concedido. Bienvenido de nuevo " + USUARIO_PRUEBA);
                break;
            }// else

        }// while

        System.out.println("Terminando... hecho.");

        sc.close();
    }// main

    static boolean validarCredenciales(String usuario, String contrasenia){

        if(!usuario.equalsIgnoreCase(USUARIO_PRUEBA) || !contrasenia.equals(CONTRASENIA_PRUEBA)){
            return false;
        }// if

        return true;
    }// validarCredenciales

}// class Accesos
