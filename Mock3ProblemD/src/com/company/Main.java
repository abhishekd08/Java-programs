package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int t = Integer.parseInt(s[0]);
        for (int k=0;k<t;k++){
            for(int j=1;j<s.length;j+=3){
                long i = Long.parseLong(s[j]);
                long d = Long.parseLong(s[j+1]);
                long z = Long.parseLong(s[j+2]);
                long d_p = i;
                long z_p = 0;
                if (z >= d){
                    System.out.println(-1);
                }else {
                    long diff,nxtDiff;
                    long x = 0;
                    do {
                        diff = Math.abs(d_p-z_p);
                        d_p+=d;
                        z_p+=z;
                        x++;
                        nxtDiff = Math.abs(d_p-z_p);
                        System.out.println("okok");
                        System.out.println("diff "+diff + " nxtDiff "+nxtDiff);
                        if (d_p == z_p){
                            System.out.println(x);
                        }else {
                            if (nxtDiff > diff) {
                                System.out.println(-1);
                            }
                        }
                    }while (nxtDiff <= diff);
                }
            }
        }
    }
}
