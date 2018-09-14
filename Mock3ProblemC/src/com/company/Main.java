package com.company;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Main {
    public static void main(String[] args){
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String[] inputStr = br.readLine().split(" ");
            long sn = Long.parseLong(inputStr[0]);
            if ((sn >= 10 )&&(sn <= 10000)) {
                long rn = Long.parseLong(inputStr[1]);
                if ((rn >= 1)&&(rn <= 1000000)) {
                    long[] s = new long[(int) sn];
                    String[] samplesStr = br.readLine().split(" ");
                    for (int i = 0; i < sn; i++) {
                        s[i] = Long.parseLong(samplesStr[i]);
                    }
                    long[] x = new long[(int) rn];
                    for (long i = 0; i < rn; i++) {
                        String[] range = br.readLine().split(" ");
                        if ((Math.abs(Long.parseLong(range[1]) - Long.parseLong(range[0])) >= 1)
                                && ((Math.abs(Long.parseLong(range[1]) - Long.parseLong(range[0])) >= 1))) {
                            x[(int) i] = 0;
                            for (long j = 0; j < sn; j++) {
                                if (Long.parseLong(range[0]) < Long.parseLong(range[1])) {
                                    if ((s[(int) j] >= Long.parseLong(range[0])) && (s[(int) j] <= Long.parseLong(range[1]))) {
                                        x[(int) i]++;
                                    }
                                } else if (Long.parseLong(range[0]) > Long.parseLong(range[1])) {
                                    if ((s[(int) j] <= Long.parseLong(range[0])) && (s[(int) j] >= Long.parseLong(range[1]))) {
                                        x[(int) i]++;
                                    }
                                }
                            }
                        }
                    }
                    for (long i = 0; i < rn; i++) {
                        System.out.println(x[(int) i]);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}