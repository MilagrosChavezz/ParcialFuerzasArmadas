package ar.edu.unlam.pb2.eva03;

import java.util.Objects;

public abstract class Vehiculo {
	
	private Integer codigo;
	private String nombre;
	private String codAlfanumerco;
	
	public Vehiculo(Integer codigo, String nombre) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
	}
	
	public Vehiculo(String codAlfanumerico, String nombre) {
		super();
		this.codAlfanumerco = codAlfanumerico;
		this.nombre = nombre;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCodAlfanumerco() {
		return codAlfanumerco;
	}

	public void setCodAlfanumerco(String codAlfanumerco) {
		this.codAlfanumerco = codAlfanumerco;
	}

	@Override
	public int hashCode() {
		return Objects.hash(codigo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		
		Vehiculo other = (Vehiculo) obj;
		return Objects.equals(codigo, other.codigo);
	}

	
	



}
