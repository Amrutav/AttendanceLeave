<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>ATTENDANCE SYSTEM</title>
<link href="css/style.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="js/jquery-1.11.3.min.js"></script>

<script type="text/javascript">
$(document).ready(function(e) {
	document.getElementById("Img_files").onchange = function () {
    var reader = new FileReader();

    reader.onload = function (e) {
        // get loaded data and render thumbnail.
        document.getElementById("ShowUpload_Img").src = e.target.result;
    };

    // read the image file as a data URL.
    reader.readAsDataURL(this.files[0]);
};
	
	$("#AdminLogin").click(function(){
		 var DDuser=$("#DDHrmsUserType").val();
		 var UName=$("#txtUserName").val();
		 var UPassword=$("#txtPassword").val();
		 if(DDuser == "0")
		 {
		 	alert("Please Select User Type");
			$("#DDHrmsUserType").focus();
			return false;
		 }
		 if(UName==""){
		 	alert("Please Enter User Name");
			$("#txtUserName").focus();
			return false;
		 }
		 if(UPassword==""){
		 	alert("Please Enter Password");
			$("#txtPassword").focus();
			return false;
		 }
		 else
		 {
		 	window.location("Dashboard.html");
			return ture;
		 }
		 
	});
	
	$("#closebtn2").click(function() {
                $("#dlg2").fadeOut('100', "linear", function() { $("#bkg2").fadeOut(); });
            });
            
			
			
            $("#DivRegister").click(function() {
            
                        if (document.getElementById('bkg2').style.visibility == 'hidden') {
                            document.getElementById('bkg2').style.visibility = '';
                            $("#bkg2").hide();
                        }
                        if (document.getElementById('dlg2').style.visibility == 'hidden') {
                            document.getElementById('dlg2').style.visibility = '';
                            $("#dlg2").hide();
                        }
                        $("#bkg2").fadeIn(100, "linear", function() 
						{ $("#dlg2").fadeIn(); });
                        return false;
                    
            });
			$("#BtnStep1").click(function(){
				$("#StepOneOpen").css("display","none");
				$("#StepTwoOpen").css("display","block");
				$("#StepOneFirst").text("REGISTRATION STEP 2");
			});
			$("#BtnStep2Prev").click(function(){
				$("#StepOneOpen").css("display","block");
				$("#StepTwoOpen").css("display","none");
				$("#StepThreeOpen").css("display","none");
				$("#StepOneFirst").text("REGISTRATION STEP 1");
			});
			$("#BtnStep2").click(function(){
				$("#StepThreeOpen").css("display","block");
				$("#StepTwoOpen").css("display","none");
				$("#StepOneFirst").text("REGISTRATION STEP 3");
			});
			$("#BtnStep3Prev").click(function(){
				$("#StepThreeOpen").css("display","none");
				$("#StepTwoOpen").css("display","block");
				$("#StepOneFirst").text("REGISTRATION STEP 2");
			});
			
			
		/*	$('body').click(function() {
    if (!$(this.target).is('#bkg2')){
       $("#bkg2").hide();
    }
});*/
			
    
});

</script>
</head>
<body>

<div class="Wrapper">
	<div class="header">
    </div>
    <div class="Reg_FormContainer">
     	<div class="LoginReg_Header">
        	LOGIN
        </div>
       
    		  <!-- Admin Login Panel -->
		        <div class="Adminlogin_Panel">
                <div class="AdminControl_Panel">
                	<div class="AdminLoginPanel_Lbl">User Type : </div>
                    <div  style="width:auto; float:left;padding-left: 20px;">
                    	<select id="DDHrmsUserType" class="AdmininputDD_Css">
                        <option value="0">-- Select User Type --</option>
                        <option>ADMIN</option>
                        <option>HR</option>
                        <option>EMPLOYEE</option>
                        </select>
                    </div>
                </div>
            	<div class="AdminControl_Panel">
                	<div class="AdminLoginPanel_Lbl">User Name : </div>
                    <div  style="width:auto; float:left;padding-left: 20px;">
                    	<input type="text" id="txtUserName"  class="Admininput_Css" />
                    </div>
                </div>
                <div class="AdminControl_Panel">
                	<div class="AdminLoginPanel_Lbl">Password : </div>
                    <div  style="width:auto; float:left;padding-left: 20px;">
                    	<input type="password" class="Admininput_Css" id="txtPassword"  />
                    </div>
                </div>
                
            </div>
		    <!-- Admin Login Panel-->
    <div class="Admin_Reg_Row">
     	 <a href="Dashboard.html">
        	<input type="submit" class="LogInRegBtn" value="LOGIN" id="AdminLogin" />
        </div>
        </a>
        <div class="Admin_Reg_Row">
        	<input type="submit" class="SignupRegBtn" value="REGISTER" id="DivRegister" />
        </div>
    </div>
    
    	
    <!-- Modal Pop Up for Registration-->
		<div class="blockbkg2" id="bkg2" style="visibility: hidden;">
    		<div class="cont2" id="dlg2" style="visibility: hidden;">
         <div style="float: left; width: 80%; height: 20px; font-family: Arial, Helvetica, sans-serif;
          color: Black; font-size: 16px; font-weight: bold;" title="Close">
          </div>
    <div class="closebtn2" title="Close" id="closebtn2">
                <img src="img/button_delete_blue.png" border="0" height="24" />
   </div>
   <!-- Place for Content -->
   	<div class="callBackHeader" id="StepOneFirst">REGISTRATION STEP 1</div>
    <!-- Step One Start-->
    <div class="popupContain" id="StepOneOpen">
    			<div class="popupRow">
	                <div class="popupLoginWap" id="SeluserType">
                        <select class="cb_num popupContain_select" >
                            <option value="0">User Type</option>
                            <option>HR</option>
                            <option>EMPLOYEE</option>
                        </select>
	                    
	                </div>
	            </div>
    			
	            <div class="popupRow">
	                <div class="popupLoginWap">
                        
	                    <input class="cb_num popupContain_input" id="txtUname" placeholder="User Name" type="text" name="number"  maxlength="10">
	                </div>
	            </div>
                
                <div class="popupRow">
	                <div class="popupLoginWap">
                        
	                    <input class="cb_num popupContain_input" id="txtPassword" placeholder="Password" type="password" name="number"  maxlength="10">
	                </div>
	            </div>
                
	            <div class="popupRow forgotPasswordError"></div>
	            <div class="popupRow" style="margin-top:23px;">
	                <div class="popupButtonWap cf">
	                    <div >
	                        <div class="Button_Next" id="BtnStep1"> Next</div>
	                    </div>
                        
                       
	                </div>
	            </div>
 
   
