package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String[] nm_str = br.readLine().split(" ");
            int n = Integer.parseInt(nm_str[0]);
            int m = Integer.parseInt(nm_str[1]);
            int[][] matrix = new int[n][m];
            for (int i=0;i<n;i++){
                String[] line = br.readLine().split(" ");
                for (int j=0;j<m;j++){
                    matrix[i][j] = Integer.parseInt(line[j]);
                }
            }
            ArrayList<Data> dataArrayList = new ArrayList();
            for (int i=0;i<n;i++){
                for (int j=0;j<m;j++){
                    if (i!=0||j!=0){
                        int properties = 0;
                        if (matrix[i][j] == 1){
                            if (i-1 >= 0){
                                properties += matrix[i-1][j];
                                if (j-1 >= 0){
                                    properties += matrix[i-1][j-1];
                                }
                                if (j+1 < m){
                                    properties += matrix[i-1][j+1];
                                }
                            }
                            if (i+1 < n){
                                properties += matrix[i+1][j];
                                if (j-1 > 0){
                                    properties += matrix[i+1][j-1];
                                }
                                if (j+1 < m){
                                    properties += matrix[i+1][j+1];
                                }
                            }
                            if (j+1 < m){
                                properties += matrix[i][j+1];
                            }
                            if (j-1 > 0){
                                properties += matrix[i][j-1];
                            }
                            Data data = new Data();
                            data.i = i;
                            data.j = j;
                            data.val = properties;
                            dataArrayList.add(data);
                        }
                    }
                }
            }

            for (int i=0;i<dataArrayList.size();i++){
                System.out.println(dataArrayList.get(i).val+" "+dataArrayList.get(i).i+":"+dataArrayList.get(i).j);
            }

            int maxVal = 0;
            for (int i=0;i<dataArrayList.size();i++){
                if (maxVal <= dataArrayList.get(i).val){
                    maxVal = dataArrayList.get(i).val;
                }
            }
            ArrayList<Data> maxData = new ArrayList<>();
            for (int i=0;i<dataArrayList.size();i++){
                if (dataArrayList.get(i).val == maxVal){
                    maxData.add(dataArrayList.get(i));
                    System.out.println("("+dataArrayList.get(i).i+":"+dataArrayList.get(i).j+") = "+dataArrayList.get(i).val);
                }
            }

            if (maxData.size() > 0) {
                int minDist = 10000;
                int minPosition = 0;
                for (int k = 0; k < maxData.size(); k++) {
                    int dist = 0;
                    if (maxData.get(k).i == maxData.get(k).j) {
                        dist = maxData.get(k).i - 1;
                        dist = dist * 2;
                    } else {
                        int tmp_i = 0, tmp_j = 0;
                        while (maxData.get(k).i - tmp_i != maxData.get(k).j - tmp_j) {
                            if (maxData.get(k).i - tmp_i > maxData.get(k).j - tmp_j) {
                                tmp_i++;
                                dist++;
                            } else if (maxData.get(k).i - tmp_i < maxData.get(k).j - tmp_j) {
                                tmp_j++;
                                dist++;
                            }
                        }
                        dist = maxData.get(k).i - 1;
                        dist = dist * 2;
                    }
                    if (dist < minDist) {
                        minDist = dist;
                        minPosition = k;
                    }
                }
                System.out.println("Answer Position: ("+maxData.get(minPosition).i+":"+maxData.get(minPosition).j+") = "+maxData.get(minPosition).val);
            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

class Data{
    public int i,j,val;
}