/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.claseproducto;


import java.util.List;

/**
 *
 * @author strdh
 */
public class CalculadorDePrecioConDescuento   implements CalculadorDePrecio {
    private double descuento; 
    
    public CalculadorDePrecioConDescuento(double descuento) {
        this.descuento = descuento;
    }

    @Override
    public double calcularPrecioTotal(List<ClaseProducto> productos) {
        double total = 0;
        for (ClaseProducto producto : productos) {
            total += producto.getPrecio() * producto.getCantidad();
        }
        return total * (1 - descuento / 100);
    }
}

