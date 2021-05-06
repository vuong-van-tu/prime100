package com.company;

public class Main {

    public static void main(String[] args) {
        int count = 0;
        int n = 2;
        while (n<100){
            boolean prime = true;
            for (int i = 2 ; i < n ; i ++){
                if (n%i==0){
                    prime = false;
                }
            }
            if (prime==true){
                System.out.print(n+"  ");
            }
            n++;
        }
    }
}
