package pcwikSe350.assignment1;

import java.util.Date;
import java.util.Objects;

public class Flight {
  private Airline airline;
  private Airport origine;
  private Airport destination;
  private String flightNumber;
  private Date departureTime;


  public Flight(Airline airline, Airport origine, Airport destination, String flightNumber, Date departureTime){
    setAirline(airline);
    setOrigine(origine);
    setDestination(destination);
    setFlightNumber(flightNumber);
    setDepartureTime(departureTime);
  }


  public Airline getAirline() {
    return airline;
  }

  public void setAirline(Airline aAirline)throws IllegalArgumentException  {
    if (aAirline == null){
      throw new IllegalArgumentException("Airline name can not be null");
    }
    airline = aAirline;
  }

  public Airport getOrigine() {
    return origine;
  }

  public void setOrigine(Airport aOrigine)throws IllegalArgumentException  {
    if (aOrigine == null){
      throw new IllegalArgumentException("Airport name can not be null");
    }
    origine = aOrigine;
  }

  public Airport getDestination() {
    return destination;
  }

  public void setDestination(Airport aDestination)throws IllegalArgumentException  {
    if (aDestination == null){
      throw new IllegalArgumentException("Airport name can not be null");
    }
    destination = aDestination;
  }

  public String getFlightNumber() {
    return flightNumber;
  }

  public void setFlightNumber(String aFlightNumber)throws IllegalArgumentException  {
    if (aFlightNumber == null){
      throw new IllegalArgumentException("A flight number can not be null");
    }
    flightNumber = aFlightNumber;
  }

  public Date getDepartureTime() {
    return departureTime;
  }

  public void setDepartureTime(Date departureTime) throws IllegalArgumentException{
    if (departureTime == null){
      throw new IllegalArgumentException("A date and time can not be null");
    }
    this.departureTime = departureTime;
  }








  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append(String.format("%-20s %s%n", "Airline Name:", getAirline()));
    sb.append(String.format("%-20s %s%n", "Origin Airport Name:", getOrigine()));
    sb.append(String.format("%-20s %s%n", "Destination Airport Name:", getDestination()));
    sb.append(String.format("%-20s %s%n", "Flight number:", getFlightNumber()));
    sb.append(String.format("%-20s %s%n", "Departure time:", getDepartureTime()));
    return  sb.toString();
  }

  @Override
  public boolean equals(Object o) {
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    final Flight other = (Flight) o;
    if (getAirline().equals(other.getAirline())) {
      return false;
    }
    if (getOrigine().equals(other.getOrigine())) {
      return false;
    }
    if (getDestination().equals(other.getDestination())) {
      return false;
    }
    if (getFlightNumber().equals(other.getFlightNumber())) {
      return false;
    }
    if (getDepartureTime().equals(other.getDepartureTime())) {
      return false;
    }

    return true;
  }

  @Override
  public int hashCode(){
    return Objects.hash(airline,origine,destination,flightNumber,departureTime);
  }



}
