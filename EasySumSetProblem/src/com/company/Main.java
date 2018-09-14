package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int nA = Integer.parseInt(br.readLine());
            String[] aStr = br.readLine().split(" ");
            int[] a = new int[nA];
            for (int i=0;i<nA;i++){
                a[i] = Integer.parseInt(aStr[i]);
            }
            int nB = Integer.parseInt(br.readLine());
            String[] bStr = br.readLine().split(" ");
            int[] b = new int[nB];
            for (int i=0;i<nB;i++){
                b[i] = Integer.parseInt(bStr[i]);
            }

            int i=0;
            int tmp = a[0] + i;
            while (tmp <= b[nB-1]){
                for (int j=0;j<nB;j++){
                    if (tmp == b[j]){
                        System.out.print(i+" ");
                    }
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
