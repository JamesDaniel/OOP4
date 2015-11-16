
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author SoftwareDev
 */
public class BinarySearchTreeMapTest {
    
    public BinarySearchTreeMapTest() {
    }
    
    /**
     * Test of the get method, of class BinarySearchTreeMap.
     */
    @Test
    public void testGet() {
        System.out.println("get");
        
        BinarySearchTreeMap instance = new BinarySearchTreeMap();
        instance.put("Jan", 1);
        instance.put("Feb", 2);
        
        int result = (Integer)instance.get("Feb");
        int expectedResult = 2;       
        
        assertEquals(expectedResult, result);
    }
    /**
     * Test of put method, of class BinarySearchTreeMap.
     */
    @Test
    public void testPut() {
        System.out.println("put");
        
        BinarySearchTreeMap instance = new BinarySearchTreeMap();
        instance.put("Jan", 1);
        
        
        int result = (Integer)instance.get("Jan");
        int expectedResult = 1;
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(expectedResult, result);
    }
    
    /**
     * Test of height method, of class BinarySearchTreeMap.
     */
    @Test
    public void testHeight() {
        System.out.println("height");
        
        BinarySearchTreeMap instance = new BinarySearchTreeMap();
        instance.put("Jan", 1);
        instance.put("Feb", 2);
        instance.put("Mar", 3);
        instance.put("Apr", 4);
        instance.put("May", 5);
        instance.put("Jun", 6);
        instance.put("Jul", 7);
        instance.put("Aug", 8);
        instance.put("Sep", 9);
        instance.put("Oct", 10);
        instance.put("Nov", 11);
        instance.put("Dec", 12);
        
        int result = instance.height();
        int expectedResult = 6;
        assertEquals(expectedResult, result);
        int size = instance.size();
        int expectedSize = 12;
        assertEquals(expectedSize, size);
        
        instance = new BinarySearchTreeMap();
        instance.put("Meg", 1);
        instance.put("Rob", 2);
        instance.put("Bob", 3);
        result = (Integer)instance.height();
        expectedResult = 2;
        assertEquals(expectedResult, result);
        size = instance.size();
        expectedSize = 3;
        assertEquals(expectedSize, size);
    }




    
}
