package com.jpaboard;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDateTime;

public class ApiResponse<T> {

    private int statusCode;

    private T data;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "Asiz/Seoul")
    private LocalDateTime serverDateTime;

    public ApiResponse(int statusCode, T data) {
        this.statusCode = statusCode;
        this.data = data;
        this.serverDateTime = LocalDateTime.now();
    }

    public static <T> ApiResponse<T> ok(T data) {
        return new ApiResponse<>(200, data);
    }

    public static <T> ApiResponse<T> fail(int statusCode, T errorData) {
        return new ApiResponse<>(statusCode, errorData);
    }

    public int getStatusCode() {
        return this.statusCode;
    }

    public T getData() {
        return this.data;
    }

    public LocalDateTime getServerDateTime() {
        return this.serverDateTime;
    }
}