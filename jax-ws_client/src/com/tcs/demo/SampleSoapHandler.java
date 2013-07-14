/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tcs.demo;

import java.io.PrintStream;
import java.util.Collections;
import java.util.Set;
import javax.xml.namespace.QName;
import javax.xml.soap.SOAPMessage;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;

/**
 *
 * @author Chakravarthi
 */
public class SampleSoapHandler implements SOAPHandler<SOAPMessageContext> {

  private static PrintStream out = System.out;

  @Override
  public boolean handleMessage(SOAPMessageContext saopMessageContext) {
    logToSystemOut(saopMessageContext);
    return true;
  }

  @Override
  public Set<QName> getHeaders() {
    return Collections.EMPTY_SET;
  }

  @Override
  public boolean handleFault(SOAPMessageContext messageContext) {
    return true;
  }

  @Override
  public void close(MessageContext context) {
  }

  private void logToSystemOut(SOAPMessageContext soapMessageContext) {
    Boolean outboundProperty = (Boolean) soapMessageContext.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY);

    if (outboundProperty.booleanValue()) {
      out.println("\nOutbound message:");
    } else {
      out.println("\nInbound message:");
    }

    SOAPMessage message = soapMessageContext.getMessage();
    try {
      message.writeTo(out);
      out.println("");   // just to add a newline
    } catch (Exception e) {
      out.println("Exception in handler: " + e);
    }
  }
}
