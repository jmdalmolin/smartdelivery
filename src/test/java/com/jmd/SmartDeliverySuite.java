package com.jmd;

import com.jmd.client.SmartDeliveryTest;
import com.google.gwt.junit.tools.GWTTestSuite;
import junit.framework.Test;
import junit.framework.TestSuite;

public class SmartDeliverySuite extends GWTTestSuite {
  public static Test suite() {
    TestSuite suite = new TestSuite("Tests for SmartDelivery");
    suite.addTestSuite(SmartDeliveryTest.class);
    return suite;
  }
}
