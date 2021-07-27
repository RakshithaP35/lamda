package com.xworkz.lamda.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import com.xworkz.lamda.dto.HabbaDTO;

import com.xworkz.lamda.dto.Religion;
import com.xworkz.lamda.search.HabbaSearch;

public class HabbaDAOimpl implements HabbaDAO{
	private Collection<HabbaDTO> habba = new ArrayList<HabbaDTO>();


	@Override
	public boolean ulisu(HabbaDTO dto) {
		boolean add = habba.add(dto);
		System.out.println(dto);
		return add;
	}

	@Override
	public HabbaDTO ondhannuHuduku(HabbaSearch search) {
		Iterator<HabbaDTO> iterator = this.habba.iterator();
		HabbaDTO temp = null;
		while(iterator.hasNext()) {
			HabbaDTO habbadto = iterator.next();
			if(search.huduku(habbadto)) {
				temp = habbadto;
				break;
			}
		}
		return temp;
	}

	@Override
	public Collection<HabbaDTO> yellavannuHuduku(HabbaSearch search) {
		Collection<HabbaDTO> collection = new ArrayList<HabbaDTO>();
		Iterator<HabbaDTO>itr=this.habba.iterator();
		
		while (itr.hasNext()) {
			HabbaDTO habbaDTO = itr.next();
			if(search.huduku(habbaDTO)) {
				collection.add(habbaDTO);
			}
			
		}
		return collection;
	}

	
}
