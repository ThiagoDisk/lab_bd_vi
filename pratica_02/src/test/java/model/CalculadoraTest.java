package model;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraTest {

    Calculadora calc = new Calculadora();

    //PARTICAO 1
    //VALOR MAIS PERTO DE 0
    //CT: <1,1>
    @Test
    public void testeArranjoPertoZero() {
        int resultado = calc.arranjo(1,1);
        assertEquals(1,resultado);
    }

    //VALOR MAIS PERTO DE 6
    //CT: <5,120>
    @Test
    public void testeArranjoPertoCinco() {
        int resultado = calc.arranjo(5,5);
        assertEquals(120,resultado);
    }

    //PARTICAO NULA
    // CT:<0,0>
    @Test
    public void testeArranjoZero() {
        double resultado = calc.arranjo(0,0);
        assertEquals(0, resultado);
    }
}
