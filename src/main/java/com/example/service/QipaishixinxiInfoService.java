package com.example.service;

import cn.hutool.core.collection.CollectionUtil;
import com.example.dao.QipaishixinxiInfoDao;
//kuabiaojisuan1
import com.example.entity.*;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import com.example.entity.QipaishixinxiInfo;
//kuabiaojisuan2
import com.example.exception.CustomException;
import com.example.common.ResultCode;
import com.example.vo.QipaishixinxiInfoVo;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import cn.hutool.crypto.SecureUtil;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
public class QipaishixinxiInfoService {

    @Resource
    private QipaishixinxiInfoDao qipaishixinxiInfoDao;
	
	//kuabiaojisuan3

    public QipaishixinxiInfo add(QipaishixinxiInfo qipaishixinxiInfo) {
        //shangxchxuantupxian
        // 唯一校验
        
      // qipaishixinxiInfo.setAccount((double) 0);
	  
        qipaishixinxiInfoDao.insertSelective(qipaishixinxiInfo);
        return qipaishixinxiInfo;
    }
	
	public List<Map<String,String>> findByDiqu() {
        return qipaishixinxiInfoDao.findByDiqu();
    }

    public void delete(Long id) {
        qipaishixinxiInfoDao.deleteByPrimaryKey(id);
    }

    public void update(QipaishixinxiInfo qipaishixinxiInfo) {
        //shangxchxuantupxian
		//youdianzan
        qipaishixinxiInfoDao.updateByPrimaryKeySelective(qipaishixinxiInfo);
    }

    public QipaishixinxiInfo findById(Long id) {
        return qipaishixinxiInfoDao.selectByPrimaryKey(id);
    }

    public List<QipaishixinxiInfoVo> findAll() {
        return qipaishixinxiInfoDao.findByQipaishibianhao("all");
    }

    public PageInfo<QipaishixinxiInfoVo> findPage(String qipaishibianhao, Integer pageNum, Integer pageSize, HttpServletRequest request) {
        PageHelper.startPage(pageNum, pageSize);
		
		List<QipaishixinxiInfoVo> all=null;
        Account user = (Account) request.getSession().getAttribute("user");
        if (user.getLevel().equals("管理员")) {all = qipaishixinxiInfoDao.findByQipaishibianhao(qipaishibianhao);}
		
        
        return PageInfo.of(all);
    }
	
	public PageInfo<QipaishixinxiInfoVo> findPageqt(String qipaishibianhao, Integer pageNum, Integer pageSize, HttpServletRequest request) {
        PageHelper.startPage(pageNum, pageSize);
		
		List<QipaishixinxiInfoVo> all=null;
        Account user = (Account) request.getSession().getAttribute("user");
        all = qipaishixinxiInfoDao.findByQipaishibianhao(qipaishibianhao);
		
	
	
        
        return PageInfo.of(all);
    }

   // public QipaishixinxiInfoVo findByUserName(String name) {
//        return qipaishixinxiInfoDao.findByUsername(name);
//    }

	//yoxulogindenxglu
	
    public void changeStatus(Long id) {
        QipaishixinxiInfo qipaishixinxiInfo = qipaishixinxiInfoDao.selectByPrimaryKey(id);
        if(qipaishixinxiInfo.getStatus().equals("是")){
            qipaishixinxiInfo.setStatus("否");
            qipaishixinxiInfoDao.updateByPrimaryKey(qipaishixinxiInfo);
        }else if(qipaishixinxiInfo.getStatus().equals("否")){
            qipaishixinxiInfo.setStatus("是");
            qipaishixinxiInfoDao.updateByPrimaryKey(qipaishixinxiInfo);
        }
    }
	//ddaizdhifu
	//youtixing
	
	
   
}
