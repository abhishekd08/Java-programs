package com.company;

public class Main {

    public static void main(String[] args) {
        int n = 5;
        int a = 1;
        int b = 2;

        for(int i=0;i<=n;i++){
            int x=i;
            int y=n-x;

            int tmp1 = (int)Math.pow(x,2)*a;
            int tmp2 = (int)Math.pow(y,2)*b;

            int sum = tmp1+tmp2;
            System.out.println("x: "+x+" y: "+y+" ::: "+sum);
        }
    }
}
