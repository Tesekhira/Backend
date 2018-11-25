package uh2.fstm.ilisi.Controller;

/**
 * Created by AbdoWork on 24/11/2018.
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import uh2.fstm.ilisi.Model.BO.Livreur;
import uh2.fstm.ilisi.Model.DAO.LivreurDAO;
import uh2.fstm.ilisi.Service.LivreurService;

import java.util.List;

/**
 * Created by For work on 08/07/2018.
 */
@RestController
@RequestMapping("/app/livreur")
public class LivreurCtrl {
    @Autowired
    private LivreurService livreurService;

    @RequestMapping(value="/all",method= RequestMethod.GET)
    public List<Livreur> getAll()
    {
        return (List<Livreur>) livreurService.Retreive();
    }

    @RequestMapping(value="/create",method=RequestMethod.POST)
    public void create(@RequestBody Livreur liv)
    {
        livreurService.Insertion(liv);
    }
    @RequestMapping(value="/delete/{id}",method=RequestMethod.DELETE)
    public void delete(@PathVariable long id)
    {
        livreurService.Supprimer(id);

    }
    @RequestMapping(value="/update",method=RequestMethod.PUT)
    public void update(@RequestBody  Livreur liv)
    {
        livreurService.Modifier(liv);
    }

}
