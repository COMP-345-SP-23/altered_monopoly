package edu.ithaca.barr;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class RailRoadCompaniesTest {
    
    @Test 
    public void mortgageTest(){
        Player player = new Player("Thimble");
        RailRoadCompanies rrc = new RailRoadCompanies("Short Line", 200, 50);
        rrc.setOwner(player);
        assertFalse(rrc.getMortgage());
        assertEquals(1500, player.getMoney());

        rrc.mortgage();
        assertTrue(rrc.getMortgage());
        assertEquals(1700, player.getMoney());
    }

    @Test
    public void getSetOwnerTest(){
        Player player = new Player("Thimble");
        RailRoadCompanies rrc = new RailRoadCompanies("BoardWalk", 200, 50);

        rrc.setOwner(player);
        assertEquals(player, rrc.getOwner());
    }
}
