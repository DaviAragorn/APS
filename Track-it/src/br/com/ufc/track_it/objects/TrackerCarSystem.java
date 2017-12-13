package br.com.ufc.track_it.objects;

public class TrackerCarSystem extends Tracker {
	@Override
	public void notificar(NotificationsType tipo) {
		System.out.println("TrackerCarSystem "+tipo);
		bateriaFraca();
	}
}
