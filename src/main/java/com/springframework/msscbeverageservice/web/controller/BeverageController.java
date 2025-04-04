package com.springframework.msscbeverageservice.web.controller;

import com.springframework.msscbeverageservice.web.model.BeverageDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RequestMapping("/api/v1/beverage")
@RestController
public class BeverageController {

    @GetMapping("/{beverageId}")
    public ResponseEntity<BeverageDto> getBeverageById(@PathVariable("beverageId") UUID beverageId) {
        // TODO Impl
        return new ResponseEntity<>(BeverageDto.builder().build(), HttpStatus.OK);
    }

    @PostMapping("/")
    public ResponseEntity saveNewBeverage(@RequestBody BeverageDto beverageDto) {
        // TODO Impl
        return new ResponseEntity<>(BeverageDto.builder().build(), HttpStatus.CREATED);
    }

    @PutMapping("/{beverageId}")
    public ResponseEntity updateBeverageById(@PathVariable("beverageId") UUID beverageId, @RequestBody BeverageDto beverageDto) {
        // TODO Impl
        return new ResponseEntity<>(BeverageDto.builder().build(), HttpStatus.NO_CONTENT);
    }

    @DeleteMapping("/{beverageId}")
    public ResponseEntity deleteBeverageById(@PathVariable("beverageId") UUID beverageId) {
        // TODO Impl
        return new ResponseEntity<>(BeverageDto.builder().build(), HttpStatus.NO_CONTENT);
    }
}
