<%@ taglib  prefix="form" uri="http://www.springframework.org/tags/form"%>

<body>
    Hello this is person ${controllerMessage}

        <br>${checkListValues}
    <form:form>

           <%-- <form:checkboxes path="checkListValues" items="${checkListValuesList}"/>
           --%>
    </form:form>
</body>




