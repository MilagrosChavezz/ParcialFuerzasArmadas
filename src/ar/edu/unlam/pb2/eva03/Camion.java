package ar.edu.unlam.pb2.eva03;

public class Camion extends Vehiculo implements Terrestre {

	private Double velocidad;
	
	public Camion(Integer codigo, String nombre) {
		super(codigo, nombre);
		// TODO Auto-generated constructor stub
		this.velocidad=0.0;
	}


	public Camion(String codAlfanumerco, String nombre) {
		super(codAlfanumerco, nombre);
		// TODO Auto-generated constructor stub
		this.velocidad=0.0;
	}


	@Override
	public Double getVelocidad() {
		// TODO Auto-generated method stub
		return this.velocidad;
	}
}
