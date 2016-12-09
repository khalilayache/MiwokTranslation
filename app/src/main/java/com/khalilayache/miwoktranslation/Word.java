package com.khalilayache.miwoktranslation;

/**
 * @author by dlieve_khalil
 * @version 1
 * @since 09/12/2016
 **/

public class Word {

    private String mDefaultTranslation;

    private String mMiwokTranslation;

    public Word(String mDefaultTranslation, String mMiwokTranslation) {
        this.mDefaultTranslation = mDefaultTranslation;
        this.mMiwokTranslation = mMiwokTranslation;
    }

    public String getmDefaultTranslation() {
        return mDefaultTranslation;
    }

    public String getmMiwokTranslation() {
        return mMiwokTranslation;
    }
}
