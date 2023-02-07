package com.assignment1.clothes.model;

import java.util.Date;

import lombok.Data;

@Data
public class Clothe {
    private int id;
    private String name;
    private Date yearOfCreation;
    final Double price;

    public enum Brand {
        NIKE("Nike"),
        LEVIS("Levi's"),
        PUMA("Puma"),
        DIOR("Dior"),
        STONE_ISLANDS("Stone Islands"),
        BALENCIAGA("Balenciaga");

        private String brandName;

        private Brand(String brandName) {
            this.brandName = brandName;
        }

        public String getbrandName() {
            return brandName;
        }
    }
}
