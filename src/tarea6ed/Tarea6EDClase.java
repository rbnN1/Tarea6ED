package tarea6ed;

public class Tarea6EDClase {

    private static final double DESCUENTO_MENOR = 0.95;
    private static final double DESCUENTO_MAYOR = 0.8;
    private static final int LIMITE_DESCUENTO = 3;

    public void aplicarDescuento(double precioProducto, int numProductos) {
        double total;
        if (numProductos > LIMITE_DESCUENTO) {
            precioProducto -= 5;
        }
        if (numProductos != 0) {
            total = precioProducto * DESCUENTO_MAYOR;
            imprimeTotal(total);
        } else {
            total = precioProducto * DESCUENTO_MENOR;
            imprimeTotal(total);
        }

    }



    private void imprimeTotal(double Total) {
        System.out.println("El total a pagar es:" + Total);
        System.out.println("Enviado");
    }
}
