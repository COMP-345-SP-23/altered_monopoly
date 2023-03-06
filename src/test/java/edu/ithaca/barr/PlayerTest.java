package edu.ithaca.barr;

import org.junit.jupiter.api.Test;

import edu.ithaca.barr.bank.InsufficientFundsException;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

public class PlayerTest {
    
    @Test
    public void setGetJail(){
        Player player = new Player("Top Hat");
        assertFalse(player.getJail());
        player.setJail(true);
        assertTrue(player.getJail());
    }

    @Test
    public void movePieceGetLocationTest(){
        Player player = new Player("Top Hat");
        ArrayList<Integer> board = new ArrayList<Integer>();
        for (int i=0; i<40; i++){
            board.add(i);
        }
        player.movePiece(2, player);//lowest possible move
        assertEquals(2, player.getLocation());
        player.movePiece(12, player);//highest possible move
        assertEquals(14, player.getLocation());
        player.movePiece(5, player);//basic middle number
        player.movePiece(1, player);
        player.movePiece(12, player);
        assertEquals(32, player.getLocation());
        player.movePiece(6, player);
        assertEquals(38, player.getLocation());
        player.movePiece(4, player);
        assertEquals(2, player.getLocation());//testing for looping around the end to the beginning of the board
    }

    @Test
    public void collectGetMoneyTest(){
        Player player = new Player("Thimble");
        assertEquals(1500, player.getMoney());
        player.collect(200);//basic middle number
        assertEquals(1700, player.getMoney());
        player.collect(0);//handling 0
        assertEquals(1700, player.getMoney());
        player.collect(2000);//higher end number
        assertEquals(3700, player.getMoney());
    }

    @Test 
    public void payUpGetMoneyTest() throws InsufficientFundsException{
        Player player = new Player("Thimble");
        assertEquals(1500, player.getMoney());
        player.payUp(200);//basic middle number
        assertEquals(1300, player.getMoney());
        player.payUp(0);//handle 0
        assertEquals(1300, player.getMoney());
        assertThrows(InsufficientFundsException.class, () -> player.payUp(2000));//trying to take away more than player has
    }

    @Test
    public void getPropertiesTest(){
        Player player = new Player("Thimble");
        Property property1 = new Property("BoardWalk", 400, 50);
        Property property2 = new Property("name", 50, 50);
        assertEquals(0, player.getProperties().size());
        player.buyPropertyProperty(property1, player);
        player.buyPropertyProperty(property2, player);
        assertEquals(2, player.getProperties().size());
    }

    @Test
    public void getRailRoadCompaniesTest(){
        Player player = new Player("Thimble");
        RailRoadCompanies rrc1 = new RailRoadCompanies("Short Line", 200, 25);
        RailRoadCompanies rrc2 = new RailRoadCompanies("Water Works", 200, 25);
        assertEquals(0, player.getRailRoadCompanies().size());
        player.buyPropertyRRC(rrc1, player);
        player.buyPropertyRRC(rrc2, player);
        assertEquals(2, player.getRailRoadCompanies().size());
    }

    @Test
    public void getPropertiesStringTest(){
        Player player = new Player("Thimble");
        Property property1 = new Property("BoardWalk", 400, 50);
        RailRoadCompanies rrc1 = new RailRoadCompanies("Short Line", 200, 25);
        player.buyPropertyProperty(property1, player);
        player.buyPropertyRRC(rrc1, player);
        assertEquals("BoardWalk: 0 houses, 0 hotels, base rent: 50, mortgaged: false\nShort Line: rent: 25, mortgaged: false\n", player.getPropertiesString());
    }

    @Test
    public void getGamePieceTest(){
        Player player = new Player("Thimble");
        assertEquals("Thimble", player.getGamePiece());
    }

    @Test
    public void buyPropertyPropertyTest(){
        Player player = new Player("Thimble");
        Property property1 = new Property("BoardWalk", 400, 50);
        Property property2 = new Property("name", 50, 50);
        assertEquals(0, player.getProperties().size());
        player.buyPropertyProperty(property1, player);
        player.buyPropertyProperty(property2, player);
        assertEquals(2, player.getProperties().size());
    }

    @Test
    public void buyPropertyRRCTest(){
        Player player = new Player("Thimble");
        RailRoadCompanies rrc1 = new RailRoadCompanies("Short Line", 200, 25);
        RailRoadCompanies rrc2 = new RailRoadCompanies("Water Works", 200, 25);
        assertEquals(0, player.getRailRoadCompanies().size());
        player.buyPropertyRRC(rrc1, player);
        player.buyPropertyRRC(rrc2, player);
        assertEquals(2, player.getRailRoadCompanies().size());
    }

}
