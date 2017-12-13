package br.com.ufc.track_it.objects;

public class TrackerGraber extends Tracker {
	@Override
	public void notificar(NotificationsType tipo) {
		System.out.println("TrackerGraber "+tipo);
		bateriaFraca();
	}
}
