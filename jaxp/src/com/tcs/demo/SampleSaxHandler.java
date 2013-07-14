/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tcs.demo;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/**
 *
 * @author Chakravarthi
 */
public class SampleSaxHandler extends DefaultHandler {
  
  @Override
  public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
    System.out.println("^^^^^^^^^^^^^^^^^" + qName + "^^^^^^^^^^^^^^^^^");
    if ("image".equals(qName)) {
      System.out.println("Image resolution: " + attributes.getValue("resolution"));
    }
  }
  
  @Override
  public void characters(char[] ch, int start, int length) throws SAXException {
    System.out.println(new String(ch, start, length));
  }
  
  @Override
  public void endElement(String uri, String localName, String qName) throws SAXException {
    System.out.println("^^^^^^^^^^^^^^^^^" + qName + "^^^^^^^^^^^^^^^^^");
  }
}
