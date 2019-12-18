package com.syne.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure
   .SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@Controller
public class SpringWebServiceStsApplication {

	@RequestMapping("/test")
    @ResponseBody
    String home() {
      return "SSS!";
    }

	public static void main(String[] args) {
		SpringApplication.run(SpringWebServiceStsApplication.class, args);
	}

}
