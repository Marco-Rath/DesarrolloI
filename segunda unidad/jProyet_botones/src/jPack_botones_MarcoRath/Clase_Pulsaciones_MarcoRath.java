/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jPack_botones_MarcoRath;

public class Clase_Pulsaciones_MarcoRath {
    private int pulsar;

    public Clase_Pulsaciones_MarcoRath() {
        this.pulsar = 0;
    }

    public void setPulsaciones(int pulsaciones) {
        this.pulsar = pulsaciones;
    }

    public int getPulsaciones() {
        return pulsar;
    }

    public void incrementar() {
        pulsar++;
    }

    public void decrementar() {
        if (pulsar > 0) {
            pulsar--;
        }
    }

    public void reiniciar() {
        pulsar = 0;
    }

    public void aumentar(int cantidad) {
        pulsar += cantidad;
    }

    public void disminuir(int cantidad) {
        if (pulsar >= cantidad) {
            pulsar -= cantidad;
        } else {
            pulsar = 0;
        }
    }
}
