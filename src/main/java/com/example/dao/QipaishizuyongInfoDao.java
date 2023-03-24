package com.example.dao;

import com.example.entity.QipaishizuyongInfo;
import com.example.vo.QipaishizuyongInfoVo;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;
import java.util.Map;

@Repository
public interface QipaishizuyongInfoDao extends Mapper<QipaishizuyongInfo> {
    List<QipaishizuyongInfoVo> findByQipaishibianhao(@Param("qipaishibianhao") String qipaishibianhao);
	List<QipaishizuyongInfoVo> findByQipaishibianhaolist2(@Param("qipaishibianhao") String qipaishibianhao,@Param("zuyongren") String zuyongren);        
    int checkRepeat(@Param("column") String column, @Param("value") String value, @Param("id") Long id);
    
    Integer count();
	
	@Select("select * from qipaishizuyong_info where qipaishibianhao = #{qipaishibianhao}")
    QipaishizuyongInfo selectByQipaishibianhao(String qipaishibianhao);
	
	@Select("SELECT * FROM qipaishizuyong_info order by id")
    List<Map<String, Object>> daochuexcel();
	
	@Select("SELECT xxdiquziduanxxxx,count(id) as hsggs FROM qipaishizuyong_info  group by xxdiquziduanxxxx")
    List<Map<String,String>> findByDiqu();
	
	
	
	
	
	
    
	
	

}
