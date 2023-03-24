document.write("<div class='footer'>");
document.write("</div>");
 document.write("   <div class='contentd'>");
  document.write("      <div class='box'>");
   document.write("         <div class='contentbt'>友情连接</div>");
    document.write("        <div class='contentdb'>");
     document.write("           <ul>");
				
       document.write("              <li style=''><a href='http://www.baidu.com' target='_blank'><span class='contentdbt'>百度</span><span class='contentdbb'><img src='uploadfile/baidu.jpg' alt='' style='width:157px; height:45px;'></span></a></li>");
       document.write("              <li style=''><a href='http://www.baidu.com' target='_blank'><span class='contentdbt'>谷歌</span><span class='contentdbb'><img src='uploadfile/google.jpg' alt='' style='width:157px; height:45px;'></span></a></li>");
       document.write("              <li style=''><a href='http://www.baidu.com' target='_blank'><span class='contentdbt'>QQ</span><span class='contentdbb'><img src='uploadfile/qq.jpg' alt='' style='width:157px; height:45px;'></span></a></li>");
       document.write("              <li style=''><a href='http://www.baidu.com' target='_blank'><span class='contentdbt'>新浪</span><span class='contentdbb'><img src='uploadfile/sina.jpg' alt='' style='width:157px; height:45px;'></span></a></li>");
       document.write("              <li style=''><a href='http://www.baidu.com' target='_blank'><span class='contentdbt'>雅虎</span><span class='contentdbb'><img src='uploadfile/yahoo.jpg' alt='' style='width:157px; height:45px;'></span></a></li>");
                    
        document.write("       </ul>");
			   
         document.write("   </div>");
       document.write("     <div class='footer_tr_box  r'>");
       document.write("        <div class='footer_tr r'>");
        document.write("            <div class='footer_trl l'>");
        document.write("                <div class='footer_trlt'><img src='./qtimages/weixinerweima.png' alt='' style='width:154px;'></div>");
         document.write("               <div class='footer_trlb'>技术服务(抖音)</div>");
         document.write("           </div>");
           document.write("         <div class='footer_trl r'>");
          document.write("              <div class='footer_trlt'><img src='./qtimages/weixinerweima.png' alt='' style='width:154px;'></div>");
          document.write("              <div class='footer_trlb'>加入我们</div>");
          document.write("          </div>");
         document.write("       </div>");
         document.write("   </div>");
		document.write("	 <div>");
       document.write(" <div>");
        document.write("    <div class='footer_bn'>");
        document.write("        <div class='footer_bnl l'>Copyright @ 2022 助学新版  All Rights Reserved  <a href='http://beian.miit.gov.cn/' target='_blank'>******号</a></div>");
         document.write("       <a href='#' class='footer_bnl l' target='_blank' style='background: url(assets/images/beian.png) no-repeat left center; padding-left: 25px;margin-left: 10px'>xxx公网安备 xxxxxx号</a>");
        document.write("    </div>");
      document.write("  </div>");
  document.write("  </div>");
     document.write("   </div>");
 document.write("   </div>");


	//锚点平滑滚动
    $("a.topLink").click(function() {
    $("html, body").animate({
      scrollTop: $($(this).attr("href")).offset().top + "px"
    }, {
      duration: 400,
      easing: "linear"
    });
    return false;
    });
    $(function () {
        $('.chbnav_touch_top_list').click(function () {
            $('.chbnav_touch_nav_box').addClass('chbnav_select');
            $('body').css('position', 'fixed');
        });
        $('.chbnav_touch_navli1 img').click(function () {
            $('.chbnav_touch_nav_box').removeClass('chbnav_select');
            $('body').css('position', 'relative');
        });

        $(".chbnav_touch_navli").click(function () {

            $(".chbnav_touch_erji").slideUp();

            if ($(".chbnav_touch_erji", this).css("display") == "block") {

            } else {
                $(".chbnav_touch_erji", this).slideDown();
            }
        });
    })
        $(function () {
            $(".renli_main_box_ul_list li").click(function () {

                $(".renli_main_box_ul_li_xianxi").slideUp();
                $('.renli_main_box_ul_li_more').text('+');

                if($(".renli_main_box_ul_li_xianxi",this).css("display")=="block"){

                }else{
                    $(".renli_main_box_ul_li_xianxi",this).slideDown();
                    $('.renli_main_box_ul_li_more',this).text('-');
                }
            });
        })
        $(function () {
            $('.pages_prev').text('<');
            $('.pages_next').text('>');
        })
    $(function() {

        $("#tab2").rTabs({
            bind : 'click',
            animation : 'fadein'
        });
    })
    $(function () {
        var ie6 = document.all;
        var dv = $('.page_ywlyl'), st, botv;
        var bv = $('.footer');
        dv.attr('otop', dv.offset().top);
        dv.attr('oheight', dv.height());
        $(window).scroll(function () {
            st = Math.max(document.body.scrollTop || document.documentElement.scrollTop);
            botv=bv.offset().top-st-parseInt(dv.attr('oheight'));
            if (st > parseInt(dv.attr('otop'))) {
                if(parseInt(bv.offset().top-st)<parseInt(dv.attr('oheight'))){
                    dv.css({ 'position': 'fixed', top: botv });
                }else{
                    if (ie6) {//IE6不支持fixed属性，所以只能靠设置position为absolute和top实现此效果
                        dv.css({ position: 'absolute', top: st });
                    }
                    else if (dv.css('position') != 'fixed') dv.css({ 'position': 'fixed', top: 0 });
                }
            } else if (dv.css('position') != 'static') dv.css({ 'position': 'static' });
        });
    });
