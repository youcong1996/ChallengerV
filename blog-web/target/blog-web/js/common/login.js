/**
 * 登录
 */
$(function(){
	$("#login").click(function(){
		//通过id选择器获取input的value
		var email = $("#email").val();
		var password = $("#password").val();		
		var reg = /^[A-Za-z\d]+([-_.][A-Za-z\d]+)*@([A-Za-z\d]+[-.])+[A-Za-z\d]{2,4}$/; 
		
		//表单校验(含非空校验和条件校验)
		if(email==null||email==""){
			layui.use('layer', function(){
				  var layer = layui.layer;
				  
				  layer.alert("请输入登录账户",{icon: 5});
			}); 
		}else if(!reg.test(email)){
			layui.use('layer', function(){
				  var layer = layui.layer;
				  
				  layer.alert("登录账户格式不正确",{icon: 5});
			});         		
	
		}else if(password==null||password==""){
			layui.use('layer', function(){
				  var layer = layui.layer;
				  
				  layer.alert("请输入密码",{icon: 5});
			});  
			
		}else if(password.length<6){
			layui.use('layer', function(){
				  var layer = layui.layer;
				  
				  layer.alert("密码位数不能小于六位",{icon: 5});
			});         		
	
		}else{
			//与后台url进行异步交互
			$.ajax({
    			url:"/blog-web/user/login",
    			type:"POST",
    	    	data : {"email":email,"password":password},
    	    	dataType : 'json',
    			success:function(data){
    
    			if(data.returnCode=="333333"){
    				layui.use('layer', function(){
    					  var layer = layui.layer;
    					  
    					  layer.alert(data.returnMsg, {icon: 5});
    				});         		
          	
    			}else if(data.returnCode=="222222"){
    				layui.use('layer', function(){
  					  var layer = layui.layer;
  					  
  					  layer.alert(data.returnMsg, {icon: 5});
  				});  
    			}else if(data.returnCode=="000000"){
    			  
    				layui.use('layer', function(){
     					  var layer = layui.layer;
     					  
     					  layer.alert("请稍后,马上进入"+data.returnMsg,{icon: 1});
     					
     				}); 
    				
         			setTimeout(() => {
    		    		view();
    				}, 1000);
    				
    			}
    	
    			},error:function(){
    				layui.use('layer', function(){
  					  var layer = layui.layer;
  					  
  					  layer.alert("有异常,请和管理员联系");
  					  
  				});  
    			}
    		});
		}
	});
	
	
});

function view(){
	window.location.href='index.html';
}