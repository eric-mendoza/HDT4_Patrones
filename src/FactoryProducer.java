/**
 * Esta clase devuelve un factory en funcion de lo que el usuario desea, pudiendo ser StackList, StackVector
 * o StackArrayList factory
 * @author Eric Mendoza 15002
 * @author Jonnathan Juarez 15377
 * @since 15/08/2016
 * @version 1.0
 */
public class FactoryProducer {
    /**
     * Metodo que devuelve el tipo de factory que se desea
     * @param factorial Este parametro define que tipo de factory se instanciara
     * @return Retorna una factory
     */
    public static AbstractStackFactory getFactory(String factorial){
        if(factorial.equalsIgnoreCase("Lista")){
            return new StackListFactory();

        }else if(factorial.equalsIgnoreCase("Vector")){
            return new StackVectorFactory();

        }else if(factorial.equalsIgnoreCase("ArrayList")){
            return new StackArrayListFactory();
        }

        return null;
    }
}
