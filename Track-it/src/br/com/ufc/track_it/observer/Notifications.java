package br.com.ufc.track_it.observer;

import java.util.ArrayList;
import java.util.List;

public class Notifications { //OBSERVER

		private String nome;
		private List<NotificationsListenner> listeners = new ArrayList<NotificationsListenner>();
		
		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}
		
		public void addListener(NotificationsListenner listener) {
			listeners.add(listener);
		}
		
		public void notificarForaArea() {
			for (NotificationsListenner listener : listeners) {
				listener.notificar(NotificationsType.objetoForaDeAreaDelimitada);
			}
		}
		
//		public void notificarObjetoExtraviado() {
//			for (NotificationsListenner listener : listeners) {
//				listener.notificar(NotificationsType.ObjetoExtraviado);
//			}
//		}
		
		public void notificarRecarregarChip() {
			for (NotificationsListenner listener : listeners) {
				listener.notificar(NotificationsType.recarregarChip);
			}
		}
		
//		public void notificarObjetoChegou() {
//			for (NotificationsListenner listener : listeners) {
//				listener.notificar(NotificationsType.objetoChegou);
//			}
//		}
		
		public void notificarRastreadorBateriaFraca() {
			for (NotificationsListenner listener : listeners) {
				listener.notificar(NotificationsType.rastreadorBateriaFraca);
			}
		}
}
