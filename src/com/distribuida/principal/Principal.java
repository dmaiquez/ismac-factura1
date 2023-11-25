package com.distribuida.principal;

import java.util.Date;

import com.distribuida.entities.Cliente;
import com.distribuida.entities.Factura;
import com.distribuida.entities.Producto;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cliente cliente = new Cliente();
		Cliente cliente2 = new Cliente();
		
		cliente.setIdCliente(1);
		cliente.setCedula("1234567890");
		cliente.setNombre("Pamelo");
		cliente.setApellido("Taipe");
		cliente.setEdad(99);
		cliente.setFechaNacimiento(new Date());
		cliente.setDireccion("Tumbaco");
		cliente.setTelefono("0987654321");
		cliente.setCorreo("ptaipe@correo.com");
		
		cliente2.setIdCliente(2);
		cliente2.setCedula("12345678902");
		cliente2.setNombre("Pamelo2");
		cliente2.setApellido("Taipe2");
		cliente2.setEdad(92);
		cliente2.setFechaNacimiento(new Date());
		cliente2.setDireccion("Tumbaco2");
		cliente2.setTelefono("09876543212");
		cliente2.setCorreo("ptaipe2@correo.com");
		
		Producto producto = new Producto();
		producto.setIdProducto(1);
		producto.setNombre("Manzana");
		producto.setDescripcion("Caja de Manzanas");
		producto.setPrecio(25.30);
		producto.setStock(100);

		
		Factura factura = new Factura();
		
		factura.setIdFactura(1);
		factura.setNumFactura("FAC-0001");
		factura.setFecha(new Date());
		factura.setTotalNeto(56.32);
		factura.setIva(0.12);
		factura.setTotal(60.15);
		
			// inyeccion de dependencias
		factura.setCliente(cliente);
		
		// impresion 
		System.out.println(factura.toString());
		
		
		
		
		
	}

}
