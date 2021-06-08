
package com.company;

        import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap vao so can xet");
        int num= sc.nextInt();
        int max=0;
        for (int i = 1; i < num; i++) {
            if(num%i==0){
                max=i;

            }
        }System.out.println("uoc lon nhat cua "+num+"la"+max);
    }
}
