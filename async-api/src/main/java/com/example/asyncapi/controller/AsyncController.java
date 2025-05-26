package com.example.asyncapi.controller;

import com.example.asyncapi.service.AsyncService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.CompletableFuture;

@RestController
@RequestMapping("/api")
public class AsyncController {
    
    private final AsyncService asyncService;

    public AsyncController(AsyncService asyncService) {
        this.asyncService = asyncService;
    }

    @GetMapping("/direct")
    public CompletableFuture<String> getDirectAsync() {
        return asyncService.fetchDataAsync();
    }

    @GetMapping("/thenApply")
    public CompletableFuture<String> getWithThenApply() {
        return asyncService.fetchDataAsync()
                .thenApply(String::toUpperCase);
    }

    @GetMapping("/thenAccept")
    public ResponseEntity<String> getWithThenAccept() {
        asyncService.fetchDataAsync()
                .thenAccept(data -> System.out.println("Received in thenAccept: " + data));
        return ResponseEntity.ok("Request sent — check server logs for output");
    }

}
