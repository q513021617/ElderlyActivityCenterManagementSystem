package com.example.service;

import cn.hutool.core.collection.CollectionUtil;
import com.example.dao.TushuxinxiInfoDao;
//kuabiaojisuan1
import com.example.entity.*;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import com.example.entity.TushuxinxiInfo;
//kuabiaojisuan2
import com.example.exception.CustomException;
import com.example.common.ResultCode;
import com.example.vo.TushuxinxiInfoVo;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import cn.hutool.crypto.SecureUtil;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
public class TushuxinxiInfoService {

    @Resource
    private TushuxinxiInfoDao tushuxinxiInfoDao;
	
	//kuabiaojisuan3

    public TushuxinxiInfo add(TushuxinxiInfo tushuxinxiInfo) {
        List<Long> tupianflst = tushuxinxiInfo.getTupianflst();
        if (!CollectionUtil.isEmpty(tupianflst)) {
            tushuxinxiInfo.setTupian(tupianflst.toString());
        }
		
		        //shangxchxuantupxian
        // 唯一校验
        int count = tushuxinxiInfoDao.checkRepeat("tushubianhao", tushuxinxiInfo.getTushubianhao(), null);
if (count > 0) {
	throw new CustomException("1001", "该图书编号\"" + tushuxinxiInfo.getTushubianhao() + "\"已存在");
}
      // tushuxinxiInfo.setAccount((double) 0);
	  
        tushuxinxiInfoDao.insertSelective(tushuxinxiInfo);
        return tushuxinxiInfo;
    }
	
	public List<Map<String,String>> findByDiqu() {
        return tushuxinxiInfoDao.findByDiqu();
    }

    public void delete(Long id) {
        tushuxinxiInfoDao.deleteByPrimaryKey(id);
    }

    public void update(TushuxinxiInfo tushuxinxiInfo) {
        List<Long> tupianflst = tushuxinxiInfo.getTupianflst();
        if (!CollectionUtil.isEmpty(tupianflst)) {
            tushuxinxiInfo.setTupian(tupianflst.toString());
        }
		
		        //shangxchxuantupxian
		//youdianzan
        tushuxinxiInfoDao.updateByPrimaryKeySelective(tushuxinxiInfo);
    }

    public TushuxinxiInfo findById(Long id) {
        return tushuxinxiInfoDao.selectByPrimaryKey(id);
    }

    public List<TushuxinxiInfoVo> findAll() {
        return tushuxinxiInfoDao.findByKucun("all");
    }

    public PageInfo<TushuxinxiInfoVo> findPage(String kucun, Integer pageNum, Integer pageSize, HttpServletRequest request) {
        PageHelper.startPage(pageNum, pageSize);
		
		List<TushuxinxiInfoVo> all=null;
        Account user = (Account) request.getSession().getAttribute("user");
        if (user.getLevel().equals("管理员")) {all = tushuxinxiInfoDao.findByKucun(kucun);}
		
        
        return PageInfo.of(all);
    }
	
	public PageInfo<TushuxinxiInfoVo> findPageqt(String kucun, Integer pageNum, Integer pageSize, HttpServletRequest request) {
        PageHelper.startPage(pageNum, pageSize);
		
		List<TushuxinxiInfoVo> all=null;
        Account user = (Account) request.getSession().getAttribute("user");
        all = tushuxinxiInfoDao.findByKucun(kucun);
		
	
	
        
        return PageInfo.of(all);
    }

   // public TushuxinxiInfoVo findByUserName(String name) {
//        return tushuxinxiInfoDao.findByUsername(name);
//    }

	//yoxulogindenxglu
	
    public void changeStatus(Long id) {
        TushuxinxiInfo tushuxinxiInfo = tushuxinxiInfoDao.selectByPrimaryKey(id);
        if(tushuxinxiInfo.getStatus().equals("是")){
            tushuxinxiInfo.setStatus("否");
            tushuxinxiInfoDao.updateByPrimaryKey(tushuxinxiInfo);
        }else if(tushuxinxiInfo.getStatus().equals("否")){
            tushuxinxiInfo.setStatus("是");
            tushuxinxiInfoDao.updateByPrimaryKey(tushuxinxiInfo);
        }
    }
	//ddaizdhifu
	//youtixing
	
	
   
}
