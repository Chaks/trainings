/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tcs.demo;

import com.tcs.demo.service.GlobalWeather;
import com.tcs.demo.service.GlobalWeatherSoap;
import java.util.ArrayList;
import java.util.List;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.handler.Handler;

/**
 *
 * @author Chakravarthi
 */
public class JAXWSClientWithSoapHandler {

  public static void main(String args[]) {
    GlobalWeather globalWeather = new GlobalWeather();
    GlobalWeatherSoap globalWeatherSoap = globalWeather.getGlobalWeatherSoap12();

    //Changing the address of the service via stub
    //((BindingProvider) globalWeatherSoap).getRequestContext().put(
    //BindingProvider.ENDPOINT_ADDRESS_PROPERTY, "http://localhost:6789/globalweather.asmx");
    
    //Adding HandlerChain programatically
    List<Handler> handlers = new ArrayList<Handler>();
    handlers.add(new SampleSoapHandler());
    
    ((BindingProvider) globalWeatherSoap).getBinding().setHandlerChain(handlers);

    System.out.println("getCitiesByCountry(): " + globalWeatherSoap.getCitiesByCountry("India"));
    System.out.println("getWeather(): " + globalWeatherSoap.getWeather("Bombay", "India"));
  }
}
