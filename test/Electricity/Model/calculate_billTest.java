/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Electricity.Model;

import Electricity.calculate_bill;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author HP
 */
public class calculate_billTest {
    calculate_bill cb;
    
    public calculate_billTest() {
    }
    
    @Before
    public void setUp() {
        cb = new calculate_bill();
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testActionPerformed() {
        assertEquals(584,cb.actionPerformed(1));
    }

    @Test
    public void testMain() {
    }
    
}
