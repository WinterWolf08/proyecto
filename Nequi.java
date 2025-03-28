/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.poli.ejemplo1.project;

/**
 * Clase para manejar pagos con Nequi.
 * 
 * @autor USUARIO
 */
public class Nequi {
    /**
     * Realiza un pago con Nequi.
     * 
     * @param monto El monto a pagar.
     * @return Un mensaje indicando el resultado del pago.
     */
    public String realizarPago(final double monto) {
        if (monto <= 0) {
            return "El monto debe ser mayor que cero.";
        }
        try {
            // Lógica del pago
            return "Pago realizado con Nequi por la cantidad de: " + monto;
        } catch (Exception e) {
            return "Error al realizar el pago con Nequi: " + e.getMessage();
        }
    }
}
