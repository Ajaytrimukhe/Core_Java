import java.util.*;

public class Example1 {
   
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        int month;
        System.out.println("Enter the month you want");
        month=sc.nextInt();
        String name; 
        switch(month)
        {
            case 1:
            name="January";
            break;   
            
            case 2:
            name="Fabruary";
            break;

            case 3:
            name="March";
            break;

            case 4:
            name="April";
            break;

            case 5:
            name="May";
            break;

            case 6:
            name="June";
            break;

            case 7:
            name="July";
            break;

            case 8:
            name="August";
            break;

            case 9:
            name="September";
            break;

            case 10:
            name="October";
            break;

            case 11:
            name="November";
            break;

            case 12:
            name="December";
            break;

            default:
            name="Wrong input";
        }
         System.out.println("Month is "+name);  
        sc.close();
    }
}

/*
 -------------------------------------------------------------------------------
                                      Output
 -------------------------------------------------------------------------------
 
   PS C:\Users\Shree\Desktop\csj 35\javabasics\Switch> java Example1
   Enter the month you want
   12   
   Month is December
 -------------------------------------------------------------------------------
   */
