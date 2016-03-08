<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>CVP | Log in</title>
    <!-- Font Awesome -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.min.css">
    <!-- Ionicons -->
    <link rel="stylesheet" href="https://code.ionicframework.com/ionicons/2.0.1/css/ionicons.min.css">
    <spring:url value="/resources/common_styles.css" var="commonCSS" />
	<link href="${commonCSS}" rel="stylesheet" />
	<spring:url value="/resources/plugins/iCheck/square/blue.css" var="iCheckCSS" />
    <link href="${iCheckCSS}" rel="stylesheet"/>
    <style>
    #didq-f-id{
		text-align:center;
		border-top: 2px solid grey;
		background:#fff;    	
    }
    </style>
    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
        <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
  </head>
  <body class="hold-transition login-page">
    <div class="login-box">
      <div class="login-logo">
      	<spring:url value="/resources/dist/img/cpvapplogo.png" var="cvplogo" />
      	<img alt="CVP Apps" src="${cvplogo}" width="100%"/>
      </div>
      <div class="login-box-body">
        <p class="login-box-msg">Sign in to start your session</p>
        <form:form role="form" action="loginCheck.html" modelAttribute="loginForm" method="POST">
          <div class="form-group has-feedback">
           	<form:input path="email" cssClass="form-control mandatory" placeholder="Email"/>  
            <span class="glyphicon glyphicon-envelope form-control-feedback"></span>
          </div>
          <div class="form-group has-feedback">
            <form:password path="password" cssClass="form-control mandatory" placeholder="Password"/>
            <span class="glyphicon glyphicon-lock form-control-feedback"></span>
          </div>
          <div class="row">
            <div class="col-xs-8">
              <div class="checkbox icheck">
                <label>
                  <input type="checkbox"> Remember Me
                </label>
              </div>
            </div><!-- /.col -->
            <div class="col-xs-4">
              <button type="submit" class="btn btn-primary btn-block btn-flat">Sign In</button>
            </div><!-- /.col -->
          </div>
      	</form:form>
        <a href="#">I forgot my password</a><br>
        <a href="register.html" class="text-center">Register a new membership</a>
      </div><!-- /.login-box-body -->
      <div id="didq-f-id"></div> <script type="text/javascript" src="http://www.jonathanlockwoodhuie.com/quotes-f-js.php"></script>
    </div><!-- /.login-box -->
    <div class="dailyQoutes">
    	<!-- <script src="http://wordsmith.org/words/quote.js" type="text/javascript"></script> -->
    	
    </div>
    <!-- jQuery 2.1.4 -->
    <spring:url value="/resources/plugins/jQuery/jquery-1.12.1.min.js" var="jQueryJS" />
    <script src="${jQueryJS}"></script>
    <!-- Bootstrap 3.3.5 -->
    <spring:url value="/resources/bootstrap/js/bootstrap.min.js" var="bootstrapJS" />
    <script src="${bootstrapJS}"></script>
    <!-- iCheck -->
    <spring:url value="/resources/plugins/iCheck/icheck.min.js" var="iCheckJS" />
    <script src="${iCheckJS}"></script>
    <script>
      $(function () {
        $('input').iCheck({
          checkboxClass: 'icheckbox_square-blue',
          radioClass: 'iradio_square-blue',
          increaseArea: '20%'
        });
        $("#didq-f-id").find("a,br").remove();
        $("#didq-f-id").find("em").replaceWith(function(){
            return $("<blockquote />", {html: $(this).html()});
        });
        /* $("#didq-f-id").find("a").remove();
        $("#didq-f-id").find("br").remove(); */
      });
    </script>
  </body>
</html>
