package pcwikSe350.assignment1;

import java.util.Objects;

public class Airline {
  private String name;




  public Airline(String name){
    setName(name);
  }

  public String getName() {
    return name;
  }

  private void setName(String aName) throws IllegalArgumentException {

    if (aName.length() > 8 ){
      throw new IllegalArgumentException("Airline name must be less then 8 characters");
    }
    name = aName;
  }






  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append(String.format(getName()));
    return  sb.toString();
  }

  @Override
  public boolean equals(Object o) {
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    final Airline other = (Airline) o;
    if (!getName().equals(other.getName())) {
      return false;
    }

    return true;
  }

  @Override
  public int hashCode(){
    return Objects.hash(name);
  }

}


