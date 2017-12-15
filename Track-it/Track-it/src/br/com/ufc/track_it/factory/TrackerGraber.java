package br.com.ufc.track_it.factory;

import br.com.ufc.track_it.observer.NotificationsType;

public class TrackerGraber extends Tracker {
	@Override
	public void notificar(NotificationsType tipo) {
		System.out.println("TrackerGraber "+tipo);
		bateriaFraca();
	}
}
