package tp1;

public class Pantalon extends Prenda {
	
	static final int PRECIO_PANTALON = 250;
	private int telaUsada;

	@Override
	protected float precioBase() {
		
		return PRECIO_PANTALON + telaUsada;
	
	}
	
	public Pantalon(float valorNegocio, boolean nacional, Marca laMarca, int cantidadTela) {
		
		super(valorNegocio, nacional, laMarca);
		telaUsada = cantidadTela;	
	}

}
