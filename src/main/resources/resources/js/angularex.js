var myapp=angular.module('myapp',[]);
myapp.controller('myctrl',function($scope){
	 $scope.mess = "Hello Angular";
});
myapp.controller('ajaxctrl',function($http,$scope){
	var reqObject={bookId:1};
	$http({
		method:'POST',
		url :'./AjaxUsingAng',
		data:JSON.stringify(reqObject),
		responseType:'json'
	}).then(function (response){
		console.log(response['data']);
		/*var books=[]
		books.push(response.data);
		$scope.books=books;
		console.log($scope.books);*/
		$scope.books=response.data;
		
	},function(error){
		console.log(error);
	});
	
});