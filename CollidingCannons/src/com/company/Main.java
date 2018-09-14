package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line1 = br.readLine().split(",");
        String[] line2 = br.readLine().split(",");

        int height = Integer.parseInt(line1[0]);
        int width = Integer.parseInt(line2[0]);

        int la = Integer.parseInt(line2[0]) + 5;
        int ls = Integer.parseInt(line2[1]);
        int ra = Integer.parseInt(line2[2]) + 5;
        int rs = Integer.parseInt(line2[3]);

        double lhs = (double) ls * (Math.cos(la));
        double lvs = (double) ls * (Math.sin(la));
        double rhs = (double) rs * (Math.cos(ra));
        double rvs = (double) rs * (Math.sin(ra));

        int midPoint = (int) (lhs / (lhs + rhs)) * width;
        double midTime = (double) midPoint / lhs;

        double leftUnitVerticleTime = ((height / (double) 2) / lvs);
        double rightUnitVerticleTime = ((height / (double) 2) / rvs);

        double leftTotalVerticleDist = lvs * midTime;
        double rightTotalVerticleDist = rvs * midTime;

        int leftCycles = (int) (leftTotalVerticleDist / (width / 2));
        int rightCycles = (int) (rightTotalVerticleDist / (width / 2));

        if ((leftCycles > 0 && rightCycles > 0) || (leftCycles < 0 && rightCycles < 0)) {
            double leftVertDist = (leftTotalVerticleDist % (width / 2));
            double rightVertDist = (rightTotalVerticleDist % (width / 2));

            if (leftVertDist == rightVertDist) {

                if (midPoint > (width / 2)) {
                    int x_point = midPoint - (width / 2);
                    if (leftCycles > 0) {

                    } else if (leftCycles < 0) {

                    }
                } else if (midPoint < (width / 2)) {
                    int x_point = (width / 2) - midPoint;
                    if (leftCycles > 0) {

                    } else if (leftCycles < 0) {

                    }
                } else {

                }

            } else {
                //TODO print no collision
            }

        } else {
            //TODO print no collision
        }
    }
}
