package com.codewithme;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};


        Scanner input=new Scanner(System.in);
        System.out.println("enter your name: ");
        String name=input.nextLine();

        boolean isExist=false;
        int j=0;
        for (int i=0;i<students.length;i++){
            if (name == students[i]){
                isExist=true;
                j=i;
                break;
            }
        }
        if (isExist=true) System.out.println("sinh vien "+name+" o vi tri thu "+j);
        else System.out.println("khong co ten sinh vien nay trong danh sach");
    }
}
