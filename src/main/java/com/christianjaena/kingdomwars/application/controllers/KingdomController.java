package com.christianjaena.kingdomwars.application.controllers;

import com.christianjaena.kingdomwars.application.dto.KingdomDto;
import com.christianjaena.kingdomwars.application.request.KingdomRequest;
import com.christianjaena.kingdomwars.application.services.KingdomService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/kingdoms")
public class KingdomController {

    private final KingdomService kingdomService;

    public KingdomController(KingdomService kingdomService) {
        this.kingdomService = kingdomService;
    }

    @PostMapping
    public ResponseEntity<KingdomDto> test(KingdomRequest request) {
        KingdomDto kingdom = kingdomService.createKingdom(request);
        return ResponseEntity.status(HttpStatus.CREATED).body(kingdom);
    }

}
