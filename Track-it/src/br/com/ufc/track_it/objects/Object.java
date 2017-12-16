package br.com.ufc.track_it.objects;

import java.util.ArrayList;

import br.com.ufc.track_it.observer.NotificationsListenner;
import br.com.ufc.track_it.observer.NotificationsType;

public class Object implements NotificationsListenner {
	Tracker tracker;
	String name;
	ArrayList<User> interested; // Lista de interessados no objeto para serem
								// noificados
								// Padrão Observer

	public Object(Tracker tracker, String name) {
		super();
		this.tracker = tracker;
		this.name = name;
	}

	public void objetoForaDeArea() {
		System.out.println("O seu objeto saiu da área delimitada !");
	}

	@Override
	public void notificar(NotificationsType tipo) {
		System.out.println(tipo);
		objetoForaDeArea();
	}
	
	public Tracker getTracker() {
		return this.tracker;
	}

}
