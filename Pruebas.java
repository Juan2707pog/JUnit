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
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;



class PruebaFuncion7 {
	static Funcion7 o = null;
	
	


	@DisplayName("Test de Caja Negra Valor Limite inferior de R")
	@Test
	 static  void probarFuncioCadenaAlreves4() {
		String[] listaDeCadenas = {"Javier", "Carlos", "Limonxelo", "Carlitos"};
		assertEquals("ier, los, onx, lit", Funcion7.funcion7(listaDeCadenas)); 
	}
}
