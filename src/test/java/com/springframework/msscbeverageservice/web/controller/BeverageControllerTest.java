package com.springframework.msscbeverageservice.web.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.springframework.msscbeverageservice.web.model.BeverageDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import java.util.UUID;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(BeverageController.class)
class BeverageControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    ObjectMapper objectMapper;

    private static final String PATH_URL_TEMPLATE = "/api/v1/beverage/";
    @Test
    void getBeverageById() throws Exception {
        mockMvc.perform(get(PATH_URL_TEMPLATE+ UUID.randomUUID().toString()).accept(MediaType.APPLICATION_JSON)).andExpect(status().isOk());
    }

    @Test
    void saveNewBeverage() throws Exception {
        BeverageDto beverageDto = BeverageDto.builder().build();
        String beverageDtoJson = objectMapper.writeValueAsString(beverageDto);
        mockMvc.perform(post(PATH_URL_TEMPLATE)
                .contentType(MediaType.APPLICATION_JSON)
                .content(beverageDtoJson))
                .andExpect(status().isCreated());
    }

    @Test
    void updateBeverageById() throws Exception {
        BeverageDto beverageDto = BeverageDto.builder().build();
        String beverageDtoJson = objectMapper.writeValueAsString(beverageDto);
        mockMvc.perform(put(PATH_URL_TEMPLATE+UUID.randomUUID().toString())
                .contentType(MediaType.APPLICATION_JSON)
                .content(beverageDtoJson))
                .andExpect(status().isNoContent());
    }

    @Test
    void deleteBeverage() throws Exception {
        mockMvc.perform(delete(PATH_URL_TEMPLATE+UUID.randomUUID().toString())
                        .accept(MediaType.APPLICATION_JSON))
                        .andExpect(status().isNoContent());
    }
}