package com.example.service;

import cn.hutool.core.collection.CollectionUtil;
import com.example.dao.LaonianrenInfoDao;
//kuabiaojisuan1
import com.example.entity.*;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import com.example.entity.LaonianrenInfo;
//kuabiaojisuan2
import com.example.exception.CustomException;
import com.example.common.ResultCode;
import com.example.vo.LaonianrenInfoVo;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import cn.hutool.crypto.SecureUtil;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
public class LaonianrenInfoService {

    @Resource
    private LaonianrenInfoDao laonianrenInfoDao;
	
	//kuabiaojisuan3

    public LaonianrenInfo add(LaonianrenInfo laonianrenInfo) {
        List<Long> touxiangflst = laonianrenInfo.getTouxiangflst();
        if (!CollectionUtil.isEmpty(touxiangflst)) {
            laonianrenInfo.setTouxiang(touxiangflst.toString());
        }
		
		        //shangxchxuantupxian
        // 唯一校验
        int count = laonianrenInfoDao.checkRepeat("yonghuming", laonianrenInfo.getYonghuming(), null);
if (count > 0) {
	throw new CustomException("1001", "该用户名\"" + laonianrenInfo.getYonghuming() + "\"已存在");
}
      // laonianrenInfo.setAccount((double) 0);
	  
        laonianrenInfoDao.insertSelective(laonianrenInfo);
        return laonianrenInfo;
    }
	
	public List<Map<String,String>> findByDiqu() {
        return laonianrenInfoDao.findByDiqu();
    }

    public void delete(Long id) {
        laonianrenInfoDao.deleteByPrimaryKey(id);
    }

    public void update(LaonianrenInfo laonianrenInfo) {
        List<Long> touxiangflst = laonianrenInfo.getTouxiangflst();
        if (!CollectionUtil.isEmpty(touxiangflst)) {
            laonianrenInfo.setTouxiang(touxiangflst.toString());
        }
		
		        //shangxchxuantupxian
		//youdianzan
        laonianrenInfoDao.updateByPrimaryKeySelective(laonianrenInfo);
    }

    public LaonianrenInfo findById(Long id) {
        return laonianrenInfoDao.selectByPrimaryKey(id);
    }

    public List<LaonianrenInfoVo> findAll() {
        return laonianrenInfoDao.findByJianjie("all");
    }

    public PageInfo<LaonianrenInfoVo> findPage(String jianjie, Integer pageNum, Integer pageSize, HttpServletRequest request) {
        PageHelper.startPage(pageNum, pageSize);
		
		List<LaonianrenInfoVo> all=null;
        Account user = (Account) request.getSession().getAttribute("user");
        if (user.getLevel().equals("管理员")) {all = laonianrenInfoDao.findByJianjie(jianjie);}
		
        
        return PageInfo.of(all);
    }
	
	public PageInfo<LaonianrenInfoVo> findPageqt(String jianjie, Integer pageNum, Integer pageSize, HttpServletRequest request) {
        PageHelper.startPage(pageNum, pageSize);
		
		List<LaonianrenInfoVo> all=null;
        Account user = (Account) request.getSession().getAttribute("user");
        all = laonianrenInfoDao.findByJianjie(jianjie);
		
	
	
        
        return PageInfo.of(all);
    }

   // public LaonianrenInfoVo findByUserName(String name) {
//        return laonianrenInfoDao.findByUsername(name);
//    }

	public LaonianrenInfo login(String yonghuming, String mima) {
        LaonianrenInfo laonianrenInfo = laonianrenInfoDao.findByYonghumingzj(yonghuming);
        if (laonianrenInfo == null) {
            throw new CustomException(ResultCode.USER_ACCOUNT_ERROR);
        }
        if (!SecureUtil.md5(mima).equalsIgnoreCase(laonianrenInfo.getMima())) {
            throw new CustomException(ResultCode.USER_ACCOUNT_ERROR);
        }
        return laonianrenInfo;
    }
	
    public void changeStatus(Long id) {
        LaonianrenInfo laonianrenInfo = laonianrenInfoDao.selectByPrimaryKey(id);
        if(laonianrenInfo.getStatus().equals("是")){
            laonianrenInfo.setStatus("否");
            laonianrenInfoDao.updateByPrimaryKey(laonianrenInfo);
        }else if(laonianrenInfo.getStatus().equals("否")){
            laonianrenInfo.setStatus("是");
            laonianrenInfoDao.updateByPrimaryKey(laonianrenInfo);
        }
    }
	//ddaizdhifu
	//youtixing
	 public void update2(LaonianrenInfoVo laonianrenInfo) {
        List<Long> touxiangflst = laonianrenInfo.getTouxiangflst();
        if (!CollectionUtil.isEmpty(touxiangflst)) {
            laonianrenInfo.setTouxiang(touxiangflst.toString());
        }
		
		        //shangxchxuantupxian
        if (StringUtils.isEmpty(laonianrenInfo.getMima())) {
            // 默认密码123456
            laonianrenInfo.setMima(SecureUtil.md5("123456"));
        } else {
            laonianrenInfo.setMima(SecureUtil.md5(laonianrenInfo.getMima()));
        }
        laonianrenInfoDao.updateByPrimaryKeySelective(laonianrenInfo);
    }
	
   
}
