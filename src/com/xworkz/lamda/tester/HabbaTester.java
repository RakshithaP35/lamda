package com.xworkz.lamda.tester;

import java.util.Collection;
import java.util.Iterator;

import com.xworkz.lamda.dao.HabbaDAO;
import com.xworkz.lamda.dao.HabbaDAOimpl;
import com.xworkz.lamda.dto.HabbaDTO;
import com.xworkz.lamda.dto.Religion;

public class HabbaTester {
	

	public static void main(String[] args) {
		HabbaDTO dto = new HabbaDTO("Dasara","Southern",9,Religion.Hinduism,"Many",true,true);
		HabbaDTO dto1 = new HabbaDTO("Depawali","all over India",2,Religion.Hinduism,"Chakali",true,true);
		HabbaDTO dto2 = new HabbaDTO("Ganesha Chathurthi","All over India",3,Religion.Hinduism,"Kadubu",true,true);
		HabbaDTO dto3 = new HabbaDTO("Ugadi","Southern",1,Religion.Hinduism,"Obbat",true,true);
		HabbaDTO dto4= new HabbaDTO("Sankrathi","Southern",4,Religion.Hinduism,"Kargikayi",true,true);
		
		HabbaDAO dao = new HabbaDAOimpl();
		dao.ulisu(dto1);
		dao.ulisu(dto2);
		dao.ulisu(dto3);
		dao.ulisu(dto4);
		dao.ulisu(dto);
	
		System.out.println("****");
		HabbaDTO habbaDao = dao.ondhannuHuduku((a) -> a.getName().equals("Deepavali"));
		System.out.println(dto);
		
		System.out.println("****");
		Collection<HabbaDTO> coll = dao.yellavannuHuduku((b)->b.getNoOfDays()>5);
		
		for(HabbaDTO habba : coll) {
			System.out.println(habba);
		}
	}
}
