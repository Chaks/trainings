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
public class Calculator {

  private static final String PLUS = "+";
  private static final String MINUS = "-";
  private static final String MULTIPLY = "*";
  private static final String DIVIDE = "/";

  public Integer cal(Integer op1, Integer op2, String opr) {
    if (null != opr) {
      switch (opr) {
        case PLUS:
          return add(op1, op2);
        case MINUS:
          return sub(op1, op2);
        case MULTIPLY:
          return mul(op1, op2);
        case DIVIDE:
          return div(op1, op2);
        default:
          return null;
      }
    }
    return null;
  }

  private Integer add(Integer op1, Integer op2) {
    return op1 + op2;
  }

  private Integer sub(Integer op1, Integer op2) {
    return op1 - op2;
  }

  private Integer div(Integer op1, Integer op2) {
    return op1 / op2;
  }

  private Integer mul(Integer op1, Integer op2) {
    return op1 * op2;
  }
}
