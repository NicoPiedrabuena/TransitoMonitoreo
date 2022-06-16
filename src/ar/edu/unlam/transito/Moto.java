package ar.edu.unlam.transito;

public class Moto extends MedioTransporte {

	private String patente;
	private Integer velMax;
	private final Integer CAPACIDA_MAXIMA_PASAJEROS;

	public Moto(String patente, Integer velMax, Double latitud, Double longitud) {
		super(latitud,longitud);
		this.patente = patente;
		this.velMax = velMax;
		this.CAPACIDA_MAXIMA_PASAJEROS =2;
	}

	public String getPatente() {
		return patente;
	}

	public void setPatente(String patente) {
		this.patente = patente;
	}

	public Integer getVelocidadMaxima() {
		return velMax;
	}

	public void setVelocidadMaxima(Integer velMax) {
		this.velMax = velMax;
	}



	public Integer getCAPACIDA_MAXIMA_PASAJEROS() {
		return CAPACIDA_MAXIMA_PASAJEROS;
	}
	
}
