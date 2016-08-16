/**
 * Clase abstracta que sirve para obtener las factories de los tres tipos de stack
 * @author Eric Mendoza 15002
 * @author Jonnathan Juarez 15377
 * @since 14/08/2016
 * @version 1.0
 */
public abstract class AbstractStackFactory<E> {
    abstract Stack<E> getStackList(String list);
    abstract Stack<E> getStackVector(String vector);
    abstract Stack<E> getStackArrayList(String arrayList);
}