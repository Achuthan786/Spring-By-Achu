<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
  
        <h1>Edit Customer</h1>  
       <form:form method="POST" action="/99acres/afterEditIwillTakeCare">    
        <table >    
        <tr>  
        <td></td>    
         <td><form:hidden  path="customerId" /></td>  
         </tr>   
         <tr>    
          <td>CustomerName : </td>   
          <td><form:input path="customerName"  /></td>  
         </tr>    
         <tr>    
          <td>Customer Area :</td>    
          <td><form:input path="customerArea" /></td>  
         </tr>   
         <tr>    
          <td>Customer Phone No :</td>    
          <td><form:input path="customerContactNo" /></td>  
         </tr>   
           
         <tr>    
          <td> </td>    
          <td><input type="submit" value="Edit Save" /></td>    
         </tr>    
        </table>    
       </form:form>    