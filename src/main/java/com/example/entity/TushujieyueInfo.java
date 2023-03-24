package com.example.entity;

import javax.persistence.*;
import java.util.List;

@Table(name = "tushujieyue_info")
public class TushujieyueInfo extends Account {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "tushubianhao")	private String tushubianhao;	@Column(name = "mingcheng")	private String mingcheng;	@Column(name = "zuozhe")	private String zuozhe;	@Column(name = "chubanshe")	private String chubanshe;	@Column(name = "chubannianfen")	private String chubannianfen;	@Column(name = "kucun")	private String kucun;	@Column(name = "jieyueren")	private String jieyueren;	@Column(name = "jieyueshuliang")	private String jieyueshuliang;	@Column(name = "jieyueshijian")	private String jieyueshijian;	
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

	
	public String getTushubianhao() {
        return tushubianhao;
    }
    public void setTushubianhao(String tushubianhao) {
		this.tushubianhao = tushubianhao;
    }	public String getMingcheng() {
        return mingcheng;
    }
    public void setMingcheng(String mingcheng) {
		this.mingcheng = mingcheng;
    }	public String getZuozhe() {
        return zuozhe;
    }
    public void setZuozhe(String zuozhe) {
		this.zuozhe = zuozhe;
    }	public String getChubanshe() {
        return chubanshe;
    }
    public void setChubanshe(String chubanshe) {
		this.chubanshe = chubanshe;
    }	public String getChubannianfen() {
        return chubannianfen;
    }
    public void setChubannianfen(String chubannianfen) {
		this.chubannianfen = chubannianfen;
    }	public String getKucun() {
        return kucun;
    }
    public void setKucun(String kucun) {
		this.kucun = kucun;
    }	public String getJieyueren() {
        return jieyueren;
    }
    public void setJieyueren(String jieyueren) {
		this.jieyueren = jieyueren;
    }	public String getJieyueshuliang() {
        return jieyueshuliang;
    }
    public void setJieyueshuliang(String jieyueshuliang) {
		this.jieyueshuliang = jieyueshuliang;
    }	public String getJieyueshijian() {
        return jieyueshijian;
    }
    public void setJieyueshijian(String jieyueshijian) {
		this.jieyueshijian = jieyueshijian;
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