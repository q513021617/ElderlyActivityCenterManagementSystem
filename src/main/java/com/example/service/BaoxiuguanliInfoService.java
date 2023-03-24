package com.example.service;

import cn.hutool.core.collection.CollectionUtil;
import com.example.dao.BaoxiuguanliInfoDao;
//kuabiaojisuan1
import com.example.entity.*;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import com.example.entity.BaoxiuguanliInfo;
//kuabiaojisuan2
import com.example.exception.CustomException;
import com.example.common.ResultCode;
import com.example.vo.BaoxiuguanliInfoVo;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import cn.hutool.crypto.SecureUtil;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
public class BaoxiuguanliInfoService {

    @Resource
    private BaoxiuguanliInfoDao baoxiuguanliInfoDao;
	
	//kuabiaojisuan3

    public BaoxiuguanliInfo add(BaoxiuguanliInfo baoxiuguanliInfo) {
        //shangxchxuantupxian
        // 唯一校验
        
      // baoxiuguanliInfo.setAccount((double) 0);
	  
        baoxiuguanliInfoDao.insertSelective(baoxiuguanliInfo);
        return baoxiuguanliInfo;
    }
	
	public List<Map<String,String>> findByDiqu() {
        return baoxiuguanliInfoDao.findByDiqu();
    }

    public void delete(Long id) {
        baoxiuguanliInfoDao.deleteByPrimaryKey(id);
    }

    public void update(BaoxiuguanliInfo baoxiuguanliInfo) {
        //shangxchxuantupxian
		//youdianzan
        baoxiuguanliInfoDao.updateByPrimaryKeySelective(baoxiuguanliInfo);
    }

    public BaoxiuguanliInfo findById(Long id) {
        return baoxiuguanliInfoDao.selectByPrimaryKey(id);
    }

    public List<BaoxiuguanliInfoVo> findAll() {
        return baoxiuguanliInfoDao.findByBaoxiuren("all");
    }

    public PageInfo<BaoxiuguanliInfoVo> findPage(String baoxiuren, Integer pageNum, Integer pageSize, HttpServletRequest request) {
        PageHelper.startPage(pageNum, pageSize);
		
		List<BaoxiuguanliInfoVo> all=null;
        Account user = (Account) request.getSession().getAttribute("user");
        if (user.getLevel().equals("管理员")) {all = baoxiuguanliInfoDao.findByBaoxiuren(baoxiuren);}
        
        
        return PageInfo.of(all);
    }
	
	public PageInfo<BaoxiuguanliInfoVo> findPageqt(String baoxiuren, Integer pageNum, Integer pageSize, HttpServletRequest request) {
        PageHelper.startPage(pageNum, pageSize);
		
		List<BaoxiuguanliInfoVo> all=null;
        Account user = (Account) request.getSession().getAttribute("user");
        all = baoxiuguanliInfoDao.findByBaoxiuren(baoxiuren);
        
	
	
        
        return PageInfo.of(all);
    }

   // public BaoxiuguanliInfoVo findByUserName(String name) {
//        return baoxiuguanliInfoDao.findByUsername(name);
//    }

	//yoxulogindenxglu
	
    public void changeStatus(Long id) {
        BaoxiuguanliInfo baoxiuguanliInfo = baoxiuguanliInfoDao.selectByPrimaryKey(id);
        if(baoxiuguanliInfo.getStatus().equals("是")){
            baoxiuguanliInfo.setStatus("否");
            baoxiuguanliInfoDao.updateByPrimaryKey(baoxiuguanliInfo);
        }else if(baoxiuguanliInfo.getStatus().equals("否")){
            baoxiuguanliInfo.setStatus("是");
            baoxiuguanliInfoDao.updateByPrimaryKey(baoxiuguanliInfo);
        }
    }
	//ddaizdhifu
	//youtixing
	
	
   
}
