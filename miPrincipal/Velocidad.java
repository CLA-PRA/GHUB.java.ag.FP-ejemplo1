package miPrincipal;
import java.util.Scanner;

public class Velocidad {
    public  Velocidad() {
        // declaracion de variables
		int d=0;
	    Scanner entrada = new Scanner (System.in);		
		System.out.print("Proporciona tiempo en seg: ");
		int t=entrada.nextShort();
		System.out.print("Proporciona Velocidad en mts/seg:");
		int v=entrada.nextShort();

        d = calculaVelocidad(t, v);
        
		System.out.print("Distancia = ");
		System.out.print(d);
        System.out.println(" mts.");
        entrada.close();
            
    }
    public int calculaVelocidad(int t, int v){
        return t*v;
    }

    
}