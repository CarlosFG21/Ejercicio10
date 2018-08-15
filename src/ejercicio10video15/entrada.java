
package ejercicio10video15;

import java.util.*;
import javax.swing.JOptionPane;

public class entrada {
    
    public void mensaje(){
        
        String nombre;
        
        nombre = JOptionPane.showInputDialog("INTRODUCE TU NOMBRE, POR FAVOR");
        
        String edad;
        
        edad = JOptionPane.showInputDialog("INTRODUCE TU EDAD, POR FAVOR");
        
        int edad2 = Integer.parseInt(edad);
        
        edad2++;
        
       System.out.println("HOLa " + nombre + " EL AÑO QUE VIENE TENDRAS " + edad2 + " AÑOS");
        
    }
    
}
