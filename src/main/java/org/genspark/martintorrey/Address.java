package org.genspark.martintorrey;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("addressBean")
public class Address {
	@Value("Rochester")
	private String city;
	
	@Value("New York")
	private String state;
	
	@Value("United States of America")
	private String country;
	
	@Value("14623")
	private String zipcode;

	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + ", country=" + country + ", zipcode=" + zipcode + "]";
	}
	
	
}
