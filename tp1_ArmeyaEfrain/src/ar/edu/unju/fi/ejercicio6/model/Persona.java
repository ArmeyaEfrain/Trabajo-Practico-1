package ar.edu.unju.fi.ejercicio6.model;

import java.time.LocalDate;
import java.time.Period;

public class Persona {
	private int dni;
	private String nombre;
	private LocalDate fecha;
	private String provincia;
	private Period edad;
	
	
	public Persona() {

	}


	public Persona(int dni, String nombre, LocalDate fecha, String provincia, Period edad) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.fecha = fecha;
		this.provincia = provincia;
		this.edad = edad;
	}


	public int getDni() {
		return dni;
	}


	public void setDni(int dni) {
		this.dni = dni;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public LocalDate getFecha() {
		return fecha;
	}


	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}


	public String getProvincia() {
		return provincia;
	}


	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}


	public Period getEdad() {
		return edad;
	}


	public void setEdad(Period edad) {
		this.edad = edad;
	}
	
	public Period calcular(Period a,int b) {
		a=Period.between(fecha, LocalDate.of(2018, 9, 11));
		return a;
	}
	
}
