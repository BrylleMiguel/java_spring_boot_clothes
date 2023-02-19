package com.assignment1.clothes.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@Table
public class Clothe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Double id;

    @NotBlank
    private String name;

    @Min(1)
    @Max(499)
    @NotNull
    private Double price;

    @Min(2021)
    private int yearOfCreation;

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
