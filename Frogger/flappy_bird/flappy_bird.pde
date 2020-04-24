int birdX=200;
int birdY=300;
int pipeX=400;
int pipeY=0;
int gravity=4;
int pipeMovement=5;
int upperPipeHeight = (int) random(100, 400);
int score=0;
void setup(){
  size(400,600);
}
boolean intersectsPipes() { 
         if (birdY < upperPipeHeight && birdX > pipeX && birdX < (pipeX+60)){
            return true; }
        else if (birdY>upperPipeHeight+150 && birdX > pipeX && birdX < (pipeX+60)) {
            return true; }
        else { return false; }
}
void draw(){
  if(intersectsPipes()){
    birdY=550;
    
  }
  if(mousePressed){
    birdY=birdY-13;
  }
  if(pipeX<0){
    upperPipeHeight = (int) random(100, 400);
    pipeX=400;
    score=score+1;
  }
  pipeX=pipeX-pipeMovement;
 background(#7FCDFC);
 text(score, 200, 50);
 //pipes
 fill(0, 100, 0);
rect(pipeX, pipeY, 60, upperPipeHeight);
rect(pipeX,upperPipeHeight+150, 60, upperPipeHeight+350);
  birdY=birdY+gravity;
  if(birdY>550){
    gravity=0;
    println("game over");
   
    
  }
  //floor
  fill(#D1BA7E);
  rect(0,575,600,25);
  //bird
fill(#F6FF00);
stroke(#F8FC7F);
ellipse(birdX,birdY, 50, 50);
fill(1000,1000,1000);
ellipse(birdX+20,birdY-10,25,25);
fill(0,0,0);
ellipse(birdX+20,birdY-10,10,10);
fill(#FAB608);
ellipse(birdX+25,birdY+15,30,15);
}
