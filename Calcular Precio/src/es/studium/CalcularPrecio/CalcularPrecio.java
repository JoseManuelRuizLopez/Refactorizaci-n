package es.studium.CalcularPrecio;

public class CalcularPrecio {

	public double calcularPrecio(int unidades, double precioUnitario)
	{		
		double iva = (precioUnitario * 21)/100;
	
		double precio = unidades * precioUnitario + iva;
		
		return precio;
	}

}
