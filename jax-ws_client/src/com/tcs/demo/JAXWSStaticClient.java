/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tcs.demo;

import com.tcs.demo.service.GlobalWeather;
import com.tcs.demo.service.GlobalWeatherSoap;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;

/**
 *
 * @author Chakravarthi
 */
public class JAXWSStaticClient {

  public static void main(String args[]) throws MalformedURLException {
    GlobalWeather globalWeather = new GlobalWeather();
    GlobalWeatherSoap globalWeatherSoap = globalWeather.getGlobalWeatherSoap12();

    //Changing the address of the service via stub
    ((BindingProvider) globalWeatherSoap).getRequestContext().put(
            BindingProvider.ENDPOINT_ADDRESS_PROPERTY, "http://localhost:6789/globalweather.asmx");
    //System.out.println("getCitiesByCountry(): " + globalWeatherSoap.getCitiesByCountry("India"));
    //System.out.println("getWeather(): " + globalWeatherSoap.getWeather("Bombay", "India"));

    //http://www.webservicex.net/globalweather.asmx?WSDL
    //Changing the address of WSDL
    QName qName = new QName("http://www.webserviceX.NET", "GlobalWeather");
    GlobalWeather globalWeather1 = new GlobalWeather(new URL("http://localhost:6789/globalweather.asmx?WSDL"), qName);
    GlobalWeatherSoap globalWeatherSoap1 = globalWeather1.getGlobalWeatherSoap();

    ((BindingProvider) globalWeatherSoap1).getRequestContext().put(
            BindingProvider.ENDPOINT_ADDRESS_PROPERTY, "http://localhost:6789/globalweather.asmx");
    System.out.println("getCitiesByCountry(): " + globalWeatherSoap1.getCitiesByCountry("India"));
  }
}
