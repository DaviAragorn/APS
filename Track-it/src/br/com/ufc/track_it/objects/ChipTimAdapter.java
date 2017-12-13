package br.com.ufc.track_it.objects;

public class ChipTimAdapter extends ChipTim implements CreditosAdapter {

	public ChipTimAdapter(int creditos) {
		setCreditos(creditos);
	}

	@Override
	public void colocarCreditos(int creditos) {
		colocarCreditosTim(creditos);
	}
}
