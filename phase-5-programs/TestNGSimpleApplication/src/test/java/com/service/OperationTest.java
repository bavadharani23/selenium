package com.service;

import static org.testng.AssertJUnit.assertEquals;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class OperationTest {

  @Test
  public void addTest() {
    Operation op = new Operation();
    int result=op.add(100,200);
    assertEquals(result,300);
  }

  @Test
  @Ignore            //@Disable annotation in jUnit
  public void divTest() {
	  Operation op = new Operation();
	    int result=op.div(200,100);
	    assertEquals(result,2);
  }

  @Test
  public void multiTest() {
	  Operation op = new Operation();
	    int result=op.multi(10,20);
	    assertEquals(result,200);
  }

  @Test
  public void subTest() {
	  Operation op = new Operation();
	    int result=op.sub(200,100);
	    assertEquals(result,100);
  }
}
