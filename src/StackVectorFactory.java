/**
 * Esta clase devuelve stacks del tipo StackVector
 * @author Eric Mendoza 15002
 * @author Jonnathan Juarez 15377
 * @since 15/08/2016
 * @version 1.0
 */
public class StackVectorFactory extends AbstractStackFactory{
    @Override
    <E> Stack<E> getStack(String vector) {
        if (vector.equalsIgnoreCase("Vector")){
            return new StackVector<E>();
        }
        return null;
    }

}
