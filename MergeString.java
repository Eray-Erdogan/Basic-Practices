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
    public static boolean control(String str){
        System.out.print("String da.a Length :" );
        System.out.println(str.length());
        if(!(str.length()>1 & str.length()<2500)){
            System.out.println(str+"   String lenght must be like 1 < lenght < 2500 "+"\n" +
                    "Write proper values.");

            return false;
        }
        else {
            System.out.println("Values are proper.");
            System.out.println("--------------------------------");

            return true;
        }
    }

    public static String merge(String a1,String b1)    {
        String merged ="";
        for (int i = 0; i < a1.length() || i < b1.length() ; i++) {

            // add the ith character if it exists
            if (i < a1.length())
                merged+=(a1.charAt(i));

            // add ith character if it exists

            if (i < b1.length())
                merged+=(b1.charAt(i));
        }
        return merged;
    }



    public static void main(String[] args) {

        // Our function will take two parameter
        // We will merge two string in one string in char order
        while(!(control(Stringa())))
        {        System.out.println("Rewrite a again");
            System.out.println("--------------------------------");    }
        while(!(control(Stringb())))
        {        System.out.println("Rewrite b again");
            System.out.println("--------------------------------");       }
        System.out.println("a1 is "+ a1+"\n"+"b1 is  "+b1);

        System.out.println(" Final result  :  "+ merge(a1,b1));

    }
}
