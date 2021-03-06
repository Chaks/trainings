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
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 *
 * @author Chakravarthi
 */
public class XPathDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
            throws ParserConfigurationException, SAXException, IOException, XPathExpressionException {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder docBuilder = factory.newDocumentBuilder();

        Document doc = docBuilder.parse(new File("src/sdn.xml"));

        XPath xPath = XPathFactory.newInstance().newXPath();
        //Print all the first and last names
        Object firstNameResult =
                xPath.compile("/sdnList/sdnEntry/firstName/text()").evaluate(doc, XPathConstants.NODESET);
        NodeList firstNameNodes = (NodeList) firstNameResult;
        for (int i = 0; i < firstNameNodes.getLength(); i++) {
            System.out.println("firstName => " + firstNameNodes.item(i));
        }

        Object lastNameResult =
                xPath.compile("/sdnList/sdnEntry/lastName/text()").evaluate(doc, XPathConstants.NODESET);
        NodeList lastNameNodes = (NodeList) lastNameResult;
        for (int i = 0; i < lastNameNodes.getLength(); i++) {
            System.out.println("lastName => " + lastNameNodes.item(i));
        }

        //Count the number of programs against CUBA
        Double noOfProgarmsCubaResult =
                (Double) xPath.compile("count(/sdnList/sdnEntry/programList[program='CUBA'])").evaluate(doc, XPathConstants.NUMBER);
        System.out.println("Programs against CUBA => " + noOfProgarmsCubaResult);

        //Address Node of all the programs against CUBA
        Object addressResult =
                xPath.compile("/sdnList/sdnEntry/programList[program='CUBA']/../addressList/address").evaluate(doc, XPathConstants.NODESET);
        NodeList addressNodeList = (NodeList) addressResult;
        for (int i = 0; i < addressNodeList.getLength(); i++) {
            System.out.println(""
                    + addressNodeList.item(i).getNodeName() + ">>>>>" + addressNodeList.item(i).getTextContent());
        }

        //Search for all the programs that are of sdnType 'Entity'
        Object entityTypeResult =
                xPath.compile("/sdnList/sdnEntry/sdnType[contains(.,'Entity')]/../programList/program/text()").evaluate(doc, XPathConstants.NODESET);
        NodeList entityTypeNodeList = (NodeList) entityTypeResult;
        for (int i = 0; i < entityTypeNodeList.getLength(); i++) {
            System.out.println("sdnType (Entity) program => "
                    + entityTypeNodeList.item(i).getNodeName() + ">>>>>" + entityTypeNodeList.item(i).getTextContent());
        }

        //Search for all the sdnType's that are not of type 'Entity'
        Object sdnTypeResult =
                xPath.compile("/sdnList/sdnEntry/sdnType[not(contains(.,'Entity'))]/text()").evaluate(doc, XPathConstants.NODESET);
        NodeList sdnTypeNodeList = (NodeList) sdnTypeResult;
        for (int i = 0; i < sdnTypeNodeList.getLength(); i++) {
            System.out.println("sdnType => "
                    + sdnTypeNodeList.item(i).getNodeName() + ">>>>>" + sdnTypeNodeList.item(i).getTextContent());
        }
    }
}
