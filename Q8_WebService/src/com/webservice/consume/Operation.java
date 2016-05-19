package com.webservice.consume;

import com.webservice.Soapresponder;
import com.webservice.Soapresponder_Service;

public class Operation {

	public static void main(String[] args) {
	
		Soapresponder_Service service = new Soapresponder_Service();
		Soapresponder soapresponder = service.getSoapresponderSOAP();
		soapresponder.newOperation("Ahmet");
		
	}
}
