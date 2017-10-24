$(document).ready(function(){
	var reqObj={bookId:1};
	var date=myfunction(new Date());
	var name=myfunction('Anubhav');
	console.log(date);
	console.log(name);
	$.ajax({
		method:'POST',
		url:'./jqueryAjax',
		data:reqObj,
		dataType:'json',
		success:function(response){
			console.log(response);
		},
		error:function(){
			
		}
	});
	function myfunction(myparam){
		console.log(myparam)
		return myparam;
	}
	var funcdel=function(param){
		console.log(param);
	}
	funcdel(10);
});