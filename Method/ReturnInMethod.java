import java.util.*;

class Data {
    int a, b, c;

    static String display() 
	{
        String name = "Ajay";
		
		return name;
    }

    void set(int x, int y) {
        a = x + y;
        this.b = x;
        this.c = y;
    }

    int get() {
        System.out.println("The value of a: " + a);
        return a;
    }

    int getx() {
        System.out.println("The multiplication of b and c: " + b * c);
        return b * c;
    }
}

class Data1 extends Data {
  

    Data1() {
       System.out.println("My Name is "+Data.display());
    }
}

public class ReturnInMethod{
    public static void main(String[] args) {
        Data1 d1 = new Data1();
        d1.set(10, 20);
        System.out.println(d1.get());
        System.out.println(d1.getx());
    }
}
