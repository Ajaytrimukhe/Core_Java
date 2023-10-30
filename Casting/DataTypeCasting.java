import java.util.*;

class Data{

int i;
Scanner sc=new Scanner(System.in);

 Data(int x)   //constructor
 {
 System.out.println("Enter the value of Integer");
 i=sc.nextInt();

 long l=i;
 System.out.println("After Integer to long = "+l); 
 
 double d=(double)i;
 System.out.println("After Integer to Double = "+d); 
 
 float f=(float)i;
 System.out.println("After Integer to Float = "+f);

 char c=(char)i;
 System.out.println("After Integer to Float = "+c);
 
 m2(); 
 }

 double d;
 void m2()  //method
 {
 System.out.println("Enter the value of Double");
 d=sc.nextDouble();

 int i=(int)d; //DataType Casting(Explicit)
 System.out.println("After the Double to int = "+i); 

 float f=(float)d;
 System.out.println("After the Double to Float = "+f); 
 
 byte b=(byte)d;
 System.out.println("After the Double to Byte = "+b);

 char c=(char)d; 
 System.out.println("After the Double to Character = "+c);
 }

 void Scan()
 {
 sc.close();
 }

}

public class DataTypeCasting
{
public static void main(String arg[])
 {
  Data d1=new Data(20);
   
  d1.Scan();
 }
}