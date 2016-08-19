/**
 * Esta clase devuelve stacks del tipo StackArrayList
 * @author Eric Mendoza 15002
 * @author Jonnathan Juarez 15377
 * @since 15/08/2016
 * @version 1.0
 */
public class StackArrayListFactory extends AbstractStackFactory {
    @Override
    <E> Stack<E> getStack(String arrayList) {
        if (arrayList.equalsIgnoreCase("ArrayList")){
            return new StackArrayList<E>();
        }
        return null;
    }

}
