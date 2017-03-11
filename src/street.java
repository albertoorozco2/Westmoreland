import processing.core.PApplet;

public class street {
  PApplet parent;
public street(PApplet p){
  parent = p;
}
  public void display(int people, int cars){
  parent.fill(240, 240, 240);
  parent.rect(0, 0, 1000, 100); //background text
  parent.fill(0, 102, 153);
  parent.textSize(32); 
  parent.text("Westmoreland Street", 330, 50); //text
  parent.fill(0, 102, 153);
  parent.textSize(12);
  parent.text("Number of people "+people +" numbers of cars "+cars, 330, 70); //text
  
  parent.fill(221, 233, 237);
  parent.rect(0, 100, 1000, 50);//up sidewalk 
  parent.rect(0, 550, 1000, 50);//down sidewalk
  parent.fill(185, 195, 199); //streets
  parent.rect(0, 150, 1000, 100);
  parent.rect(0, 250, 1000, 100);
  parent.rect(0, 350, 1000, 100);
  parent.rect(0, 450, 1000, 100);
  }

}
