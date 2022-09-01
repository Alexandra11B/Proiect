package com.example.Rental.entity;

import javax.persistence.*;
@Entity
@Table(name = "car")
public class Car {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id")
        private int id;

    @Column(name = "brand")
    private String brand;

        @Column(name = "year")
        private int year;

        @Column(name = "price")
        private int price;
        @Column(name = "mileage")
        private int mileage;
        @Column(name = "colour")
        private String colour;
        @Column(name = "availability")
        private boolean availability;
        @Column(name = "consumption")
        private double consumption;
        @Column(name = "type")
        private String type;
        @Column(name = "antecedents")
        private boolean antecedents;

    public Car(int brand, int year, int price, int mileage, int colour, boolean availability, int consumption, int type, boolean antecedents) {
        this.brand = String.valueOf(brand);
        this.year = year;
        this.price = price;
        this.mileage = mileage;
        this.colour = String.valueOf(colour);
        this.availability = availability;
        this.consumption = consumption;
        this.type = String.valueOf(type);
        this.antecedents = antecedents;
    }

    public Car() {

        }

        public int getId() {
            return id;
        }

        public int getYear() {
            return year;
        }

        public int getPrice() {
            return price;
        }

        public int getMileage() {
            return mileage;
        }

        public String getBrand() {
            return brand;
        }

        public String getColour() {
            return colour;
        }

        public boolean isAvailability() {
            return availability;
        }

        public double getConsumption() {
            return consumption;
        }

        public String getType() {
            return type;
        }

        public boolean isAntecedents() {
            return antecedents;
        }

        public void setId(int id) {
            this.id = id;
        }

        public void setYear(int year) {
            this.year = year;
        }

        public void setPrice(int price) {
            this.price = price;
        }

        public void setMileage(int mileage) {
            this.mileage = mileage;
        }

        public void setBrand(String brand) {
            this.brand = brand;
        }

        public void setColour(String colour) {
            this.colour = colour;
        }

        public void setAvailability(boolean availability) {
            this.availability = availability;
        }

        public void setConsumption(double consumption) {
            this.consumption = consumption;
        }

        public void setType(String type) {
            this.type = type;
        }

        public void setAntecedents(boolean antecedents) {
            this.antecedents = antecedents;
        }

        @Override
        public String toString() {
            return "com.example.Rental.entity.Car{" +
                    "id=" + id +
                    ", year=" + year +
                    ", price=" + price +
                    ", mileage=" + mileage +
                    ", brand=" + brand +
                    ", colour=" + colour +
                    ", availability=" + availability +
                    ", consumption=" + consumption +
                    ", type=" + type +
                    ", antecedents=" + antecedents +
                    '}';
        }
    }



