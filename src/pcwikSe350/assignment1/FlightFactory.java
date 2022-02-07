package pcwikSe350.assignment1;

import java.util.Date;

public class FlightFactory {
  private FlightFactory(){
  }

  public static CommercialFlight createFlight(String type, Airline airline, Airport origine, Airport destination, String flightNumber, Date departureTime){
    if(type.equals("commercial"))
      return new CommercialFlight(airline, origine, destination,flightNumber, departureTime);
    else return null;
  }

}
