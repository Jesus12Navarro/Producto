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
public class Proveedor {
    private String nombre;
    private List<ClaseProducto> productos;

    public Proveedor(String nombre) {
        this.nombre = nombre;
        this.productos = new ArrayList<>();
    }

    public void añadirProducto(ClaseProducto producto) {
        productos.add(producto);
    }

    public List<ClaseProducto> getProductos() {
        return productos;
    }

    public String getNombre() {
        return nombre;
    }
}

