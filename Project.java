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
 *
 * @author USUARIO
 */
public class Project {

    public static void main(String[] args) {
        // Crear instancias de Nequi y PayPal
        Nequi nequi = new Nequi();
        PayPal paypal = new PayPal();

        // Crear adaptadores para Nequi y PayPal
        PaymentAdapter nequiAdapter = new NequiAdapter(nequi);
        PaymentAdapter paypalAdapter = new PayPalAdapter(paypal);

        // Crear una instancia de Pedido
        Pedido pedido = new Pedido();

        // Configurar y procesar el pago con Nequi
        String resultadoNequi = procesarPago(pedido, nequiAdapter, 100.0);
        System.out.println(resultadoNequi);

        // Configurar y procesar el pago con PayPal
        String resultadoPayPal = procesarPago(pedido, paypalAdapter, 200.0);
        System.out.println(resultadoPayPal);
    }

    private static String procesarPago(Pedido pedido, PaymentAdapter adapter, double monto) {
        pedido.setPaymentAdapter(adapter);
        pedido.processPayment(monto);
        return "Pago procesado con " + adapter.getClass().getSimpleName() + ": $" + monto;
    }
}
