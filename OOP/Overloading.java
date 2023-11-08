import java.util.Scanner;

class Data {
    int method(int i)   //First method "Same name of method"
    {
        int result = i * i;
        return result;
    }

    int method(int i,int j) //second method "same name of method"
    {
      int result=i*i*i;
      return result;
    } 
}

public class Overloading {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        System.out.println("Enter the value: ");
        i = sc.nextInt();
        Data d1 = new Data();

        d1.method(i);
        d1.method(i,i);

        System.out.println("The square of " + i + " is: " + d1.method(i));
        System.out.println("The cube of " + i + " is: " + d1.method(i,i));

        sc.close();
    }
}
