/**
 * Clase abstracta que sirve para obtener las factories de los tres tipos de stack
 * @author Eric Mendoza 15002
 * @author Jonnathan Juarez 15377
 * @since 14/08/2016
 * @version 1.0
 */
public abstract class AbstractStackFactory {
    abstract <E> Stack<E> getStack(String list);
}