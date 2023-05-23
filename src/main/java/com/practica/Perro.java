package com.practica;

public class Perro extends Animal{
	
    private int edad;

    public Perro(String nombre, int edad) {
        super(nombre);
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public String hacerSonido() {
        return "El perro ladra";
    }
}
