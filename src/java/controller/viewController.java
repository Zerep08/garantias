/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author sergiojc
 */

@Controller
@RequestMapping("/login.htm")
public class viewController {
    
    @RequestMapping(method = RequestMethod.GET)
    public String toIndex(Model model){      
       // model.addAttribute("holaBarbarillo","holaBarbarillomon");      
        return "index";
    }
    
    
    
}