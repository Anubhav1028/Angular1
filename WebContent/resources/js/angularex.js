var myapp=angular.module('myapp',[]);
myapp.controller('myctrl',function($scope){
	 $scope.mess = "Hello Angular";
});
myapp.controller('ajaxctrl',function($http){
	var reqObject={bookId:1};
	$http({
		method:'POST',
		url :'./AjaxUsingAng',
		data:JSON.stringify(reqObject),
		responseType:'json',
		 headers: {
		        'Content-type': 'application/json'
		    }
	}).then(function (response){
		console.log(response);
	},function(error){
		console.log(error);
	});
});