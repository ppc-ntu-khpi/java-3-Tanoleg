package test;

import domain.Exercise;
import java.util.Arrays;

public class TestResult {

    public static void main(String[] args) {

        int size = 11;

        int[] result = Exercise.calculate(size);

        System.out.println("Generated array: " + Arrays.toString(result));
    }
}