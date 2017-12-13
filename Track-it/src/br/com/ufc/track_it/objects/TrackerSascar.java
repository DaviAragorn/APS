package br.com.ufc.track_it.objects;
//PADRÃO FACTORY
public class TrackerSascar extends Tracker {
	@Override
	public void notificar(NotificationsType tipo) {
		System.out.println("TrackerSascar "+tipo);
		bateriaFraca();
	}

}
