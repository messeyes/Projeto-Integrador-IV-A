import org.example.Calculadora;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest{

    @Test
    void testSoma(){
        Double resultado = Calculadora.realizarCalculo(10.0, 5.0,"+");
        assertEquals(15.0,resultado);
    }

    @Test
    void testSubtracao(){
        Double resultado = Calculadora.realizarCalculo(10.0,5.0,"-");
        assertEquals(5.0, resultado);
    }

    @Test
    void testMultiplicacao(){
        Double resultado = Calculadora.realizarCalculo(10.0,5.0,"*");
        assertEquals(50.0, resultado);
    }

    @Test
    void testDivisao(){
        Double resultado = Calculadora.realizarCalculo(10.0,2.0,"/");
        assertEquals(5.0, resultado);
    }

    @Test
    void testDivisaoPorZero(){
        Double resultado = Calculadora.realizarCalculo(10.0,0.0,"/");
        assertNull(resultado);
    }

    @Test
    void testOperacaoInvalida(){
        Double resultado = Calculadora.realizarCalculo(10.0,5.0,"%");
        assertNull(resultado);
    }
}