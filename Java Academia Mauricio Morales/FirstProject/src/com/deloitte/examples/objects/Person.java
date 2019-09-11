package com.deloitte.examples.objects;

public class Person {

	private double altura;
	private int edad;
	private double peso;
	private char genero;
	private String nacionalidad;
	private String nombre;
	private String apellido_paterno;
	private String apellido_materno;
	private String estado_civil;
	
	public Person(String nombre, String apellido_paterno, String apellido_materno) {
		this.nombre = nombre;
		this.apellido_paterno = apellido_paterno;
		this.apellido_materno = apellido_materno;
	}

	public Person() {
		
	}
	
	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public char getGenero() {
		return genero;
	}

	public void setGenero(char genero) {
		this.genero = genero;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido_paterno() {
		return apellido_paterno;
	}

	public void setApellido_paterno(String apellido_paterno) {
		this.apellido_paterno = apellido_paterno;
	}

	public String getApellido_materno() {
		return apellido_materno;
	}

	public void setApellido_materno(String apellido_materno) {
		this.apellido_materno = apellido_materno;
	}

	public String getEstado_civil() {
		return estado_civil;
	}

	public void setEstado_civil(String estado_civil) {
		this.estado_civil = estado_civil;
	}
	
	public int suma1(int a, int b) {
		System.out.println("Int");
		return a+b;
	}
	public byte suma2(byte a, byte b) {
		System.out.println("Byte");
		return (byte) (a+b);
	}
	public char suma3(char a, char b) {
		System.out.println("Char");
		return (char) (a+b);
	}
	public long suma4(long a, long b) {
		System.out.println("long");
		return (long) (a+b);
	}
	public double suma5(double a, double b) {
		System.out.println("double");
		return (double) (a+b);
	}
	public float suma6(float a, float b) {
		System.out.println("float");
		return (float) (a+b);
	}

}
