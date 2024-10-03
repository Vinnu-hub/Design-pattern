package org.example.ONlyBuilderDesignpattern;

// Product class
class House {
    private final int rooms;
    private final int bathrooms;
    private final boolean hasGarage;

    private House(Builder builder) {
        this.rooms = builder.rooms;
        this.bathrooms = builder.bathrooms;
        this.hasGarage = builder.hasGarage;
    }

    @Override
    public String toString() {
        return "House{" +
                "rooms=" + rooms +
                ", bathrooms=" + bathrooms +
                ", hasGarage=" + hasGarage +
                '}';
    }

    // Builder class
    public static class Builder {
        private int rooms;
        private int bathrooms;
        private boolean hasGarage;

        public Builder(int rooms) {
            this.rooms = rooms; // Required parameter
        }

        public Builder bathrooms(int bathrooms) {
            this.bathrooms = bathrooms;
            return this; // Return the builder to allow for method chaining
        }

        public Builder hasGarage(boolean hasGarage) {
            this.hasGarage = hasGarage;
            return this; // Return the builder to allow for method chaining
        }

        public House build()
        {
            return new House(this);
        }
    }


    // Client code
    public static void main(String[] args) {
        House house = new House.Builder(3) // Required parameter
                .bathrooms(2)              // Optional parameter
                .hasGarage(true)           // Optional parameter
                .build();

        System.out.println(house);
    }
}