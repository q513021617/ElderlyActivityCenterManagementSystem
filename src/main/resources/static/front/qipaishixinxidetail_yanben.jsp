<!DOCTYPE html>
<html class="js cssanimations"><head>
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title>棋牌室信息</title>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<link rel="stylesheet" href="./qtimages/amazeui.min.css">
	<link rel="stylesheet" href="./qtimages/app.css">
	<link rel="stylesheet" href="./qtimages/touch.css">
	<link rel="stylesheet" href="./qtimages/layout.css">
    <link rel="stylesheet" type="text/css" href="./qtimages/slider.css">
    <link rel="stylesheet" type="text/css" href="./qtimages/swiper.min.css">
    <link rel="stylesheet" type="text/css" href="./qtimages/animate.min.css">
    <link rel="stylesheet" type="text/css" href="./qtimages/video.css">
    <link rel="stylesheet" type="text/css" href="./qtimages/component.css">
    <link rel="stylesheet" type="text/css" href="./qtimages/style.css">
    <link rel="stylesheet" type="text/css" href="./qtimages/remodal.css">
    <link rel="stylesheet" type="text/css" href="./qtimages/remodal-default-theme.css">
    <link rel="stylesheet" type="text/css" href="./qtimages/caddy.css">
    <link rel="stylesheet" type="text/css" href="./qtimages/licheng.css">
	<link rel="stylesheet" href="./qtimages/sl_common_form.css">
<meta http-equiv="Content-Type" content="text/html; charset=gb2312"></head>
<body style="">
<div id="wrapper">
<script src="qttop.js"></script>
<script src="bht.js"></script>
 <div class="contentc">
        <div class="box">
            <div class="contentbt">棋牌室信息</div>
			<div class="footer"></div>
            <div class="contentc_c">
                <ul>
 					<div class="content-form" >
					  <table width="100%" border="0"  align="center" cellpadding="3" cellspacing="1" class="table table-striped table-bordered table-hover">
								<tr>
									<td width='11%'>棋牌室编号：</td><td width='39%'>{{qipaishixinxiInfo.qipaishibianhao}}</td>     <td width='11%'>棋牌室名称：</td><td width='39%'>{{qipaishixinxiInfo.qipaishimingcheng}}</td></tr><tr>     <td width='11%'>价格：</td><td width='39%'>{{qipaishixinxiInfo.jiage}}</td>     <td width='11%'>棋牌室简介：</td><td width='39%'>{{qipaishixinxiInfo.qipaishijianjie}}</td></tr><tr>     <td width='11%'>地址：</td><td width='39%'>{{qipaishixinxiInfo.dizhi}}</td>     <td width='11%'>备注：</td><td width='39%'>{{qipaishixinxiInfo.beizhu}}</td>     </tr><tr><td colspan=4 align=center><input type=button name=Submit5 value=返回 class='btn btn-primary' onClick="javascript:history.back()" /><input type=button name=Submit52 value=打印 class='btn btn-primary' onClick="javascript:window.print()"  /> <!--jixaaxnnxiu--></td></tr>
							</table>
					</div>
                </ul>
            </div>
        </div>
    </div>
