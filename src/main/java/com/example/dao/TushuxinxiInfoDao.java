package com.example.dao;

import com.example.entity.TushuxinxiInfo;
import com.example.vo.TushuxinxiInfoVo;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;
import java.util.Map;

@Repository
public interface TushuxinxiInfoDao extends Mapper<TushuxinxiInfo> {
    List<TushuxinxiInfoVo> findByKucun(@Param("kucun") String kucun);
	
    int checkRepeat(@Param("column") String column, @Param("value") String value, @Param("id") Long id);
    
    Integer count();
	
	@Select("select * from tushuxinxi_info where tushubianhao = #{tushubianhao}")
    TushuxinxiInfo selectByTushubianhao(String tushubianhao);
	
	@Select("SELECT * FROM tushuxinxi_info order by id")
    List<Map<String, Object>> daochuexcel();
	
	@Select("SELECT xxdiquziduanxxxx,count(id) as hsggs FROM tushuxinxi_info  group by xxdiquziduanxxxx")
    List<Map<String,String>> findByDiqu();
	
	
	
	
	
	
    
	
	

}
