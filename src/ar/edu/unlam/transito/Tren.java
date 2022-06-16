package ar.edu.unlam.transito;

public class Tren extends MedioTransporte {

	private Integer cantidadDePasajerosPorVagon;
	private Integer velocidadMaxima;
	private Integer cantidadVagones;

	public Tren(Integer cantidadVagones,Integer cantidadPasajerosPorVagon,Integer velocidadMaxima,Double latitud, Double longitud) {
		super(latitud, longitud);
		this.cantidadDePasajerosPorVagon = cantidadPasajerosPorVagon;
		this.velocidadMaxima =velocidadMaxima;
		this.cantidadVagones = cantidadVagones;
	}

	public Integer getCantidadDePasajerosPorVagon() {
		return cantidadDePasajerosPorVagon;
	}

	public void setCantidadDePasajerosPorVagon(Integer cantidadDePasajerosPorVagon) {
		this.cantidadDePasajerosPorVagon = cantidadDePasajerosPorVagon;
	}

	public Integer getVelocidadMaxima() {
		return velocidadMaxima;
	}

	public void setVelocidadMaxima(Integer velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}

	public Integer getCantidadDeVagones() {
		return cantidadVagones;
	}

	public void setCantidadVagones(Integer cantidadVagones) {
		this.cantidadVagones = cantidadVagones;
	}
	
	
}
