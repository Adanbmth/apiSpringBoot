package com.example.demo.models;
import lombok.Getter;
import lombok.Setter;

public class messageRtrn {
    @Getter @Setter
    private String message;

    public messageRtrn(String message) {
        this.message = message;
    }
}
