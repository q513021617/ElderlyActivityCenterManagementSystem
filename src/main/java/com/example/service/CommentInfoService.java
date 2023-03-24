package com.example.service;

import cn.hutool.core.collection.CollectionUtil;
import cn.hutool.core.date.DateUtil;
import com.example.dao.CommentInfoDao;
import com.example.entity.Account;
import com.example.entity.CommentInfo;


import com.example.exception.CustomException;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.List;

@Service
public class CommentInfoService {

    @Resource
    private CommentInfoDao commentInfoDao;

	@Resource
	private AdminInfoService adminInfoService;

   @Resourceprivate LaonianrenInfoService laonianrenInfoService;



    public CommentInfo add(CommentInfo commentInfo) {
        commentInfo.setCreateTime(DateUtil.formatDateTime(new Date()));
        String content = commentInfo.getContent();
        if (content.length() > 255) {
            commentInfo.setContent(content.substring(0, 250));
        }
        commentInfoDao.insertSelective(commentInfo);
        return commentInfo;
    }

    public void delete(Long id) {
        commentInfoDao.deleteByPrimaryKey(id);
    }

    public void update(CommentInfo commentInfo) {
        String content = commentInfo.getContent();
        if (content.length() > 255) {
            commentInfo.setContent(content.substring(0, 250));
        }
        commentInfoDao.updateByPrimaryKeySelective(commentInfo);
    }

    public CommentInfo findById(Long id) {
        return commentInfoDao.selectByPrimaryKey(id);
    }

    public List<CommentInfo> findAll() {
        return commentInfoDao.selectAll();
    }

    public List<CommentInfo> findAll(Long shujuid) {
        List<CommentInfo> list = commentInfoDao.findByShujuid(shujuid);
        if (!CollectionUtil.isEmpty(list)) {
            for (CommentInfo info : list) {
                Long userId = info.getUserId();
                String level = info.getLevel();
				if (level.equals("管理员")) {
					info.setUserName(adminInfoService.findById(userId).getUsername());
				}

				if (level.equals("老年人")) {info.setUserName(laonianrenInfoService.findById(userId).getYonghuming());}


            }
        }
        return list;
    }
    public List<CommentInfo> findAllhsg(Long shujuid,String biao) {
        List<CommentInfo> list = commentInfoDao.findByShujuidhsg(shujuid,biao);
        if (!CollectionUtil.isEmpty(list)) {
            for (CommentInfo info : list) {
                Long userId = info.getUserId();
                String level = info.getLevel();
                if (level.equals("管理员")) {
                    info.setUserName(adminInfoService.findById(userId).getUsername());
                }
				if (level.equals("老年人")) {info.setUserName(laonianrenInfoService.findById(userId).getYonghuming());}


            }
        }
        return list;
    }


}
