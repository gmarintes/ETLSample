package com.efficio.sample.etl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class ETLController {
    
    @RequestMapping(value="index.do")
    @ResponseBody
    public String helloWorld() {
        return "Hello World";
    }
    
    @RequestMapping(value="freemarker_test.do")
    public ModelAndView freeMarkerTest() {
        ModelAndView view = new ModelAndView("freemarker_test");
        view.addObject("message", "Hello from Spring and FreeMarker!");
        
        return view;
    }
}
