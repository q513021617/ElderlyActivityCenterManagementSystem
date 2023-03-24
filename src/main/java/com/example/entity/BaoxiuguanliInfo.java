package com.example.entity;

import javax.persistence.*;
import java.util.List;

@Table(name = "baoxiuguanli_info")
public class BaoxiuguanliInfo extends Account {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "biaoti")
	@Column(name = "addtime")
	private String addtime;
	@Column(name = "status")
	private String status;
	//yoxuxtupTransiexnt
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	//gextsexttpzidxuan

	//public String getFileIds() {
//		return fileIds;
//	}
//
//	public void setFileIds(String fileIds) {
//		this.fileIds = fileIds;
//	}

	
	public String getBiaoti() {
        return biaoti;
    }
    public void setBiaoti(String biaoti) {
		this.biaoti = biaoti;
    }
        return baoxiuneirong;
    }
    public void setBaoxiuneirong(String baoxiuneirong) {
		this.baoxiuneirong = baoxiuneirong;
    }
        return baoxiuhuifu;
    }
    public void setBaoxiuhuifu(String baoxiuhuifu) {
		this.baoxiuhuifu = baoxiuhuifu;
    }
        return baoxiuren;
    }
    public void setBaoxiuren(String baoxiuren) {
		this.baoxiuren = baoxiuren;
    }

	public String getAddtime() {
        return addtime;
    }
    public void setAddtime(String addtime) {
        this.addtime = addtime == null ? null : addtime.trim();
    }

	public void setId(Long id) {
		this.id = id;
	}
	public Long getId() {
		return this.id;
	}

}