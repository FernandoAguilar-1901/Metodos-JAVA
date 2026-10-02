public class Solicitudes {

    public static void main(String[] args) {

        // Declaro mi arreglo con los estatus de las solicitudes
        String[] solicitudes = {"aprobada", "rechazada", "rechazada",
                "rechazada", "pendiente", "aprobada", "rechazada", "pendiente"};

        // Llamada a la función. Ya muestra directo los mensajes
        contarSolicitudes(solicitudes);
    }// main

    // Método para contar las solicitudes
    static void contarSolicitudes(String[] solicitudes){

        // Variables que permitirán ir guardando cuantas veces encontramos una solicitud aprobada, pendiente o rechazada
        int aprobadas = 0;
        int pendientes = 0;
        int rechazadas = 0;

        // Ciclo forEach que recorre cada solicitud del arreglo solicitudes
        for(String solicitud: solicitudes){

            // Switch que va a leer solicitud por solicitud
            switch(solicitud){

                // Si la solicitud es aprobada, sumamos uno al contador
                case "aprobada":
                    aprobadas += 1;
                    break;

                // Si la solicitud es pendiente, sumamos uno al contador
                case "pendiente":
                    pendientes += 1;
                    break;

                // Si la solicitud es rechazada, sumamos uno al contador
                case "rechazada":
                    rechazadas += 1;
                    break;

                // default por si se llega a escribir un dato del arreglo que no coincida con los anteriores
                default:
                    System.out.println("Estatus no reconocido");
            }// switch
        }// forEach

        // Resultados
        System.out.println("\n-====== Resumen de revisión ======-");
        System.out.println("Solicitudes aprobadas: " + aprobadas);
        System.out.println("Solicitudes pendientes: " + pendientes);
        System.out.println("Solicitudes rechazadas: " + rechazadas);
    }// contarSolicitudes

}// class Solicitudes
