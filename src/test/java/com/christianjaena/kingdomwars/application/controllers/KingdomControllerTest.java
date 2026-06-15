package com.christianjaena.kingdomwars.application.controllers;


import com.christianjaena.kingdomwars.application.dto.KingdomDto;
import com.christianjaena.kingdomwars.application.request.KingdomRequest;
import com.christianjaena.kingdomwars.application.services.KingdomService;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.webmvc.test.autoconfigure.WebMvcTest;
import org.springframework.http.HttpHeaders;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(controllers = KingdomController.class)
class KingdomControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockitoBean
    private KingdomService kingdomService;

    @Test
    void shouldCreateKingdom() throws Exception {
        KingdomDto kingdomDto = new KingdomDto("Test Kingdom");
        when(kingdomService.createKingdom(any(KingdomRequest.class)))
                .thenReturn(kingdomDto);

        mockMvc.perform(
                        post("/api/v1/kingdoms")
                                .content(
                                        """
                                            {
                                                name: "Test Kingdom"
                                            }
                                        """
                                )
                )
                .andExpect(jsonPath("$.name").value("Test Kingdom"))
                .andExpect(status().isCreated());
    }

    @Test
    void shouldGetKingdom() {

    }

    @Test
    void shouldDeleteKingdom() {

    }

}