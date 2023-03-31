package com.example.simplearraytest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ArrayTest {

    private ArrayOperations mArray;

    @Before
    public void SetUp(){
        mArray = new ArrayOperations();
    }

    @Test
    public void operacionNotNull(){
        assertNotNull(mArray);
    }

    @Test
    public void searchNumber() {
        assertTrue(mArray.searchNumber(15));
        assertTrue(mArray.searchNumber(-20));
        assertFalse(mArray.searchNumber(-100));
        assertFalse(mArray.searchNumber(-23));
    }

    @Test
    public void countOcurrences() {
        assertEquals(3,mArray.countOcurrences(8));
        assertEquals(2,mArray.countOcurrences(1));
    }
}