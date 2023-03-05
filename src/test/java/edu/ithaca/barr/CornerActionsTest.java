package edu.ithaca.barr;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CornerActionsTest {
    
    @Test
    public void getToJailTest(){

        CornerActions jail = new CornerActions("Jail", false);//not a call to go to jail
        CornerActions toJail = new CornerActions("Go to Jail", true); //calls true to go to jail
        assertEquals(false, jail.getToJail());
        assertEquals(true, toJail.getToJail());
    }
}
