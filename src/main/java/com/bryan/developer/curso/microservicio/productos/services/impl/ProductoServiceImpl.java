package com.bryan.developer.curso.microservicio.productos.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bryan.developer.curso.microservicio.productos.entities.Producto;
import com.bryan.developer.curso.microservicio.productos.repositories.ProductoDao;
import com.bryan.developer.curso.microservicio.productos.services.ProductoService;
import com.bryan.developer.curso.microservicio.productos.util.LogAbstract;

@Service
public class ProductoServiceImpl extends LogAbstract implements ProductoService{
	
	@Autowired
	private ProductoDao dao;

	@Override
	@Transactional(readOnly = true)
	public List<Producto> listarProductos() {
		LOG.info("Ejecutando el siguiente Metodo de la Clase: " + getClass().getName() + " - "
				+ Thread.currentThread().getStackTrace()[1].getMethodName());
		return dao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Producto mostrarProducto(Long id) {
		LOG.info("Ejecutando el siguiente Metodo de la Clase: " + getClass().getName() + " - "
				+ Thread.currentThread().getStackTrace()[1].getMethodName());
		return dao.findById(id).orElse(null);
	}

}
