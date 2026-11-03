public class FactorialNumber{
public static void main(string[] args)
{
int num=1;
while (num<=10){
int fact=1;
int i=num;
while(i>=1)
{
fact=fact*i;
i--;
}
System.out.println("Factorial of"+num+"="+fact);
num++;
}
}
}