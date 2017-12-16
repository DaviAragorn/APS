package br.com.ufc.track_it.objects;

public class Position { // ESPECIALIASTA DA INFORMAÇÃO, ATRIBUINDO A
						// RESPONSABILIDADE DE RETORNA A POSIÇÃO DO OBJETO
						// A CLASSE POSITION JÁ QUE ELA TEM OS METODOS E ATRIBUTOS NECESÁRIOS A
						// ISSO.
	private float latitude;
	private float longitude;

	public Position(float latitude, float longitude) {
		super();
		this.latitude = latitude;
		this.longitude = longitude;
	}


	public float getLatitude() {
		return latitude;
	}

	public void setLatitude(float latitude) {
		this.latitude = latitude;
	}

	public float getLongitude() {
		return longitude;
	}

	public void setLongitude(float longitude) {
		this.longitude = longitude;
	}
	
	public void getPosition() {
		printPos (this.latitude, this.longitude);
	}
public void printPos(float a, float b){
	System.out.println("Latitude: "+a+"\nLongitude"+b+" ");
}
}
