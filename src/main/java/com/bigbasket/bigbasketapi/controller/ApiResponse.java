package com.bigbasket.bigbasketapi.controller;


public class ApiResponse<T> {
    private boolean result;
    private String message;
    private T data;

    public ApiResponse(boolean result, String message, T data) {
        this.result = result;
        this.message = message;
        this.data = data;
    }
    
    public ApiResponse() {
    }

    public boolean isResult() {
        return result;
    }

    public void setResult(boolean result) {
        this.result = result;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    
}
