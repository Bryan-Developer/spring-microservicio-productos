package com.bryan.developer.curso.microservicio.productos.ws.rests;

import static com.bryan.developer.curso.microservicio.productos.util.MsProductosConstantes.ROOT;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bryan.developer.curso.microservicio.productos.entities.Producto;
import com.bryan.developer.curso.microservicio.productos.services.ProductoService;
import com.bryan.developer.curso.microservicio.productos.util.LogAbstract;;

@RestController
@RequestMapping(ROOT + "/productos")
public class ProductoRest extends LogAbstract {

	@Autowired
	private ProductoService service;

	@GetMapping("/listar")
	public List<Producto> listar() {
		LOG.info("Ejecutando el siguiente Metodo de la Clase: " + getClass().getName() + " - "
				+ Thread.currentThread().getStackTrace()[1].getMethodName());
		return service.listarProductos();
	}

	@GetMapping("/listar/{id}")
	public Producto mostrar(@PathVariable Long id) {
		LOG.info("Ejecutando el siguiente Metodo de la Clase: " + getClass().getName() + " - "
				+ Thread.currentThread().getStackTrace()[1].getMethodName());
		return service.mostrarProducto(id);
	}

}
