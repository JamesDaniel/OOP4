
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
        int result = (Integer)instance.height();
        int expectedResult = 0;
        assertEquals(expectedResult, result);
        
        instance.put("Feb", 2);
        result = (Integer)instance.height();
        expectedResult = 1;
        assertEquals(expectedResult, result);
        
        instance.put("Mar", 2);
        result = (Integer)instance.height();
        expectedResult = 1;
        assertEquals(expectedResult, result);
        
        instance.put("Apr", 3);
        result = (Integer)instance.height();
        expectedResult = 2;
        assertEquals(expectedResult, result);
        
        instance.put("May", 4);
        result = (Integer)instance.height();
        expectedResult = 2;
        assertEquals(expectedResult, result);
        
        instance.put("Jun", 5);
        result = (Integer)instance.height();
        expectedResult = 2;
        assertEquals(expectedResult, result);
        
        instance.put("Jul", 5);
        result = (Integer)instance.height();
        expectedResult = 3;
        assertEquals(expectedResult, result);
        
        instance.put("Aug", 5);
        result = (Integer)instance.height();
        expectedResult = 3;
        assertEquals(expectedResult, result);
        
        instance.put("Sep", 5);
        result = (Integer)instance.height();
        expectedResult = 3;
        assertEquals(expectedResult, result);
        
        instance.put("Oct", 5);
        result = (Integer)instance.height();
        expectedResult = 4;
        assertEquals(expectedResult, result);
        
        instance.put("Nov", 5);
        result = (Integer)instance.height();
        expectedResult = 5;
        assertEquals(expectedResult, result);
        
        instance.put("Dec", 5);
        result = (Integer)instance.height();
        expectedResult = 5;   // even though node "Dec" is at a height of 4
                             //  the height of the binary tree is still 5.
        assertEquals(expectedResult, result);
    }




    
}
