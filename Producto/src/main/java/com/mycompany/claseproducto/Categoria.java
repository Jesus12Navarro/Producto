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
public class Categoria {
    private String nombre;
    private List<ClaseProducto> productos;

    public Categoria(String nombre) {
        this.nombre = nombre;
        this.productos = new ArrayList<>();
    }

    public void añadirProducto(ProductoAlimenticio producto1) {
        productos.add(producto1);
    }
    public void añadirProducto(ProductoElectronico producto2) {
        productos.add(producto2);
    }

    public List<ClaseProducto> getProductos() {
        return productos;
    }

    public String getNombre() {
        return nombre;
    }
}

