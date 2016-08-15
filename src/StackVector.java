import java.util.Vector;

/**
 * Implementacion de la interfaz Stack en forma de vector
 * @author Eric Mendoza 15002
 * @author Jonnathan Juarez 15377
 * @since 14/08/2016
 * @version 2.0
 */

public class StackVector<E> extends AbstractStack<E> {
    protected Vector<E> data;

    /**
     * Constructor, construye un stack vacio
     */
    public StackVector() {
        data = new Vector<E>();
    }

    /**
     * Agrega un valor a la cabeza del stack
     * @param item es el elemento que se desea agregar
     */
    @Override
    public void push(E item) {
        data.add(item);
    }

    /**
     * Retorna el valor que se encuentra a la cabeza del stack
     * @return retorna el ultimo elemento agregado
     */
    public E pop() {
        return data.remove(size()-1);
    }

    /**
     * Muestra el elemento que se encuentra a la cabeza del stack
     * @return retorna el ultimo elemento agregado
     */
    public E peek() {
        return data.get(size() - 1);
    }

    /**
     * Para saber el tamano actual del stack
     * @return retorna el numero de elementos en el stack
     */
    public int size() {
        return data.size();
    }

}