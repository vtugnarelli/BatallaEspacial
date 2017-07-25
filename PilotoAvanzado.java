class PilotoAvanzado {

	Nave nave = new Nave();

	Radar radar = nave.obtenerRadar();
	
	String nombre = "NN";
	
	int casillerosTotales = 0;

	void salirDeLaBase() {

		nave.despegar();

		nave.avanzarAlNorte();
		
		casillerosTotales++;
	}

	int irAlNorte() {

		int casilleros = 0;

		while (radar.escanearNorte() == Espectro.VACIO) {
			nave.avanzarAlNorte();

			casilleros++;
		}
		
		casillerosTotales = casillerosTotales + casilleros;

		return casilleros;
	}

	int irAlNorteHasta(int alNorte) {
		
		int casilleros;
		
		for (casilleros = 0; (casilleros < alNorte) && (radar.escanearNorte() == Espectro.VACIO); casilleros++) {

			nave.avanzarAlNorte();
		}
		
		casillerosTotales = casillerosTotales + casilleros;
		
		return casilleros;
	}
	
	@Override
	public String toString() {

		return "Piloto " + nombre;
	}
}
