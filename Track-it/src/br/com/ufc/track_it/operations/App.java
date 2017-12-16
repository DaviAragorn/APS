package br.com.ufc.track_it.operations;

import java.util.ArrayList;

import br.com.ufc.track_it.fachada.Fachada;
import br.com.ufc.track_it.objects.Position;
import br.com.ufc.track_it.objects.Profile;
import br.com.ufc.track_it.objects.User;
import br.com.ufc.track_it.repository.User_Repo;

public class App {
	String nome;
	static ArrayList<User> usuarios;
	
	public static void main(String[] args) {
		
		//Servico.cadastrarUsuario(u);
		
		String user = "José";
		String nick = "Zé";
		String password = "jose123";
		int id = 211;
		ArrayList ob = null;
		Profile perfil = Profile.User;
		
		String user2 = "João";
		String nick2 = "jj";
		String password2 = "joao123";
		int id2 = 007;
		ArrayList ob2 = null;
		Profile perfil2 = Profile.User;
		
		User u = new User(user,nick, password,id,ob,perfil);
		User a = new User(user2, nick2 ,password2, id2, ob2, perfil2);
		User_Repo.addUser(u);
		User_Repo.addUser(a);
		
		System.out.println(u.toString());
		Fachada.findObjects(u, "aaa");
		System.out.println(Fachada.findUser(a, user2).toString());
		
		// Servico.addItem(u, i)
		
		// List<Item> itens = Servico.listarItens(u)
		
		
		// Posicao p = Servico.getPosicao(i);
		
		// syso p
		
	}
	
}
