package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new
                    InputStreamReader(System.in));
            String N_string = br.readLine();
            int n = Integer.parseInt(N_string);

            String[] input_string = new String[n];
            for (int i=0;i<n;i++){
                input_string[i] = br.readLine();
            }
            

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
