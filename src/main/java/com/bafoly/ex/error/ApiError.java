package com.bafoly.ex.error;

import lombok.Data;

import java.util.Date;

@Data
public class ApiError {

    int status;

    String message;

    long timestamp;

    String path;

    public ApiError(int status, String message, String path) {
        this.status = status;
        this.message = message;
        this.timestamp = new Date().getTime();
        this.path = path;
    }

}
