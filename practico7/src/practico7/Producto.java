package practico7;
//Aquí implemento los atributos que van a tener en común las clases hijo.
public class Producto {
	private String matricula; 	//Matrícula del coche.
	private String color;		//Color del choche.
	private String modelo;		//Marca y modelo del coche. 

	//método contructor de la clase producto.
	public Producto(String matricula, String color, String modelo) {
		super();
		this.matricula = matricula;
		this.color = color;
		this.modelo = modelo;
	}
	//Setters y getters de los atributos de la clase.
	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

}
