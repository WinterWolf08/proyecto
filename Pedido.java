package co.poli.edu.ejemplo1.modelo.Model.co.poli.edu.ejemplo1.modelo;

import co.poli.edu.ejemplo1.modelo.Cliente;
import co.poli.edu.ejemplo1.modelo.payment.PaymentAdapter;
import java.io.*;
import java.util.*;

/**
 * 
 */
public class Pedido {

    /**
     * Default constructor
     */
    public Pedido() {
    }

    /**
     * 
     */
    private String numero;

    /**
     * 
     */
    private String fecha;

    /**
     * 
     */
    private Cliente cliente;

    /**
     * 
     */
    private ArrayList<Producto> producto;

    /**
     * 
     */
    private PaymentAdapter paymentAdapter;

    public void setPaymentAdapter(PaymentAdapter paymentAdapter) {
        this.paymentAdapter = paymentAdapter;
    }

    public String processPayment(double amount) {
        if (paymentAdapter != null) {
            paymentAdapter.processPayment(amount);
            return "Payment processed with amount: " + amount;
        } else {
            return "No se ha configurado un adaptador de pago.";
        }
    }
}
