/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tcs.demos.junit.util;

/**
 *
 * @author Chaks
 */
public class CaluclatorTestTraditional {

  public static void main(String[] args) {
    Calculator calculator = new Calculator();
    Integer sum = calculator.cal(10, 15, "+");
    if (sum == 25) {
      System.out.println("cal() worked expected for ADD");
    }

    Integer sub = calculator.cal(100, 15, "-");
    if (sub == 85) {
      System.out.println("cal() worked expected for SUB");
    }

    Integer mul = calculator.cal(10, 15, "*");
    if (mul == 150) {
      System.out.println("cal() worked expected for MUL");
    }

    Integer div = calculator.cal(100, 5, "/");
    if (div == 20) {
      System.out.println("cal() worked expected for DIV");
    }
  }
}
