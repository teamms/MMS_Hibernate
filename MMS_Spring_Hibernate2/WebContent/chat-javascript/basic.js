
$(document).ready(function(){
	
	$("h3").click(function(){
		$("h3").css("background-color","white");
		$(this).css("background-color","red");
		
	});
	
	
	
	
	var ajax_call = function() {
		
		//var otherPerson=$('*').filter(function() {
		//    return $(this).css("background-color") === 'red';
		//});
		var otherPerson=$('h3');
		
		console.log(otherPerson.attr('id'));
		
		$("#displayMessages").html("");
		
		$.ajax({
			url: 'ChatServlet',
			type: 'GET',
			dataType: 'json',
			contentType: 'application/json',
	        mimeType: 'application/json',
	        data:{"username" : "hashir"},
			//data: $('#updateUsername').serialize(),
			success:function(data){
				if(true){
					var key,i=0;
					var count = Object.keys(data.messages).length;
					console.log(count);
					for(i=0;i<count;i++){
						$("#displayMessages").append(data.messages[i].userName1+": "+data.messages[i].message+"<br>");
						$("#displayMessages").slideDown(1000);
						
					}
					
				}else{
					
					alert('Please enter valid info');
				}
			}
			
		});
		};
		var interval=1000*1;
		setInterval(ajax_call, interval);
	
	
	
	
	/*$("#updateMessages").submit(function(){
		
		$.ajax({
			url: 'ChatServlet',
			type: 'GET',
			dataType: 'json',
			contentType: 'application/json',
	        mimeType: 'application/json',
	        data:{"username" : "hashir"},
			//data: $('#updateUsername').serialize(),
			success:function(data){
				if(true){
					var key,i=0;
					var count = Object.keys(data.messages).length;
					console.log(count);
					for(i=0;i<count;i++){
						$("#displayMessages").append(data.messages[i].userName1+": "+data.messages[i].message+"<br>");
						$("#displayMessages").slideDown(1000);
						
					}
					
				}else{
					
					alert('Please enter valid info');
				}
			}
			
		});
		
		return false;
	});*/
	
	
	
});