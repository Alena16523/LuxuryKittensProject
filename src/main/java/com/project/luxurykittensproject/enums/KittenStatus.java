package com.project.luxurykittensproject.enums;

public enum KittenStatus {

    AVAILABLEREADY("Available and Ready"),
    AVAILABLETORESERVE("Available to Reserve"),
    RESERVED("Reserved"),
    ADOPTED("Adopted"),
    OBSERVATION("Under Observation of the cattery");

    private final String description;

    KittenStatus(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
