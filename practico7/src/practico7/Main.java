package practico7;
//Clase Main donde se van a crear e utilizar los objetos.
public class Main {
	public static void main(String[] args) {
		Km0 uno = new Km0("8567YXM", "Azul", "Mercedes GLC Coupé", 1600.78f);	//Creo un objeto uno de la clase Km0 con sus respectivos datos.
		Nuevo dos = new Nuevo ("4526JLK", "Negro", "Tesla Modelo S");	//Creo un objeto dos de la clase Nuevo con sus respectivos datos.
		SegundaMano tres = new SegundaMano("8732PKM", "Rojo", "Citroen C3 Picasso", 37000.67f, "Julián Medina Perez");	//Creo un objeto uno de la clase SegundaMano con sus respectivos datos.
		
		//Utilizo el método mostrar datos de cada clase para imprimir en pantalla los atributos de los objetos
		uno.mostrarDatos();
		dos.mostrarDatos();
		tres.mostrarDatos();
	}

}
