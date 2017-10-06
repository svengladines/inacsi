var getParameter = function (url, key) {
		var urlParts = url.split('?');
	    var sURLVariables = urlParts[1].split('&');
	    for (var i = 0; i < sURLVariables.length; i++) 
	    {
	        var sParameterName = sURLVariables[i].split('=');
	        if (sParameterName[0] == key) 
	        {
	            return sParameterName[1];
	        }
	    }
};

var serialize = function( element ) {
    var o = {};
    var a = element.serializeArray();
    $jq.each(a, function() {
        if (o[this.name] !== undefined) {
            if (!o[this.name].push) {
                o[this.name] = [o[this.name]];
            }
            o[this.name].push(this.value || '');
        } else {
            o[this.name] = this.value || '';
        }
    });
    return o;
};

function error( button, element, message ) {
	
	doneButton( button );
	
	button.removeClass("btn-success");
	button.addClass("btn-danger");
	
	if ( message != undefined ) {
		element.html( message )	;
	}
	element.removeClass("text-success");
	element.addClass("text-danger");
	element.removeClass("hidden").addClass("show");
	
};

function success( button, element, message ) {
	
	doneButton( button );
	button.removeClass("btn-danger");
	button.addClass("btn-success");
	
	if ( message != undefined ) {
		element.html( message )	;
	}
	
	element.removeClass("text-danger");
	element.addClass("text-success");
	
	if ( element != undefined ) {
		element.removeClass("hidden").addClass("show");
	}
	
};

var busyButton = function( btn, busyText ) { 
	
	var btnTextOriginal
		= btn.html();
	
	btn.attr("data-text-original", btnTextOriginal );
	btn.prop( "disabled", "disabled" );
	if ( ! busyText ) {
		busyText = "Even geduld...";
	}
	btn.html( "<i class=\"fa fa-cog fa-spin\"></i>&nbsp;&nbsp;" + busyText );
		
};

var doneButton = function( btn ) { 
	
	var btnTextOriginal
		= btn.attr("data-text-original");
	
	btn.prop( "disabled", false );
	btn.html( btnTextOriginal );
		
};

function clearError() {
	
	$jq(".error").removeClass("show").addClass("hidden");
	
}

function clearStatus() {
	$jq(".status").removeClass("show").addClass("hidden");
}

function refresh() {
	window.location.hash="";
	window.location.reload();
}

function buttons() {
	
	$jq(".btn-primary").click( function( event ) {
		
		busyButton( $jq(this) );
		
	});
	
}


