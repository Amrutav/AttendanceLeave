/**
 * 
 */
$("#BtnStep3").click(function() {
	alert("ok")
	var imgElem = document.getElementById('Img_files');
	var imgData = JSON.stringify(getBase64Image(imgElem));
	dataObject = {
		'user_name':$('#txtUname').val(),
		'user_password':$('#txtPassword').val(),
		'user_first_name':$('#txtFname').val(),
		'user_last_name':$('#txtLname').val(),
		'user_type':$('#SeluserType').val(),
		'profile_pic': imgData,
		'user_gender':$('#SelGender').val(),
		'user_email':$('#SelEmail').val(),
		'user_mobile_number':$('#MobNumber').val()
};

console.log(dataObject);
	
$.ajax({
    url: 'http://localhost:8080/LeaveAttendance/user/employeeRegister',
    type: 'post',
	contentType: "application/json; charset=utf-8",
	dataType:'json',
	data:JSON.stringify(dataObject),
    success: function(result) {
        console.log(result); 
if(result.status=="SUCCESS"){
$.msgbox({type: 'success',content: 'Registration is Successful ,Thanks for registering',	title:'User Registration'});
    }else if (result.status=="ERROR"){	
	$.msgbox({	type: 'error',	content: 'Server error',	title: 'Submission error'});
}else{
$.msgbox({type: 'warning',content: 'Unfortunately we are unable to process your request Inconvenience regretted',title: 'System Warning'});
}
}
});

});


function getBase64Image(imgElem) {
	// imgElem must be on the same server otherwise a cross-origin error will be thrown "SECURITY_ERR: DOM Exception 18"
	    var canvas = document.createElement("canvas");
	    canvas.width = imgElem.clientWidth;
	    canvas.height = imgElem.clientHeight;
	    var ctx = canvas.getContext("2d");
	    //ctx.drawImage(imgElem, 0, 0);
	    var dataURL = canvas.toDataURL("image/png");
	    return dataURL.replace(/^data:image\/(png|jpg);base64,/, "");
	}