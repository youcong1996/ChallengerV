/**
 * 注册
 */
$(function(){
	$("#register").click(function(){
		var email = $("#email").val();
		var username = $("#username").val();
		var sex = $("#sex").val();
		var password = $("#password").val();
		var password2 = $("#password2").val();
		var reg = /^[A-Za-z\d]+([-_.][A-Za-z\d]+)*@([A-Za-z\d]+[-.])+[A-Za-z\d]{2,4}$/; 
		
		
		if(email==null||email==""){
			layui.use('layer', function(){
				  var layer = layui.layer;
				  
				  layer.alert("邮箱是您的登录账户,不能为空",{icon: 5});
			}); 
		}else if(username==null||username==""){
			layui.use('layer', function(){
				  var layer = layui.layer;
				  
				  layer.alert("用户名为必填项",{icon: 5});
			}); 
		}else if(!reg.test(email)){
			layui.use('layer', function(){
				  var layer = layui.layer;
				  
				  layer.alert("邮箱格式不正确",{icon: 5});
			}); 
		}else if(sex==null||sex==""){
			layui.use('layer', function(){
				  var layer = layui.layer;
				  
				  layer.alert("性别为必填项",{icon: 5});
			}); 
		}else if(password==null||password==""){
			layui.use('layer', function(){
				  var layer = layui.layer;
				  
				  layer.alert("密码为必填项",{icon: 5});
			}); 
		}else if(password2==null||password2==""){
			layui.use('layer', function(){
				  var layer = layui.layer;
				  
				  layer.alert("确认密码为必填项",{icon: 5});
			}); 
			
		}else if(password.length<6){
			layui.use('layer', function(){
				  var layer = layui.layer;
				  
				  layer.alert("密码长度不能小于六位",{icon: 5});
			}); 
		}else if(password2.length<6){
			layui.use('layer', function(){
				  var layer = layui.layer;
				  
				  layer.alert("确认密码长度不能小于六位",{icon: 5});
			}); 
		}else if(password!=password2){
			layui.use('layer', function(){
				  var layer = layui.layer;
				  
				  layer.alert("密码与确认密码不一致,请重新输入",{icon: 5});
			}); 
		}else{
			var data = {
					email:email,
					username:username,
					sex:sex,
					password:password
			}
			//与后台url进行异步交互
			$.ajax({
    			url:"/blog-web/user/register",
    			type:"POST",
    			contentType: 'application/json;charset=utf-8',
    	    	data : JSON.stringify(data),
    	    	dataType : 'json',
    			success:function(data){
    				alert(data.returnCode)
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
          	
    			}else if(data.returnCode=="111111"){
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
         				window.location.href='/blog-web/test?email='+data.email;;
    				}, 3000);
    				
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

