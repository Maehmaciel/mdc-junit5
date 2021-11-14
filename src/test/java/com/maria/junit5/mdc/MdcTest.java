package com.maria.junit5.mdc;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 *
 * @author maeh
 */
public class MdcTest {
   

    @Test
    void mdc_30_12() {
      assertEquals(Mdc.segundaFormaCalculoMdc(30, 12),6);
    }
    
    @Test
    void mdc_30_15_error() {
      assertNotEquals(Mdc.segundaFormaCalculoMdc(30, 15),6);
    }
    
     @Test
    void mdc_30_15() {
      assertNotEquals(Mdc.segundaFormaCalculoMdc(30, 15),5);
    }


    
}