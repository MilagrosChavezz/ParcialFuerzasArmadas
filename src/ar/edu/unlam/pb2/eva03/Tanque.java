package ar.edu.unlam.pb2.eva03;

public class Tanque extends Vehiculo implements Terrestre {

	private Double velocidad;
	
	public Tanque(Integer codigo, String nombre) {
		super(codigo, nombre);
		// TODO Auto-generated constructor stub
		this.velocidad=0.0;
	}
	
	public Tanque(String codAlfanumerco, String nombre) {
		super(codAlfanumerco, nombre);
		// TODO Auto-generated constructor stub
		this.velocidad=0.0;
	}

	@Override
	public Double getVelocidad() {
		// TODO Auto-generated method stub
		return velocidad;
	}

	public void setVelocidad(Double velocidad) {
		this.velocidad = velocidad;
	}
	
	
	


}
