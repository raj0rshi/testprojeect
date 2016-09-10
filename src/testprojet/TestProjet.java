/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testprojet;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 *
 * @author Rajorshi Biswas
 */
public class TestProjet {

    /**
     * @param args the command line arguments
     */
    
    
    public int add(int i, int j)
    {
        return i+j;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        
        System.out.println("Hellow worlld");
        Result result = JUnitCore.runClasses(testprojet.TestJunit.class);
		
      for (Failure failure : result.getFailures()) {
         System.out.println(failure.toString());
      }
    }
    
}
