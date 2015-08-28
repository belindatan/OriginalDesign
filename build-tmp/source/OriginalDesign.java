import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class OriginalDesign extends PApplet {

int y=50;
int x = 250;
int z=250;
int a=300;
int b=250;
public void setup()
{
size (500,500);
//frameRate (15);
}

public void draw()
{	



background(130,255,255);
if (y>100)
{
	background (130,250,258);
}

if (y>150)
{
	background (255,164,96);
}

if (y>200)
{
	background (253,151,107);
}
if (y>450)
{
	background (25,25,112);
}

int x=250;
while (x<370)
{
	

arc(x,50, 40, 20, PI, 2*PI);
	x=x+40;
}


int z=250;
while (z<370)
{
	arc(z,85, 40, 20, 0, PI);
	z=z+40;
}




int a=300;
while (a<420)
{
	arc(a,150, 40, 20, PI, 2*PI);
	a=a+40;
}


int b=300;
while (b<420)
{
	arc(b,190, 40, 20, 0, PI);
	b=b+40;
}



fill (255,140,0);
 ellipse(50,y,150,150);
 y=y+1;
if (y>500){
	y = 50;
}

fill (50,202,50);
rect(0, 350, 500, 250);


fill (255);
//arc1
arc (230,70,40,40, PI/2,3*PI/2);
arc (350,70,40,40,-PI/2,PI/2);
//arc2
arc (280,170,40,40, PI/2,3*PI/2);
arc (400,170,40,40,-PI/2,PI/2);

noStroke();
rect(230,50,120,40);
rect(280,150,120,40);

}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "OriginalDesign" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
