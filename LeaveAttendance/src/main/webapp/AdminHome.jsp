<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link href="css/style.css"  rel="stylesheet" type="text/css"  />
<link href="css/SlideMenu.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="js/jquery-1.11.3.min.js"></script>
<script type="text/javascript">
$(document).ready(function(e) {
$("#DIVUsertype").css("display","none");
$("#lIPROFILE").click(function(){
$("#DIVUsertype").slideToggle();
}); 
});
</script>
</head>
<body>
<div id="Wrapper">
<div class="header">
    </div>
    <div class="AdminFixedpanel_Container">
        
        <div class="Menu_RightContainer">
        	
        </div>
       
                        <div class="nav-toggler toggle-slide-left EditedF_OpenMenu" id="OpenBtn"> 
                        <div class="Admin_MenuBtn">
                    	<div class="Admin_MenuBtnRow">
                        	<img src="Images/SlideCLoseOpen_Top.png" height="20" />
                        </div>
                        
                       
                    </div>
                        </div>
                      
    </div>
    
    
    <div class="DashboardContainer_Div">
    
    </div>
	<div class="Admin_DigiFarm_Container">
    		  <!-- Admin Slide Menu -->
		        	<div style="min-height:0px; height:auto; width:400px;">
        				<nav class="menu slide-menu-left" style="position: absolute;min-height:98%;height: auto;top:0px;width: 400px; ">
                		<ul>
                            <li><div class="SLideMenu_header">
                            	<div class="close-menu EditedF_CLoseMenu">
                    CLOSE
                        <span class="boxclose" style="font-size: 27px;top: 9px;position: absolute;left: 56px;"></span>
                    </div>
                            </div></li>
                            <li><div class="close-menu EditedF_CLoseMenu"></div></li>
                            <li id="lIPROFILE">
                                <div style="">
                            		<span style="margin-top:8px;">
                             		<a href="#">
                            		USER TYPE
                           			 </a>
                            		</span>
                         		</div>
                                
                                <div style="padding: 0px 0px 10px 10px;" id="DIVUsertype" style="display:none;">
                          			<a href="#">
                                        <div style="margin-top:0px;margin-left: 10px;">
                                         <span style="display:block;width: 33px; float: left;">
                                            <img src="Images/Hr_Icon.png" width="15" height="15">
                                        </span>
                                        <span style="margin-top:1px;">HR</span>
                                        </div>
                         			</a>
                          			<a href="#">
                         				 <div style="margin-top:0px;margin-left: 10px;">
                         				 <span style="display:block;width: 33px; float: left;">
                                   		 	<img src="Images/Emp_Icon.png" width="15" height="15">
                             			 </span>
                         				<span style="margin-top:1px;">EMPLOYEE</span>
                             			</div>
                         </a>
                         </div>
                                
                                
                            </li>
                            <li id="#"><a href="#">
                            <span style="margin-top:8px;">
                                PROFILE
                            </span>
                            </a>
                            </li>
                            <li id="#"><a href="#">
                            <span style="margin-top:8px;">
                               LOGOUT
                            </span>
                            </a>
                            </li>
                  		</ul>
						</nav>
						<!--<div class="nav-toggler toggle-slide-left EditedF_OpenMenu" id="OpenBtn">Click</div>-->
                        
       				</div>
		      <!-- Admin Slide Menu-->
    </div>

</div>















<a href="javascript:list();">List</a>
<div>
/////////////////////
</div>
<div id="display">

</div>
















<script type="text/javascript" src="js/admin.js"></script>
<script src="js/classie.js"></script>
<script src="js/nav.js"></script>
</body>
</html>