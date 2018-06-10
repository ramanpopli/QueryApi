<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>

<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>Registration</title>

<script

  src="https://code.jquery.com/jquery-3.2.1.min.js"

  integrity="sha256-hwg4gsxgFZhOsEEamdOYGBf13FyQuiTwlAQgxVSNgt4="

  crossorigin="anonymous"></script>

</head>

 

<body>

<form name ="myform" action="/Rest/Queryprocess" method="POST">

        Enter Email :<input type="email" name="email" id="email" required> <br>

        Enter Name :<input type="text" name="name"  id="name" required><br>

        Enter  Subject :<input type="text" name="subject"  id="subject" required><br>

        Enter QueryMessage :<input type="textarea" name="queryMessage"  id="queryMessage" required><br>

        

      

            

              <input type="submit" value="Register">

             

</form>


 <script>

       $(document).ready(function(e) {

 

              $("#form_click").off('click').on('click',function(e) {

                     debugger;

                     e.stopPropagation();

                     registerViaAjax().done(function(){

                           alert("working");

                     });

 

              });

 

       });

      

       function registerViaAjax() {

             

              var userModel = {};

              userModel["email"] = $("#email").val();

              userModel["name"] = $("#name").val();

              userModel["subject"] = $("#subject").val();

              userModel["queryMessage"] = $("#queryMessage").val();

            

              /* var flag = false;

              var str ;

              var regex = '';

              if(regex.test($("#phone").val()))

              if($("#phone").val().length === 0)

                     flag = true;

                     return false;

              } */

 

             

                    

              }

                 return $.ajax({
                     type : "POST",

                     contentType : "application/json",

                     url : "http://localhost:8080/SpringMVCCrud/Queryregister",

                     data : JSON.stringify("userModel"),

                     success : function(res) {

                           console.log("SUCCESS: ", res);

                           if(res){

                                  alert("Query Sent ")

                           }else

                                  {

                                  alert("res "+res);

                                  }

                                 

                     },

                     error : function(e) {

                           console.log("ERROR: ", e);

                     }

                    

              });

 

      

       </script>

 

 

 

 

 

</body>

</html>