package spring_demo2;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Component
@RequestMapping("/")
public class MyController {
	@RequestMapping("/link1")
	public String m1() {
		return "login";
	}

	@RequestMapping("/link2")
	public ModelAndView m2() {
		return new ModelAndView("registration");
	}

	@RequestMapping("/link3")
	public ModelAndView m3() {
		return new ModelAndView("success3", "data", "this data from controller");
	}

	@RequestMapping("/link4")
	public ModelAndView m4() {

		DTO dto = new DTO();
		dto.setId(12);
		dto.setName("shivansh");

		return new ModelAndView("success4", "dto", dto);
	}

	@RequestMapping("/link5")
	public ModelAndView m5() {

		DTO dto1 = new DTO();
		dto1.setId(5);
		dto1.setName("shivam");

		DTO dto2 = new DTO();
		dto2.setId(6);
		dto2.setName("ankush");

		DTO dto3 = new DTO();
		dto3.setId(7);
		dto3.setName("shivansh");

		List<DTO> list = new ArrayList<>();
		list.add(dto1);
		list.add(dto2);
		list.add(dto3);

		return new ModelAndView("success5", "list", list);
	}
	/*
	 * @RequestMapping("/login") public ModelAndView login(HttpServletRequest
	 * req) { String username=req.getParameter("username"); String
	 * password=req.getParameter("password");
	 * if(username.equals("shiv")&&password.equals("1234")){ return new
	 * ModelAndView("home","msg","login success"); }else{ return new
	 * ModelAndView("login","msg","login failed"); }
	 * 
	 * }
	 */

	@RequestMapping("/login")
	public ModelAndView login(@RequestParam String username, int password) {
		if (username.equals("shiv") && password == 1234) {
			return new ModelAndView("home", "msg", "login success");
		} else {
			return new ModelAndView("login", "msg", "login failed");
		}
	}
	@RequestMapping("/reg")
	public ModelAndView reg(@ModelAttribute RegistrationDTO rdto) {
		return new ModelAndView("home","rdto",rdto);
	}
}
