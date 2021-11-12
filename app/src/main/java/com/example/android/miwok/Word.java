package com.example.android.miwok;

/**
 * {@link Word} represents a vocabulary word that the user wants to learn.
 * It contains a default translation and a Miwok translation for that word.
 */
public class Word {
    /* Default translation for the word */
    private final String mDefaultTranslation,
    /* Miwok translation for the word */
    mMiwokTranslation;

    public Word(String defaultTranslation, String miwokTranslation) {
        this.mDefaultTranslation = defaultTranslation;
        this.mMiwokTranslation = miwokTranslation;
    }

    /* Get the default translation of the word. */
    public String getEnglishTranslation() {
        return mDefaultTranslation;
    }

    /* Get the Miwok translation of the word. */
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }
}
