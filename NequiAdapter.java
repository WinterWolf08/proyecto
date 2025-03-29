/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.poli.edu.ejemplo1.modelo.payment;

public class NequiAdapter implements PaymentAdapter {
    @Override
    public String processPayment(double amount) {
        // Lógica para procesar el pago con Nequi
        return "Pago de " + amount + " procesado con Nequi.";
    }
}
