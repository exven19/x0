//// Wild circles #2.
String title=  "Let's GO.";
String subtitle=  "Keep Playing.";
String author=  "Nayeem";

// GLOBAL VARIABLES //
float x,y;
int h,w;

// Setup:  screen size, initialization. //
void setup() {
  size(1080, 720);
  x=  width/2;
  y=  height/2;
  w=  180;          // width of ellipse.
  h=  180;          // height of ellipse
}

// Next frame. //
void draw() {
  text( title, 110, 50 );
  text( subtitle, width/2, 10 );
  text( author, 10, height-10 );
  text( w+"x"+h, width/2,height-10 );
  //
  ellipse(x, y, w, h);
}


//  Handle mouse clicks //
void mousePressed() {
  x=  mouseX;
  y=  mouseY;
}


//  Handle keyboard //
void keyPressed() {
  // Erase everything, change size & color. //
  background( random(255), random(255), random(255) );
  fill( random(255), random(255), random(255) );
  w=  int( random(50,150) );
  h=  int( random(50,150) );
}
