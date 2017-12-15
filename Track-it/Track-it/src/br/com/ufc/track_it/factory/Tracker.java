package br.com.ufc.track_it.factory;

import br.com.ufc.track_it.adapter.Chip;
import br.com.ufc.track_it.adapter.ChipClaro;
import br.com.ufc.track_it.adapter.ChipTim;
import br.com.ufc.track_it.adapter.TypeChip;
import br.com.ufc.track_it.objects.Position;
import br.com.ufc.track_it.observer.NotificationsListenner;
import br.com.ufc.track_it.observer.NotificationsType;

public class Tracker implements NotificationsListenner { // IMPLEMENTS DO
															// OBSERVER
	Position pos;
	int leftCharge = 100;
	Chip chip;

	public void bateriaFraca() {
		System.out.println("A bateria de seu rastreador est� quase no fim !\n"
				+ "Recarregue e continue utilizando nossos servi�os.");
	}

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

	public void criarChip(TypeChip tipo) { // GRASP CREATOR, ATRIBUINDO A
											// RESPONSABILIDADE DE CRIAR UMA
											// INST�NCIA DE CHIP PARA O
											// RASTREADOR QUE O USA DIRATAMENTE.
		// Criamos a instancia de pedido item
		switch (tipo) {
		case Tim:
			this.chip = new ChipTim();
		case Claro:
			this.chip = new ChipClaro();
		default:
			break;
		}
	}

	@Override
	public void notificar(NotificationsType tipo) { // NOTIFICA��O DO PADR�O
													// OBSERVER
		System.out.println(tipo);
		bateriaFraca();
	}
}
