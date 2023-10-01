package com.champlain.oop2assignment2;

public class SuitFirstComparator implements CardComparator {
    @Override
    public int compare(Card card1, Card card2) {
        // Compare cards based on suit first
        int suitComparison = card1.getSuit().compareTo(card2.getSuit());

        // If the suits are the same, compare based on rank
        if (suitComparison == 0) {
            return card1.getRank().compareTo(card2.getRank());
        }

        return suitComparison;
    }
}

