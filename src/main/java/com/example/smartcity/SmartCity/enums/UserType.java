package com.example.smartcity.SmartCity.enums;

public enum UserType {
    BUSINESSMAN("BUSINESSMAN"),
    STUDENT("STUDENT"),
    TOURIST("TOURIST");

    private final String type;

    UserType(String type) {
        this.type = type;
    }

    public String getUserType(){
        return type;
    }
}
