//var Url ="http://"https://ortega-arsw-t2.herokuapp.com/clima/;"
var Url= "http://localhost:8080/clima/";
var api = (function(){
	
	return {
		
		getCityWeather: function (city,callback){
				var f;
				$.getJSON("/clima/"+city,function(data){
	                    callback(data);
	                });
		},
		
		getCasesByCountry: function (pais,callback){
			var g;
			$.get("/clima/"+pais,function(data){
	                    g=data;
	                });
	                return callback(g)
		}
		
	}
})();