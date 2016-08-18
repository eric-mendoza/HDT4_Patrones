import org.junit.Test;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.*;

/**
 * Clase donde se haran las  pruebas unitarias de la clases calculadora.
 * @author Eric Mendoza 15002
 * @author Jonnathan Juarez 15377
 * @since 17/08/2016
 * @version 2.0
 */
public class CalculadoraTest {
    private Calculadora calculadora = Calculadora.getInstance();
    /**
     * Prueba que calculadora devuelve una instancia de si misma, nose puede instancia mas veces
     */
    @Test
    public void getInstance() throws Exception {
        assertThat(Calculadora.getInstance(), instanceOf(Calculadora.class));
    }
    /**
     * Prueba la funcion operar usando como memoria un Vector
     */
    @Test
    public void operarVector() throws Exception {
        String stringTest = "2 2 +";
        int num = 4;
        int  result = calculadora.operar(stringTest, "Vector", "Vector");
        assertEquals(num,result);
    }
    /**
     * Prueba la funcion operar usando como memoria un Array
     */
    @Test
    public void operarArrayList() throws Exception {
        String stringTest = "2 2 +";
        int num = 4;
        int  result =  calculadora.operar(stringTest, "ArrayList", "ArrayList");
        assertEquals(num,result);
    }
    /**
     * Prueba la funcion operar usando como memoria una lista simplemente encadenada
     */
    @Test
    public void operarListaSimple() throws Exception {
        String stringTest = "2 2 +";
        int num = 4;
        int result = calculadora.operar(stringTest, "Lista", "Simple");
        assertEquals(num,result);
    }
    /**
     * Prueba la funcion operar usando como memoria una lista doblemente encadenada
     */
    @Test
    public void operarListaDoble() throws Exception {
        String stringTest = "2 2 +";
        int num = 4;
        int  result = calculadora.operar(stringTest, "Lista", "Doble");
        assertEquals(num,result);
    }
    /**
     * Prueba la funcion operar usando como memoria una lista circularmente
     */
    @Test
    public void operarListaCircular() throws Exception {
        String stringTest = "2 2 +";
        int num = 4;
        int  result =  calculadora.operar(stringTest, "Lista", "Circular");
        assertEquals(num,result);
    }
    /**
     * Prueba la funcion sumar
     */
    @Test
    public void sumar() throws Exception {
        int operacion =calculadora.sumar(3,4);
        int result = 7;
        assertEquals(result,operacion);

    }
    /**
     * Prueba la funcion restar
     */
    @Test
    public void restar() throws Exception {
        int operacion = calculadora.restar(100,69);
        int resultado = 31;
        assertEquals(operacion,resultado);

    }
    /**
     * Prueba la funcion multiplicar
     */
    @Test
    public void multiplicar() throws Exception {
        int operacion = calculadora.multiplicar(10,69);
        int resultado = 690;
        assertEquals(operacion,resultado);
    }
    /**
     * Prueba la funcion dividir
     */
    @Test
    public void dividir() throws Exception {
        int operacion = calculadora.dividir(100,10);
        int resultado = 10;
        assertEquals(operacion,resultado);
    }

}
