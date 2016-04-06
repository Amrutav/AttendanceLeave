/**
 * 
 */
function list(){
	$.ajax({
	    url: 'http://localhost:8080/LeaveAttendance/admin/getHRListForApproval',
	    type: 'get',
		contentType: "application/json; charset=utf-8",
		dataType:'json',
		data:"",
	    success: function(result) {
	        console.log(result);
	$.each(result, function(i, item) {
	    alert(item.user_id);
	    alert(i);
	    $("#display").append("<div>"+item.employee_code+"     "+item.user_first_name+" "+item.user_last_name+"<input type='button' onClick='approve("+item.user_id+");'/></div>");
	});
	}
	});

}

function approve(user_id){
	alert(user_id);
}