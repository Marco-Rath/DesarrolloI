
package jPack_Cuenta_MarcoRath;

import javax.swing.JOptionPane;

public class CuentaFacil {
     private String titular;
    private double cantidad;

    // Constructor sin parámetros
    public CuentaFacil() {
        titular = "";
        cantidad = 0.0;
    }

    // Constructor con el titular obligatorio y la cantidad opcional
    public CuentaFacil(String titular, double cantidad) {
        this.titular = titular;
        this.cantidad = cantidad;
    }

    // Métodos get y set para el titular y la cantidad
    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    // Método para depositar una cantidad en la cuenta
    public void depositar(double cantidad) {
        if (cantidad > 0) {
            this.cantidad += cantidad;
            System.out.println("Se ha depositado: " + cantidad);
        } else {
            System.out.println("No se puede depositar una cantidad menor o igual a 0.");
        }
    }

    // Método para retirar una cantidad de la cuenta
public boolean retirar(double cantidad) {
    if (cantidad <= this.cantidad) {
        this.cantidad -= cantidad;
        System.out.println("Se ha retirado: " + cantidad);
        System.out.println("Saldo actual: " + this.cantidad);
        return true;  // Retorno true si el retiro fue exitoso
    } else {
        System.out.println("Saldo insuficiente. No se puede retirar esa cantidad.");
        return false;  // Retorno false si el retiro no fue exitoso
    }
}
}
    
    
    

