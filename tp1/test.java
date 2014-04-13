package tp1;

public class test {
	
	public static void main(String[] args) { 
		 Marca armani;
		 Marca sarkany;
		 armani = new Armani();
		 sarkany = new Sarkany();
		 Saco saco = new Saco(200,true,armani,4); //Parametros ValorDelNegocio, Nacional?, Marca y cantidadBotones
		 Pantalon pantalon = new Pantalon(200,false,sarkany,50); //Parametros ValorDelNegocio, Nacional?, Marca y CantidadTelaUsada
		 Zapato zapato = new Zapato(200,false,sarkany,42);//Parametros ValorDelNegocio, Nacional?, Marca y Talle
		 Sombrero sombrero = new Sombrero(200,false,armani,5);//Parametros ValorDelNegocio, Nacional?, Marca y CoeficienteMetroSexualidad
		 Camisa camisa = new Camisa(200,true,armani); //Parametros ValorDelNegocio, Nacional?, Marca
		 
		 
		 System.out.println("Precio Final:");
		 System.out.println("Saco: " + saco.precioFinal());
		 System.out.println("Pantalon: " + pantalon.precioFinal());
		 System.out.println("Zapato: " + zapato.precioFinal());
		 System.out.println("Sombrero: " + sombrero.precioFinal());
		 System.out.println("Camisa: "+ camisa.precioFinal());
		 		 
		 }
}