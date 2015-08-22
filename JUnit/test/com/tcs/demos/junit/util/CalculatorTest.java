/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tcs.demos.junit.util;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Chaks
 */
public class CalculatorTest {

  @BeforeClass
  public static void setUpClass() {
  }

  @AfterClass
  public static void tearDownClass() {
  }

  @Before
  public void setUp() {
  }

  @Test
  public void testCalForAdd() {
    Integer op1 = 5;
    Integer op2 = 10;
    String opr = "+";
    Calculator instance = new Calculator();
    Integer expResult = 15;
    Integer result = instance.cal(op1, op2, opr);
    Assert.assertEquals(expResult, result);
  }

  @Test
  public void testCalForSub() {
    Integer op1 = 1233;
    Integer op2 = 233;
    String opr = "-";
    Calculator instance = new Calculator();
    Integer expResult = 1000;
    Integer result = instance.cal(op1, op2, opr);
    Assert.assertEquals(expResult, result);
  }

  @Test
  public void testCalForMul() {
    Integer op1 = 5;
    Integer op2 = 10;
    String opr = "*";
    Calculator instance = new Calculator();
    Integer expResult = 50;
    Integer result = instance.cal(op1, op2, opr);
    Assert.assertEquals(expResult, result);
  }

  @Test
  public void testCalForDiv() {
    Integer op1 = 500;
    Integer op2 = 10;
    String opr = "/";
    Calculator instance = new Calculator();
    Integer expResult = 50;
    Integer result = instance.cal(op1, op2, opr);
    Assert.assertEquals(expResult, result);
  }

  @After
  public void tearDown() {
  }
}
