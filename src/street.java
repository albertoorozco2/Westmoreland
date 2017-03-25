import processing.core.PApplet;

public class street {
  PApplet parent;

  public street(PApplet p) {
    parent = p;
  }

  public void display(int people, int cars) {
    parent.fill(240, 240, 240);
    parent.rect(0, 0, 1000, 100); // background text
    parent.fill(0, 102, 153);
    parent.textSize(32);
    parent.text("Westmoreland Street", 330, 50); // text
    parent.fill(0, 102, 153);
    parent.textSize(13);
    parent.text("Number of people " + people + " numbers of vehicles " + cars, 330, 70); // text

    parent.fill(200, 200, 200);
    parent.rect(0, 100, 1000, 50);// up sidewalk
    //first line of street
    parent.fill(144, 144, 144); // streets
    parent.rect(0, 150, 1000, 100);
    parent.fill(255, 255, 255);
    parent.rect(0, 152, 1000, 3);// white line
    parent.rect(30, 200, 20, 3);
    parent.rect(70, 200, 20, 3);
    parent.rect(110, 200, 20, 3);
    parent.rect(150, 200, 20, 3);
    parent.rect(190, 200, 20, 3);
    parent.rect(230, 200, 20, 3);
    parent.rect(270, 200, 20, 3);
    parent.rect(310, 200, 20, 3);
    parent.rect(350, 200, 20, 3);
    parent.rect(390, 200, 20, 3);
    parent.rect(430, 200, 20, 3);
    parent.rect(470, 200, 20, 3);
    parent.rect(510, 200, 20, 3);
    parent.rect(550, 200, 20, 3);
    parent.rect(590, 200, 20, 3);
    parent.rect(630, 200, 20, 3);
    parent.rect(670, 200, 20, 3);
    parent.rect(710, 200, 20, 3);
    parent.rect(750, 200, 20, 3);
    parent.rect(790, 200, 20, 3);
    parent.rect(830, 200, 20, 3);
    parent.rect(870, 200, 20, 3);
    parent.rect(910, 200, 20, 3);
    parent.rect(950, 200, 20, 3);
    parent.rect(990, 200, 20, 3);
        
    
    //second line of street
    parent.fill(144, 144, 144);
    parent.rect(0, 250, 1000, 100);
    parent.fill(255, 221, 0);
    parent.rect(0, 247, 1000, 3);// yelloe line
    parent.rect(0, 250, 1000, 3);// yelloe line
    parent.fill(255, 255, 255);
    parent.rect(30, 300, 20, 3);
    parent.rect(70, 300, 20, 3);
    parent.rect(110, 300, 20, 3);
    parent.rect(150, 300, 20, 3);
    parent.rect(190, 300, 20, 3);
    parent.rect(230, 300, 20, 3);
    parent.rect(270, 300, 20, 3);
    parent.rect(310, 300, 20, 3);
    parent.rect(350, 300, 20, 3);
    parent.rect(390, 300, 20, 3);
    parent.rect(430, 300, 20, 3);
    parent.rect(470, 300, 20, 3);
    parent.rect(510, 300, 20, 3);
    parent.rect(550, 300, 20, 3);
    parent.rect(590, 300, 20, 3);
    parent.rect(630, 300, 20, 3);
    parent.rect(670, 300, 20, 3);
    parent.rect(710, 300, 20, 3);
    parent.rect(750, 300, 20, 3);
    parent.rect(790, 300, 20, 3);
    parent.rect(830, 300, 20, 3);
    parent.rect(870, 300, 20, 3);
    parent.rect(910, 300, 20, 3);
    parent.rect(950, 300, 20, 3);
    parent.rect(990, 300, 20, 3);
    
    //third line of street
    parent.fill(144, 144, 144);
    parent.rect(0, 350, 1000, 100);
    parent.fill(255, 221, 0);
    parent.rect(0, 347, 1000, 3);// yelloe line
    parent.rect(0, 350, 1000, 3);// yelloe line
    parent.fill(255, 255, 255);
    parent.rect(30, 400, 20, 3);
    parent.rect(70, 400, 20, 3);
    parent.rect(110, 400, 20, 3);
    parent.rect(150, 400, 20, 3);
    parent.rect(190, 400, 20, 3);
    parent.rect(230, 400, 20, 3);
    parent.rect(270, 400, 20, 3);
    parent.rect(310, 400, 20, 3);
    parent.rect(350, 400, 20, 3);
    parent.rect(390, 400, 20, 3);
    parent.rect(430, 400, 20, 3);
    parent.rect(470, 400, 20, 3);
    parent.rect(510, 400, 20, 3);
    parent.rect(550, 400, 20, 3);
    parent.rect(590, 400, 20, 3);
    parent.rect(630, 400, 20, 3);
    parent.rect(670, 400, 20, 3);
    parent.rect(710, 400, 20, 3);
    parent.rect(750, 400, 20, 3);
    parent.rect(790, 400, 20, 3);
    parent.rect(830, 400, 20, 3);
    parent.rect(870, 400, 20, 3);
    parent.rect(910, 400, 20, 3);
    parent.rect(950, 400, 20, 3);
    parent.rect(990, 400, 20, 3);
   
    
    //fourth line of street
    parent.fill(144, 144, 144);
    parent.rect(0, 450, 1000, 100);
    parent.fill(255, 221, 0);
    parent.rect(0, 447, 1000, 3);// yelloe line
    parent.rect(0, 450, 1000, 3);// yelloe line
    parent.fill(255, 255, 255);
    parent.rect(30, 500, 20, 3);
    parent.rect(70, 500, 20, 3);
    parent.rect(110, 500, 20, 3);
    parent.rect(150, 500, 20, 3);
    parent.rect(190, 500, 20, 3);
    parent.rect(230, 500, 20, 3);
    parent.rect(270, 500, 20, 3);
    parent.rect(310, 500, 20, 3);
    parent.rect(350, 500, 20, 3);
    parent.rect(390, 500, 20, 3);
    parent.rect(430, 500, 20, 3);
    parent.rect(470, 500, 20, 3);
    parent.rect(510, 500, 20, 3);
    parent.rect(550, 500, 20, 3);
    parent.rect(590, 500, 20, 3);
    parent.rect(630, 500, 20, 3);
    parent.rect(670, 500, 20, 3);
    parent.rect(710, 500, 20, 3);
    parent.rect(750, 500, 20, 3);
    parent.rect(790, 500, 20, 3);
    parent.rect(830, 500, 20, 3);
    parent.rect(870, 500, 20, 3);
    parent.rect(910, 500, 20, 3);
    parent.rect(950, 500, 20, 3);
    parent.rect(990, 500, 20, 3);
   
    
    
    parent.rect(0, 545, 1000, 3);// white line
    parent.fill(200, 200, 200);
    parent.rect(0, 550, 1000, 50);// down sidewalk
    parent.fill(0, 0, 255);
    parent.rect(700, 135, 60, 15);// up sidewalk
    parent.textSize(12);
    parent.fill(255, 255, 255);
    parent.text("bus stop", 700, 145); // text
    

  }

}
