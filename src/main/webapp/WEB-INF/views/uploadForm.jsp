<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<style>
	iframe {
		width: 0px;
		height: 0px;
		border: 0px;
	}
</style>
<body>
	<form id="form1" action="uploadForm" method="post" enctype="multipart/form-data" target="zeroFrame">
		<input type="file" name="file"><input type="submit">
	</form>
	
	<iframe name="zeroFrame"></iframe>
</body>
<script>
	function addFilePath(msg) {
		alert(msg);
		document.getElementById("form1").reset();
	}
</script>
</html>