package com.udacity.pricing;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringRunner.class)
@WebMvcTest
public class PricingServiceApplicationTests {

	@Autowired
	private MockMvc mockMvc;
	
	@Test
	public void contextLoads() throws Exception { 
	}

	@Test
	public void testVehicle() throws Exception {
		 this.mockMvc.perform(get("/services/price?vehicleId=1")).andDo(print())
 		.andExpect(status().isOk());
	}
	
}
