
class MisionDestruirAsteroideAlNorte {

	void ejecutar () {
		
		Nave destructor;
		destructor= new Nave();
		
		Radar radar;
		radar= destructor.obtenerRadar();
		
		destructor.despegar();
		
		while (radar.escanearNorte()!= Espectro.DESCONOCIDO){
			
			while (radar.escanearNorte()== Espectro.VACIO){
				destructor.avanzarAlNorte();
			}
			
			while (radar.escanearNorte()== Espectro.ASTEROIDE){
				destructor.atacarAlNorte();
			}
		
		}
			
	}
		
}
