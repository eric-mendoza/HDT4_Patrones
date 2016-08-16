/**
 * Created by Eric on 15/08/2016.
 */
public class StackCircularList<E> extends AbstractStack<E> {
    protected CircularList<E> data;

    /**
     * Constructor, construye un stack vacio
     */
    public StackCircularList() {
        data = new CircularList<E>();
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
