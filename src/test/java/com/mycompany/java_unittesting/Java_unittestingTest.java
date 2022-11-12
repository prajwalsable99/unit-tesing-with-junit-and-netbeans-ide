/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.java_unittesting;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author DELL
 */
public class Java_unittestingTest {
    Java_unittesting obj;
    public Java_unittestingTest() {
    }

  
    
    @BeforeEach
    public void setUp() {
        
         obj =new Java_unittesting();
    }
    
    @AfterEach
    public void tearDown() {
        obj=null;
        
        
    }

    @org.junit.jupiter.api.Test
    public void testMain() {
    }

    @org.junit.jupiter.api.Test
    public void testAddFun() {
        int x=10;
        int y=20;
        int op=obj.addFun(x,y);
        
        assertEquals(30,op);
        
    }
    
}
