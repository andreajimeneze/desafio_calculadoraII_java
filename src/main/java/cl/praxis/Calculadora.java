package cl.praxis;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

// Fase Verde Implementar métodos en clase
@Data
@NoArgsConstructor
@ToString
public class Calculadora {

    public int restar(int numero1, int numero2) {
       return numero1 - numero2;
    }

    public int multiplicar(int numero1, int numero2) {
        return numero1 * numero2;
    }

    public int sumar(int numero1, int numero2) {
        return numero1 + numero2;
    }

    public float dividir(int numero1, int numero2) {
        if(numero2 == 0)
            throw new ArithmeticException("Division by zero");
        return (float) numero1 / numero2;
    }

}
