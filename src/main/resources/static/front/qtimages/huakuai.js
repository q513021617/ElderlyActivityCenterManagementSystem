$(function(){

    //菜单形式
    $('.menus1 li a').each(function(){
        var flag = 0;
        var i = 0;
        $('.menus1 li').mouseover(function(){
            var index = $(this).index();
            $('.menus1 .bg').css('left',(index-1)*56+'px');
            $('.menus1 li a').css('color','#000');
            $(this).css('color','#fff');
            $('.menus1 li a').click(function(){
                $('.menus1 .bg').css('left',(index-1)*56+'px');
                flag = (index-1)*56;
                i=$(this).index()-1;
                $(this).css('color','#fff');
            })
            $('.menus1 li a').mouseout(function(){
                $('.menus1 .bg').css('left',flag+'px');
                $('.menus1 li a').css('color','#000');
                $('.menus1 li a').eq(i).css('color','#fff');
            });
        });
    })



})
