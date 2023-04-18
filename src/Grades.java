//Write a Java method that will receive any number of integer marks and then print the mark and the corresponding grade using the grading criteria below.
//        Marks
//        Grade
//        (8 marks)
//        Page 2
//        x>=80 A 75<=x<80 A- 70<=x<75 B+ 65<=x<70 B- 60<=x<65 B
//        50<=x<60 C
//        x<50 F
import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter grade: ");
        int x = scan.nextInt();

        if (x >= 80) {
            System.out.println("A");
        } else if (75 <= x && x<80){
            System.out.println("A-");

        } else if (70 <= x && x<75){
            System.out.println("B+");

        } else if (65 <= x && x<70){
            System.out.println("B-");

        }else if (60 <= x && x<65){
            System.out.println("B");

        }else if (50 <= x && x<60){
            System.out.println("C");

        }else {
            System.out.println("F");

        }

    }
}
