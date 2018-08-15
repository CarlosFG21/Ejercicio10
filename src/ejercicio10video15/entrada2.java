
package ejercicio10video15;

import java.util.*;
import javax.swing.JOptionPane;

public class entrada2 {
    
    public void utilizar(){
        
        String num1 = JOptionPane.showInputDialog("INTRODUCE UN NUMERO");
        
        double num2 = Double.parseDouble(num1);
        
        System.out.print("LA RAIZ DE " + num1 + " ES:");
        
        System.out.printf("%1.1f", Math.sqrt(num2));
        
    }
}
