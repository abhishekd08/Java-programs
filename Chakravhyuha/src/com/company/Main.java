package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        br.close();;

        int[][] matrix = new int[n][n];

        int position=1;
        int limit = n*n;
        int i=0,j=0;
        int power = 0;
        ArrayList<String> points = new ArrayList<>();
        while (position != limit){
            for (;j<n;j++){
                matrix[i][j] = position;
                if (position%11 == 0){
                    points.add("("+String.valueOf(i)+","+String.valueOf(j)+")");
                    power++;
                }
                position++;
            }

            for (;i<n;i++){
                matrix[i][j] = position;
                if (position%11 == 0){
                    points.add("("+String.valueOf(i)+","+String.valueOf(j)+")");
                    power++;
                }
                position++;
            }

            for (;j>=0;j--){
                matrix[i][j] = position;
                if (position%11 == 0){
                    points.add("("+String.valueOf(i)+","+String.valueOf(j)+")");
                    power++;
                }
                position++;
            }

            for (;i>=0;i--){

            }
        }
    }
}
