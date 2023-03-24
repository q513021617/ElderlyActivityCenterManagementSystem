package com.example.entity;

import javax.persistence.*;
import java.util.List;

@Table(name = "qipaishixinxi_info")
public class QipaishixinxiInfo extends Account {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "qipaishibianhao")	private String qipaishibianhao;	@Column(name = "qipaishimingcheng")	private String qipaishimingcheng;	@Column(name = "jiage")	private String jiage;	@Column(name = "qipaishijianjie")	private String qipaishijianjie;	@Column(name = "dizhi")	private String dizhi;	@Column(name = "beizhu")	private String beizhu;	
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

	
	public String getQipaishibianhao() {
        return qipaishibianhao;
    }
    public void setQipaishibianhao(String qipaishibianhao) {
		this.qipaishibianhao = qipaishibianhao;
    }	public String getQipaishimingcheng() {
        return qipaishimingcheng;
    }
    public void setQipaishimingcheng(String qipaishimingcheng) {
		this.qipaishimingcheng = qipaishimingcheng;
    }	public String getJiage() {
        return jiage;
    }
    public void setJiage(String jiage) {
		this.jiage = jiage;
    }	public String getQipaishijianjie() {
        return qipaishijianjie;
    }
    public void setQipaishijianjie(String qipaishijianjie) {
		this.qipaishijianjie = qipaishijianjie;
    }	public String getDizhi() {
        return dizhi;
    }
    public void setDizhi(String dizhi) {
		this.dizhi = dizhi;
    }	public String getBeizhu() {
        return beizhu;
    }
    public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
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