/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statkatzxfl;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Cody
 */
public class StatKatzXFLTest {
    
    public StatKatzXFLTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of QBR method, of class Quarterback.
     */
    @Test
    public void testQBR() {
        
    }
    
        /**
     * Test of TotalOffense method, of class Offense.
     */
    @Test
    public void testTotalOffense() {
        
    }
    
        /**
     * Test of OffensiveEfficiency method, of class Offense.
     */
    @Test
    public void testOffensiveEfficiency() {
        
    }
    
        /**
     * Test of TotalDefense method, of class Defense.
     */
    @Test
    public void testTotalDefense() {
        Defense team1 = new Defense(250,67,10,2,4,57);
        double totalDefense;
        totalDefense = team1.totalDefense();
        double expected = 317;
        assertEquals(expected, totalDefense, .001);
    }
    
        /**
     * Test of DefensiveEfficiency method, of class Defense.
     */
    @Test
    public void testDefensiveEfficiency() {
       
    }
    
        /**
     * Test of display method, of class Team.
     */
    @Test
    public void testDisplay() {

    }
}
