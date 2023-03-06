package edu.ithaca.barr;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class CornerActionsTest {
    
    @Test
    public void getToJailTest(){

        CornerActions jail = new CornerActions("Jail", false);//doesn't include a call to go to jail
        CornerActions toJail = new CornerActions("Go to Jail", true); //calls true to go to jail
        assertFalse(jail.getToJail());
        assertTrue(toJail.getToJail());
    }
}
