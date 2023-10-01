package com.champlain.oop2assignment2;

import java.util.Comparator;

public class RankFirstComparator implements CardComparator {
    @Override
    public int compare(Card card1, Card card2) {
        // Compare cards based on rank first
        int rankComparison = card1.getRank().compareTo(card2.getRank());

        // If the ranks are the same, compare based on suit
        if (rankComparison == 0) {
            return card1.getSuit().compareTo(card2.getSuit());
        }

        return rankComparison;
    }
}


