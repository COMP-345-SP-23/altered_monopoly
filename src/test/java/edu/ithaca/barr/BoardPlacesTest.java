package edu.ithaca.barr;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BoardPlacesTest {
    
    @Test 
    public void checkTypeTest(){ //constructors are still empty
        //test for each individual type that extends BoardPlaces class
        BoardPlaces property = new Property("BoardWalk", 400, 50);
        assertEquals(0, property.checkType());
        BoardPlaces railRoadCompanies = new RailRoadCompanies("Short Line", 200, 25);
        assertEquals(1, railRoadCompanies.checkType());
        BoardPlaces taxPayment = new TaxPayments("Income Tax", 200);
        assertEquals(2, taxPayment.checkType());
        BoardPlaces cornerActions = new CornerActions("Free Parking", false);
        assertEquals(3, cornerActions.checkType());
        BoardPlaces deckPlace = new DeckPlace("Community Chest");
        assertEquals(4, deckPlace.checkType());

        //test for each individual class type, ensuring extended properly with attributes
        assertEquals("BoardWalk", property.getName());
        assertEquals("Short Line", railRoadCompanies.getName());
        assertEquals("Income Tax", taxPayment.getName());
        assertEquals("Free Parking", cornerActions.getName());
        assertEquals("Community Chest", deckPlace.getName());  
    }

}
