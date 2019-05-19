void setup(){
  size(500,500);

}
int x = 20;
int c =20;
int f =20;


void draw(){
if(mousePressed){
x=x+7;  
  f=f+5;
  c=c+4;
  background(100,100,100);
}
fill(#5903FC);
ellipse(f,100,20,20);


fill(#03FC1D);
ellipse(x,150,20,20);


fill(#FFE600);
ellipse(c,200,20,20);





}
