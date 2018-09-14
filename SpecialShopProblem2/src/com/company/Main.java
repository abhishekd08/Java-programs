package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {

    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int cases = Integer.parseInt(br.readLine());
        for(int i=0;i<cases;i++) {
            String inputString = br.readLine();
            String[] inputStrArr = inputString.split(" ");
            int n = Integer.parseInt(inputStrArr[0]);
            int a = Integer.parseInt(inputStrArr[1]);
            int b = Integer.parseInt(inputStrArr[2]);

            long sum = (long)a+(long)b;
            long numerator = (long)b * (long)n;
            long ans = numerator/(sum);
            ans++;
            long val = mathInt(ans,n-ans,a,b);
            System.out.println(val);
        }
    }

    public static long mathInt(long x,long y,int a,int b){
        return ( (((long)Math.pow(x,2))*a) + ( (long)(Math.pow(y,2))*b) );
    }

    /*public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int cases = Integer.parseInt(br.readLine());
        for(int i=0;i<cases;i++){
            String inputString = br.readLine();
            String[] inputStrArr = inputString.split(" ");
            int n = Integer.parseInt(inputStrArr[0]);
            int a = Integer.parseInt(inputStrArr[1]);
            int b = Integer.parseInt(inputStrArr[2]);

            int sum = a+b;
            System.out.println(sum);
            double tmp = a/(double)sum;
            System.out.println(tmp);
            int position = (int)(n*tmp);
            System.out.println(position);

            long val = mathInt(position,n-position,a,b);
            System.out.println(val);
        }
    }

    public static long mathInt(int x, int y, int a, int b) {
        return ((((int) Math.pow(x, 2)) * a) + ((int) (Math.pow(y, 2)) * b));
    }

    public static BigInteger math(int xInt, int yInt, int aInt, int bInt) {
        return BigInteger.valueOf(xInt).pow(2).multiply(BigInteger.valueOf(aInt))
                .add(BigInteger.valueOf(yInt).pow(2).multiply(BigInteger.valueOf(bInt)));
    }*/


    /*public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int cases = Integer.parseInt(br.readLine());

        for (int i = 0; i < cases; i++) {
            String inputString = br.readLine();
            String[] inputStrArr = inputString.split(" ");
            int n = Integer.parseInt(inputStrArr[0]);
            int a = Integer.parseInt(inputStrArr[1]);
            int b = Integer.parseInt(inputStrArr[2]);

            if (a == b){
                int x = n/2;
                int y=n-x;
                int val = mathInt(x,y,a,b);
                System.out.println(val);
            }else if(a-b>0){

            }else if (a-b<0){

            }

            int x = 0, y = n;
            int p = (x + y) / 2, q = n - p;
            long val = mathInt(p, q, a, b);
            long nextVal = mathInt(p + 1, q - 1, a, b);

            while (x < y) {
                if (val < nextVal) {
                    y = (x + y) / 2;
                } else if (val > nextVal) {
                    x = (x + y) / 2;
                } else {
                    System.out.println(val);
                    break;
                }
                p = (x + y) / 2;
                q = n - p;
                val = mathInt(p, q, a, b);
                nextVal = mathInt(p + 1, q - 1, a, b);

                if ((y - x) < 2) {
                    if (val < nextVal) {
                        System.out.println(val);
                        break;
                    } else {
                        System.out.println(nextVal);
                        break;
                    }
                }
            }

        }
    }


    public static int mathInt(int x, int y, int a, int b) {
        return ((((int) Math.pow(x, 2)) * a) + ((int) (Math.pow(y, 2)) * b));
    }*/


    /*public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int cases = Integer.parseInt(br.readLine());

        for (int i = 0; i < cases; i++) {
            String inputString = br.readLine();
            String[] inputStrArr = inputString.split(" ");
            int n = Integer.parseInt(inputStrArr[0]);
            int a = Integer.parseInt(inputStrArr[1]);
            int b = Integer.parseInt(inputStrArr[2]);

            int x = 0, y = n;
            int p = (x + y) / 2, q = n - p;
            BigInteger val = math(p, q, a, b);
            BigInteger nextVal = math(p + 1, q - 1, a, b);

            while (x < y) {
                if (val.compareTo(nextVal) == -1) {
                    y = (x + y) / 2;
                } else if (val.compareTo(nextVal) == 1) {
                    x = (x + y) / 2;
                }
                *//*else if(val.compareTo(nextVal) == 0){
                    System.out.println(val);
                    break;
                }*//*
                p = (x + y) / 2;
                q = n - p;
                val = math(p, q, a, b);
                nextVal = math(p + 1, q - 1, a, b);
                System.out.println(val);
                if ((y - x) < 2) {
                    if (val.compareTo(nextVal) == -1) {
                        System.out.println(val);
                        break;
                    } else {
                        System.out.println(nextVal);
                        break;
                    }
                }
            }

        }
    }*/

    /*public static BigInteger math(int xInt, int yInt, int aInt, int bInt) {
        return BigInteger.valueOf(xInt).pow(2).multiply(BigInteger.valueOf(aInt))
                .add(BigInteger.valueOf(yInt).pow(2).multiply(BigInteger.valueOf(bInt)));
    }*/
}


/*

import java.io.BufferedReader;
        import java.io.InputStreamReader;

class TestClass {
    public static void main(String args[] ) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int cases = Integer.parseInt(br.readLine());

        for(int i=0;i<cases;i++){
            String inputString = br.readLine();
            String[] inputStrArr = inputString.split(" ");
            int n = Integer.parseInt(inputStrArr[0]);
            int a = Integer.parseInt(inputStrArr[1]);
            int b = Integer.parseInt(inputStrArr[2]);


            int x=0,y=n;
            int p= (x+y)/2,q=n-p;
            long val = math(p,q,a,b);
            long nextVal = math(p+1,q-1,a,b);
            while(x < y){
                if(val < nextVal){
                    y = (x+y)/2;
                }else if(val > nextVal){
                    x = (x+y)/2;
                }else{
                    System.out.println(val);
                    break;
                }
                p = (x+y)/2;
                q=n-p;
                val = math(p,q,a,b);
                nextVal = math(p+1,q-1,a,b);

                if((y-x) < 2){
                    if(val < nextVal){
                        System.out.println(val);
                        break;
                    }else{
                        System.out.println(nextVal);
                        break;
                    }
                }
            }
        }
    }

    public static int math(int x,int y,int a,int b){
        return ( (((int)Math.pow(x,2))*a) + ((int)(Math.pow(y,2))*b) );
    }
}


*/