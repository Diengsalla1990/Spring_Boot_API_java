package com.diengsalla.ApiRest;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.springframework.http.MediaType;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import com.diengsalla.ApiRest.controller.EmployeeController;
import com.diengsalla.ApiRest.service.EmployeeService;


@SpringBootTest
@AutoConfigureMockMvc
class EmployeeControllerTest {
	
	@Autowired
	private MockMvc mockMvc;
	

	@Test
	public void testGetEmployees() throws Exception{
		 mockMvc.perform(get("/employees"))
         .andExpect(status().isOk())
         .andExpect(jsonPath("$[0].firstName", is("Laurent")));
	}

}
