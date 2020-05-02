package com.uca.capas.domain;



import javax.validation.constraints.Digits;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Producto {

	@Size(min = 12, max = 12, message = "El campo Código debe tener una longitud entre 1 y 100")
	@NotEmpty(message = "El campo no puede estar vacio")
	String codigo;
	
	@Size(min = 1, max = 100, message = "El campo Nombre debe tener una longitud entre 1 y 100")
	@NotEmpty(message = "El campo no puede estar vacio")
	String nombre;
	
	@Size(min = 1, max = 100, message = "El campo Marca debe tener una longitud entre 1 y 100")
	@NotEmpty(message = "El campo no puede estar vacio")
	String marca;
	
	@Size(min = 1, max = 500, message = "El campo Descripción debe tener una longitud entre 1 y 100")
	@NotEmpty(message = "El campo no puede estar vacio")
	String descripcion;
	
	@Digits(fraction = 0, integer = 10, message ="Las existencias no pueden ser decimales")
	@NotEmpty(message = "El campo no puede estar vacio")
	String existencias;
	
	@Pattern(regexp = "^(0[1-9]|[12][0-9]|3[01])[- /.](0[1-9]|1[012])[- /.](19|20)\\d\\d$", message="El formato de la fecha debe ser 'dd/mm/yyyy'")
	@NotEmpty(message = "El campo no puede estar vacio")
	String fecha;
	
	public Producto() {
		
	}
	
	public Producto(String codigo, String nombre, String marca, String descripcion, String existencias, String fecha) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.marca = marca;
		this.descripcion = descripcion;
		this.existencias = existencias;
		this.fecha = fecha;
	}
	
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getExistencias() {
		return existencias;
	}
	public void setExistencias(String existencias) {
		this.existencias = existencias;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	
}
