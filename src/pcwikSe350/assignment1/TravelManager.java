package pcwikSe350.assignment1;

import java.util.Date;

public class TravelManager {
    public static void main(String[] args){
      Airport depart = new Airport("MDW");
      Airport arrival = new Airport("MCO");
      Airline airline = new Airline("Delta");
      Flight flight = new Flight(airline,depart,arrival,"DAL5642", new Date(2022, 06, 03, 1, 12, 0));
      System.out.println(flight);
    }


}
