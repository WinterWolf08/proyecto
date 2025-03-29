/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package co.edu.poli.ejemplo1.project;

import co.poli.edu.ejemplo1.modelo.Pedido;
import co.poli.edu.ejemplo1.modelo.payment.Nequi;
import co.poli.edu.ejemplo1.modelo.payment.NequiAdapter;
import co.poli.edu.ejemplo1.modelo.payment.PayPal;
import co.poli.edu.ejemplo1.modelo.payment.PayPalAdapter;
import co.poli.edu.ejemplo1.modelo.payment.PaymentAdapter;

/**
 * Clase principal para ejecutar el proyecto.
 * 
 * @autor USUARIO
 */
public class Project {

    public static void main(final String[] args) {
        // Crear instancias de Nequi y PayPal
        final Nequi nequi = new Nequi();
        final PayPal paypal = new PayPal();

        // Crear adaptadores para Nequi y PayPal
        final PaymentAdapter nequiAdapter = new NequiAdapter(nequi);
        final PaymentAdapter paypalAdapter = new PayPalAdapter(paypal);

        // Crear una instancia de Pedido
        final Pedido pedido = new Pedido();

        // Configurar y procesar el pago con Nequi
        final String resultadoNequi = procesarPago(pedido, nequiAdapter, 100.0);
        System.out.println(resultadoNequi);

        // Configurar y procesar el pago con PayPal
        final String resultadoPayPal = procesarPago(pedido, paypalAdapter, 200.0);
        System.out.println(resultadoPayPal);
    }

    private static String procesarPago(final Pedido pedido, final PaymentAdapter adapter, final double monto) {
        pedido.setPaymentAdapter(adapter);
        pedido.processPayment(monto);
        return "Pago procesado con " + adapter.getClass().getSimpleName() + ": $" + monto;
    }
}
