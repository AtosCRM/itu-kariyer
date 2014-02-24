<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Save Customer</title>
</head>
<body>
	<f:view>
		<h:form style="align:center">
			<h:panelGrid columns="2" border="1">

				<h:outputLabel value="Adi"></h:outputLabel>
				<h:inputText value="#{customer.name}" />

				<h:outputLabel value="Soyadi"></h:outputLabel>
				<h:inputText value="#{customer.lastname}" />

				<h:outputLabel value="Dogum Tarihi"></h:outputLabel>
				<h:inputText value="#{customer.birthDate}" />

				<h:outputLabel value="Tc Kimlik No"></h:outputLabel>
				<h:inputText value="#{customer.birthDate}">
					<f:validateLength maximum="11" minimum="11" />
					<f:validator
						validatorId="com.atos.subscriber.validation.NationalityIdValidator" />
				</h:inputText>

				<h:outputLabel value="Musteri Tipi"></h:outputLabel>

				<h:selectOneMenu value="#{customer.typeId}">
					<f:selectItems value="#{dropDownData.customerType}" var="dp"
						itemLabel="#{dp.typeDescription}" itemValue="#{dp.typeId}" />
				</h:selectOneMenu>

				<h:commandButton value="Kaydet" action="#{customerAction.insert}"></h:commandButton>
				<h:outputLabel></h:outputLabel>

				<h:messages />

			</h:panelGrid>
		</h:form>

	</f:view>
</body>
</html>