package edu.ithaca.barr;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class PropertyTest {
    
    @Test
    public void getBuyHouseHotelTest(){
        Property property = new Property("Boardwalk", 400, 50);
        Player player = new Player("Thimble");
        property.setOwner(player);
        assertEquals(0, property.getHouses());
        property.buyHouse();//each just buying a house, expecting it to increment each time
        assertEquals(1, property.getHouses());
        property.buyHouse();
        property.buyHouse();
        assertEquals(3, property.getHouses());
        property.buyHouse();

        assertEquals(4, property.getHouses());
        //switches over to check that buying a single hotel chances house and hotel counts
        property.buyHotel();
        assertEquals(1, property.getHotels());
        assertEquals(0, property.getHouses());
    }

    @Test
    public void getSellHouseHotel(){
        Player player = new Player("Thimble");
        Property property = new Property("Boardwalk", 400, 50);
        property.setOwner(player);
        assertEquals(0, property.getHouses());
        property.buyHouse();
        property.buyHouse();
        property.buyHouse();
        assertEquals(3, property.getHouses());
        property.sellHouse();//simply selling a house when player has multiple
        assertEquals(2, property.getHouses());
        property.buyHouse();
        property.buyHouse();

        property.buyHotel();
        assertEquals(1, property.getHotels());
        property.sellHotel();//simply selling a hotel when player has 1
        assertEquals(0, property.getHotels());
    }

    @Test
    public void calculateNewRentTest(){
        Player player = new Player("Thimble");
        Property property = new Property("BoardWalk", 400, 50);
        property.setOwner(player);
        assertEquals(50, property.getBaseRent());
        //base rent without houses or hotels
        assertEquals(50, property.calculateNewRent());
        property.buyHouse();

        
        assertEquals(250, property.calculateNewRent());//new rent with 1 house
        property.buyHouse();
        property.buyHouse();
        property.buyHouse();
        property.buyHotel();
        assertEquals(2050, property.calculateNewRent());//new rent with 1 hotel
        property.buyHouse();
        assertEquals(2250, property.calculateNewRent());//new rent with 1 hotel, 1 house
    }

    @Test
    public void mortgageTest(){
        Player player = new Player("Thimble");
        Property property = new Property("BoardWalk", 400, 50);
        property.setOwner(player);
        assertFalse(property.getMortgage());
        //before mortgage
        assertEquals(1500, player.getMoney());

        property.mortgage();
        //after mortgage
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
