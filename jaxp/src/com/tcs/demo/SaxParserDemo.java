/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tcs.demo;

import java.io.File;
import java.io.IOException;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.SAXException;

/**
 *
 * @author Chakravarthi
 */
public class SaxParserDemo {

  public static void main(String args[]) throws ParserConfigurationException, SAXException, IOException {

    SAXParserFactory factory = SAXParserFactory.newInstance();
    System.out.println("SAXParserFactory implementation class: " + factory.toString());
    SAXParser saxParser = factory.newSAXParser();

    saxParser.parse(new File("src/weatherData.xml"), new SampleSaxHandler());
  }
}
