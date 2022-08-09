package com.bridgelabz;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
      static ArrayList<workshop> w2=new ArrayList<workshop>();
    public static void multipleperson(String id,String firstname,String lastname,String email){

        workshop w1=new workshop(id,firstname,lastname,email);
        w2.add(w1);

    }
    public static int countperson(){

        return w2.size();
    }

    public static void main(String[] args) {
        Boolean r1=true;
        Scanner sc=new Scanner(System.in);
        System.out.println("-welcome-");

        for (int i=0;i<=3;i++){
            String id="[1-4]{1}[A-Z]{2}";
            System.out.println("Enter ID");
            String id1= sc.next();
            Pattern pattern =Pattern.compile(id);
            Matcher matcher =pattern.matcher(id);
            boolean result=matcher.matches();
            if(result==true) System.out.println("valid id");
            else System.out.println("invalid id please enter valid id");

            System.out.println("Enter first name");
            String ="[    A-Z]{1}[a-z]{5}";
            System.out.println("Enter ID");
            String fname= sc.next();
            Pattern pattern1 =Pattern.compile(id);
            Matcher matcher1 =pattern.matcher(id);
            boolean result1=matcher.matches();
            if(result1==true) System.out.println("valid id");
            else System.out.println("invalid id please enter valid id");






            System.out.println("enter last name");
            String lname=sc.next();
            System.out.println("enter email id");
            String email=sc.next();
            System.out.println("enter phone number");
            Long phoneno= sc.nextLong();
            System.out.println("enter date");

            workshop list=new workshop(id1,fname,lname,email);
            w2.add(list);
        }
        System.out.println("multiple person are  " +w2);


    }
}
