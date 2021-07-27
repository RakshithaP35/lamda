package com.xworkz.lamda.tester;

import java.util.Collection;

import com.xworkz.lamda.dao.MarketDAO;
import com.xworkz.lamda.dao.MarketDAOimpl;
import com.xworkz.lamda.dto.MarketDTO;

public class MarketTester {

	public static void main(String[] args) {
		MarketDAO dao = new  MarketDAOimpl();
		
		MarketDTO name = dao.find((a)->a.getName().equals("D-Mart"));
		System.out.println(name);
		
		System.out.println("**************");
		Collection<MarketDTO> coll = dao.findAll((b)->b.getNoOfShops()>2);
		for (MarketDTO market : coll) {
			System.out.println(market);
			
		}

	}

}
