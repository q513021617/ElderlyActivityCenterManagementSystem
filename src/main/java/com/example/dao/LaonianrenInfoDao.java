package com.example.dao;

import com.example.entity.LaonianrenInfo;
import com.example.vo.LaonianrenInfoVo;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;
import java.util.Map;

@Repository
public interface LaonianrenInfoDao extends Mapper<LaonianrenInfo> {
    List<LaonianrenInfoVo> findByJianjie(@Param("jianjie") String jianjie);
	
    int checkRepeat(@Param("column") String column, @Param("value") String value, @Param("id") Long id);
    
    Integer count();
	
	@Select("select * from laonianren_info where yonghuming = #{yonghuming}")
    LaonianrenInfo selectByYonghuming(String yonghuming);
	
	@Select("SELECT * FROM laonianren_info order by id")
    List<Map<String, Object>> daochuexcel();
	
	@Select("SELECT xxdiquziduanxxxx,count(id) as hsggs FROM laonianren_info  group by xxdiquziduanxxxx")
    List<Map<String,String>> findByDiqu();
	
	
	
	
	
	
    
	
	LaonianrenInfoVo findByYonghumingzj(String yonghuming);

}
