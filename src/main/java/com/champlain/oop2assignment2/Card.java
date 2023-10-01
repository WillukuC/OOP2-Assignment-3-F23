package com.champlain.oop2assignment2;

public class Card {
    private final Suit aSuit;

    private final Rank aRank;

    public Card (Rank pRank, Suit pSuit) {
        this.aRank = pRank;
        this.aSuit = pSuit;
    }

    public Rank getRank() {
        return this.aRank;
    }

    public Suit getSuit() {
        return this.aSuit;
    }

    @Override
    public String toString() {
        return this.aRank + " of " + this.aSuit;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof Card)) {
            return false;
        } else if (((Card) o).aRank == this.aRank && ((Card) o).aSuit == this.aSuit) {
            return true;
        } else {
            return false;
        }
    }
}
