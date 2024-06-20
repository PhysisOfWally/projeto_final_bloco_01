package roupa.model;

public abstract class Roupa {
	// declarando os atributos da Classe Abstrata principal
	private String modelo;
	private int codigo;
	private char genero;

	public Roupa(String modelo, int codigo, char genero) {
		this.modelo = modelo;
		this.codigo = codigo;
		this.genero = genero;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public char getGenero() {
		return genero;
	}

	public void setGenero(char genero) {
		this.genero = genero;
	}
	
	public void visualizar() {
		
		System.out.println("\n\n*********************************************");
		System.out.println("Informações da Roupa:");
		System.out.println("*************************************************");
		System.out.println("Modelo da Roupa: " + this.modelo);
		System.out.println("Codigo: " + this.codigo);
		System.out.println("Genero: " + genero);

	}
}