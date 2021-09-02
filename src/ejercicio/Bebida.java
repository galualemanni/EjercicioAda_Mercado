package ejercicio;

public class Bebida extends Producto {
	// atributos
	float litros;

// metodo constructor
	public Bebida(float precio, int codigo, float litros) {
		super(precio, codigo);
		this.litros = litros;

	}

	public Bebida() {

	}

	public void Mostrardatos() {
		System.out.println("Bebida\n->Codigo = " + codigo + "\n->Precio = " + precio + "\nPeso en Kg = " + litros);
	}

	public String toString() {
		return "Bebida\n->Codigo = " + codigo + "\n->Precio = " + precio + "\n->Cantidad en litros = " + litros;

	}

}