<script src="./qtimages/jquery.min.js"></script>
<script type="text/javascript" src="./qtimages/pingzi_video.js"></script>
<script src="./qtimages/jquery-1.11.0.js" type="text/javascript" charset="utf-8"></script>
<script src="./qtimages/swiper.min.js" type="text/javascript" charset="utf-8"></script>
<script src="./qtimages/swiper.animate.min.js" type="text/javascript" charset="utf-8"></script>
<script src="./qtimages/main.js" type="text/javascript" charset="utf-8"></script>
<script type="text/javascript" src="./qtimages/amazeui.min.js"></script>
<script type="text/javascript" src="./qtimages/font_size.js"></script>
<script type="text/javascript" src="./qtimages/modernizr.custom.js"></script>
<script type="text/javascript" src="./qtimages/classie.js"></script>
<script type="text/javascript" src="./qtimages/uisearch.js"></script>
<script type="text/javascript" src="./qtimages/jQuery.rTabs.js"></script>
<script src="./qtimages/remodal.js"></script>
<script src="./qtimages/caddy.js"></script>
<script src="./qtimages/huakuai.js"></script>
<script> new UISearch( document.getElementById( 'sb-search' ) );</script>
<script src="qtdown.js"></script>
<!--daipxingxlun-->
</div>
<script src="js/swiper-5.4.5/swiper.min.js"></script>
<script src="js/vue2.6.11/axios.js"></script>
<script src="js/vue2.6.11/vue.min.js"></script>
<script src="js/jquery-1.10.2.js"></script>
<script src="js/my.js"></script>
<link rel="stylesheet" href="css/bootstrap.min.css">
<script src="js/bootstrap.min.js"></script>
<link rel="stylesheet" href="css/common.css">
<link rel="stylesheet" href="css/nav.css">
<link rel="stylesheet" href="css/font-awesome.css">
<link rel="stylesheet" href="css/element/index.css">
<link rel="stylesheet" href="css/hsg.css">
<script>
	new Vue({
		el: '#wrapper',
		data: {
			isCollect: false,
			qipaishixinxiid: 0,
			mainSrc: '',
			//tupxianzd
		
			qipaishixinxiInfo: {},
			comments: [],
			commentInfo: {
				qipaishixinxiid: 0,
				content: ''
			},
			//totalComment: 0,
			isShow: false,

			user: {},
			searchText: null,
		},

		created: function () {
			axios.get('/auth').then(res => {
				if (res.data.code === '0') {
					this.user = res.data.data;
				}
			});
			//xuxyaxodenxglxu
			this.qipaishixinxiid = this.getQueryVariable('qipaishixinxiid');
			this.loadQipaishixinxiInfo();
			this.loadComments();
		},

		methods: {
			searchQipaishixinxi(text) {   // 根据关键字查询商品
				if(text) {
					location.href = '/front/qipaishixinxilisttp.html?text=' + text;
				}else {
					location.href = '/front/qipaishixinxilisttp.html';
				}
			},
			loadQipaishixinxiInfo() {
				axios.get("/qipaishixinxiInfo/" + this.qipaishixinxiid).then(res => {
					if (res.data.code === '0') {
						this.qipaishixinxiInfo = res.data.data;
						this.mainSrc = '/front/img/goods/default.png';
						//yodutdupidanjs
					} else {
						alert(res.data.msg);
					}
				});
			},
			loadComments() {
				 axios.get("/commentInfo/allqt/" + this.qipaishixinxiid+"/qipaishixinxi").then(res => {
					if (res.data.code === '0') {
						this.comments = res.data.data;
						this.totalComment = this.comments.length;
					} else {
						alert(res.data.msg)
					}
				})
			},
			getQueryVariable(variable) {
				let query = window.location.search.substring(1);
				let vars = query.split("&");
				for (let i = 0; i < vars.length; i++) {
					let pair = vars[i].split("=");
					if (pair[0] === variable) {
						return pair[1];
					}
				}
				return '';
			},
			mouseOver(id) {
				$('#main-img-id').attr('src', '/files/download/' + id);
			},
			changeCount(type) {
				let $count = $('#count-id');
				let $store = $('#store-id');
				let count = parseInt($count.text());
				let store = parseInt($store.text());
				if (type === '+') {
					count = count === store ? store : count + 1;
				} else {
					count = count === 1 ? 1 : count - 1;
				}
				$count.text(count)
			},
			addCart() {
				window.location.href = '/front/goumaijiluadd.html?qipaishixinxiid='+this.qipaishixinxiid
			},
			openModel() {
				if(this.user.level+"" == 'undefined'){
                    alert("请先登录");
                    return;
                }
				this.commentInfo.qipaishixinxiid = this.qipaishixinxiid;
				this.commentInfo.content = '';
				$('#commentModal').modal('show');
			},
			submitComment() {
				let data = {userId: this.user.id, level: this.user.level, content: this.commentInfo.content, shujuid: this.commentInfo.qipaishixinxiid,biao:'qipaishixinxi'};
				debugger
				axios.post('/commentInfo', data).then(res => {
					if (res.data.code === '0') {
						$('#commentModal').modal('hide');
						alert('评价成功');
						this.loadQipaishixinxiInfo();
						this.loadComments();
					} else {
						alert(res.data.msg);
					}
				})
			},
			dianzan_d_click() {
				axios.put('/qipaishixinxiInfo', {id: this.qipaishixinxiid, dianzan_d: 1}).then(res => {
					if (res.data.code === '0') {
						alert('点赞+1');
						this.loadQipaishixinxiInfo();
					} else {
						alert(res.data.msg)
					}
				})
			},
			dianzan_c_click() {
				axios.put('/qipaishixinxiInfo', {id: this.qipaishixinxiid, dianzan_c: 1}).then(res => {
					if (res.data.code === '0') {
						alert('反对+1');
						this.loadQipaishixinxiInfo();
					} else {
						alert(res.data.msg)
					}
				})
			},
			collect(){
				console.log(this.qipaishixinxiInfo.shangpinmingcheng);
				if(this.user.level+"" == 'undefined'){
					alert("请先登录");
					return;
				}
					axios.post('/collectInfo', {shoucangmingcheng: this.qipaishixinxiInfo.shxouxixan, userId: this.user.id,shujuid: this.qipaishixinxiid,level: this.user.level,biao:'qipaishixinxi'}).then(res => {
						if (res.data.code === '0') {
							alert("收藏成功");
						} else {
							alert(res.data.msg)
						}
					})


			},
			//adxdliaxnjie
			logout() {
				axios.get("/logout").then(res => {
					if(res.data.code === '0') {
						location.href = '/front/index.html';
					} else {
						msg('error', res.data.msg);
					}
				})
			}
		}
	})
</script>
</body>
</html>

