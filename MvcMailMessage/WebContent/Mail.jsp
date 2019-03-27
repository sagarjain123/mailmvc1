<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>MailSender</title>
</head>
<body>
	<h1>Welcome to Mail sending Application</h1>

	<h2>
		<b><font color="red">${emsg}</font></b>
	</h2>
	<form action="sendMail.do" method="post">
		<pre>
Receiptent Id:<input type="email" name="receiptent" id="receiptent">
Subject:<input type="text" name="subject" id="subject">
Text:<input type="text" name="text" id="text">
</pre>
		<input type="submit" value="submit"> <input type="reset"
			value="reset">
	</form>
</body>
</html>