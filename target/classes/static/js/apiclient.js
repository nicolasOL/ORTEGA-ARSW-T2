var Url ="http://"+$(location).attr('hostname')+":"+$(location).attr('port')+"/casos";
var apiclient = (function(){
	
	return {
		
		getCityWeather: function (city,callback){
				var f;
				$.get("/clima/"+city,function(data){
	                    f=data;
	                });
	                return callback(f)
		},
		
		getCasesByCountry: function (pais,callback){
			var g;
			$.get("/clima/"+pais,function(data){
	                    g=data;
	                });
	                return callback(g)
		}
		
	};
})();