package tp1;

public class Armani implements Marca {

	static final float COEFICIENTE_DE_POLITICA_DE_PRECIO = (float) 0.65;
	
	@Override
	public float politica(float precioBase) {
		
		return precioBase*COEFICIENTE_DE_POLITICA_DE_PRECIO;	
		
	}

}
