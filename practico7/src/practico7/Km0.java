package practico7;

//Implemento la clase Km0 que hereda de Producto sus atributos y métodos.
public class Km0 extends Producto {
	private float nKm; //el único atributo propio de esta clase es el nKm que indica el quilometraje del coche.
	
	//Método constuctor que incluye los atributos heredados del padre y el suyo propio.
	public Km0(String matricula, String color, String modelo, float nKm) {
		super(matricula, color, modelo);
		this.nKm = nKm;
	}
	//Método para mostrar los datos del objeto perteneciente a la clase Km0.
	public void mostrarDatos () {
		System.out.println("Los datos del coche kílometro 0 selecinado son:" 
				+"\nMatrícula: "+ getMatricula()+"."
				+"\nColor: "+ getColor()+"."
				+"\nModelo: "+getModelo()+"."
				+"\nNúmero de Kilómetros: "+nKm+".\n");
	}
	//getters y Setters para el atributo de la clase Km0, el resto de métodos ya los ha heredado del padre exceptuando mostrarDatos.
	public float getnKm() {
		return nKm;
	}

	public void setnKm(float nKm) {
		this.nKm = nKm;
	}
}
