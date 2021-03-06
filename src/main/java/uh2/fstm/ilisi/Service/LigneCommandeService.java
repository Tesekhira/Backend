package uh2.fstm.ilisi.Service;

import org.springframework.beans.factory.annotation.Autowired;
import uh2.fstm.ilisi.Model.BO.LigneCommande;
import uh2.fstm.ilisi.Model.DAO.LigneCommandeDAO;

import java.util.List;

/**
 * Created by TesekhiraEnligne on 11/25/18.
 */
public class LigneCommandeService {


    @Autowired
    private LigneCommandeDAO lignecommandeDao;

    public List<LigneCommande> Retreive(){
        return (List<LigneCommande>) lignecommandeDao.findAll();
    }

    public void Insertion(LigneCommande sup)
    {
        lignecommandeDao.save(sup);
    }

    public void Supprimer(Long id)
    {
        lignecommandeDao.delete(id);
    }

    public void Modifier(LigneCommande sup)
    {
        lignecommandeDao.save(sup);
    }
}
