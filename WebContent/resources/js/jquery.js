$(document).ready(function(){
	var reqObj={bookId:3};
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
});