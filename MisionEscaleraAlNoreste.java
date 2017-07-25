
class MisionEscaleraAlNoreste {

	void subir() {
		
		Nave atleta = new Nave();
		
		Radar radar = atleta.obtenerRadar();
		
		atleta.despegar();
		
		while (radar.escanearNorte()== Espectro.VACIO) {
			atleta.avanzarAlNorte();
			
			if (radar.escanearEste()== Espectro.VACIO) {
				atleta.avanzarAlEste();
			}
		}
	}
}
