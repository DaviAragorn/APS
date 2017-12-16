package br.com.ufc.track_it.objects;

import br.com.ufc.track_it.observer.NotificationsListenner;
import br.com.ufc.track_it.observer.NotificationsType;

public class Chip implements NotificationsListenner { //USANDO PADRÃO OBSERVER
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
				"Seus créditos estão acabando !\n" + "Recarregue seu chip para utilizar mais de nossos serviços.");
	}

	@Override
	public void notificar(NotificationsType tipo) {
		System.out.println(tipo);
		recarregaChip();
	}

}
