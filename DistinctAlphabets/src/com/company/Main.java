package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        String[] _2 = {"A", "B", "C"};
        String[] _3 = {"D", "E", "F"};
        String[] _4 = {"G", "H", "I"};
        String[] _5 = {"J", "K", "L"};
        String[] _6 = {"M", "N", "O"};
        String[] _7 = {"P", "Q", "R", "S"};
        String[] _8 = {"T", "U", "V"};
        String[] _9 = {"W", "X", "Y", "Z"};
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String[] input = br.readLine().split("");
            int[] in = new int[input.length];
            for (int i = 0; i < input.length; i++) {
                try {
                    in[i] = Integer.parseInt(input[i]);
                }catch (NumberFormatException numE){

                }
            }

            ArrayList<String> list = new ArrayList<>();
            for (int i = 0; i < in.length; i++) {
                switch (in[i]) {
                    case 2:
                        if (!list.contains(_2[0])) {
                            list.add(_2[0]);
                        }
                        break;
                    case 3:
                        if (!list.contains(_3[0])) {
                            list.add(_3[0]);
                        }
                        break;
                    case 4:
                        if (!list.contains(_4[0])) {
                            list.add(_4[0]);
                        }
                        break;
                    case 5:
                        if (!list.contains(_5[0])) {
                            list.add(_5[0]);
                        }
                        break;
                    case 6:
                        if (!list.contains(_6[0])) {
                            list.add(_6[0]);
                        }
                        break;
                    case 7:
                        if (!list.contains(_7[0])) {
                            list.add(_7[0]);
                        }
                        break;
                    case 8:
                        if (!list.contains(_8[0])) {
                            list.add(_8[0]);
                        }
                        break;
                    case 9:
                        if (!list.contains(_9[0])) {
                            list.add(_9[0]);
                        }
                        break;
                }
            }

            for (int i = 0, j = 1; j < in.length; i++, j++) {
                String letter = "";
                switch (in[j]) {
                    case 2:
                        int index = in[i]%3;
                        if (index == 0){
                            index = 2;
                        }
                        letter = _2[index-1];
                        if (!list.contains(letter)) {
                            list.add(letter);
                        }
                        break;
                    case 3:
                        index = in[i]%3;
                        if (index == 0){
                            index = 2;
                        }
                        letter = _3[index-1];
                        if (!list.contains(letter)) {
                            list.add(letter);
                        }
                        break;
                    case 4:
                        index = in[i]%3;
                        if (index == 0){
                            index = 2;
                        }
                        letter = _4[index-1];
                        if (!list.contains(letter)) {
                            list.add(letter);
                        }
                        break;
                    case 5:
                        index = in[i]%3;
                        if (index == 0){
                            index = 2;
                        }
                        letter = _5[index-1];
                        if (!list.contains(letter)) {
                            list.add(letter);
                        }
                        break;
                    case 6:
                        index = in[i]%3;
                        if (index == 0){
                            index = 2;
                        }
                        letter = _6[index-1];
                        if (!list.contains(letter)) {
                            list.add(letter);
                        }
                        break;
                    case 7:
                        index = in[i];
                        if (index == 0){
                            index = 3;
                        }
                        letter = _7[index-1];
                        if (!list.contains(letter)) {
                            list.add(letter);
                        }
                        break;
                    case 8:
                        index = in[i]%3;
                        if (index == 0){
                            index = 2;
                        }
                        letter = _8[index-1];
                        if (!list.contains(letter)) {
                            list.add(letter);
                        }
                        break;
                    case 9:
                        index = in[i]%4;
                        if (index == 0){
                            index = 3;
                        }
                        letter = _9[index-1];
                        if (!list.contains(letter)) {
                            list.add(letter);
                        }
                        break;
                }
            }

            System.out.println(list.size());
            for (int i = 0; i < list.size(); i++) {
                System.out.println(list.get(i));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
