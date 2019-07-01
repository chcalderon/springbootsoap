package com.example.cl.demo.config;

import com.example.cl.demo.BlzServiceAdapter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class BeanConfig {

	@Bean
	public Jaxb2Marshaller marshaller() {
		Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
		marshaller.setContextPath("com.example.cl.demo.soapclient");
		return marshaller;
	}

	@Bean
	public BlzServiceAdapter soapConnector(Jaxb2Marshaller marshaller) {
		BlzServiceAdapter client = new BlzServiceAdapter();
		client.setDefaultUri("http://www.thomas-bayer.com/axis2/services/BLZService");
		client.setMarshaller(marshaller);
		client.setUnmarshaller(marshaller);
		return client;
	}

}