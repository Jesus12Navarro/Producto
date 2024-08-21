/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.claseproducto;

/**
 *
 * @author strdh
 */
public class GestorDeDescuentos {
    private Descuento descuento;

    public GestorDeDescuentos(Descuento descuento) {
        this.descuento = descuento;
    }

    public double aplicarDescuento(double precio) {
        return descuento.aplicarDescuento(precio);
    }
}


