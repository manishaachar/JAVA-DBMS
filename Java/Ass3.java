package Java;

import java.util.Scanner;

public class Ass3 {
    public static void main(String[] args) {
        System.out.println("Enter a string:");
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        StringBuffer sb1=new StringBuffer(s);
        StringBuffer sb2=new StringBuffer("");
        //System.out.println(sb1.capacity());
        System.out.println("capacity =" +sb1.capacity());
        int i,j;
        for(i=sb1.length()-1,j=0;i>0;i--,j++)
        {
            sb2.insert(j, sb1.charAt(1));

        }
        System.out.println(sb2);
        String upper=sb1.toString().toUpperCase();
        System.out.println(upper);
        System.out.println("Enter appened word");
        String ss=sc.next();
        sb2=new StringBuffer(upper);
        System.out.println(sb2.append(ss));

    }
}