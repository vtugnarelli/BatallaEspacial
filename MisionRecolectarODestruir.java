
class MisionRecolectarODestruir {

	void recolectar() {
		
		Nave recolector = new Nave();
		
		Radar radar = recolector.obtenerRadar();
		
		recolector.despegar();
		
		recolector.avanzarAlSur();
		recolector.avanzarAlSur();
		
		recolector.avanzarAlOeste();
		
		int antimateria = radar.buscarAlOeste(Sustancia.ANTIMATERIA);
		
		if (antimateria >= 50) {
			recolector.cargarDesdeOeste(Sustancia.ANTIMATERIA, 100);
			
			recolector.avanzarAlEste();
			
			recolector.avanzarAlNorte();
			
			recolector.descargarEnNorte(Sustancia.ANTIMATERIA, 100);
		
		} else {
			
			while (radar.escanearOeste()== Espectro.CONTENEDOR) {
				recolector.atacarAlOeste();
			}
		}
	}
}
