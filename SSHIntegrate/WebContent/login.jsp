<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录</title>
</head>
<body>
<div class="content">
		<section class="loginBox">
        	<label><h3>管理员登录</h3></label>
			<form class="form-horizontal" role="form" action="LoginAction" method="post">
				<div class="form-group">
					<label for="username" class="col-sm-3 control-label">账号</label>
					<div class="col-sm-9">
						<input type="text" class="form-control" id="username"
							name="username" placeholder="username">
					</div>
				</div>
				<div class="form-group">
					<label for="password" class="col-sm-3 control-label">密码</label>
					<div class="col-sm-9">
						<input type="password" class="form-control" id="password"
							name="password" placeholder="password">
					</div>
				</div>
				<div>
					<input type="submit" class="btn btn-primary col-sm-12" id="submit" value="登录">
                </div>
			</form>
		</section>
</div>
</body>
</html>