package com.bryan.developer.curso.microservicio.productos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bryan.developer.curso.microservicio.productos.entities.Producto;

public interface ProductoDao extends JpaRepository<Producto, Long>{

}
