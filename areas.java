import java.util.*;
import javax.swing.*;

public class Areas {
    public static void main(String[] args) {
        
        // usuario elige que elemento tenemos que calcular
        Scanner entrada = new Scanner(System.in);
        System.out.println("Elige una opción: \n1: Cuadrado \n2: Rectángulo \n3: Triángulo \n4: Círculo");
        int figura = entrada.nextInt();
        
        switch (figura){
        
            case 1:
                int lado = Integer.parseInt(JOptionPane.showInputDialog("Introduce cm lado"));
                System.out.println("El area del cuadrado es " + Math.pow(lado, 2));
                break;
            
            case 2:
                int base = Integer.parseInt(JOptionPane.showInputDialog("Introduce cm base"));
                int altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce cm altura"));
                System.out.println("El area del rectángulo es " + (base * altura));   
                break;
            
            case 3:
                int baseT = Integer.parseInt(JOptionPane.showInputDialog("Introduce cm base"));
                int alturaT = Integer.parseInt(JOptionPane.showInputDialog("Introduce cm altura"));
                System.out.println("El area del triángulo es " + (baseT * alturaT)/2 );
                break;
            
            case 4:
                int radio = Integer.parseInt(JOptionPane.showInputDialog("Introduce cm radio"));
                System.out.print("El area del círculo es ");
                System.out.printf("%1.2f", Math.PI * (Math.pow(radio, 2)));    
                break;
        }
    }
}
