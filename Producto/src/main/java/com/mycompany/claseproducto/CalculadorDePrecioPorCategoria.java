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
public class CalculadorDePrecioPorCategoria implements CalculadorDePrecio {
    private Categoria categoria;

    public CalculadorDePrecioPorCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    @Override
    public double calcularPrecioTotal(List<ClaseProducto> productos) {
        double total = 0;
        for (ClaseProducto producto : categoria.getProductos()) {
            total += producto.getPrecio() * producto.getCantidad();
        }
        return total;
    }
}
