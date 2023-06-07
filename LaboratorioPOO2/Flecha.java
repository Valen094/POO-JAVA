package Laboratorio;
import javax.swing.JOptionPane;

public class Flecha {
  int longitud;
  String color;

  public Flecha() {
      longitud = 18;
      color = "negro";
  }

  public Flecha(int longitud, String color) {
      this.longitud = longitud;
      this.color = color;
  }

  
  public void imprimir(String simbolo) {
      if (color.equals("negro")) {
          System.out.print(simbolo);
      } else {
          System.err.print(simbolo);
      }
  }

  public void construirFlecha() {
      for (int i = 0; i < longitud; i++) {
          imprimir("-");
      }
      imprimir("> \n");
  }
}

public class Principal {
	
  Flecha flecha1, flecha2, flecha3;

  public static void main(String[] args) {
      Principal miPrincipal = new Principal();
  }

  public Principal() {

      flecha1 = new Flecha();
      flecha1.longitud = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la longitud de la flecha 1:"));
      flecha1.color = JOptionPane.showInputDialog("Ingrese el color de la flecha 1:");
      flecha1.construirFlecha();

   flecha2 = new Flecha();
   flecha2.longitud = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la longitud de la flecha 2:"));
   flecha2.color = JOptionPane.showInputDialog("Ingrese el color de la flecha 2:");
   flecha2.construirFlecha();


      int longitud = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la longitud de la flecha 3:"));
      String color = JOptionPane.showInputDialog("Ingrese el color de la flecha 3:");
      flecha3 = new Flecha(longitud, color);
      flecha3.construirFlecha();
  }
}
