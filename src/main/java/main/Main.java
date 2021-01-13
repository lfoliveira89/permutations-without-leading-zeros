package main;

import tasks.permutation.PermutationCalculator;

public class Main {

    public static void main(String[] args) {

        if (args == null || args.length < 1 || !args[0].trim().matches("^[0-9]+$")) {
            System.err.println("##################################################");
            System.err.println("Input must be a valid number.");
            System.err.println("##################################################");

            return;
        }

        final String input = args[0];

        final PermutationCalculator permutationCalculator = new PermutationCalculator(input);

        System.out.println("##################################################");
        System.out.println("Result: " + permutationCalculator.calculateNumberOfPermutation());
        System.out.println("##################################################");

    }

}
