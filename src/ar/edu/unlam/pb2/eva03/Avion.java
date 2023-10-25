package ar.edu.unlam.pb2.eva03;

public class Avion extends Vehiculo implements Volador {

	private Double altura;
	
	public Avion(Integer codigo, String nombre) {
		super(codigo, nombre);
		// TODO Auto-generated constructor stub
		this.altura=0.0;
	}

	
	public Avion(String codAlfanumerco, String nombre) {
		super(codAlfanumerco, nombre);
		// TODO Auto-generated constructor stub
		this.altura=0.0;
	}


	public Double getAltura() {
		// TODO Auto-generated method stub
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}

	
	
	

	


}
