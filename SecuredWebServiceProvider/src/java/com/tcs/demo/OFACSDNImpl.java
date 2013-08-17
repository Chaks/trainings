/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tcs.demo;

import javax.xml.ws.Holder;
import net.webservicex.OFACSDNSoap;
import net.webservicex.SDNList;

/**
 *
 * @author Chakravarthi
 */
public class OFACSDNImpl implements OFACSDNSoap {

  @Override
  public void isSDNAndBlockedPersons(String names, Holder<Boolean> isSDNAndBlockedPersonsResult, Holder<SDNList> sdnLists) {
    System.out.println("Checking for " + names);
    isSDNAndBlockedPersonsResult.value = Boolean.TRUE;
  }
}
