package tr.gov.nvi.tckimlik.WS;

import java.rmi.RemoteException;

public class Main {

	public static void main(String[] args) throws RemoteException {
	
		KPSPublicSoapProxy kpsPublic = new KPSPublicSoapProxy();
		boolean result = kpsPublic.TCKimlikNoDogrula (Long.parseLong("33742565926"), "ERCAN", "KIRBIYIK", 1992 /*Do�umTarihi*/);
				System.out.println("do�rulama : " + (result ? "ba�ar�l�" : "ba�ar�s�z"));

	}

}
