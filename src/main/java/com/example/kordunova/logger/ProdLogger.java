package com.example.kordunova.logger;

public class ProdLogger implements Logger {

    @Override
    public void logMessage(String message) {
        System.out.println("PROD " + message);
    }
}
