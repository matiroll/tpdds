package tp1;

public class Venta {
	
	private String fechaDeVenta;
	private int cantidadVendida;
	private Prenda prenda;
	
	public Venta(String fecha,int cantidad, Prenda laPrenda){
		
		fechaDeVenta = fecha;
		cantidadVendida = cantidad;
		prenda = laPrenda;
		
	}
}
