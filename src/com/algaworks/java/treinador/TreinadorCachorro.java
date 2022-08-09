package com.algaworks.java.treinador;

import com.algaworks.java.animal.Cachorro;
import com.algaworks.java.animal.Gato;

public class TreinadorCachorro {

	public static void main(String[] args) {
		Cachorro cachorro = new Cachorro();
		cachorro.setNome("Bob");
		
		Gato gato = new Gato();
		gato.setNome("Tom");
				
		DonoCachorro dono = new DonoCachorro();
		dono.ensinarCachorroSentar(cachorro);
	}

}
