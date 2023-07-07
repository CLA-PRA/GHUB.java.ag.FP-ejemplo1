package miTest;

import miPrincipal.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

//import java.beans.Transient;

class AppTest {

    
    
    @Test
    void prueba1(){
        Velocidad v = new Velocidad();
        
        assertTrue(v.calculaVelocidad(5, 7)==35);
        
    }
    
    
}