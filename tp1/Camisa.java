package tp1;

public class Camisa extends Prenda {
	
	static final float PRECIO_CAMISA = 200;

	@Override
	protected float precioBase() {
		
		return PRECIO_CAMISA;
	
	}
	
	public Camisa(float valorNegocio, boolean nacional, Marca laMarca){
		
		super(valorNegocio,nacional,laMarca);
		
	}

}
