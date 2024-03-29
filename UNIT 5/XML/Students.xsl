<?xml version = "1.0" encoding = "UTF-8"?>
<xsl:stylesheet xmlns:xsl = "http://www.w3.org/1999/XSL/Transform" version = "1.0">   
	<xsl:template match = "/"> 
      		<html> 
         		<body> 
            			<h2>Students</h2> 
				
            			<table border = "1"> 
               				<tr bgcolor="yellow"> 
                  					<th>Roll No</th> 
                  					<th>First Name</th> 
                  					<th>Last Name</th> 
                  		         	<th>Marks</th> 
               				</tr> 
				
            				<xsl:for-each select="class/student"> 
                  				<tr> 
                     					<td><xsl:value-of select = "@rollno"/></td> 
									<td><xsl:value-of select = "firstname"/></td> 
                     					<td><xsl:value-of select = "lastname"/></td> 
                                       <td><xsl:value-of select = "marks"/></td> 
			             		</tr> 
               			</xsl:for-each> 
					
            			</table> 
         		</body> 
      		</html> 
   </xsl:template>  
</xsl:stylesheet>