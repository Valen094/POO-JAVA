import javax.swing.JOptionPane;

public class ClaseConMetodos {

	public static void main(String[] args) {
		
		double ladoA;
		double ladoB;
		
		ladoA = ingresarDatos ("Ingrese la longitud del lado A: ");
		ladoB = ingresarDatos("Ingrese la longitud del lado B: ");
		
		calcularArea(ladoA, ladoB);
	}
	
	public static double ingresarDatos (String mensaje) {
		String cadena;
		double valor;
		
		cadena = JOptionPane.showInputDialog(mensaje);
		valor = Double.parseDouble(cadena);
		
		return valor;
	}
	
	private static void calcularArea(double ladoA, double ladoB) {
		double resultado;
		resultado = ladoA * ladoB;
		JOptionPane.showMessageDialog(null, "El resultado es: " +  resultado);
	}


}
