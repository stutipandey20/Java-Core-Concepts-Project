package com.example.asyncapi.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.concurrent.CompletableFuture;

@Service
public class AsyncService {
    
    @Async
    public CompletableFuture<String> fetchDataAsync() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e){
            Thread.currentThread().interrupt();
        }
        return CompletableFuture.completedFuture("Hello from async service!");
    }
}
