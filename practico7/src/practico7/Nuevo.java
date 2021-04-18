package practico7;

//Implemento la clase Km0 que hereda de Producto sus atributos y métodos.
public class Nuevo extends Producto {
	
	//Este tipo de producto no tiene atributos propios asi que
	//implemento directamente el método constructor.
	public Nuevo(String matricula, String color, String modelo) {
		super(matricula, color, modelo);
	}
	
	//Método para mostrar los datos del objeto perteneciente a la clase Nuevo.
	public void mostrarDatos () {
		System.out.println("Los datos del coche nuevo selecinado son:" 
				+"\nMatrícula: "+ getMatricula()+"."
				+"\nColor: "+ getColor()+"."
				+"\nModelo: "+getModelo()+".\n" );
	}
	//No necesita setters y getters ya que solo usa los atributos y métodos del padre exceptuando mostrarDatos.
}
