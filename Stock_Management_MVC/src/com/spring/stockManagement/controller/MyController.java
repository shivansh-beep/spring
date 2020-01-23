package com.spring.stockManagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.stockManagement.model.StockDTO;
import com.spring.stockManagement.service.MyServiceImp;

@Component
@RequestMapping("/")
public class MyController {
	@Autowired
	MyServiceImp ms;

	@RequestMapping("/stock")
	public String stock() {
		System.out.println("inside controller");
		return "Stock";
	}

	@RequestMapping(value = "/StockData", method = RequestMethod.POST)
	public String stockData(@ModelAttribute StockDTO dto) {
		ms.stock(dto);
		return "Stock";

	}

}
