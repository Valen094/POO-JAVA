import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.JOptionPane;

//ROBOT
public class Proceso {
	
	private String id;
	private String nombre;
	private int edad;
	private String tipo;
	
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
    	return edad;
    }
    
    public void setEdad(int edad) {
    	this.edad = edad;
    }
    
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public Proceso (String id, String nombre, int edad, String tipo) {
    	
    	this.id = id;
    	this.nombre = nombre;
    	this.edad = edad;
    	this.tipo = tipo;
    	
    }

    public Proceso() {
		// TODO Auto-generated constructor stub
	}

	public void mostrarInformacion() {
        JOptionPane.showMessageDialog(null, "------------Información----------\n" +
                "Identificación: " + id + "\n" +
                "Nombre: " + nombre + "\n" +
                "Tipo: " + tipo + "\n" +
                "Edad: " + edad + " años\n" +
                "---------------------------------");
    }
    
    public void ingresarDatos () {
    	id = JOptionPane.showInputDialog("Ingrese el ID del robot");
    	nombre = JOptionPane.showInputDialog("Ingrese el nombre del robot");
    	edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del robot"));
    	tipo = JOptionPane.showInputDialog("Ingrese el tipo de robot");
    }
    
    public static void main(String[] args) {
    	ArrayList<Proceso> listaRobots = new ArrayList<>();
    	HashMap<String, Proceso> mapRobots = new HashMap<>();
    	
    	int opcion =0;
    	String menu;
    	
    	do {
			
		
    	menu = "1 - Registrar Robot\n"
    		+ "2 - Consultar Robot\n"
    		+ "3 - Consultar lista de Robots\n"
    		+ "4 - Salir";   
    	
    	opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));
    	
    	switch (opcion) {
		case 1:
            Proceso robot = new Proceso();
            robot.ingresarDatos();
            listaRobots.add(robot);
            mapRobots.put(robot.getId(), robot);
			break;
		
		case 2: 
			
            String consulta = JOptionPane.showInputDialog("Ingrese la identificación del robot a consultar: ");
            if (mapRobots.containsKey(consulta)) {
                Proceso robotConsultado = mapRobots.get(consulta);
                robotConsultado.mostrarInformacion();
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró ningun robot con la identificación ingresada.");
            }
            
            break;
        
		case 3:
            String lista = "Lista de robots:\n";
            for (Proceso robotLista : listaRobots) {
                lista += "Identificación: " + robotLista.getId() + ", Nombre: " + robotLista.getNombre() + "\n";
            }
            JOptionPane.showMessageDialog(null, lista);
			break;
			
		case 4:
			JOptionPane.showMessageDialog(null, "SALIENDO");
			break;

		default:
			
			JOptionPane.showMessageDialog(null, "Numero fuera de rango, intente nuevamente");

			break;
			
			}
    	} while (opcion != 4);
    }
}
