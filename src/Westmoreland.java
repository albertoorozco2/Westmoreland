

import processing.core.PApplet;

public class Westmoreland extends PApplet{
  
  int people = (int) random(1,10);
  int cars = (int) random(0,50);
  
  street st = new street(this);
 
  person ps0 = new person(this);
  person ps1 = new person(this);
  person ps2 = new person(this);
  person ps3 = new person(this);
  person ps4 = new person(this);
  person ps5 = new person(this);
  person ps6 = new person(this);
  person ps7 = new person(this);
  person ps8 = new person(this);
  person ps9 = new person(this);
  person ps10 = new person(this);
  person ps11 = new person(this);
  person ps12 = new person(this);
  person ps13 = new person(this);
  person ps14 = new person(this);
  person ps15 = new person(this);
  person ps16 = new person(this);
  person ps17 = new person(this);
  person ps18 = new person(this);
  person ps19 = new person(this);
  person ps20 = new person(this);

    public static void main(String[] args) {
        PApplet.main("Westmoreland");
    }

    public void settings(){
        size(1000,600);
    }

    public void setup(){
        //fill(120,50,240);
      
    }

    public void draw(){
      
      st.display(people, cars);

      ps0.display();
      ps1.display();
      ps2.display();
      ps3.display();
      ps4.display();
      ps5.display();
      ps6.display();
      ps7.display();
      ps8.display();
      ps9.display();
      ps10.display();
      ps11.display();
      ps12.display();
      ps13.display();
      ps14.display();
      ps15.display();
      ps16.display();
      ps17.display(); 
      ps18.display(); 
      ps19.display();
      ps20.display();
      
    
    }
    

}

