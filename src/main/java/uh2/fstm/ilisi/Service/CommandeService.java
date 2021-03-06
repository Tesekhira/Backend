package uh2.fstm.ilisi.Service;

import org.springframework.beans.factory.annotation.Autowired;
import uh2.fstm.ilisi.Model.BO.Commande;
import uh2.fstm.ilisi.Model.DAO.CommandeDAO;

import java.util.List;

/**
 * Created by TesekhiraEnligne on 11/25/18.
 */
public class CommandeService {

    @Autowired
    private CommandeDAO commandeDao;

    public List<Commande> Retreive(){
        return (List<Commande>) commandeDao.findAll();
    }

    public void Insertion(Commande sup)
    {
        commandeDao.save(sup);
    }

    public void Supprimer(Long id)
    {
        commandeDao.delete(id);
    }

    public void Modifier(Commande sup)
    {
        commandeDao.save(sup);
    }
}
