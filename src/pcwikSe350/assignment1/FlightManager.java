package pcwikSe350.assignment1;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FlightManager {
  private static FlightManager ourInstance;


  public static FlightManager getInstance()throws Exception{
    if (ourInstance == null)
      ourInstance = new FlightManager();
    return ourInstance;
  }
  private FlightManager(){
  }

  static List<CommercialFlight> flights = new ArrayList();

  public static void createFlight() throws Exception {
    Airport depart = new Airport("MDW");
    Airport arrival = new Airport("MCO");
    Airline airline = new Airline("Delta");

    flights.add(FlightFactory.createFlight("commercial",airline,depart,arrival,"DAL5642", new Date(2022, 06, 03, 1, 12, 0)));
    System.out.println(getFlightByNumber());
  }
  public static List<CommercialFlight> getFlightByNumber() throws Exception{
    if(flights != null) {
      return flights;
    }
    else{
      throw new IllegalArgumentException("Airline name can not be null");
    }

  }




}
