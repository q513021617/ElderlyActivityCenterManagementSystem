document.write("<table width='100%' height='30px' align='center'  style='border-bottom:#CC3333; background: #0cb3d0; border-bottom:solid'>");
 document.write(" <tr>");
 document.write("   <td width='11%'>&nbsp;</td>");
 document.write("   <td width='44%'><div style=' float: left; margin-left: 10px; ' class='dd'>");
					
							
		   document.write("		<template v-if=\"this.user.level&&this.user.level==='管理员'\">");
document.write("			<font color='#ffffff'>当前用户：  {{user.username}},[{{this.user.level}}]&nbsp; </font> <a  @click='logout' class='content-form-signup' > 退出 </a> |  <a href='/end/page/main_guanliyuan.html' class='content-form-signup'>后台</a>  ");
document.write("		</template>");
document.write("		<template v-else-if=\"this.user.level&&this.user.level==='老年人'\">");
document.write("			<a  class='edit-handle2'> {{user.yonghuming}},[{{this.user.level}}]  </a> <a  @click='logout'  rel='nofollow' class='content-form-signup'>退出</a>  <a href='/end/page/main_laonianren.html' class='content-form-signup'  rel='nofollow'>后台</a>  ");
document.write("		</template>");
document.write("		<template v-else-if=\"this.user.level&&this.user.level==='注册用户'\">");
document.write("			<font color='white'>当前用户：  {{user.yonghuming}},[{{this.user.level}}]&nbsp; </font> <a  @click='logout' class='content-form-signup' > 退出 </a> |  <a href='/end/page/main_guanliyuan.html' class='content-form-signup'>后台</a>  ");
document.write("		</template>");
document.write("<template v-else><a href='/end/page/login.html' style='color:#fff; margin-left: 10px;margin-right:5px;'>登录</a> <a href='yonghuxinxiadd.html' style='color:#fff;'>注册</a></template>");


					document.write("	</div> </td>");
   document.write(" <td width='45%'>欢迎来到老年活动中心管理系统,欢迎咨询加盟！</td>");
 document.write(" </tr>");
document.write("</table>");
document.write("<div class='header'>");
 document.write("   <div class='box'>");
  document.write("      <div class='logo l'>");
   document.write("         <a href='index.html'><img src='./qtimages/logo.jpg' alt=''></a>");
      document.write("  </div>");
    document.write("    <div class='nav r'>");
      document.write("      <div class='nav_t'>");
     document.write("           <div class='nav_t_box r'>");
         document.write("           <div class='nav_t_l l'>");
          document.write("              <div id='sb-search' class='sb-search'>");
            document.write("                <form action='news.php' name='search' method='post' >");
          document.write("                      <input class='sb-search-input' placeholder='在此处输入检索内容...' type='text' value='' name='biaoti' id='biaoti'>");
             document.write("                   <input class='sb-search-submit' type='submit' value=''>");
             document.write("                   <span class='sb-icon-search'></span>");
             document.write("               </form>");
             document.write("           </div>");
           document.write("        </div>");
            document.write("        <div class='nav_t_r r'>");
           document.write("              <div class='menus menus1'>");
         document.write("                   <ul>");
          document.write("                      <div class='bg' style='left: 56px;'></div>");
         document.write("                       <li style='color: rgb(255, 255, 255);'><a href='http://www.dongfang-china.com/' target='_blank' style='color: rgb(0, 0, 0);'><span>中文</span></a></li>");
           document.write("                     <li style='color: rgb(255, 255, 255);'><a href='http://www.dongfang-china.com/en/' target='_blank' style='color: rgb(255, 255, 255);'><span>EN</span></a></li>");
          document.write("                  </ul>");
           document.write("                 <div class='clear'></div>");
         document.write("               </div>");
          document.write("          </div>");
          document.write("      </div>");

       document.write("     </div>");
        document.write("    <div class='nav_b'>");
         document.write("       <div class='nav_list2'>");
           document.write("         <ul>");
                      				 document.write("<li><a href='index.html'>首页</a></li>");
					//grigueueiss9sf
  		 								document.write("<li>");
                     document.write("   <a style='cursor:pointer'>老年人</a>");
                        document.write("    <ul>");
						document.write("		<li><a href='laonianrenadd.html'>老年人注册</a></li> ");
                        document.write("    </ul>");
                      document.write("  </li>");					document.write("<li>");
                     document.write("   <a style='cursor:pointer'>棋牌室信息</a>");
                        document.write("    <ul>");
						document.write("		<li><a href='qipaishixinxilist.html'>棋牌室信息</a></li> ");
                        document.write("    </ul>");
                      document.write("  </li>");					document.write("<li>");
                     document.write("   <a style='cursor:pointer'>图书信息</a>");
                        document.write("    <ul>");
						document.write("		<li><a href='tushuxinxilisttp.html'>图书信息</a></li> ");
                        document.write("    </ul>");
                      document.write("  </li>");					document.write("<li>");
                     document.write("   <a style='cursor:pointer'>通知公告</a>");
                        document.write("    <ul>");
						document.write("		<li><a href='xinwentongzhilist.html?lb=通知公告'>通知公告</a></li>  ");
                        document.write("    </ul>");
                      document.write("  </li>");

document.write("<li>");
document.write("   <a style='cursor:pointer'>新闻资讯</a>");
document.write("    <ul>");
document.write("		 <li><a href='xinwentongzhilist.html?lb=新闻资讯'>新闻资讯</a></li> ");
document.write("    </ul>");
document.write("  </li>");

                      document.write("<li>");
                     document.write("   <a style='cursor:pointer'>在线留言</a>");
                        document.write("    <ul>");
						document.write("		<li><a href='liuyanbanadd.html'>在线留言</a></li> <li><a href='liuyanbanlist.html'>查看留言</a></li> ");
                        document.write("    </ul>");
                      document.write("  </li>");//yoxulixuyaxn
				document.write("<li><a href='/end/page/login.html'>后台管理</a></li>");
         document.write("            </ul>");
      document.write("          </div>");
       document.write("     </div>");
     document.write("   </div>");
    document.write("  </div>");
 document.write(" </div>");