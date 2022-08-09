package com.bridgelabz;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    static ArrayList<Workshop> w2 = new ArrayList<Workshop>();

    public static void multipleperson(String id, String firstname, String lastname, String email) {

        Workshop w1 = new Workshop(id, firstname, lastname, email);
        w2.add(w1);

    }

    public void inputfname() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Name of User: ");
        String fName = sc.next();
        boolean check = Pattern.matches("^[A-Z]{1}+[a-z]{3,}$", fName);
        if (check) {
            System.out.println("Valid");
        } else {
            System.out.println("Please Enter a Valid firstName with Only \"One Starting Capital\" letter");
            inputfname();
        }

    }

    public void lname1() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter last Name of User: ");
        String lName = sc.next();
        boolean check1 = Pattern.matches("^[A-Z]{1}+[a-z]{3,}$", lName);
        if (check1) {
            System.out.println("Valid");
        } else {
            System.out.println("Please Enter a Valid lirstName with Only \"One Starting Capital\" letter");
            lname1();
        }
    }

    public void id1() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter ID : ");
        String ID = sc.next();
        boolean check5 = Pattern.matches("[0-9]{3}", ID);
        if (check5) {
            System.out.println("Valid");
        } else {
            System.out.println("Please Enter a Valid id");
            id1();
        }
    }

    public void fdate1() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first date : ");
        String fdate = sc.next();
        boolean check6 = Pattern.matches("^\\d{4}\\-(0?[1-9]|1[012])\\-(0?[1-9]|[12][0-9]|3[01])$", fdate);
        if (check6) {
            System.out.println("Valid");
        } else {
            System.out.println("Please Enter a Valid date in yyyy-mm-dd");
            fdate1();
        }
    }

    public void ldate1() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter last date : ");
        String ldate = sc.next();
        boolean check7 = Pattern.matches("^\\d{4}\\-(0?[1-9]|1[012])\\-(0?[1-9]|[12][0-9]|3[01])$", ldate);
        if (check7) {
            System.out.println("Valid");
        } else {
            System.out.println("Please Enter a Valid date in yyyy-mm-dd");
            ldate1();
        }
    }

    public void email1() {
//        for (Workshop str : w2) {
//            if (!w2.contains(str)) {
//                w2.add(str);
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter Email of User: ");
                String eMail = sc.next();
                boolean check3 = Pattern.matches("[a-zA-Z0-9.]+[0-9a-zA-Z]*@[a-z0-9]+[.][a-z]{2,4}[.][a-z]*", eMail);
                if (check3)
                    System.out.println("Valid");
                else
                    System.out.println("Please Enter a Valid Email with Only \"example.abc@bl.co.in\" letter");
                email1();
//            }
//        }
    }

    public static void main(String[] args) {
//        Boolean r1=true;
//        Scanner sc=new Scanner(System.in);
//        System.out.println("-welcome-");
//
        for (int i = 0; i <= 2; i++) {

            Main w3= new Main();
            w3.inputfname();
            w3.lname1();
            w3.id1();
            w3.email1();
            w3.fdate1();
            w3.ldate1();
            System.out.println("multiple person are  " + w2);
        }

    }
}
