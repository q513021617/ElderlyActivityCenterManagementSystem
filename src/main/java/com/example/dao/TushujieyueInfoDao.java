package com.example.dao;

import com.example.entity.TushujieyueInfo;
import com.example.vo.TushujieyueInfoVo;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;
import java.util.Map;

@Repository
public interface TushujieyueInfoDao extends Mapper<TushujieyueInfo> {
    List<TushujieyueInfoVo> findByTushubianhao(@Param("tushubianhao") String tushubianhao);
	List<TushujieyueInfoVo> findByTushubianhaolist2(@Param("tushubianhao") String tushubianhao,@Param("jieyueren") String jieyueren);        
    int checkRepeat(@Param("column") String column, @Param("value") String value, @Param("id") Long id);
    
    Integer count();
	
	@Select("select * from tushujieyue_info where tushubianhao = #{tushubianhao}")
    TushujieyueInfo selectByTushubianhao(String tushubianhao);
	
	@Select("SELECT * FROM tushujieyue_info order by id")
    List<Map<String, Object>> daochuexcel();
	
	@Select("SELECT xxdiquziduanxxxx,count(id) as hsggs FROM tushujieyue_info  group by xxdiquziduanxxxx")
    List<Map<String,String>> findByDiqu();
	
	
	
	
	
	
    
	
	

}
