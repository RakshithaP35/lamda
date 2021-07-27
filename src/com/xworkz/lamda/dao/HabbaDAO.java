package com.xworkz.lamda.dao;

import java.util.Collection;

import com.xworkz.lamda.dto.HabbaDTO;
import com.xworkz.lamda.search.HabbaSearch;

public interface HabbaDAO {
	
	boolean ulisu(HabbaDTO dto);
	HabbaDTO ondhannuHuduku(HabbaSearch search);
	Collection<HabbaDTO> yellavannuHuduku(HabbaSearch search);

}
