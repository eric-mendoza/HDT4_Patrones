/**
 * Esta clase devuelve stacks del tipo StackList en cualquiera de sus tres variedades
 * @author Eric Mendoza 15002
 * @author Jonnathan Juarez 15377
 * @since 14/08/2016
 * @version 1.0
 */
public class StackListFactory extends AbstractStackFactory {
    /**
     * Metodo que devuelve un stack tipo lista segun lo indicado por el usuario
     * @param list Es el tipo de StackList que se desea (Simple, doble o circular)
     * @return Devuelve un Stack
     */
    @Override
    <E> Stack<E> getStack(String list) {
        if (list.equalsIgnoreCase("Simple")){
            return new StackSinglyLinkedList<E>();

        } else if (list.equalsIgnoreCase("Doble")){
            return new StackDoublyLinkedList<E>();

        } else if (list.equalsIgnoreCase("Circular")){
            return new StackCircularList<E>();

        }

        return null;
    }
}
