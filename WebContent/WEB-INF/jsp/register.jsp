<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>CVP | Registration Page</title>
    <!-- Font Awesome -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.min.css">
    <!-- Ionicons -->
    <link rel="stylesheet" href="https://code.ionicframework.com/ionicons/2.0.1/css/ionicons.min.css">
    <spring:url value="/resources/common_styles.css" var="commonCSS" />
	<link href="${commonCSS}" rel="stylesheet" />
	<spring:url value="/resources/plugins/iCheck/square/blue.css" var="iCheckCSS" />
    <link href="${iCheckCSS}" rel="stylesheet"/>
    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
        <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
  </head>
  <body class="hold-transition register-page">
    <div class="register-box">
      <div class="register-logo">
        <spring:url value="/resources/dist/img/cpvapplogo.png" var="cvplogo" />
      	<img alt="CVP Apps" src="${cvplogo}" width="100%"/>
      </div>

      <div class="register-box-body">
        <p class="login-box-msg">Register a new membership</p>
        <form:form role="form" action="registration.html" modelAttribute="registrationForm" method="POST">
          <div class="form-group has-feedback">
            <form:input path="user_id" cssClass="form-control mandatory" placeholder="User id"/>
            <span class="glyphicon glyphicon-user form-control-feedback"></span>
          </div>
          <div class="form-group has-feedback">
          	<form:input path="firstname" cssClass="form-control mandatory" placeholder="First name"/>
            <span class="glyphicon glyphicon-envelope form-control-feedback"></span>
          </div>
           <div class="form-group has-feedback">
          	<form:input path="lastname" cssClass="form-control mandatory" placeholder="Last name"/>
            <span class="glyphicon glyphicon-envelope form-control-feedback"></span>
          </div>
          <div class="form-group has-feedback">
          	<form:input path="mobile" cssClass="form-control mandatory" placeholder="Mobile number"/>
            <span class="glyphicon glyphicon-envelope form-control-feedback"></span>
          </div>
          <div class="form-group has-feedback">
          	<form:textarea path="address" cssClass="form-control mandatory" placeholder="Address"></form:textarea>
            <span class="glyphicon glyphicon-envelope form-control-feedback"></span>
          </div>
          <div class="form-group has-feedback">
          	<form:input path="pincode" cssClass="form-control mandatory" placeholder="Pincode" maxlength="6"/>
            <span class="glyphicon glyphicon-envelope form-control-feedback"></span>
          </div>
          <div class="form-group has-feedback">
          	<form:input path="email" cssClass="form-control mandatory" placeholder="Email id"/>
            <span class="glyphicon glyphicon-envelope form-control-feedback"></span>
          </div>
          <div class="form-group has-feedback">
			<div class="input-group">
				<input type="password" id="password_initial" class="form-control" placeholder="Password">
				<div class="input-group-addon">
					<input type="checkbox" id="showPassword1" class="css-checkbox" /><label for="showPassword1" class="css-label" title="Show characters"></label>
				</div>
			</div>
          </div>
          <div class="form-group has-feedback">
          	<div class="input-group">
				<form:password path="password" cssClass="form-control" placeholder="Retype Password"/>
				<div class="input-group-addon">
					<input type="checkbox" id="showPassword2" class="css-checkbox" /><label for="showPassword2" class="css-label" title="Show characters"></label>
				</div>
			</div>
          </div>
          <div class="row">
            <div class="col-xs-8">
              <div class="checkbox icheck">
                <label>
                  <input type="checkbox"> I agree to the <a href="#">terms</a>
                </label>
              </div>
            </div><!-- /.col -->
            <div class="col-xs-4">
              <button type="submit" class="btn btn-primary btn-block btn-flat">Register</button>
            </div><!-- /.col -->
          </div>
        </form:form>

        <a href="login.html" class="text-center">I already have a membership</a>
      </div><!-- /.form-box -->
    </div><!-- /.register-box -->
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
        $('input[type="checkbox"]').not('.css-checkbox').iCheck({
          checkboxClass: 'icheckbox_square-blue',
          radioClass: 'iradio_square-blue',
          increaseArea: '20%'
        });
      });
      (function ($) {
  	    $.toggleShowPassword = function (options) {
  	        var settings = $.extend({
  	            field: "#password",
  	            control: "#toggle_show_password",
  	        }, options);
  	        var control = $(settings.control);
  	        var field = $(settings.field);
  	        control.bind('click', function () {
  	            if (control.is(':checked')) {
  	                field.attr('type', 'text');
  	            } else {
  	                field.attr('type', 'password');
  	            }
  	        });
  	    };
  	}(jQuery));
    $.toggleShowPassword({
  	    field: '#password_initial',
  	    control: '#showPassword1'
  	});
    $.toggleShowPassword({
  	    field: '#password',
  	    control: '#showPassword2'
  	});
     
    </script>
  </body>
</html>
