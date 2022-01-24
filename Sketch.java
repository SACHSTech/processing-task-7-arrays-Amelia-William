import processing.core.PApplet;

public class Sketch extends PApplet {

  float ySpeed = 5;
	
  public void settings() {
	 size(600, 600);
  }

float[] circleY = new float[50];

public void setup() {
  for (int i = 0; i < circleY.length; i++) {
    circleY[i] = random(height);
  }
}

public void draw() {
  background(50);

  for (int i = 0; i < circleY.length; i++) {
    float circleX = width * i / circleY.length;
    ellipse(circleX, circleY[i], 25, 25);

    if (keyPressed) {
      if (keyCode == UP) {
        ySpeed = 10;
      } 
      else if (keyCode == DOWN) {
        ySpeed = 1;
      } 
   }
   
   circleY[i] = circleY[i] + ySpeed;

    circleY[i]++;

    if (circleY[i] > height) {
      circleY[i] = 0;
    }
  }
}
}
