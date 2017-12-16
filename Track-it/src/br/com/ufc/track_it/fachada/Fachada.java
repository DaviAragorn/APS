package br.com.ufc.track_it.fachada;

import br.com.ufc.track_it.objects.Allowence;
import br.com.ufc.track_it.objects.Profile;
import br.com.ufc.track_it.objects.User;
import br.com.ufc.track_it.repository.User_Repo;

public class Fachada {
 
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
	
	public static void addObject(User u, Object obj)
	{
		if (autenticar(u.getLogin(), u.getSenha()) == null || u.getPerfil() != Profile.User)
			return ;
		else
		u.setObjeto((br.com.ufc.track_it.objects.Object) obj);
	}
	
	public static void associateCarrier(User u, Object obj, User t)
	{
		if (autenticar(u.getLogin(), u.getSenha()) == null || u.getPerfil() != Profile.User)
			return ;
		if (autenticar(t.getLogin(), t.getSenha()) == null || t.getPerfil() != Profile.Transporter)
			return ;
		else
			t.setObjeto((br.com.ufc.track_it.objects.Object) obj);
	}
}
