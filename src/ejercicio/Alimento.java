package ejercicio;

public class Alimento extends Producto {
	float kilos;

	public Alimento(float precio, int codigo, float kilos) {
		super(precio, codigo);
		this.kilos = kilos;

	}

	public void mostrarDatos() {
		System.out.println("Alimento\n->Codigo = " + codigo + "\n->Precio = " + precio + "\nPeso en Kg = " + kilos);
	}

	public String toString() {
		return "Alimento\n->Codigo = " + codigo + "\n->Precio = " + precio + "\n->Peso en Kg = " + kilos;

	}

	public Alimento() {

	}
}
