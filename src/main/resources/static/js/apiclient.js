var Url ="http://"+$(location).attr('hostname')+":"+$(location).attr('port')+"/casos";
var apiclient = (function(){
	
	var g=[]
	return {
		
		getAllCases: function (callback){
				var f;
				$.get("/casos",function(data){
	                    f=data;
	                });
	                return callback(f)
		},
		
		getCasesByCountry: function (pais,callback){
			var g;
			$.get("/casos/"+pais,function(data){
	                    g=data;
	                });
	                return callback(g)
		}
		
	};
})();