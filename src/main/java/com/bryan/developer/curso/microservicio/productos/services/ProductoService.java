package com.bryan.developer.curso.microservicio.productos.services;

import java.util.List;

import com.bryan.developer.curso.microservicio.productos.entities.Producto;

public interface ProductoService {
	
	List<Producto> listarProductos();
	Producto mostrarProducto(Long id);

}
