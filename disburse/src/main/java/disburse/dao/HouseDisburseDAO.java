package disburse.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import disburse.mapper.HouseDisburseMapper;
import disburse.vo.HouseDisburse;

@Service
public class HouseDisburseDAO {
	@Autowired
	private HouseDisburseMapper hdm;
	
	public HouseDisburse getHighestAmount() {
		return hdm.getHighestAmount();
	}

}
