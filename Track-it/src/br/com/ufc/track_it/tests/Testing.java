package br.com.ufc.track_it.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import br.com.ufc.track_it.fachada.Fachada;
import br.com.ufc.track_it.objects.Object;
import br.com.ufc.track_it.objects.User;
import br.com.ufc.track_it.repository.User_Repo;

class Testing {

	@Test
	void usersTest() {
		for(User e : User_Repo.Users()) {
			assertNotNull(e);
		}
	}
	
	@Test
	void itensTest() {
		for(User e : User_Repo.Users()) {
			for(Object i : e.getObjetcts()) {
				assertNotNull(e);
			}
		}
	}
	
	@Test
	void trackerIntregrity() {
		for(User e : User_Repo.Users()) {
			for(Object i : e.getObjetcts()) {
				assertNotNull(i.getTracker().getChip());
			}
		}
	}
	
	@Test
	void singleTest() {
		Fachada uno = Fachada.getInstancia(), deux = Fachada.getInstancia();
		assertEquals(uno, deux);
	}

}
