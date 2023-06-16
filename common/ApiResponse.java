package com.build.ecommerce.common;

import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class ApiResponse {
    private final boolean success;
    private final String message;

    public ApiResponse(boolean success, String message) {
        this.success = success;
        this.message = message;
    }

    public String getTimeStamp(){
        return LocalDateTime.now().toString();
    }
}
