package uh2.fstm.ilisi.Service;

import org.springframework.beans.factory.annotation.Autowired;
import uh2.fstm.ilisi.Model.BO.Client;
import uh2.fstm.ilisi.Model.BO.Commande;
import uh2.fstm.ilisi.Model.DAO.ClientDAO;

import java.util.List;

/**
 * Created by TesekhiraEnligne on 11/25/18.
 */
public class ClientService {
    @Autowired
    private ClientDAO clientDAO;
    public List<Client> Retreive(){
        return (List<Client>) clientDAO.findAll();
    }

    public void Insertion(Client sup)
    {
        clientDAO.save(sup);
    }

    public void Supprimer(Long id)
    {
        clientDAO.delete(id);
    }

    public void Modifier(Client sup)
    {
        clientDAO.save(sup);
    }
}
