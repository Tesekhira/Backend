package uh2.fstm.ilisi.Controller;

/**
 * Created by AbdoWork on 24/11/2018.
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import uh2.fstm.ilisi.Model.BO.Client;
import uh2.fstm.ilisi.Model.DAO.ClientDAO;
import uh2.fstm.ilisi.Service.ClientService;

import java.util.List;

/**
 * Created by For work on 08/07/2018.
 */
@RestController
@RequestMapping("/app/client")
public class ClientCtrl {
    @Autowired
    private ClientService clientService;

    @RequestMapping(value="/all",method= RequestMethod.GET)
    public List<Client> getAll()
    {
        return (List<Client>) clientService.Retreive();
    }

    @RequestMapping(value="/create",method=RequestMethod.POST)
    public void create(@RequestBody Client cli)
    {
        clientService.Insertion(cli);
    }
    @RequestMapping(value="/delete/{id}",method=RequestMethod.DELETE)
    public void delete(@PathVariable long id)
    {
        clientService.Supprimer(id);

    }
    @RequestMapping(value="/update",method=RequestMethod.PUT)
    public void update(@RequestBody  Client cli)
    {
        clientService.Modifier(cli);
    }

}
