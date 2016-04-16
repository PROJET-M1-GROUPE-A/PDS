package serviceRMIImplementation;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import daoImplementation.DaoPartieImpl;
import daoInterface.DaoPartieInterface;
import serviceRMIInterface.ServicePartieInterface;

public class ServicePartieImpl extends UnicastRemoteObject implements ServicePartieInterface{

	private static final long serialVersionUID = 1L;
	
	private DaoPartieInterface daoPartieInterface;
	
	protected ServicePartieImpl() throws RemoteException {
		daoPartieInterface = new DaoPartieImpl();
	}

	@Override
	public boolean rejoindrePartie(Object nompartie, Object nbrejoueur) throws RemoteException {
		// TODO Auto-generated method stub
		return false;
	}

}