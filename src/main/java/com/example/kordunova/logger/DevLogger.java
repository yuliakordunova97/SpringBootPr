package com.example.kordunova.logger;

public class DevLogger implements Logger {

    @Override
    public void logMessage(String message) {
        System.out.println("DEV " + message);
    }
}
