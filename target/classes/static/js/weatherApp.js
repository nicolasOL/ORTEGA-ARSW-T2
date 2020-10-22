var weatherApp = (function(){
	var apiu="js/apiclient.js"
	
	var _ciudadSeleccionada;

    function input(){
        _ciudadSeleccionada = $("#city").val();
		console.log(_ciudadSeleccionada);
        $.getScript(apiu, function() {
            api.getCityWeather(_ciudadSeleccionada, convertElementsToObject);
        })

    }

    function convertElementsToObject(functions) {
        //$("table").find("tr:gt(0)").remove();
        console.log(functions)
        name = functions.nombre;
        temperatura = functions.temperatura;
        sensacionTermica = functions.sensacion;
        minTemperatura = functions.tempminima;
        maxTemperatura = functions.tempmaxima;
        presion = functions.presion;
        humedad = functions.humedad;
            var row = '<tr><td>' + name + '</td><td>' + temperatura + '</td><td>' + sensacionTermica + '</td><td>' + minTemperatura + '</td><td>' + maxTemperatura + '</td><td>' + presion + '</td><td>' + humedad +'</td><td>'+'</tr>';
            $("#info").append(row);
        }

    return {
        input: input
    }
})();