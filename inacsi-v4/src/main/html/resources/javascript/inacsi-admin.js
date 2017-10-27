var scheme = "http://localhost:8099";
// var scheme = "http://vive-le-velo-backend.appspot.com";

var url = function ( sub ) {
	return scheme + "/api" + sub;
}

var Editable = function ( id, text ) {
	
	this.id = id;
	this.text = text;
	
};

var editablesURL = function ( ) {
	return url( "/articles" );
}

var postEditable = function ( url, editable, callback ) {
	
	$jq.ajax( {
		type: "post",
		url: url,
		dataType: "json",
		contentType: "application/json;charset=\"utf-8\"",
	    processData: false,
		data: JSON.stringify( editable ),
		success: function( returned ) {
			if ( callback ) {
				callback( returned );
			}
			else {
				// success( button, statusElement, "Opgeslagen" );
			}
		},
		error: function(  jqXHR, textStatus, errorThrown ) {
			$jq("#error").html( errorThrown );
		}
	});
};