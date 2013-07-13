/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tcs.demo;

import com.tcs.demo.service.GlobalWeatherSoap;
import com.tcs.demo.service.GlobalWeatherSoap_Stub;
import com.tcs.demo.service.GlobalWeather_Impl;
import javax.xml.rpc.Stub;

/**
 *
 * @author Chakravarthi
 */
public class JAXRPCStaticStubClient {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
	// TODO code application logic here

	try {
	  // This code block invokes the GlobalWeatherSoap:getWeather operation on web service
	  com.tcs.demo.service.GlobalWeather globalWeather = new com.tcs.demo.service.GlobalWeather_Impl();
	  com.tcs.demo.service.GlobalWeatherSoap globalWeatherSoap = globalWeather.getGlobalWeatherSoap();

	  System.out.println("getCitiesByCountry(): " + globalWeatherSoap.getCitiesByCountry("India"));
	  System.out.println("globalWeatherSoap(): " + globalWeatherSoap.getWeather("Bombay", "India"));

	  //Overriding the endpoint
	  GlobalWeatherSoap_Stub globalWeatherSoap_Stub =
			  (GlobalWeatherSoap_Stub) new GlobalWeather_Impl().getPort(GlobalWeatherSoap.class);
	  globalWeatherSoap_Stub._setProperty(
			  Stub.ENDPOINT_ADDRESS_PROPERTY, "http://localhost:6789/globalweather.asmx");
	  System.out.println("getCitiesByCountry(): " + globalWeatherSoap_Stub.getCitiesByCountry("India"));
	} catch (javax.xml.rpc.ServiceException ex) {
	  java.util.logging.Logger.getLogger(
			  com.tcs.demo.service.GlobalWeather.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	} catch (java.rmi.RemoteException ex) {
	  java.util.logging.Logger.getLogger(
			  com.tcs.demo.service.GlobalWeather.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	} catch (Exception ex) {
	  java.util.logging.Logger.getLogger(
			  com.tcs.demo.service.GlobalWeather.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	}

  }
}
