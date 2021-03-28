package pratica_01;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
public class CalculadoraTest {
	Calculadora calc = new Calculadora();
	
//Este teste ira validar o o calculo do metodo Calculadora.Arranjo e analisar o valor esperado.
	@Test
	public void calcArranjo() {
		assertEquals(3, calc.arranjo(4,2));
	}
}
