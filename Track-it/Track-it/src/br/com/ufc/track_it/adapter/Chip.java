package br.com.ufc.track_it.adapter;

import br.com.ufc.track_it.observer.NotificationsListenner;
import br.com.ufc.track_it.observer.NotificationsType;

public class Chip implements NotificationsListenner { // USANDO PADR�O OBSERVER
	private int numero;
	int creditos;
	boolean status;
	String SignalStrenght;

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	protected void setCreditos(int creditos) {
		this.creditos = creditos;
	}

	public void recarregaChip() {
		System.out.println(
				"Seus cr�ditos est�o acabando !\n" + "Recarregue seu chip para utilizar mais de nossos servi�os.");
	}

	@Override
	public void notificar(NotificationsType tipo) {
		System.out.println(tipo);
		recarregaChip();
	}

}
