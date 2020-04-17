public class car {
  int carX;
  int carY;
  int carSpeed;
  int size;
  public car(int carX, int carY, int carSpeed, int size) {
    this.carX=carX;
    this.carY=carY;
    this.carSpeed=carSpeed;
    this.size=size;
  }
  void moveRight() {
    carX=carX+carSpeed;
    if (carX>775) {
      carX=50;
    }
  }
  public int getY() {
    return carY;
  }
  public int getX() {
    return carX;
  }
  public int getSize() {
    return size;
  }
  void moveLeft() {
    carX=carX-carSpeed;
    if (carX<25) {
      carX=width-150;
    }
  }
  void display()
  {
    fill(0, 255, 0);
    rect(carX, carY, size, 50);
  }
}

//memeber variables
int hopDistance=40;
int X=400;
int Y=550;
int carSpeed1=10;
car car1= new car(350, 450, carSpeed1, 150);
car car2= new car(350, 350, carSpeed1, 150);
car car3= new car(350, 200, carSpeed1, 150);
car car4= new car(350, 100, carSpeed1, 150);

boolean intersects(car car1) {
  if ((Y > car1.getY() && Y < car1.getY()+50) &&
    (X > car1.getX() && X < car1.getX()+car1.getSize())) {
      
    return true;
  } else {
    return false;
  }
}


void setup() {

  size(800, 600);
}

void keyPressed()
{
  if (key == CODED) {
    if (keyCode == UP)
    {
      Y=Y-hopDistance;
    } else if (keyCode == DOWN)
    {
      Y=Y+hopDistance;
    } else if (keyCode == RIGHT)
    {
      X=X+hopDistance;
    } else if (keyCode == LEFT)
    {
      X=X-hopDistance;
    }
  }
}
void draw() {
  background(0, 0, 0);
  if (intersects(car1)) {
    println("car1");
    Y=550;
  }
  fill(#9FA2A0);
  rect(1, 275, 800, 60);
  car1.display();
  car2.display();
  car3.display();
  car4.display();
  car1.moveRight();
  car2.moveLeft();
  car3.moveRight();
  car4.moveLeft();
  fill(100, 400, 100);
  ellipse(X, Y, 50, 50);
  if (Y>550) {
    Y=550;
  } else if (Y<50) {
    Y=550;
    carSpeed1=carSpeed1+10;
    println("car speed up!");
  }
  if (X>750) {
    X=750;
  } else if (X<50) {
    X=50;
  }
  if (intersects(car2)) {
    println("car2");
    Y=550;
  }
   if (intersects(car3)) {
    println("car3");
    Y=550;
  }
   if (intersects(car4)) {
    println("car4");
    Y=550;
  }
}
