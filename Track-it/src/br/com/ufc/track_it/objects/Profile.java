package br.com.ufc.track_it.objects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public enum Profile {
	User(Allowence.addObject,Allowence.deleteObject,Allowence.findObject,Allowence.modifyObject,Allowence.sendMesseges),
	Transporter(Allowence.reciveObjects,Allowence.sendMesseges);
	
	private List<Allowence> permissoes = new ArrayList<Allowence>();
	
	private Profile(Allowence... permissoes) {
		setPermissoes(Arrays.asList(permissoes));
	}

	public List<Allowence> getPermissoes() {
		return permissoes;
	}

	private void setPermissoes(List<Allowence> permissoes) {
		this.permissoes = permissoes;
	}
}