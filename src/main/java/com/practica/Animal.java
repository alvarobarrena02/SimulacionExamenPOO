package com.practica;

public class Animal {
	
    private String nombre;

    public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Animal(String nombre) {
        this.nombre = nombre;
    }

    public String hacerSonido() {
        return "El animal hace un sonido";
    }
}
