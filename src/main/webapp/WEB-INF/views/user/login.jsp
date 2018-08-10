<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
<link href="/resources/bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css" />
<link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css" rel="stylesheet" type="text/css" />
<link href="/resources/dist/css/AdminLTE.min.css" rel="stylesheet" type="text/css" />
 <link href="/resources/plugins/iCheck/square/blue.css" rel="stylesheet" type="text/css" />
<title>Insert title here</title>
</head>
<body class="login-page">
	<div class="login-box">
		<div class="login-logo">
			<a href="/resources/index2.html"><b>Zerock</b>Project</a>
		</div>
		<div class="login-box-body">
			<p class="login-box-msg">Sign in to start your session</p>
			
			<form action="/user/loginPost" method="post">
				<div class="form-group has-feedback">
					<input type="text" name="userid" class="form-control" placeholder="USER ID" />
					<span class="glyphicon glyphicon-envelope form-control-feedback"></span>
				</div>
				<div class="form-group has-feedback">
					<input type="password" name="userpwd" class="form-control" placeholder="Password" />
					<span class="glyphicon glyphicon-lock form-control-feedback"></span>
				</div>
				<div class="row">
					<div class="col-xs-8">
						<div class="checkbox icheckbox">
							<label>
								<input type="checkbox" name="useCookie">Remember Me
							</label>
						</div>
					</div>
					<div class="col-xs-4">
						<button type="submit" class="btn btn-primary btn-block btn-flat">Sign In</button>
					</div>
				</div>
			</form>
		</div>
	</div>
</body>
</html>