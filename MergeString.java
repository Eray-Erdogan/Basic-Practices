import javax.swing.*;
import java.io.*;
import java.util.Scanner;

public class MergeString {
    static String a1="";
    static String b1="";

    public static String Stringa (){
        Scanner sc1= new Scanner(System.in);
        System.out.println("Enter da.a string: ");
        String a= sc1.nextLine();
        a1=a;
        System.out.println("You have entered da.a as: "+a);
        return a;
    }

    public static String Stringb(){
        Scanner sc2= new Scanner(System.in);
        System.out.println("Enter b string: ");
        String b= sc2.nextLine();
        b1=b;
        System.out.println("You have entered b as: "+b);
        return b;
    }



    public static void main(String[] args) {

        // Our function will take two parameter
        // We will merge two string in one string in char order



    }
}
