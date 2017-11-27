package controller;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import dao.TicketDAO;
import java.util.List;
import org.json.JSONArray;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import pojo.Ticket;

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
        TicketDAO tdao=new TicketDAO();
        List<Ticket> lista=tdao.getAllRows();
        JSONArray json=new JSONArray(lista);
        return json.toString();
    }
    //http://localhost:8080/spring212/trucos/diHola.htm
    @RequestMapping(value = "saveTicket", method = RequestMethod.POST, produces = "aplication/json")
    public @ResponseBody
    String saveTicket(
            @RequestParam("nombre") String nombre,
            @RequestParam("falla") String falla,
            @RequestParam("comentario") String comentario,
            @RequestParam("correo") String correo,
            @RequestParam("status") String status) {  
        
        TicketDAO tdao=new TicketDAO();
        tdao.saveTicket(1, nombre, falla, comentario, correo, status);
        List<Ticket> lista=tdao.getAllRows();
        JSONArray json=new JSONArray(lista);
        
        return json.toString();
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
