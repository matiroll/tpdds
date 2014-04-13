package tp1;

public class Sarkany implements Marca {
	
	static final float PRECIOBASE_CONDICIONAL = 500;
	static final float COEFICIENTE_DE_PRECIOBASE_MAYOR_IGUAL_A_500 = (float)0.65;
	static final float COEFICIENTE_DE_PRECIOBASE_MENOR_A_500 = (float)0.1;
	
	@Override
	public float politica(float precioBase) {
		
		if (precioBase >= PRECIOBASE_CONDICIONAL) return precioBase*COEFICIENTE_DE_PRECIOBASE_MAYOR_IGUAL_A_500;
		else return precioBase*COEFICIENTE_DE_PRECIOBASE_MENOR_A_500;
		
	}

}
