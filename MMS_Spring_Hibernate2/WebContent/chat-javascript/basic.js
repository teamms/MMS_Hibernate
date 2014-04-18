
var clicker=null;

$(document).ready(function(){
	
	$("h3").click(function(){
		$("h3").css("background-color","white");
		$(this).css("background-color","red");
		$("#displayMessages").html("");
		clicker=$(this);
	});
	
	
	
	
	
	
	var ajax_call = function() {
		
		//var otherPerson=$('*').filter(function() {
		//    return $(this).css("background-color") === 'red';
		//});
		//var otherPerson=clicker
		
		//var otherPerson=$('h3');
		var otherPerson=clicker.attr('id');
		console.log(otherPerson);
		
		$("#displayMessages").html("");
		
		$.ajax({
			url: 'ChatServlet',
			type: 'GET',
			dataType: 'json',
			contentType: 'application/json',
	        mimeType: 'application/json',
	        data:{"username" : $("#userName1").val(),
	        	  "otherPerson":otherPerson},
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
		$('html, body').stop();
		return false;
		};
		var interval=1000*2;
		setInterval(ajax_call, interval);
		return false;
		/*$("#send_jquery").click(function(){
			if(clicker!=null){
				$("#userName2").val(clicker.attr('id'));				
			}else return null;
			alert('hey');
			$("form#send_submit").submit();
			
		});*/
		
		$("#sendMessage").submit(function(){
			
			//alert($("#userName1").val());
			//alert(clicker.attr('id'));
			//alert($("#toInboxMessage").val());
			
			$.ajax({
				url: 'MessageServlet',
				type: 'GET',
				dataType: 'json',
				contentType: 'application/json',
		        mimeType: 'application/json',
		        data:{"userName1" : $("#userName1").val(),
		        	"userName2"   : clicker.attr('id'),
		        	"toInboxMessage"     :$('#toInboxMessage').val()
		        },
				//data: $('#updateUsername').serialize(),
				success:function(data){
					if(true){
						$("#displayName").html("Your name is "+data.username);
						$("#displayName").slideDown(1000);
					}else{
						
						alert('Please enter valid info');
					}
				}
		        
			});
			//$('html, body').stop();
			
		});
		return false;
	
	
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