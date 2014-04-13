package tp1;

public class Saco extends Prenda {
	
	static final int PRECIO_SACO = 300;
	private int botones;	

	@Override
	protected float precioBase() {
		
		return PRECIO_SACO + botones*10;
	
	}
	
	public Saco(float valorNegocio, boolean nacional, Marca laMarca, int cantidadBotones) {
		
		super(valorNegocio, nacional, laMarca);
		botones = cantidadBotones;	
		
	}
	
}
