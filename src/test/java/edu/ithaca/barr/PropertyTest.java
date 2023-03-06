package edu.ithaca.barr;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.ithaca.barr.bank.InsufficientFundsException;

public class PropertyTest {
    
    @Test
    public void getBuyHouseHotelTest(){
        Property property = new Property("Boardwalk", 400, 50);
        assertEquals(0, property.getHouses());
        property.buyHouse();
        assertEquals(1, property.getHouses());
        property.buyHouse();
        property.buyHouse();
        assertEquals(3, property.getHouses());
        property.buyHouse();

        assertEquals(0, property.getHouses());
        property.buyHouse();
        assertEquals(1, property.getHouses());
        assertEquals(0, property.getHouses());
        assertThrows(InsufficientFundsException.class, () -> property.buyHouse());
    }

    @Test
    public void getSellHouseHotel(){
        Property property = new Property("Boardwalk", 400, 50);
        assertEquals(0, property.getHouses());
        property.buyHouse();
        property.buyHouse();
        property.buyHouse();
        assertEquals(4, property.getHouses());
        property.sellHouse();
        assertEquals(3, property.getHouses());
        property.buyHouse();

        property.buyHotel();
        assertEquals(1, property.getHotels());
        property.sellHotel();
        assertEquals(0, property.getHotels());

        assertThrows(InsufficientFundsException.class, () -> property.sellHouse());
        assertThrows(InsufficientFundsException.class, () -> property.sellHotel());

    }

    @Test
    public void calculateNewRentTest(){
        Property property = new Property("BoardWalk", 400, 50);
        assertEquals(50, property.getBaseRent());
        property.buyHouse();

        assertEquals(250, property.calculateNewRent());
        property.buyHouse();
        property.buyHouse();
        property.buyHouse();
        property.buyHotel();
        assertEquals(2050, property.calculateNewRent());
        property.buyHouse();
        assertEquals(2250, property.calculateNewRent());
    }

    @Test
    public void mortgageTest(){
        Player player = new Player("Thimble");
        Property property = new Property("BoardWalk", 400, 50);
        property.setOwner(player);
        assertFalse(property.getMortgage());
        assertEquals(1500, player.getMoney());

        property.mortgage();
        assertTrue(property.getMortgage());
        assertEquals(1700, player.getMoney());

    }

    @Test
    public void getSetOwnerTest(){
        Player player = new Player("Thimble");
        Property property = new Property("BoardWalk", 400, 50);

        property.setOwner(player);
        assertEquals(player, property.getOwner());
    }

}
