package br.com.ufc.track_it.repository;

import java.util.ArrayList;

import br.com.ufc.track_it.objects.User;

public class User_Repo{
	private static ArrayList<User> usermap = new ArrayList<User>();
	
	public static User findUserNick(String login) {
		for (User a:usermap) {
			if(a.getNome().equals(login)){
				System.out.println("Result for your search: ");
				return a;
			}
				
		}
		return null;
	}
	
	public static User findUserName(String nome) {
		for (User a:usermap) {
			if(a.getNick().equals(nome))
				return a;
		}
		return null;
	}
	
	public static ArrayList<User> Users() {
		return usermap;
	}
	
	public static void addUser(User u){
		usermap.add(u);
	}
	
//	Position pos = new Position();
//	Tracker tracker = new Tracker();
//	Chip chip = new Chip();
//	Object objeto = new Object(tracker, "ervas");
//	ArrayList<Object> objetos = new ArrayList<Object>();
//	User usuario = new User("Zé", "123", 42, objetos);
//	objetos.add(objeto);
//	pos.setLatitude(500);
//	pos.setLongitude(90);
//	chip.creditos = 10;
//	chip.SignalStrenght = "Great";
//	chip.status = true;
//	tracker.pos = pos;
//	tracker.chip = chip;
	

	
}
