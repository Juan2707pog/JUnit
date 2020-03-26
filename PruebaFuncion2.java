import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PruebaFuncion2 {

	static Funcion2 funcion = null;

	@DisplayName("Test de Caja Negra Valor Limite Inferior -1")
	@Test
	void Prueba2() {
		assertEquals(false,funcion.funcion2(Integer.MIN_VALUE-1)); 
	}
}
