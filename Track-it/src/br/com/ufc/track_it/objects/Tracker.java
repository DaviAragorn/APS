package br.com.ufc.track_it.objects;

public class Tracker implements NotificationsListenner { // IMPLEMENTS DO
															// OBSERVER
	Position pos;
	int leftCharge = 100;
	Chip chip;

	public void bateriaFraca() {
		System.out.println("A bateria de seu rastreador está quase no fim !\n"
				+ "Recarregue e continue utilizando nossos serviços.");
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
											// INSTÂNCIA DE CHIP PARA O
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
	public void notificar(NotificationsType tipo) { // NOTIFICAÇÃO DO PADRÃO
													// OBSERVER
		System.out.println(tipo);
		bateriaFraca();
	}
}
