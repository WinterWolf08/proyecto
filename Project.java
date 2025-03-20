/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package co.edu.poli.ejemplo1.project;

import co.poli.edu.ejemplo1.modelo.Model.co.poli.edu.ejemplo1.modelo.Pedido;
import co.poli.edu.ejemplo1.modelo.payment.NequiAdapter;
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
        System.out.println("Procesando pago con Nequi:");
        pedido.setPaymentAdapter(nequiAdapter);
        pedido.processPayment(100.0);

        // Configurar y procesar el pago con PayPal
        System.out.println("Procesando pago con PayPal:");
        pedido.setPaymentAdapter(paypalAdapter);
        pedido.processPayment(200.0);
    }
}