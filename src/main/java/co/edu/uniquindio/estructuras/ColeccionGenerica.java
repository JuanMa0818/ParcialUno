package co.edu.uniquindio.estructuras;
/**
 * Esta interfaz es el contrato de nuestras colecciones.
 * Aquí solo decimos que se puede hacer (agregar, eliminar, obtener...),
 * y la clase que la implemente decide como lo hace.
 *
 * La T quiere decir que es genérica: sirve para guardar cualquier tipo
 * de dato (String, Integer, Paquete, etc.).
 *
 * extiende de iterable para que se pueda recorrer con un for-each.
 */

public interface ColeccionGenerica<T> extends Iterable<T> {

    // Agrega el elemento al final.
    void agregar(T elemento);

    // elimina el primer elemento que sea igual (equals).
    // Si no lo encuentra devuelve false
    boolean eliminar(T elemento);

    // Devuelve el elemento que está en esa posición (empieza desde 0)
    T obtener(int posicion);

    // Devuelve cuántos elementos hay
    int tamanio();

    // Devuelve true si no hay ningún elemento
    boolean estaVacia();
}
