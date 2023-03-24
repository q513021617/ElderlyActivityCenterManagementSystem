package com.example.service;

import cn.hutool.core.collection.CollectionUtil;
import com.example.dao.TushujieyueInfoDao;
//kuabiaojisuan1
import com.example.entity.*;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import com.example.entity.TushujieyueInfo;
//kuabiaojisuan2
import com.example.exception.CustomException;
import com.example.common.ResultCode;
import com.example.vo.TushujieyueInfoVo;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import cn.hutool.crypto.SecureUtil;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
public class TushujieyueInfoService {

    @Resource
    private TushujieyueInfoDao tushujieyueInfoDao;
	
	//kuabiaojisuan3

    public TushujieyueInfo add(TushujieyueInfo tushujieyueInfo) {
        //shangxchxuantupxian
        // 唯一校验
        
      // tushujieyueInfo.setAccount((double) 0);
	  
        tushujieyueInfoDao.insertSelective(tushujieyueInfo);
        return tushujieyueInfo;
    }
	
	public List<Map<String,String>> findByDiqu() {
        return tushujieyueInfoDao.findByDiqu();
    }

    public void delete(Long id) {
        tushujieyueInfoDao.deleteByPrimaryKey(id);
    }

    public void update(TushujieyueInfo tushujieyueInfo) {
        //shangxchxuantupxian
		//youdianzan
        tushujieyueInfoDao.updateByPrimaryKeySelective(tushujieyueInfo);
    }

    public TushujieyueInfo findById(Long id) {
        return tushujieyueInfoDao.selectByPrimaryKey(id);
    }

    public List<TushujieyueInfoVo> findAll() {
        return tushujieyueInfoDao.findByTushubianhao("all");
    }

    public PageInfo<TushujieyueInfoVo> findPage(String tushubianhao, Integer pageNum, Integer pageSize, HttpServletRequest request) {
        PageHelper.startPage(pageNum, pageSize);
		
		List<TushujieyueInfoVo> all=null;
        Account user = (Account) request.getSession().getAttribute("user");
        if (user.getLevel().equals("管理员")) {all = tushujieyueInfoDao.findByTushubianhao(tushubianhao);}
		if (user.getLevel().equals("老年人")) {all = tushujieyueInfoDao.findByTushubianhaolist2(tushubianhao,user.getYonghuming()); }        
        
        return PageInfo.of(all);
    }
	
	public PageInfo<TushujieyueInfoVo> findPageqt(String tushubianhao, Integer pageNum, Integer pageSize, HttpServletRequest request) {
        PageHelper.startPage(pageNum, pageSize);
		
		List<TushujieyueInfoVo> all=null;
        Account user = (Account) request.getSession().getAttribute("user");
        all = tushujieyueInfoDao.findByTushubianhao(tushubianhao);
		if (user.getLevel().equals("老年人")) {all = tushujieyueInfoDao.findByTushubianhaolist2(tushubianhao,user.getYonghuming()); }        
	
	
        
        return PageInfo.of(all);
    }

   // public TushujieyueInfoVo findByUserName(String name) {
//        return tushujieyueInfoDao.findByUsername(name);
//    }

	//yoxulogindenxglu
	
    public void changeStatus(Long id) {
        TushujieyueInfo tushujieyueInfo = tushujieyueInfoDao.selectByPrimaryKey(id);
        if(tushujieyueInfo.getStatus().equals("是")){
            tushujieyueInfo.setStatus("否");
            tushujieyueInfoDao.updateByPrimaryKey(tushujieyueInfo);
        }else if(tushujieyueInfo.getStatus().equals("否")){
            tushujieyueInfo.setStatus("是");
            tushujieyueInfoDao.updateByPrimaryKey(tushujieyueInfo);
        }
    }
	//ddaizdhifu
	//youtixing
	
	
   
}
