package com.example.dao;

import com.example.entity.BaoxiuguanliInfo;
import com.example.vo.BaoxiuguanliInfoVo;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;
import java.util.Map;

@Repository
public interface BaoxiuguanliInfoDao extends Mapper<BaoxiuguanliInfo> {
    List<BaoxiuguanliInfoVo> findByBaoxiuren(@Param("baoxiuren") String baoxiuren);
        
    int checkRepeat(@Param("column") String column, @Param("value") String value, @Param("id") Long id);
    
    Integer count();
	
	@Select("select * from baoxiuguanli_info where baoxiuren = #{baoxiuren}")
    BaoxiuguanliInfo selectByBaoxiuren(String baoxiuren);
	
	@Select("SELECT * FROM baoxiuguanli_info order by id")
    List<Map<String, Object>> daochuexcel();
	
	@Select("SELECT xxdiquziduanxxxx,count(id) as hsggs FROM baoxiuguanli_info  group by xxdiquziduanxxxx")
    List<Map<String,String>> findByDiqu();
	
	
	
	
	
	
    
	
	

}
