import javax.swing.JOptionPane;

public class Numeros {
	
	int numer;
	int i, neg =0, par=0;
	
	public void entrada(){
		for (int i = 0; i<5; i++) {
			
			numer = ingresarDatos("Digite 1 numero");
			if (numer%2 == 0) {
				par++;
			}
			
			if (numer<0) {
				neg++;
			}
			
		}
		JOptionPane.showMessageDialog(null, "El numero de numeros pares es: "
				+ par+"\n" + " y el numero de numeros negativos es: " + neg);
	}
	
	public static int ingresarDatos (String mensaje) {
		String cadena;
		int valor;
		cadena = JOptionPane.showInputDialog(mensaje);
		valor = Integer.parseInt(cadena);
		return valor;
	}

}
