package br.com.ufc.track_it.objects;

import java.util.ArrayList;

public class User {
	String nome;
	String nick;
	String senha;
	int id;
	ArrayList<Object> objeto;
	private Profile perfil;
	
	@SuppressWarnings("unused")
	private void addObject(Object a){
			this.objeto.add(a);
	}

	public User(String nome, String nick, String senha, int id, ArrayList<Object> objeto, Profile perfil) {
		super();
		this.nome = nome;
		this.nick = nick;
		this.senha = senha;
		this.id = id;
		this.objeto = objeto;
		this.perfil = perfil;
	}
	public String getLogin() {
		return nome;
	}

	public void setLogin(String login) {
		this.nome = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Profile getPerfil() {
		return perfil;
	}

	public void setPerfil(Profile perfil) {
		this.perfil = perfil;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNick() {
		return nick;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

	@Override
	public String toString() {
		return "User\nNome: " + nome + ", Nick: "+nick+", Senha: " + senha + ", Id= " + id + ", Objetos: " + objeto + ", Perfil: " + perfil;
	}
	
	
}