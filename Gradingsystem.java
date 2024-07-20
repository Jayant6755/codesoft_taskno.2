import java.util.*;

public class Gradingsystem {
    public static void Calculatemarks(int a){

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Write the marks of the given subjects ");
        System.out.print("English = ");
        int e =sc.nextInt();
        System.out.print("Science = ");
        int s =sc.nextInt();
        System.out.print("Maths = ");
        int m =sc.nextInt();
        System.out.print("Hindi = ");
        int h =sc.nextInt();
        System.out.print("Social Studies = ");
        int ss =sc.nextInt();
        
        
        System.out.println();

        double Total = e+s+m+h+ss;
        System.out.println("Total marks Out of 500 = "+Total);

        double Average = Total/500;
        System.out.println("Average marks = "+Average);

        double percentage = Average*100;
        System.out.println("Percentage = "+percentage);

        if (Total>=450){
            System.out.println("A+");
        }
        else if (Total>=400){
            System.out.println("A");
        }
        else if (Total>=350){
            System.out.println("B+");
        }
        else if (Total>=300){
            System.out.println("B");
        }
        else if (Total>=250){
            System.out.println("C+");
        }
        else if (Total>=200){
            System.out.println("C");
        }
        else {
            System.out.println("D");
        }
        

        
    }
    
}
