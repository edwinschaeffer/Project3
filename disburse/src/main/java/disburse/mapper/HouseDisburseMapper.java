package disburse.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import disburse.vo.HouseDisburse;

@Mapper
public interface HouseDisburseMapper {
	
	@Select("SELECT * from T_2013Q4_HOUSE_DISBURSE WHERE AMOUNT = "
			+ "(SELECT MAX(AMOUNT) FROM T_2013Q4_HOUSE_DISBURSE) LIMIT 1")
	public HouseDisburse getHighestAmount();

}
