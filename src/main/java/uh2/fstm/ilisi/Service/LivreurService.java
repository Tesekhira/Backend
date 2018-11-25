package uh2.fstm.ilisi.Service;

import org.springframework.beans.factory.annotation.Autowired;
import uh2.fstm.ilisi.Model.BO.Commande;
import uh2.fstm.ilisi.Model.BO.Livreur;
import uh2.fstm.ilisi.Model.DAO.CommandeDAO;
import uh2.fstm.ilisi.Model.DAO.LivreurDAO;

import java.util.List;

/**
 * Created by TesekhiraEnligne on 11/25/18.
 */
public class LivreurService {
    @Autowired
    private LivreurDAO livreurDao;

    public List<Livreur> Retreive(){
        return (List<Livreur>) livreurDao.findAll();
    }

    public void Insertion(Livreur sup)
    {
        livreurDao.save(sup);
    }

    public void Supprimer(Long id)
    {
        livreurDao.delete(id);
    }

    public void Modifier(Livreur sup)
    {
        livreurDao.save(sup);
    }
}
