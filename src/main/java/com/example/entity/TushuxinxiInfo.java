package com.example.entity;

import javax.persistence.*;
import java.util.List;

@Table(name = "tushuxinxi_info")
public class TushuxinxiInfo extends Account {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "tushubianhao")
	@Column(name = "addtime")
	private String addtime;
	@Column(name = "status")
	private String status;
	@Transient private List<Long> tupianflst;	//yoxuxtupTransiexnt
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public List<Long>  getTupianflst() {
        return tupianflst;
    }
    public void setTupianflst(List<Long> tupianflst) {
		this.tupianflst = tupianflst;
    }

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
    }
        return mingcheng;
    }
    public void setMingcheng(String mingcheng) {
		this.mingcheng = mingcheng;
    }
        return zuozhe;
    }
    public void setZuozhe(String zuozhe) {
		this.zuozhe = zuozhe;
    }
        return chubanshe;
    }
    public void setChubanshe(String chubanshe) {
		this.chubanshe = chubanshe;
    }
        return chubannianfen;
    }
    public void setChubannianfen(String chubannianfen) {
		this.chubannianfen = chubannianfen;
    }
        return tupian;
    }
    public void setTupian(String tupian) {
		this.tupian = tupian;
    }
        return kucun;
    }
    public void setKucun(String kucun) {
		this.kucun = kucun;
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