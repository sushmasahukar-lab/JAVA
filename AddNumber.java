class AddNumber{
void add(int a,int b){
int sum=a+b;
System.out.println("Sum of integer="+sum);
}
void add(float X,float Y){
float sum =X+Y;
System.out.println("Sum of float="+sum);
}
void add(){
int a=5; b=10;
int sum=a+b;
System.out.println("Default sum(integer)="+sum);
}
public static void main(String[] args){					
AddNumber obj =new AddNumber();
obj.add();
obj.add(8,12);
obj.add(2.5f,4.5f);
}
}
