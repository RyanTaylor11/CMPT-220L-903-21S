package com.company;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Plant cactus = new Plant("catcus", true , "Cactaceae");
        cactus.wateringinstructions();
        cactus.sunlight();
    }
}
