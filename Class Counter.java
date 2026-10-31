Class counter {
static int count=0;
int objNumber;
counter(){
counter++;
objNumbe=count;
}
void display(){
System.out.println ("object number="+objNumber);
System.out.println ("Statice count="+count);
System.out.println ("---------------------");
}
}
}
class static Variable Demo{
public static void main (string [] args){
Counter c1=new counter ();
Counter c2=new counter();
Counter c3=new counter();
c1.display();
c2.display();
c3.display();
}
}