package testprojet;

import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class TestJunit {
	
   String message = "Hello World";	
   

   @Test
   public void testPrintMessage() {
      assertEquals(6, new TestProjet().add(2,3));
   }
}