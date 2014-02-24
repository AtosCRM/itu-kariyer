<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Save Subscriber</title>
</head>
<body>
	<f:view>
		<h:form>
			<h:panelGrid columns="2" border="1">
				<h:outputLabel value="#{labelDes.cusId}" />
				<h:inputText value="#{subscriber.customerId}"></h:inputText>


				<h:outputLabel value="#{labelDes.gsmNo}" />
				<h:inputText value="#{subscriber.gsmNo}"></h:inputText>


				<h:outputLabel value="#{labelDes.gsmType}" />
				<h:inputText value="#{subscriber.gsmType}"></h:inputText>

				<h:commandButton value="Kaydet" action="#{subscriberAct.insertSub}"></h:commandButton>


			</h:panelGrid>

		</h:form>

	</f:view>
</body>
</html>