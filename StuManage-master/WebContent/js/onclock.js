     function disptime(){
        	var now=new Date();
     		var year=now.getYear();
     		var month=now.getMonth();
     		var date=now.getDate();
     		var day=now.getDay();
     		var hour=now.getHours();
     		var minu=now.getMinutes();
     		var sec=now.getSeconds();
     		var week;
     		month=month+1;
     		if(month<10) month="0"+month;
     		if(date<10) date="0"+date;
     		if(hour<10) hour="0"+hour;
     		if(minu<10) minu="0"+minu;
     		if(sec<10) sec="0"+sec;
     		var arr_week=new Array("星期日","星期一","星期二","星期三","星期四","星期五","星期六");
     		week=arr_week[day];
     		time=2020+"年"+month+"月"+date+"日 "+week+" "+hour+":"+minu+":"+sec;
     		//document.getElementById("bgclock").innerHTML=time;
     		//time=setTimeout("disptime()",1000);
        }

        
       var time=setInterval("disptime()",1000);