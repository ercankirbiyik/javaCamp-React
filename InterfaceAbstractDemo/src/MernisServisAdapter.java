import java.rmi.RemoteException;

import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;


public class MernisServisAdapter implements ICustomerCheckService {
	
	 @SuppressWarnings ("deprecation")
		public boolean checkIfRealPerson(Customer customer) {
			 
			 
			 KPSPublicSoap client = new KPSPublicSoapProxy();
			 try {
				return client.TCKimlikNoDogrula(customer.id, customer.firstName.toUpperCase(), 
						 customer.lastName.toUpperCase(),customer.birthDay.getYear() );
			} catch (RemoteException e) {
				
				e.printStackTrace();
			}
			return false;
			 
		 }

}
