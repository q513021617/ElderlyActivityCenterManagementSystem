$(".caddy").mouseenter(function(){
   $($(this).find('img')).removeClass("on_img_displacement");
   $($(this).find('img')).addClass("img_displacement");
   $(this).children(".caddy_know").children(".svg_shift").removeClass("on_svg_displacement");
   $(this).children(".caddy_know").children(".svg_shift").addClass("svg_displacement");
});
$(".caddy").mouseleave(function(){
   // on_img_displacement
   $($(this).find('img')).addClass("on_img_displacement");
   $($(this).find('img')).removeClass("img_displacement");
   $(this).children(".caddy_know").children(".svg_shift").addClass("on_svg_displacement");
   $(this).children(".caddy_know").children(".svg_shift").removeClass("svg_displacement");
});