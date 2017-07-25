class Piloto {

	Nave nave = new Nave();

	Radar radar = nave.obtenerRadar();

	void salirDeLaBase() {

		nave.despegar();

		if (radar.escanearNorte() == Espectro.VACIO) {
			nave.avanzarAlNorte();

		} else if (radar.escanearEste() == Espectro.VACIO) {
			nave.avanzarAlEste();

		} else if (radar.escanearSur() == Espectro.VACIO) {
			nave.avanzarAlSur();

		} else if (radar.escanearOeste() == Espectro.VACIO) {
			nave.avanzarAlOeste();
		}
	}

	int irAlNorte() {

		int casilleros = 0;
		
		while (radar.escanearNorte() == Espectro.VACIO) {
			nave.avanzarAlNorte();
			
			casilleros++;
		}

		return casilleros;
	}

	int irAlSur() {
		
		int casilleros = 0;

		while (radar.escanearSur() == Espectro.VACIO) {
			nave.avanzarAlSur();
			
			casilleros++;
		}
		
		return casilleros;
	}

	int irAlEste() {
		
		int casilleros = 0;

		while (radar.escanearEste() == Espectro.VACIO) {
			nave.avanzarAlEste();
			
			casilleros++;
		}
		
		return casilleros;
	}

	int irAlOeste() {

		int casilleros = 0;
		
		while (radar.escanearOeste() == Espectro.VACIO) {
			nave.avanzarAlOeste();
			
			casilleros++;
		}
		
		return casilleros;
	}
	
	int irAlNoreste() {
		
		int este;
		int norte;
		int total = 0;
		
		while (radar.escanearEste() == Espectro.VACIO) {
			este = irAlEste();
			norte = irAlNorte();
			
			total = total + este + norte;
		}
		
		return total;
		
	}
}
