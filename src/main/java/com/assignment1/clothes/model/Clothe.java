package com.assignment1.clothes.model;

import java.time.Year;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;
import org.springframework.format.annotation.DateTimeFormat;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@Table
public class Clothe {

    @Id
    private Double id;

    @NotBlank
    private String name;

    @Min(1)
    @Max(499)
    final Double price;

    @DateTimeFormat
    private Year yearOfCreation;

    @NotBlank
    private String brand;

    public enum Brand {
        NIKE("Nike"),
        LEVIS("Levi's"),
        PUMA("Puma"),
        DIOR("Dior"),
        STONE_ISLANDS("Stone Islands"),
        BALENCIAGA("Balenciaga");

        private String name;

        private Brand(String name) {
            this.name = name;
        }

        public String getBrandName() {
            return name;
        }
    }
}
