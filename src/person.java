import processing.core.PApplet;

public class person {
  PApplet parent;
  float x = ((float) Math.random()*1000);
  float y = 110 + (float)(Math.random() * ((290 - 110) + 1));
  
  
  
  public person(PApplet p){
  parent = p;
  yValue();
 }
  public void display(){
    
    
    parent.fill(250, 253, 205);
  parent.ellipse(x, y, 5, 5);
  x += .5;
  if (x > parent.width) x = 0;

    
   }
 
  public void yValue(){
    if(y>=140){ 
      y = 560 + (float)(Math.random() * ((590 - 560) + 1));
      }

    
  }
}
