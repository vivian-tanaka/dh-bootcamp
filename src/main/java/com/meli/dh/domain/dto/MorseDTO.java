package com.meli.dh.domain.dto;

public class MorseDTO{

    private String sentence;

    public MorseDTO(){}

    public MorseDTO(String sentence) {
        this.sentence = sentence;
    }

    public String getSentence() {
        return sentence;
    }

    public void setSentence(String sentence) {
        this.sentence = sentence;
    }
}
