import processing.core.PApplet;


public class vehicle {
  PApplet parent;
  float type;
  float x = ((float) Math.random() * 1000);
  double rn1 = Math.random();
  double rn2 = Math.random();
  float y;
  
  float rgb1 = (float) (Math.random()*200);
  float rgb2 = (float) (Math.random()*200);
  float rgb3 = (float) (Math.random()*200);


  public vehicle(PApplet p) {
    parent = p;
    values();
  }

  public void display() {

    if (type == 1) { // bus
      parent.fill(rgb1, rgb2, rgb3);
      parent.rect(x, y, 120, 50, 8);
      x += 1;
      if (x > parent.width)
        x = 0;
    } else if (type == 2) { // car
      parent.fill(rgb1, rgb2, rgb3);
      parent.rect(x, y+5, 60, 40, 8);
      x += 2;
      if (x > parent.width)
        x = 0;
    } else if (type == 3) { // taxi
      parent.fill(255, 255, 0);
      parent.rect(x, y+5, 60, 40, 9);
      x += 1.5;
      if (x > parent.width)
        x = 0;
    } else if (type == 4) { // bicy
      parent.fill(rgb1, rgb2, rgb3);
      parent.rect(x, y-9, 50, 8, 8);
      x += 2.5;
      if (x > parent.width)
        x = 0;
    }



  }

  public void values() {
    
    if(rn2<.25){ type=1;} // bus 
    else if(rn2<.55){ type=2;}//car
    else if(rn2<.75){ type=3;} //taxi
    else if(rn2<1){ type=4;} //bici
    
    
    if (rn1 <= 0.25) {
      y = 175;
    } else if (rn1 <= 0.55) {
      y = 275;
    } else if (rn1 <= 0.75) {
      y = 375;
    } else if (rn1 <= 1.0) {
      y = 475;
    }

       if(rn2<.25){ type=1;}
       else if(rn2<.55){ type=2;}
       else if(rn2<.75){ type=3;}
       else if(rn2<1){ type=4;}
  }
}
