import processing.core.PApplet;

public class person {
  PApplet parent;
  float x = ((float) Math.random() * 1000);
  float y = 105 + (float) (Math.random() * ((195 - 105) + 1));
  double direction = Math.random();



  public person(PApplet p) {
    parent = p;
    yValue();
  }

  public void display() {


    parent.fill(0, 255, 0);
    parent.ellipse(x, y, 5, 5);
    
    if(direction>=.5){
    x += .5;
    if (x > parent.width) x = 0;
      
    }
    else if(direction<.5) { 
      x -= .5;
    
    if (x < 0) x = parent.width;
    }


  }

  public void yValue() {
    if (y >= 150) {
      y = 555 + (float) (Math.random() * ((595 - 555) + 1));
    }
 

  }
}
