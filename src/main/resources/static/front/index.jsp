<!DOCTYPE html>
<html class="js cssanimations">
<head>
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>助学新版</title>
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
    <link rel="stylesheet" href="css/bootstrap.min.css">
</head>
<body style="">
<div id="wrapper">
<script src="qttop.js"></script>
<script src="bht.js"></script>

    <div class="contenta">
        <div class="box">
             <div class="contental l">
                 <div class="contentalt">
                     <div class="contentaltl l">站内新闻1</div>
                     <div class="contentaltr r"><a href="xinwentongzhilist.html?lb=站内新闻1"><div class="yjtl l">更多信息</div><div class="yjt l"> &gt; </div></a></div>
                 </div>
                 <div class="contentalb">
                     <ul>
                          <li v-for="obj in objsxw1">
                             <a  @click="detailxw(obj.id)" style="cursor: pointer">
                                
                                 <span class="contentalbs l">
                                     <span class="contentalbst">{{obj.biaoti}}</span>
                                     <span class="contentalbsts_touch"></span>
                                     <span class="contentalbsb">{{obj.addtime}}</span>
                                 </span>
                                
                             </a>
                         </li>
					</ul>
                 </div>
             </div>
             <div class="contentar r">
                 <div class="contentart">
                     <a href="#">
                         <div class="contentartl l">
                             <div class="contentartlt">
                                 媒体聚焦 <br><span>Media Focus</span>
                             </div>
                             <div class="contentartlb"> &gt; </div>
                         </div>
                         <div class="contentartr r"><img src="./qtimages/mtjj.jpg" alt="" style="width:319px;"></div>
                     </a>
                 </div>
                 <div class="contentart">
                     <a href="#">
                         <div class="contentartr l"><img src="./qtimages/vieo_in.jpg" alt="" style="width:319px;"></div>
                         <div class="contentartls r">
                             <div class="contentartlt">
                                 视频中心 <br><span>Purchasing center</span>
                             </div>
                             <div class="contentartlb" style="background: #5281AE"> &gt; </div>
                         </div>
                     </a>
                 </div>
             </div>
        </div>
    </div>
  <!--yoxushouxyeshanxgpin-->
  <!--yoxushoxuyetoxuxiaxng-->
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
</div>
<script src="js/swiper-5.4.5/swiper.min.js"></script>
        <script src="js/vue2.6.11/axios.js"></script>
        <script src="js/vue2.6.11/vue.min.js"></script>
        <script src="js/my.js"></script>
        <script>
            new Vue({
                el: '#wrapper',
                data: {
					objsxw1: [],
                    objssp: [],
                    objstx: [],
                    name: '',
                    tupianimrlsp: '',
                    tupianavtsp:null,
                    zhaopianimrltx: '',
                    zhaopianavttx:null,
                    user: {},

                },
                created: function () {
                    axios.get('/auth').then(res => {
                        if (res.data.code === '0') {
                            this.user = res.data.data;
                        }
                    });
					 this.loadTablexw1(6);
					//loadsp1
					//loadtx2
                },
                methods: {
                    searchGoods(text) {   // 根据关键字查询商品
                        if(text) {
                            location.href = '/front/shangpinxinxilisttp.html?text=' + text;
                        }else {
                            location.href = '/front/shangpinxinxilisttp.html';
                        }
                    },
					loadTablexw1(pageSize) {
					let name = this.name === '' ? "all" : this.name;
					axios.get("/xinwentongzhiInfo/pageqt/" + name + "?pageSize=" + pageSize+"&leibie=站内新闻").then(res => {
					  if (res.data.code === '0') {
						this.objsxw1 = res.data.data.list;
						res.data.data.list.forEach(item=>{
						  if(item.shouyetupian) {item.shouyetupianavt = JSON.parse(item.shouyetupian)[0];}
						})
						this.pageInfo = res.data.data;
						this.preActive = !(this.pageInfo.hasPreviousPage);
						this.nextActive = !(this.pageInfo.hasNextPage);
					  } else {
						msg('error', res.data.msg);
					  }
					});
				  },
                    //loadsphs
					//loadtxhs
					//tdetailsp
					//tdetailtx
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