package spring_demo3.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import spring_demo3.model.ModelDTO;
import spring_demo3.service.MyService;

@Component
@RequestMapping("/")
public class MyController {
	@Autowired
	MyService ms;

	@RequestMapping("/login")
	public String login() {
System.out.println("inside controller login");
		return "login";

	}

	@RequestMapping("/registration")
	public String reg() {
		System.out.println("inside controller reg");
		return "registration";
	}

	@RequestMapping(value = "/loginData", method = RequestMethod.POST)
	public String loginData(@ModelAttribute ModelDTO dto) {
		System.out.println(dto.getUname() + " " + dto.getPw());
		boolean b = ms.login(dto);
		if (b) {
			System.out.println("login success");
		} else {
			System.out.println("login failed");
		}
		return "login";

	}

	@RequestMapping(value = "/registrationData", method = RequestMethod.POST)
	public String regData(@ModelAttribute ModelDTO dto) {
		System.out.println(dto.getFname() + " " + dto.getUname());
		System.out.println(dto.getAd() + " " + dto.getAge());
		ms.register(dto);
		return "registration";
	}

}
