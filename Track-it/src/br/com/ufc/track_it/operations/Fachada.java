package br.com.ufc.track_it.operations;

import br.com.ufc.track_it.objects.Allowence;
import br.com.ufc.track_it.objects.User;

public class Fachada { //UTILIZA O PADRÃO CONTROLLER DO GRASP
 
	public static Fachada instancia; //SINGLETON
	
	public static Fachada getInstancia() {
        if (instancia == null) instancia = new Fachada();
        return instancia;
    }
	
	public void getUser(String name, String password){
		
	}
	
	public static void findObjects(User u, String nome) {
		if (u.getPerfil().getPermissoes().contains(Allowence.findObject)) {
			System.out.println(u.getLogin() + " realizou findObjects");
		} else {
			System.out.println(u.getLogin() + " not allowed");
		}
	}
	
	public static User autenticar(String login, String senha) {
		return User_Repo.findUserNick(login);
	}

	public static User findUser(User u, String nome)
	{
		if (autenticar(u.getLogin(), u.getSenha()) == null)
			return null;
		return User_Repo.findUserNick(nome);
	}
	
}
