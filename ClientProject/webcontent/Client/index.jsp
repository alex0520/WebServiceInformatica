<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Client</title>
</head>
<body>
	<FORM METHOD="POST" ACTION="">
		<TABLE>
			<TR>
				<TD COLSPAN="3" ALIGN="LEFT">Par&aacute;metros:</TD>
			<TR>
				<TD WIDTH="5%"></TD>
				<TD COLSPAN="2" ALIGN="LEFT">a:</TD>
				<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="a" SIZE=20></TD>
			</TR>
			<TR>
				<TD WIDTH="5%"></TD>
				<TD COLSPAN="2" ALIGN="LEFT">b:</TD>
				<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="b" SIZE=20></TD>
			</TR>
		</TABLE>
		<BR>
		<jsp:useBean id="sampleSumaWSDLProxyid" scope="session"
			class="org.example.www.SumaWSDL.SumaWSDLProxy" />
		<%
			if ("POST".equalsIgnoreCase(request.getMethod())) {
				String strA = request.getParameter("a");
				int a = Integer.parseInt(strA);
				String strB = request.getParameter("b");
				int b = Integer.parseInt(strB);
		%>
		<jsp:useBean id="org1example1www1SumaWSDL1SumaRequestType_1id"
			scope="session" class="org.example.www.SumaWSDL.SumaRequestType" />
		<%
			org1example1www1SumaWSDL1SumaRequestType_1id.setA(a);
				org1example1www1SumaWSDL1SumaRequestType_1id.setB(b);
				org.example.www.SumaWSDL.SumaResponse suma13mtemp = sampleSumaWSDLProxyid
						.suma(org1example1www1SumaWSDL1SumaRequestType_1id);
				if (suma13mtemp == null) {
		%>
		<%=suma13mtemp%>
		<%
			} else {
		%>
		<%
			if (suma13mtemp != null) {
		%>
		<span style="color: red"> <%=suma13mtemp.getResultado()%>
		</span><br />
		<%
			}
				}
		%>
		<%
			}
		%>
		<INPUT TYPE="SUBMIT" VALUE="Invoke">
	</FORM>
</body>
</html>