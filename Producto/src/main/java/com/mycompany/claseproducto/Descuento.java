/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.claseproducto;

/**
 *
 * @author strdh
 */
public class Descuento {
    private double porcentajeDescuento;

    public Descuento(double porcentajeDescuento) {
        this.porcentajeDescuento = porcentajeDescuento;
    }

    public double aplicarDescuento(double precio) {
        return precio * (1 - porcentajeDescuento / 100);
    }
}

