package br.com.ufc.track_it.objects;

public class Position { // ESPECIALIASTA DA INFORMA��O, ATRIBUINDO A
						// RESPONSABILIDADE DE RETORNA A POSI��O DO OBJETO
						// A CLASSE POSITION J� QUE ELA TEM OS METODOS E ATRIBUTOS NECES�RIOS A
						// ISSO.
	private float latitude;
	private float longitude;

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
