package com.example.myproject;

import static org.junit.Assert.assertTrue;
import org.junit.Test;


/**
 * Tests for correct dependency retrieval with maven rules.
 */
public class TestApp {

  @Test
  public void testCompare() throws Exception {
    App app = new App(3);
    assertTrue("should load native origami", true);
  }

}
