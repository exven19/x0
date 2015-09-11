//// Wild circles #1.

// GLOBAL VARIABLES //
float x,y;

// Setup:  screen size, initialization. //
void setup() {
  size( 1080, 720);        // Try changing the width & height.
  x=  width/2;
  y=  height/2;
}

// Next frame:  draw three circles. //
void draw() {
  ellipse(x, y, 180, 180);
  ellipse(x+160, y+160, 140, 140);
  ellipse(x-160, y+160, 140, 140); // Added here new one
  ellipse(x+290, y+290, 120, 120);
  ellipse(x-290, y+290, 120, 120); // Another one
  
  // Move them???? //--              x=  x + 2;  y=  y + 1;
  // Insert BREAK here ^
  // to uncomment the above code,
}
