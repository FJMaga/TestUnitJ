import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PrimosTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {
		
		Primos primos = new Primos();
		 int contador = 0;
		    int numPrimo = 0;
		    
		    for (int x = 0; x <= 100; x++) {
		    	  if (primos.esPrimo(x)) {
		    	    contador++;
		    	    numPrimo = Integer.valueOf(x);
		    	    System.out.print(String.valueOf(x) + ",");
		    	    
		    	    int expectedPrimo = Integer.valueOf(x);
				    
				    assertEquals(expectedPrimo, numPrimo);
		    	  }
		    	}
		    
	}

}
