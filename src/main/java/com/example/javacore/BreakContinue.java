package com.example.javacore;

public class BreakContinue {
    public void SwitchCaseBreak(int num) {
        switch (num) {
            case 1:
                System.out.println("MONDAY");
                break;
            case 2:
                System.out.println("TUESDAY");
                break;
        }

    }

    public void WhileContinue() {
        int[] number = {1, 3, 5, 7};
        int i = 0;
        while (i < number.length) {
            if (i == 2) {
                i++;
                continue;
            }
            System.out.println("while loop & continue" + number[i]);
            i++;
        }
    }

    public void ForBreak() {
        int[] number = {0, 6, 5, 9};
        for (int i = 0; i < number.length; i++) {
            if (i == 2) {
                continue;
            }
            System.out.println("array 0,6,5,9 but skip 6 and only show " + number[i]);
        }

    }
}
