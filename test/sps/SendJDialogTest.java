/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sps;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author tokyo
 */
public class SendJDialogTest {
    
    public SendJDialogTest() {
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
     * Test of parentTest method, of class SendJDialog.
     */
    @Test
    public void testParentTest() {
        System.out.println("parentTest");
        SendJDialog instance = null;
        String expResult = "";
        String result = instance.parentTest();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPassMap method, of class SendJDialog.
     */
    @Test
    public void testSetPassMap() {
        System.out.println("setPassMap");
        String tag = "";
        PassItem passItem = null;
        SendJDialog instance = null;
        instance.setPassMap(tag, passItem);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class SendJDialog.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        SendJDialog.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of CodeCheck method, of class SendJDialog.
     */
    @Test
    public void testCodeCheck() {
        System.out.println("CodeCheck");
        char[] code = "8376".toCharArray();
        SendJDialog instance = new SendJDialog(null ,false);
        boolean expResult = false;
        boolean result = instance.CodeCheck(code);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
