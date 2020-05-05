package ex4.p1;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] array = {12, 43, 12, -65, 778, 123, 32, 76};
        System.out.println(Arrays.stream(array).max().getAsInt());
    }
}