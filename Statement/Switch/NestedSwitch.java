import java.util.*;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year;
        String branch;
        String result="";

        try {
            System.out.println("Enter the Year of Student 1 to 4");
            year = sc.nextInt();
            sc.nextLine(); 
            System.out.println("Enter the branch");
            branch = sc.nextLine();

            switch (year) {
                case 1:
                    switch (branch) {
                        case "CS":
                            result = "C, C++, DSA";
                            break;
                        case "EE":
                            result = "EE, BE, C";
                            break;
                    }
                    break;

                case 2:
                    switch (branch) {
                        case "CS":
                            result = "Operating System, Java, CPP";
                            break;
                        case "EE":
                            result = "Microprocessors, Logic switching theory";
                            break;
                    }
                    break;

                case 3:
                    switch (branch) {
                        case "CS":
                            result = "Computer Organization, MultiMedia";
                            break;
                        case "EE":
                            result = "Fundamentals of Logic Design, Microelectronics";
                            break;
                    }
                    break;

                case 4:
                    switch (branch) {
                        case "CS":
                            result = "Data Communication and Networks, MultiMedia";
                            break;
                        case "EE":
                            result = "Embedded System, Image Processing";
                            break;
                    }
                    break;

                default:
                    result = "Something went wrong";
            }
            System.out.println(year+" Year of "+branch+" Branch Pattern is = "+result+".");
        } 
        
        catch(Exception e)
        {
          System.out.println("Exception Catch");  
        }

        finally {
            sc.close();
        }
    }
}
