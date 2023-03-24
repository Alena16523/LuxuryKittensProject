package com.project.luxurykittensproject.enums;

public enum Breed {

    ABYSSINIAN("Abyssinian"),
    AMERICANBOBTAIL("American Bobtail"),
    AMERICANCURL("American Curl"),
    AMERICANSHORTHAIR("American Shorthair"),
    AMERICANWIREHAIR("American Wirehair"),
    BALINESE("Balinese"),
    BENGAL("Bengal"),
    BIRMAN("Birman"),
    BOMBAY("Bombay"),
    BRITISHSHORTHAIR("British Shorthair"),
    BRITISHLONGHAIR("British Longhair"),
    BURMESE("Burmese"),
    BURMILLAN("Burmillan"),
    CHARTREUX("Chartreux"),
    CORNISHREX("Cornish Rex"),
    DEVONREX("Devon Rex"),
    EGYPTIANMAU("Egyptian Mau"),
    EXOTIC("Exotic"),
    HIGHLANDER("Highlander"),
    HIMALAYAN("Himalayan"),
    JAPANESEBOBTAIL("Japanese Bobtail"),
    JAVANESE("Javanese"),
    KORAT("Korat"),
    LAPERMSHORTHAIR("LaPerm Shorthair"),
    MAINECOON("Maine Coon"),
    MANX("Manx"),
    MUNCHKIN("Munchkin"),
    NEBELUNG("Nebelung"),
    NORWEGIANFORESTCAT("Norwegian Forest Cat"),
    OCICAT("Ocicat"),
    ORIENTAL("Oriental"),
    PERSIAN("Persian"),
    PETERBALD("Peterbald"),
    PIXIEBOB("Pixiebob"),
    RAGAMUFFIN("Ragamuffin"),
    RAGDOLL("Ragdoll"),
    RUSSIANBLUE("Russian Blue"),
    SAVANNAH("Savannah"),
    SCOTTISHFOLD("Scottish Fold"),
    SCOTTISHSTRAIGHT("Scottish Straight"),
    SELKIRKREX("Selkirk Rex"),
    SIAMESE("Siamese"),
    SIBERIAN("Siberian"),
    SINGAPURA("Singapura"),
    SNOWSHOE("Snowshoe"),
    SOMALI("Somali"),
    SPHYNX("Sphynx"),
    HIGHLANDFOLD("Highland Fold"),
    HIGHLANDSTRAIGHT("Highland Straight"),
    TONKINESE("Tonkinese"),
    TURKISHANGORA("Turkish Angora"),
    TURKISHVAN("Turkish Van");

    private final String breedName;

    private Breed(String breedName) {
        this.breedName = breedName;
    }

    public String getBreedName() {
        return breedName;
    }

}
