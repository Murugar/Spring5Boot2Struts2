<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
    <title>Spring Boot 2.5.4 Struts 2.3.32 Demo</title>
    <style>
        body{
            font-family: verdana;
        }

        table {
            width: 500px;

        }

        table, th, td {
            border: 1px solid black;
            padding: 2px;
        }
        
        h1{
           
            color : blue;
        }

        th{
            background-color: #00439A;
            color : white;
        }

        tr.odd{
            background-color: green;
            color : white;
        }

        tr.even{
            background-color: blue;
            color : yellow;
        }
    </style>
</head>
<body>
<h1>Spring Boot 2.5.4 Struts 2.3.32</h1>
<h3>User Information</h3>
<table>
    <tr>
        <th>ID</th>
        <th>First Name</th>
        <th>Last Name</th>
        <th>Age</th>
        <th>Gender</th>
        <th>Salary</th>
    </tr>
    <s:iterator value="users">
        <tr class="<s:if test="id%2==0">even</s:if><s:else>odd</s:else>">
            <td align="center"><s:property value="id"/></td>
            <td><s:property value="firstName"/></td>
            <td><s:property value="lastName"/></td>
            <td align="center"><s:property value="age"/></td>
            <td><s:if test="gender.equals(\"M\")">Male</s:if><s:else>Female</s:else></td>
            <td><s:property value="salary"/></td>
        </tr>
    </s:iterator>
</table>
</body>
</html>