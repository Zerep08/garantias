package controller;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author sergiojc
 */
@RestController
@RequestMapping("/tickets")
public class GarantiasRestController {
    //http://localhost:8080/spring212/trucos/diHola.htm
    @RequestMapping(value = "getAllTickets", method = RequestMethod.GET, produces = "aplication/json")
    public @ResponseBody
    String getAllTickets() {      
        Gson g = new Gson();
        return g.toJson("f");
    }
    //http://localhost:8080/spring212/trucos/diHola.htm
    @RequestMapping(value = "saveTicket", method = RequestMethod.POST, produces = "aplication/json")
    public @ResponseBody
    String saveTicket() {     
        Gson g = new Gson();
        JsonObject b=new JsonObject();
        b.addProperty("Saludo","HolaMundo");
        return b.toString();
    }
        //http://localhost:8080/spring212/trucos/diHola.htm
    @RequestMapping(value = "checkPassword", method = RequestMethod.POST, produces = "aplication/json")
    public @ResponseBody
    String checkPassword() {     
        Gson g = new Gson();
        JsonObject b=new JsonObject();
        b.addProperty("Saludo","HolaMundo");
        return b.toString();
       
    }


    
    
    
    
    

}
