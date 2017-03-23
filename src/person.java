import processing.core.PApplet;

public class person {
  PApplet parent;
  float x = ((float) Math.random() * 1000);
  float y = 110 + (float) (Math.random() * ((190 - 110) + 1));
  double direction = Math.random();



  public person(PApplet p) {
    parent = p;
    yValue();
  }

  public void display() {


    parent.fill(0, 255, 0);
    parent.ellipse(x, y, 10, 10);
    parent.textSize(8);
    parent.fill(0, 0, 0);
    parent.text(":)", x - 3, y + 2); // text

    if (direction >= .5) {
      x += .5;
      if (x > parent.width)
        x = 0;

    } else if (direction < .5) {
      x -= .5;

      if (x < 0)
        x = parent.width;
    }
    // float startTime = parent.millis();

    if (x >= 700 && x <= 760 && y >= 135 && y <= 150) {
      // x=759;
      y = 140;
      int random = (int) (Math.random() * 100);;


      if (random < 1) {
        if (direction >= .5) {
          x = 761;
        } else {
          x = 699;
        }
      } else {
        x = 759;
      }


    }

  }

  public void yValue() {
    if (y >= 140) {
      y = 560 + (float) (Math.random() * ((590 - 560) + 1));
    }


  }
}
