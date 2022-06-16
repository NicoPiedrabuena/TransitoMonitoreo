package ar.edu.unlam.transito;

public class Auto extends MedioTransporte{

	private String patente;
	private Integer capacidadOcupantes;
	private Integer velMax;


	public Auto(String patente, Integer capacidadOcupantes , Integer velMax, double latitud, double longitud) {
		super(latitud,longitud);
		this.patente = patente;
		this.capacidadOcupantes = capacidadOcupantes;
		this.velMax = velMax;
	
		
	}

	public String getPatente() {
		return patente;
	}

	public void setPatente(String patente) {
		this.patente = patente;
	}

	public Integer getCapacidadMaximaDePasajeros() {
		return capacidadOcupantes;
	}

	public void setCapacidadOcupantes(Integer capacidadOcupantes) {
		this.capacidadOcupantes = capacidadOcupantes;
	}

	public Integer getVelMax() {
		return velMax;
	}

	public void setVelMax(Integer velMax) {
		this.velMax = velMax;
	}

	

}
