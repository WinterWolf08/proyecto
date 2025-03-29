/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.poli.ejemplo1.project;

/**
 * Clase para manejar pagos con PayPal.
 * 
 * @autor USUARIO
 */
public class PayPal {
    /**
     * Envía un pago con PayPal.
     * 
     * @param amount El monto a pagar.
     * @return Un mensaje indicando el resultado del pago.
     */
    public String sendPayment(final double amount) {
        return "Pago realizado con PayPal por la cantidad de: " + amount;
    }
}
