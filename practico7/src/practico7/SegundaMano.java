package practico7;

//Implemento la clase SegundaMano que hereda de Producto sus atributos y métodos.
public class SegundaMano extends Producto {
	private float nKm;					//kilometraje del coche.
	private String antiguoPropietario;	//Nombre y apellidos del antiguo propetiario.
	
	//Método constuctor que incluye los atributos heredados del padre y los suyos propios.
	public SegundaMano(String matricula, String color, String modelo, float nKm, String antiguoPropietario) {
		super(matricula, color, modelo);
		this.nKm = nKm;
		this.antiguoPropietario = antiguoPropietario;
	}
	//Método para mostrar los datos del objeto perteneciente a la clase SegundaMano.
	public void mostrarDatos () {
		System.out.println("Los datos del coche de segunda mano selecinado son:" 
				+"\nMatrícula: "+ getMatricula()+"."
				+"\nColor: "+ getColor()+"."
				+"\nModelo: "+getModelo()+"."
				+"\nNúmero de Kilómetros: "+nKm+"."
				+"\nNombre del antiguo propietario: "+antiguoPropietario+".\n");
	}

	//getters y Setters para los atributos de la clase SegundaMano, el resto de métodos ya los ha heredado del padre exceptuando mostrarDatos.
	public float getnKm() {
		return nKm;
	}

	public void setnKm(float nKm) {
		this.nKm = nKm;
	}

	public String getAntiguoPropietario() {
		return antiguoPropietario;
	}

	public void setAntiguoPropietario(String antiguoPropietario) {
		this.antiguoPropietario = antiguoPropietario;
	}

}
