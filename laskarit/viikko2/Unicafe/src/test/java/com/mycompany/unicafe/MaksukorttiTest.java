package com.mycompany.unicafe;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class MaksukorttiTest {

    Maksukortti kortti;

    @Before
    public void setUp() {
        kortti = new Maksukortti(10);
    }

    @Test
    public void luotuKorttiOlemassa() {
        assertTrue(kortti!=null);      
    }
    
    @Test
    public void saldoAlussaOikein() {
        assertTrue(kortti.saldo() == 10);      
    }
    
    @Test
    public void latausToimiiOikein() {
        kortti.lataaRahaa(20);
        assertTrue(kortti.saldo() == 30);      
    }
    
    @Test
    public void saldoVaheneeKunRahaaOn() {
        kortti.otaRahaa(5);
        assertTrue(kortti.saldo() == 5);      
    }
    
    @Test
    public void saldoEiVahene() {
        kortti.otaRahaa(20);
        assertTrue(kortti.saldo() == 10);      
    }
    
    @Test
    public void saldoVaheneeKunRahaaOnTrue() {
        assertTrue(kortti.otaRahaa(5));     
    }
    
    @Test
    public void saldoEiVaheneFalse() {
        assertFalse(kortti.otaRahaa(20));      
    }
    
    
}
