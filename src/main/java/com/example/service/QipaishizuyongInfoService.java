package com.example.service;

import cn.hutool.core.collection.CollectionUtil;
import com.example.dao.QipaishizuyongInfoDao;
//kuabiaojisuan1
import com.example.entity.*;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import com.example.entity.QipaishizuyongInfo;
//kuabiaojisuan2
import com.example.exception.CustomException;
import com.example.common.ResultCode;
import com.example.vo.QipaishizuyongInfoVo;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import cn.hutool.crypto.SecureUtil;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
public class QipaishizuyongInfoService {

    @Resource
    private QipaishizuyongInfoDao qipaishizuyongInfoDao;
	
	//kuabiaojisuan3

    public QipaishizuyongInfo add(QipaishizuyongInfo qipaishizuyongInfo) {
        //shangxchxuantupxian
        // 唯一校验
        
      // qipaishizuyongInfo.setAccount((double) 0);
	  
        qipaishizuyongInfoDao.insertSelective(qipaishizuyongInfo);
        return qipaishizuyongInfo;
    }
	
	public List<Map<String,String>> findByDiqu() {
        return qipaishizuyongInfoDao.findByDiqu();
    }

    public void delete(Long id) {
        qipaishizuyongInfoDao.deleteByPrimaryKey(id);
    }

    public void update(QipaishizuyongInfo qipaishizuyongInfo) {
        //shangxchxuantupxian
		//youdianzan
        qipaishizuyongInfoDao.updateByPrimaryKeySelective(qipaishizuyongInfo);
    }

    public QipaishizuyongInfo findById(Long id) {
        return qipaishizuyongInfoDao.selectByPrimaryKey(id);
    }

    public List<QipaishizuyongInfoVo> findAll() {
        return qipaishizuyongInfoDao.findByQipaishibianhao("all");
    }

    public PageInfo<QipaishizuyongInfoVo> findPage(String qipaishibianhao, Integer pageNum, Integer pageSize, HttpServletRequest request) {
        PageHelper.startPage(pageNum, pageSize);
		
		List<QipaishizuyongInfoVo> all=null;
        Account user = (Account) request.getSession().getAttribute("user");
        if (user.getLevel().equals("管理员")) {all = qipaishizuyongInfoDao.findByQipaishibianhao(qipaishibianhao);}
		if (user.getLevel().equals("老年人")) {all = qipaishizuyongInfoDao.findByQipaishibianhaolist2(qipaishibianhao,user.getYonghuming()); }        
        
        return PageInfo.of(all);
    }
	
	public PageInfo<QipaishizuyongInfoVo> findPageqt(String qipaishibianhao, Integer pageNum, Integer pageSize, HttpServletRequest request) {
        PageHelper.startPage(pageNum, pageSize);
		
		List<QipaishizuyongInfoVo> all=null;
        Account user = (Account) request.getSession().getAttribute("user");
        all = qipaishizuyongInfoDao.findByQipaishibianhao(qipaishibianhao);
		if (user.getLevel().equals("老年人")) {all = qipaishizuyongInfoDao.findByQipaishibianhaolist2(qipaishibianhao,user.getYonghuming()); }        
	
	
        
        return PageInfo.of(all);
    }

   // public QipaishizuyongInfoVo findByUserName(String name) {
//        return qipaishizuyongInfoDao.findByUsername(name);
//    }

	//yoxulogindenxglu
	
    public void changeStatus(Long id) {
        QipaishizuyongInfo qipaishizuyongInfo = qipaishizuyongInfoDao.selectByPrimaryKey(id);
        if(qipaishizuyongInfo.getStatus().equals("是")){
            qipaishizuyongInfo.setStatus("否");
            qipaishizuyongInfoDao.updateByPrimaryKey(qipaishizuyongInfo);
        }else if(qipaishizuyongInfo.getStatus().equals("否")){
            qipaishizuyongInfo.setStatus("是");
            qipaishizuyongInfoDao.updateByPrimaryKey(qipaishizuyongInfo);
        }
    }
	public void changeIszf(Long id) {
       QipaishizuyongInfo qipaishizuyongInfo = qipaishizuyongInfoDao.selectByPrimaryKey(id);
        if(qipaishizuyongInfo.getIszf().equals("是")){
            qipaishizuyongInfo.setIszf("否");
            qipaishizuyongInfoDao.updateByPrimaryKey(qipaishizuyongInfo);
        }else if(qipaishizuyongInfo.getIszf().equals("否")){
            qipaishizuyongInfo.setIszf("是");
            qipaishizuyongInfoDao.updateByPrimaryKey(qipaishizuyongInfo);
        }
    }
	//youtixing
	
	
   
}
