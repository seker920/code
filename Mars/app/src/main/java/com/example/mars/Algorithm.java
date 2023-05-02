package com.example.mars;

public class Algorithm {

    private final double SPEED_ON_MARS = 9.8 ;

    public Algorithm() {

    }

    public long marsOilCalculation(String input) {
        if (input.contains(",")) {

            String inputMod = input.replace(",", ".");

            float inputFloat = Float.parseFloat(inputMod);

            return (long) (inputFloat * SPEED_ON_MARS);

        } else {
            float inputFloat = Float.parseFloat(input);

            return (long) (inputFloat * SPEED_ON_MARS);

        }
    }
}

