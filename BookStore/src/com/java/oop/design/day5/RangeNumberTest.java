package com.java.oop.design.day5;

import static org.junit.Assert.*;

import org.junit.Test;

public class RangeNumberTest {

    @Test
    public void startWithInclude() {
        RangeNumber rangeNumber=new RangeNumber("[]");
        assertTrue(rangeNumber.startWithInclude());
    }
    @Test
    public void startWithExclude() {
        RangeNumber rangeNumber=new RangeNumber("(]");
        assertFalse(rangeNumber.startWithInclude());
    }
    
    @Test
    public void endWithInclude() {
        RangeNumber rangeNumber=new RangeNumber("[]");
        assertTrue(rangeNumber.endWithInclude());
    }
    @Test
    public void endWithExclude() {
        RangeNumber rangeNumber=new RangeNumber("()");
        assertFalse(rangeNumber.endWithInclude());
    }
    
    @Test
    public void startNumber() {
        RangeNumber rangeNumber=new RangeNumber("(1,5)");
        
        assertEquals(1,rangeNumber.startNumber());
    }
    @Test
    public void endNumber() {
        RangeNumber rangeNumber=new RangeNumber("(1,5)");
        assertEquals(5,rangeNumber.endNumber());
    }
    
    @Test
    public void ofResult() {
        RangeNumber rangeNumber=new RangeNumber("(1,5)");
        assertEquals("2,3,4",rangeNumber.ofResult());
    }
    
    @Test
    public void ofResult2() {
        RangeNumber rangeNumber=new RangeNumber("[1,5]");
        assertEquals("1,2,3,4,5",rangeNumber.ofResult());
    }
    
    @Test
    public void ofResult3() {
        RangeNumber rangeNumber=new RangeNumber("[4,9]");
        assertEquals("4,5,6,7,8,9",rangeNumber.ofResult());
    }
    @Test
    public void ofResult4() {
        RangeNumber rangeNumber=new RangeNumber("(4,9]");
        assertEquals("5,6,7,8,9",rangeNumber.ofResult());
    }
    @Test
    public void ofResult5() {
        RangeNumber rangeNumber=new RangeNumber("[4,9)");
        assertEquals("4,5,6,7,8",rangeNumber.ofResult());
    }
    @Test
    public void ofResult6() {
        RangeNumber rangeNumber=new RangeNumber("[9,5)");
        assertEquals("",rangeNumber.ofResult());
    }

}
