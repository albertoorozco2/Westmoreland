

import java.util.ArrayList;

import processing.core.PApplet;

public class Westmoreland extends PApplet {

  int people = (int) random(100, 200);
  int vehicles = (int) random(10, 30);

  street st = new street(this);// street
  ArrayList<person> alPeople = new ArrayList<person>();
  ArrayList<vehicle> alVehicles = new ArrayList<vehicle>();


  public static void main(String[] args) {
    PApplet.main("Westmoreland");

  }

  public void settings() {
    size(1000, 600);
    for (int i = 0; i < vehicles; i++) {
      alVehicles.add(new vehicle(this));
    }
    for (int i = 0; i < people; i++) {
      alPeople.add(new person(this));
    }

  }

  public void setup() {

  }

  public void draw() {

    st.display(people, vehicles);

    for (int i = 0; i < vehicles; i++) {
      alVehicles.get(i).display();
    }
    for (int i = 0; i < people; i++) {
      alPeople.get(i).display();
    }

  }


}

