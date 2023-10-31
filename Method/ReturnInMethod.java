import java.util.*;

class Data
{
int a,b,c;
Scanner sc=new Scanner(System.in);

void set(int x,int y){
System.out.println("Enter the value of a");
a=x+y;
this.b=x;
this.c=y;
}

int get()
{
System.out.println("the value of a");
return a;
}

int getx()
{
	System.out.println("The Multiplication of b and c");
	return b*c;
}
}

public class ReturnInMethod{
public static void main(String arg[])
 {
 Data d1=new Data();
 d1.set(10,20);
 System.out.println(d1.get());
 System.out.println(d1.getx());
 }
}