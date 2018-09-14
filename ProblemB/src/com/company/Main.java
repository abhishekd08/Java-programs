package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new
                    InputStreamReader(System.in));
            String n_string = br.readLine();
            int n = Integer.parseInt(n_string);
            String inputLine = br.readLine();
            String[] inputSeqString = inputLine.split(",");
            int[] input = new int[n];
            for (int i=0;i<n;i++){
                input[i] = Integer.parseInt(inputSeqString[i]);
            }


        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

class ComputeAnswer{

    private int n;
    private int[] input;

    public ComputeAnswer(int n,int[] seq){
        this.n = n;
        this.input = seq;
    }

    public int getAns(){



        return 0;
    }

    private int[] convertSeq(int[] decimalSeq){

        int output[] = new int[n];

        for (int i=0;i<n;i++){
            int counter = 0;
            if (decimalSeq[i] == 1){
                counter++;
                output[i] = counter;
            }else if (decimalSeq[i] < 1){
                output[i] = 0;
            }else {

            }
        }

        return new int[1];
    }
}
