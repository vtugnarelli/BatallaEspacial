
class MisionPatrullar {

	void ejecutarAntihorario() {
		
		Nave patrullero;
		patrullero = new Nave();
		
		patrullero.despegar();
		
		patrullero.avanzarAlNorte();
		
		patrullero.avanzarAlOeste();
		
		patrullero.avanzarAlSur();
		patrullero.avanzarAlSur();
		
		patrullero.avanzarAlEste();
		patrullero.avanzarAlEste();
		
		patrullero.avanzarAlNorte();
		patrullero.avanzarAlNorte();
		
		patrullero.avanzarAlOeste();
		
	}
	
	void ejecutarHorario() {
		
		Nave patrullero;
		patrullero = new Nave();
		
		patrullero.despegar();
		
		patrullero.avanzarAlNorte();
		
		patrullero.avanzarAlEste();
		
		patrullero.avanzarAlSur();
		patrullero.avanzarAlSur();
		
		patrullero.avanzarAlOeste();
		patrullero.avanzarAlOeste();
		
		patrullero.avanzarAlNorte();
		patrullero.avanzarAlNorte();
		
		patrullero.avanzarAlEste();
	
	}
	
	void ejecutar4VueltasHorarias() {
		
		Nave patrullero;
		patrullero = new Nave();
		
		patrullero.despegar();
		
		patrullero.avanzarAlNorte();
		
		for (int vueltas = 0; vueltas <4; vueltas++) {

			patrullero.avanzarAlEste();
			
			patrullero.avanzarAlSur();
			patrullero.avanzarAlSur();
			
			patrullero.avanzarAlOeste();
			patrullero.avanzarAlOeste();
			
			patrullero.avanzarAlNorte();
			patrullero.avanzarAlNorte();
			
			patrullero.avanzarAlEste();
			
		}
	}
	
	void ejecutar4VueltasAntihorarias() {
		
		Nave patrullero = new Nave ();
		
		patrullero.despegar();
		
		patrullero.avanzarAlNorte();
		

		for (int vueltas = 0; vueltas < 4; vueltas++) {
			
			patrullero.avanzarAlOeste();
			
			patrullero.avanzarAlSur();
			patrullero.avanzarAlSur();
			
			patrullero.avanzarAlEste();
			patrullero.avanzarAlEste();
			
			patrullero.avanzarAlNorte();
			patrullero.avanzarAlNorte();
			
			patrullero.avanzarAlOeste();
			
		}
	}
	
	void ejecutar4VueltasGrandes() {
		
		Nave patrullero = new Nave ();
		
		patrullero.despegar();
		
		for (int casillas = 0; casillas < 3; casillas++) {
			
			patrullero.avanzarAlNorte();
	
		}
	
		for (int vueltas = 0; vueltas < 4; vueltas++) {
			
			for (int casilleros = 0; casilleros < 3; casilleros++) {
				
				patrullero.avanzarAlOeste();
			}
			
			for (int casilleros = 0; casilleros < 6; casilleros++) {
				
				patrullero.avanzarAlSur();
			}
			
			for (int casilleros = 0; casilleros < 6; casilleros++) {
				
				patrullero.avanzarAlEste();
			}
			
			for (int casilleros = 0; casilleros < 6; casilleros++) {
				
				patrullero.avanzarAlNorte();
			}
			
			for (int casilleros = 0; casilleros < 3; casilleros++) {
				
				patrullero.avanzarAlOeste();
			}
		}
	}
}
