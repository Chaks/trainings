/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tcs.demo;

import java.io.File;
import java.io.IOException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 *
 * @author Chakravarthi
 */
public class DomParserDemo {

  public static void main(String args[]) throws ParserConfigurationException, SAXException, IOException {
    DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
    DocumentBuilder docBuilder = factory.newDocumentBuilder();

    Document doc = docBuilder.parse(new File("src/weatherData.xml"));

    NodeList nodeList = doc.getElementsByTagName("*");
    for (int i = 0; i < nodeList.getLength(); i++) {
      System.out.println("^^^^^^^^^^^^^^^^^" + nodeList.item(i).getNodeName() + "^^^^^^^^^^^^^^^^^");
      System.out.println(nodeList.item(i).getTextContent());
      if ("image".equals(nodeList.item(i).getNodeName())) {
        System.out.println("Image resolution: "
                + nodeList.item(i).getAttributes().getNamedItem("resolution"));
      }
      System.out.println("^^^^^^^^^^^^^^^^^" + nodeList.item(i).getNodeName() + "^^^^^^^^^^^^^^^^^");
    }
  }
}
