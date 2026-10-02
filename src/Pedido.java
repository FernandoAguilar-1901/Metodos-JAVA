import java.util.Scanner;

public class Pedido {

    // Reglas de negocio
    static final double MONTO_MINIMO = 1000;
    static final double DESCUENTO = 0.10;

    public static void main(String[] args) {

        // Creamos objeto Scanner
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa el precio del producto: ");
        double precio = sc.nextDouble();

        System.out.print("Ingresa la cantidad de productos: ");
        int cantidad = sc.nextInt();

        // Validamos que el precio y la cantidad se envíen en un formato correcto
        if(precio <= 0 || cantidad <= 0){
            System.out.println("ERROR: El precio o la cantidad no pueden ser 0 ni negativo.");
        } else {
            // Se calcula el subtotal tomando el valor del precio y la cantidad. Guardo el resultado.
            double subtotal = calcularSubtotal(precio, cantidad);

            // Se calcula el total en base al subtotal calculado previamente.
            double total = calcularTotal(subtotal);

            // Se mandan los resultados de subtotal y total para mostrarlos en pantalla
            detalleCompra(subtotal, total);
        }// else

        sc.close();
    }// main

    // Ejercicio modularizado: separamos cada responsabilidad en un método diferente.

    // Método que se encarga de calcular el subtotal
    static double calcularSubtotal(double precio, int cantidad){
        double subtotal = precio * cantidad;
        return subtotal;
    }// calcularSubtotal

    // Método que se encarga de calcular el total de la compra, basándose en el subtotal
    static double calcularTotal(double subtotal){
        double total = 0;

        if(subtotal >= MONTO_MINIMO){
            total = subtotal - (subtotal * DESCUENTO);
        } else {
            total = subtotal;
        }// else

        return total;
    }// calcularTotal

    // Método que imprime los datos de la compra en pantalla
    static void detalleCompra(double subtotal, double total){

        System.out.println("\n-=========== Resumen de compra ===========-");
        System.out.println("Subtotal: " + subtotal);

        if(subtotal >= MONTO_MINIMO){
            System.out.println("Descuento del 10% aplicado.");
        } else {
            System.out.println("Sin descuento aplicado.");
        }// else

        System.out.printf("Total: $%.2f%n", total);
    }// detalleCompra


}// class Pedido