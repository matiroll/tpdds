package tp1;

public class Zapato extends Prenda {
	
	static final int PRECIO_ZAPATO = 400;
	static final int COSTO_POR_TALLE = 5;
	private int talle;
	

	@Override
	protected float precioBase() {
		
		return PRECIO_ZAPATO + talle*COSTO_POR_TALLE;
		
	}
	
	public Zapato(float valorNegocio, boolean nacional, Marca laMarca, int talleInicial) {
		
		super(valorNegocio, nacional, laMarca);
		talle = talleInicial;
		
	}

}
