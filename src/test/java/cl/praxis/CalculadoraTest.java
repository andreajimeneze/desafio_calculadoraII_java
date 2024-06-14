package cl.praxis;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

// Fase Roja: Crear clase y métodos de prueba
// Fase Verde en clase
// Fase Refactorización: Mejorar lógica clase Calculadora
public class CalculadoraTest {
 Calculadora calculadora;
    @BeforeEach
    void setUp() {
        calculadora = new Calculadora();
    }

    @Test
     void testRestar() {
        int resultadoResta = calculadora.restar(4,2);
        assertEquals(2, resultadoResta);
    }

    @Test
     void testSumar() {
        int resultadoSuma = calculadora.sumar(4,2);
        assertEquals(6, resultadoSuma);
    }
    @Test

     void testMultiplicar() {
        int resultadoMultiplicacion = calculadora.multiplicar(4,2);
        assertEquals(8, resultadoMultiplicacion);
    }

    @Test

     void testDividir() {
        double resultadoDivision = calculadora.dividir(4,2);
        assertEquals(2, resultadoDivision);
    }
}
