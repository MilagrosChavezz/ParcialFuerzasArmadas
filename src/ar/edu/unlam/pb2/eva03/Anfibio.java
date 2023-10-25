package ar.edu.unlam.pb2.eva03;

public class Anfibio extends Vehiculo implements Acuatico,Terrestre{

	private Double velocidad;
	private Double profundidad;
	
	public Anfibio(Integer codigo, String nombre) {
		super(codigo, nombre);
		// TODO Auto-generated constructor stub
		velocidad=0.0;
		profundidad=0.0;
	}


	public Anfibio(String codAlfanumerco, String nombre) {
		super(codAlfanumerco, nombre);
		// TODO Auto-generated constructor stub
		this.velocidad=0.0;
		this.profundidad=0.0;
	}
	
	@Override
	public Double getVelocidad() {
		// TODO Auto-generated method stub
		return velocidad;
	}

	@Override
	public Double getProfundidad() {
		// TODO Auto-generated method stub
		return profundidad;
	}

}
