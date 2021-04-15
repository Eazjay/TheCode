package com.codingdojo.thecode;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/")
public class TheCodeController {
	
	@RequestMapping("")
	public String index() {
		return "index.jsp";
	}
	
	@RequestMapping(value="/guessCode", method=RequestMethod.POST)
	public String guessCode(@RequestParam("code") String guessCode) {
		if(guessCode.equals("bushido")) {
			return "redirect:/success";
		}
		return "redirect:/createError";
		
	}
	
	@RequestMapping("/createError")
    public String flashMessages(RedirectAttributes redirectAttributes) {
        redirectAttributes.addFlashAttribute("error", "You must train harder!");
        return "redirect:/";
    }
	
	@RequestMapping("/success")
	public String successPage(){
		return "success.jsp";
	}
}
