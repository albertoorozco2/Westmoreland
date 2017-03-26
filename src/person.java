import processing.core.PApplet;

public class person {
  PApplet parent;
  float x = ((float) Math.random() * 1000);
  float y = 110 + (float) (Math.random() * ((180 - 110) + 1));
  double direction = Math.random();
  double type =  Math.random();
  int move=2;
  



  public person(PApplet p) {
    parent = p;
    yValue();
  }

  public void display() {


    parent.fill(0, 255, 0);
    parent.ellipse(x, y, 5, 5);
    parent.textSize(8);
    parent.fill(0, 0, 0);
    parent.text(":)", x - 3, y + 2); // text
    parent.line(x, y+3, x, y+13);//body
    parent.line(x-3, y+6, x+3, y+6);//arms
    parent.line(x, y+13, x+2, y+16); //leg
    parent.line(x, y+13, x-2, y+16); //leg

    if (direction >= .5) {
      if(type<=.33){x += .1;}
      else if(type<=.66){x += .3;}
      else if(type<=.99){x += .5;}
      
      
      if (x > parent.width)
        x = 0;

    } else if (direction < .5) {
      if(type<=.33){x -= .1;}
      else if(type<=.66){x -= .3;}
      else if(type<=.99){x -= .5;}

      if (x < 0)
        x = parent.width;
    }
    // float startTime = parent.millis();

    if (x >= 700 && x <= 760 && y >= 120 && y <= 150) {
      // x=759;
      y = 130;
      
      if (((int) (Math.random() * 100)) < 1) {
        if (direction >= .5) {
          x = 761;
        } else {
          x = 699;
        }
      } else {
        x = 759;
      }
      
    
    }

    if ((((int) (Math.random() * 1000)) < 2&&y<=130&&y>=115)) 
    {
      y=y+5;
    } 
    if ((((int) (Math.random() * 1000)) < 1&&y<=140&&y>=115)) 
    {
      y=y-5;
    } 
 //   else{
//      move=2;
//    }
//    if(move==1){
//      y+=.1;
//    }else if(move==0){
//      y-=.1;
//    }else{}
//    
//    if(y<=115){
//      move=1;
//    }else if(y>=135){
//      move=0;
//    }
//      
//    if (((int) (Math.random() * 100)) < 5) {
//      
//      if(y>=105&&y<=145){
//       y+=1;
//      }
//      
//    }
//    if (((int) (Math.random() * 100)) < 5) {
//      
//      if(y>=105&&y<=145){
//       y-=1;
//      }
//      
//    } 
    
  }

  public void yValue() {
    if (y >= 140) {
      y = 560 + (float) (Math.random() * ((590 - 560) + 1));
    }

 System.out.println();
  }
}
