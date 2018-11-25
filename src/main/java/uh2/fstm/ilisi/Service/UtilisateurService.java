package uh2.fstm.ilisi.Service;

import org.springframework.beans.factory.annotation.Autowired;
import uh2.fstm.ilisi.Model.BO.Livreur;
import uh2.fstm.ilisi.Model.BO.Utilisateur;
import uh2.fstm.ilisi.Model.DAO.LivreurDAO;
import uh2.fstm.ilisi.Model.DAO.UtilisateurDAO;

import java.util.List;

/**
 * Created by TesekhiraEnligne on 11/25/18.
 */
public class UtilisateurService {
    @Autowired
    private UtilisateurDAO utilisateurDAO;

    public List<Utilisateur> Retreive(){
        return (List<Utilisateur>) utilisateurDAO.findAll();
    }

    public void Insertion(Utilisateur sup)
    {
        utilisateurDAO.save(sup);
    }

    public void Supprimer(Long id)
    {
        utilisateurDAO.delete(id);
    }

    public void Modifier(Utilisateur sup)
    {
        utilisateurDAO.save(sup);
    }
}
