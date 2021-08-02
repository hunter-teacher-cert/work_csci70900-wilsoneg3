# Lesson: System Variables

**SWBAT: Use system variables to manipulate code across the canvas**


### Launch
- Create an ellipse that is perfectly centered in the canvas
- if you complete this task within 2 minutes, add a rectangle with the same width and height behind the circle

<Launch Code>
<function setup() {
  createCanvas(400, 400);
	
}
function draw() {
  background(220);
	rect(150,150,100,100)// desired rect
	ellipse(200,200,100,100) // desired ellipse behind
}>

### Width and Height: System Variables
Width and height are System Variables.

System variables are placeholders of information that are already coded into the system.  That means you don't have to declare or initialize them- only use them.

The system variables width and height pull the value from the widith and height parameters in the createCanvas function

Look at the launch code: what value would width and height carry?

If I have createCanvas(200,300), what value would width hold?  What value would height hold?

### Width and Height: Code Along
- You can combine width and height with mathmatical operators
- Use the width variable to move the ellipse below 1/3 of the way across the screen 
- Use the height variable to move the ellipse 3/4 of th way down the screen

### Paired Practice:
Activity #1: Variables 
Using the width variable, draw an ellipse that is:
- 1/3 of the way across the screen
- 1/4 of the way across the screen
- 2/3 of the way across the screen
- 3/4 of the way across the screen
You should have four ellipses in total. 

### System Variables: mouseX and mouseY
- mouseX and mouseY are system variables that correspond to the position of your mouse on the canvas.  This variable can be placed as a parameter in any function.

### Activity 2: mouseX and mouseY
Draw a rectangle and ellipse anywhere on your canvas and complete the following: 
- Use mouseX and/or mouseY to change the height or width of a rectangle
- Use mouseX and/or mouseY to change the height or width of an ellipse
- Use mouseX and/or mouseY to change the shade of the canvas
- Use mouseX and/or mouseY to change the fill of a rectangle or ellipse

### Individual Practice:
- Option 1 (mild): Use system variables in the code below to make it so that one aspect of the image changes size relative to the canvas.
- Option 2 (mild):  Use system variables to make the face one aspect of the image change when you move the mouse. 
- Option 3 (medium): Do Options 1 AND 2.
Option 4 (spicy): make it so that the entire face moves with the mouse. 

<practice code function setup() {
  createCanvas(400, 400);
	angleMode(DEGREES)
}
function draw() {
  background(220);
	ellipse(200, 200, 300, 300); // face
	rect(130, 150, 50,50); //left eye
	rect(225, 150, 50,50); // right eye
	arc(200, 250, 150, 50, 0, 180); // smile
	
	//original code
	// 	ellipse(200, 200, 300, 300); // face
	// rect(130, 150, 50,50); //left eye
	// rect(225, 150, 50,50); // right eye 
	// arc(200, 250, 150, 50, 0, 180) // smile
}>