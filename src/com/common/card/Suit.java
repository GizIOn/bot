package com.common.card;

public enum Suit {
    HIDDEN("Hidden"),
    DIAMOND("Diamond"),
    CLUBS("Clubs"),
    HEARTS("Hearts"),
    SPADES("Spades");

    private final String suit;

    Suit(String suit) {
        this.suit=suit;
    }

    public String getSuit(){return suit;}

    public static Suit valuesOf(String number){
        switch (number){
            case "1" -> {return DIAMOND;}
            case "2" -> {return CLUBS;}
            case "3" -> {return HEARTS;}
            case "4" -> {return SPADES;}
            default -> {return HIDDEN;}
        }
    }
}
