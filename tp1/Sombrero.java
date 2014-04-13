package tp1;

public class Sombrero extends Prenda {
	
	static final int PRECIO_SOMBRERO = 150;
	private float coeficienteDeMetrosexualidad;

	@Override
	protected float precioBase() {
		
		return PRECIO_SOMBRERO + 1*coeficienteDeMetrosexualidad;
	
	}
	
public Sombrero(float valorNegocio, boolean nacional, Marca laMarca, int coeficiente) {
		
		super(valorNegocio, nacional, laMarca);
		coeficienteDeMetrosexualidad = coeficiente;	
		
	}		

}
