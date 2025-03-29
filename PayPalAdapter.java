/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.poli.edu.ejemplo1.modelo.payment;

/**
 * Adaptador para pagos con PayPal.
 */
public class PayPalAdapter implements PaymentAdapter {
    @Override
    public String processPayment(final double amount) {
        // Lógica para procesar el pago con PayPal
        return "Pago de " + amount + " procesado con PayPal.";
    }
}
