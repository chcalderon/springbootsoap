package com.example.cl.demo;

import com.example.cl.demo.soapclient.GetBankResponseType;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

import javax.xml.bind.JAXBElement;

public class BlzServiceAdapter extends WebServiceGatewaySupport {

	public GetBankResponseType getBank(String url, Object request){
		JAXBElement res = (JAXBElement) getWebServiceTemplate().marshalSendAndReceive(url, request);
		return (GetBankResponseType) res.getValue();
	}
}