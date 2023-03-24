package com.example.dao;

import com.example.entity.QipaishixinxiInfo;
import com.example.vo.QipaishixinxiInfoVo;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;
import java.util.Map;

@Repository
public interface QipaishixinxiInfoDao extends Mapper<QipaishixinxiInfo> {
    List<QipaishixinxiInfoVo> findByQipaishibianhao(@Param("qipaishibianhao") String qipaishibianhao);
	
    int checkRepeat(@Param("column") String column, @Param("value") String value, @Param("id") Long id);
    
    Integer count();
	
	@Select("select * from qipaishixinxi_info where qipaishibianhao = #{qipaishibianhao}")
    QipaishixinxiInfo selectByQipaishibianhao(String qipaishibianhao);
	
	@Select("SELECT * FROM qipaishixinxi_info order by id")
    List<Map<String, Object>> daochuexcel();
	
	@Select("SELECT xxdiquziduanxxxx,count(id) as hsggs FROM qipaishixinxi_info  group by xxdiquziduanxxxx")
    List<Map<String,String>> findByDiqu();
	
	
	
	
	
	
    
	
	

}
