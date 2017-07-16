package com.example.temp.lh;

/**
 * Created by temp on 7/15/2017.
 */

public class c_dataType {


    private String hindiWord, englishWord;
    public c_dataType(String eWord, String hWord)
    {
        hindiWord = hWord;
        englishWord=eWord;
    }

    public String getHindiWord( )
    {
        return hindiWord;
    }

    public String getEnglishWord()
    {
        return englishWord;
    }
}
