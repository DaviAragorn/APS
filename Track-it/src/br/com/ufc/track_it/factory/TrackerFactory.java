package br.com.ufc.track_it.factory;

import br.com.ufc.track_it.objects.Tracker;

public class TrackerFactory { //PADRÃO FACTORY
	public Tracker getImpressora(TrackerType tipo) {
		switch (tipo) {
		case Sascar:
			return new TrackerSascar();
		case CarSystem:
			return new TrackerCarSystem();
		case Graber:
			return new TrackerGraber();
		default:
			break;
		}
		return null;
	}

}
