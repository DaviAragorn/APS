package br.com.ufc.track_it.objects;

public class ChipClaroAdapter extends ChipClaro implements CreditosAdapter{

	public ChipClaroAdapter(int creditos){
		setCreditos(creditos);
	}

	@Override
	public void colocarCreditos(int creditos) {
		colocarCreditosClaro(creditos);
		
	}

}
