/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import org.springframework.stereotype.Controller;
import orgspringframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
/**
 *
 * @author zerep08
 */
@Controller
@RequestMapping("/ver.htm")
public class verController {
    @RequestMapping(method = RequestMethod.GET)
    public  String otroMetodo(Model model){
        return "mostrarTicket";
}
}
