/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.claseproducto;

import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author strdh
 */
public class GestorDeInventario {
    private CalculadorDePrecio calculadorDePrecio;
    private List<ClaseProducto> productos;

    public GestorDeInventario(CalculadorDePrecio calculadorDePrecio) {
        this.calculadorDePrecio = calculadorDePrecio;
        this.productos = new ArrayList<>();
    }

    public void añadirProducto(ClaseProducto producto) {
        productos.add(producto);
    }

    public double calcularPrecioTotal() {
        return calculadorDePrecio.calcularPrecioTotal(productos);
    }

    public void setCalculadorDePrecio(CalculadorDePrecio calculadorDePrecio) {
        this.calculadorDePrecio = calculadorDePrecio;
    }
}

