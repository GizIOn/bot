package com.common.card;

public enum Rank {
    HIDDEN("Hidden"),
    TWO("2"),
    THREE("3"),
    FOUR("4"),
    FIVE("5"),
    SIX("6"),
    SEVEN("7"),
    EIGHT("8"),
    NINE("9"),
    TEN("10"),
    JACK("Jack"),
    LADY("Lady"),
    KING("King"),
    ACE("Ace");

    private final String rank;

    Rank(String rank){
        this.rank = rank;
    }

    public String getRank() {
        return rank;
    }
}