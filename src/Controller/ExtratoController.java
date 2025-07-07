package Controller;

import DAO.PixBD;
import DAO.DepositoBD;
import Model.PixModel;
import Model.DepositoModel;
import java.util.List;

public class ExtratoController {
    public List<PixModel>listarTransacoesPIX() {
        PixBD dao = new PixBD();
        return dao.buscarExtrato();
    }
    
    public List<DepositoModel>listarTransacoesDEPOSITO() {
        DepositoBD dao = new DepositoBD();
        return dao.buscarExtrato();
    }
}