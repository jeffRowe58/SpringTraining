package com.spring.springtraining;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

@Controller
public class MainController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String welcome(){
        return "/view/hello.jsp";
    }

    @RequestMapping(value = "displayname", method = RequestMethod.GET)
    public String displayName(HttpServletRequest request){
        String firstName = request.getParameter("firstName");
        request.setAttribute("firstName", firstName);
        return "displayName";
    }
}
