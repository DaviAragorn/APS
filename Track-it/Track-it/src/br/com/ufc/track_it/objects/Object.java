package br.com.ufc.track_it.objects;

import java.util.ArrayList;

import br.com.ufc.track_it.factory.Tracker;
import br.com.ufc.track_it.observer.NotificationsListenner;
import br.com.ufc.track_it.observer.NotificationsType;

public class Object implements NotificationsListenner {
	Tracker tracker;
	String name;
	ArrayList<User> interested; // Lista de interessados no objeto para serem
								// noificados
								// Padr�o Observer

	public Object(Tracker tracker, String name) {
		super();
		this.tracker = tracker;
		this.name = name;
	}

	public void objetoForaDeArea() {
		System.out.println("O seu objeto saiu da �rea delimitada !");
	}

	@Override
	public void notificar(NotificationsType tipo) {
		System.out.println(tipo);
		objetoForaDeArea();
	}

}