</div>
	<!-- Step One End-->
    
    <!-- Step Two Start-->
	<div class="popupContain" id="StepTwoOpen" style="display:none;">
    			
    			
	            <div class="popupRow">
	                <div class="popupLoginWap">
                        
	                    <input class="cb_num popupContain_input" id="txtFname" placeholder="First Name" type="text" name="number"  maxlength="10">
	                </div>
	            </div>
                
                <div class="popupRow">
	                <div class="popupLoginWap">
                        
	                    <input class="cb_num popupContain_input"  id="txtLname" placeholder="Last Name" type="text" name="number"  maxlength="10">
	                </div>
	            </div>
                <div class="popupRow">
	                <div class="popupLoginWap">
                        <select class="cb_num popupContain_select" id="SelGender" >
                            <option value="0">-- Select Gender --</option>
                            <option value="Male">-- Male --</option>
                            <option value="Female">-- Female --</option>
                        </select>
	                    
	                </div>
	            </div>
	            <div class="popupRow forgotPasswordError"></div>
	            <div class="popupRow" style="margin-top:23px;">
	                <div class="popupButtonWap cf">
	                    <div class="popupBlogin">
	                        <div class="Button_Next" id="BtnStep2"> Next</div>
	                    </div>
                         <div >
	                        <div class="Button_Prev" id="BtnStep2Prev"> Previous</div>
	                    </div>
	                </div>
	            </div>
 
   
</div>
	<!-- Step Two End-->
    <!-- Step Three Start-->
    	<div class="popupContain" id="StepThreeOpen" style="display:none;position:relative;">
    			
    			<div class="SmalDivContainer">
	            	<div class="SmalDivCol">
	                <div class="popupLoginWap">
                        
	                    <input class="cb_num popupContain_input_Last" id="SelEmail" placeholder="Email- ID" type="text" name="number"  maxlength="10">
	                </div>
	            </div>
                	<div class="SmalDivCol">
	                <div class="popupLoginWap">
                        
	                    <input class="cb_num popupContain_input_Last" id="MobNumber" placeholder="Mobile Number" type="text" name="number"  maxlength="10">
	                </div>
	            </div>
                </div>
                <div class="SmalDivCol_right">
                	<div class="Div_Col_Img">
                    	<img id="ShowUpload_Img" width="120px" height="100px" />
                    </div>
                    <div class="Div_Col_Button_Browse">
                    Browse Image
                    	<input type="file" id="Img_files" value="Browse Image" class="FileUpload_Css" />
                    	
                    </div>
                </div>
                 <div class="popupRow">
	                <div class="popupLoginWap" style="height:40px;">
                        
	                    
	                </div>
	            </div>
	            <div class="popupRow forgotPasswordError"></div>
	            <div class="popupRow" style="margin-top:-30px;">
	                <div class="popupButtonWap cf">
	                    <div class="popupBlogin">
	                        <div class="Button_Next" id="BtnStep3"> REGISTER</div>
	                    </div>
                         <div >
	                        <div class="Button_Prev" id="BtnStep3Prev"> Previous</div>
	                    </div>
	                </div>
	            </div>
 				
    <!-- Step Three End-->
    
   <!-- Place for Content -->
</div>   

</div>

    <!-- Modal Pop Up for Registration-->
    
</div>
<script type="text/javascript" src="js/registration.js"></script>
</body>

</html>