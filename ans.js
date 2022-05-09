function answer(vol,no){
  if (vol<13){
  window.open('/j3/up.cgi?vol='+vol+'&no='+no,'','width=800,height=700,scrollbars=yes,location=no');
  }else{
  window.open('/j3/gp.cgi?vol='+vol,'','width=900,height=700,scrollbars=yes,location=no');
  }
}

function kanso(){
  window.open('/j3/kanso.cgi','','width=800,height=900,scrollbars=yes,location=no');
}

function upload_ppt(){

window.open('/j3/up2.cgi?type=ppt','','width=800,height=800,scrollbars=yes,location=no');
}

function appear(id){
if (document.getElementById(id).style.display == 'block')
{document.getElementById(id).style.display='none';}
else{document.getElementById(id).style.display='block';}
}
