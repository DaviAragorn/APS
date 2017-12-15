package br.com.ufc.track_it.factory;

import br.com.ufc.track_it.observer.NotificationsType;

//PADR�O FACTORY
public class TrackerSascar extends Tracker {
	@Override
	public void notificar(NotificationsType tipo) {
		System.out.println("TrackerSascar "+tipo);
		bateriaFraca();
	}

}
