package co.poli.edu.ejemplo1.modelo.Model.co.poli.edu.ejemplo1.modelo;

import co.poli.edu.ejemplo1.modelo.Cliente;
import co.poli.edu.ejemplo1.modelo.payment.PaymentAdapter;
import java.util.ArrayList;

/**
 * Clase que representa un pedido.
 * 
 */
public class Pedido {

    /**
     * Constructor por defecto.
     */
    public Pedido() {
    }

    private String numero;
    private String fecha;
    private Cliente cliente;
    private ArrayList<Producto> producto;
    private PaymentAdapter paymentAdapter;

    public void setPaymentAdapter(final PaymentAdapter paymentAdapter) {
        this.paymentAdapter = paymentAdapter;
    }

    /**
     * Procesa el pago del pedido.
     * 
     * @param amount El monto a pagar.
     * @return Un mensaje indicando el resultado del pago.
     */
    public String processPayment(final double amount) {
        if (amount <= 0) {
            return "El monto debe ser mayor que cero.";
        }

        try {
            if (paymentAdapter != null) {
                return paymentAdapter.processPayment(amount);
            } else {
                return "No se ha configurado un adaptador de pago.";
            }
        } catch (Exception e) {
            return "Error al procesar el pago: " + e.getMessage();
        }
    }
}
