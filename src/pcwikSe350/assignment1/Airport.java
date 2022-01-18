package pcwikSe350.assignment1;

import java.util.Objects;

public class Airport {


  private String name;




  public Airport(String name){
    setName(name);
  }

  public String getName() {
    return name;
  }

  private void setName(String aName) {
    if (aName.length() != 3 ){
      throw new IllegalArgumentException("Airport name must be 3 characters long");
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
    final Airport other = (Airport) o;
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
