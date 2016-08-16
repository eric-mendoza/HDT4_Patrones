/**
 * Esta clase devuelve stacks del tipo StackVector
 * @author Eric Mendoza 15002
 * @author Jonnathan Juarez 15377
 * @since 15/08/2016
 * @version 1.0
 */
public class StackVectorFactory extends AbstractStackFactory{
    @Override
    Stack getStackList(String list) {
        return null;
    }

    @Override
    Stack getStackVector(String vector) {
        if (vector.equalsIgnoreCase("Vector")){
            return new StackVector();
        }
        return null;
    }

    @Override
    Stack getStackArrayList(String arrayList) {
        return null;
    }
}
