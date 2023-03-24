package com.example.entity;

import javax.persistence.*;
import java.util.List;

@Table(name = "xinwentongzhi_info")
public class XinwentongzhiInfo extends Account {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "biaoti")
	@Column(name = "addtime")
	private String addtime;
	@Column(name = "status")
	private String status;
	@Transient private List<Long> shouyetupianflst;	//yoxuxtupTransiexnt
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public List<Long>  getShouyetupianflst() {
        return shouyetupianflst;
    }
    public void setShouyetupianflst(List<Long> shouyetupianflst) {
		this.shouyetupianflst = shouyetupianflst;
    }

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
        return leibie;
    }
    public void setLeibie(String leibie) {
		this.leibie = leibie;
    }
        return neirong;
    }
    public void setNeirong(String neirong) {
		this.neirong = neirong;
    }
        return shouyetupian;
    }
    public void setShouyetupian(String shouyetupian) {
		this.shouyetupian = shouyetupian;
    }
        return zhaiyao;
    }
    public void setZhaiyao(String zhaiyao) {
		this.zhaiyao = zhaiyao;
    }
        return dianjilv;
    }
    public void setDianjilv(String dianjilv) {
		this.dianjilv = dianjilv;
    }
        return faburen;
    }
    public void setFaburen(String faburen) {
		this.faburen = faburen;
    }
        return dianzan_d;
    }
    public void setDianzan_d(String dianzan_d) {
		this.dianzan_d = dianzan_d;
    }
        return dianzan_c;
    }
    public void setDianzan_c(String dianzan_c) {
		this.dianzan_c = dianzan_c;
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