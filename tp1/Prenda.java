package tp1;

public abstract class Prenda {
	
	private float valorFijoDelNegocio;
	private boolean esNacional;
	private Marca marca;
	
	public float precioFinal() { 
			
			return (valorFijoDelNegocio+this.precioBase())*tasaDeImportacion()+marca.politica(this.precioBase());
			
		 }
	
	public float tasaDeImportacion(){
		
		if (esNacional) return 1;
		else return (float) 1.3;
		
	}	
	
	protected abstract float precioBase();
	
	public Prenda(float valorNegocio, boolean nacional, Marca unaMarca){
	
		valorFijoDelNegocio = valorNegocio;
		esNacional = true;
		marca = unaMarca;
		
	}
}