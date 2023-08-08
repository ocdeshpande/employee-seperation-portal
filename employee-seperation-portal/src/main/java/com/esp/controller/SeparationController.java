package com.esp.controller;

import com.esp.model.SeparationRequest;
import com.esp.repository.SeparationRequestRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/separation")
public class SeparationController {
    private final SeparationRequestRepository requestRepository;

    public SeparationController(SeparationRequestRepository requestRepository) {
        this.requestRepository = requestRepository;
    }

    @PostMapping("/request")
    public SeparationRequest createSeparationRequest(@RequestBody SeparationRequest request) {
        return requestRepository.save(request);
    }

    @GetMapping("/requests")
    public List<SeparationRequest> getAllSeparationRequests() {
        return requestRepository.findAll();
    }

    // Add other endpoints for updating, deleting, and handling separation requests
}
