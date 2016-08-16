/**
 * Stack que utiliza como memoria una lista doblemente encadenada.
 * @author Eric Mendoza 15002
 * @author Jonnathan Juarez 15377
 * @since 14/08/2016
 * @version 2.0
 */
public class StackDoublyLinkedList<E> extends AbstractStack<E> {
    protected DoublyLinkedList<E> data;

    /**
     * Constructor, construye un stack vacio
     */
    public StackDoublyLinkedList() {
        data = new DoublyLinkedList<E>();
    }

    /**
     * Agrega un valor a la cabeza del stack
     * @param item es el elemento que se desea agregar
     */
    @Override
    public void push(E item) {
        data.addLast(item);
    }

    /**
     * Retorna el valor que se encuentra a la cabeza del stack
     * @return retorna el ultimo elemento agregado
     */
    @Override
    public E pop() {
        return data.removeLast();
    }

    /**
     * Muestra el elemento que se encuentra a la cabeza del stack
     * @return retorna el ultimo elemento agregado
     */
    @Override
    public E peek() {
        return data.getLast();
    }

    /**
     * Para saber el tamano actual del stack
     * @return retorna el numero de elementos en el stack
     */
    @Override
    public int size() {
        return data.size();
    }
}
