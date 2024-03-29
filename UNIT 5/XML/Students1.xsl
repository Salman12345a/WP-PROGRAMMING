<?xml version = "1.0" encoding = "UTF-8"?> 
<xsl:stylesheet xmlns:xsl = "http://www.w3.org/1999/XSL/Transform" version = "1.0" >   

	<xsl:template match = "/"> 
      		<html> 
         		<body> 
            			<h2>Students</h2> 
            			<xsl:apply-templates select = "class/student" /> 
         		</body> 
      		</html> 
   	</xsl:template>  

   	<xsl:template match = "class/student"> 
      		<xsl:apply-templates select = "@rollno" /> 
      		<xsl:apply-templates select = "firstname" /> 
      		<xsl:apply-templates select = "lastname" /> 
            <xsl:apply-templates select = "marks" /> 
      	<br /> 
   	</xsl:template>  

   	<xsl:template match = "@rollno"> 
      		<span style = "font-size : 25px;"> 
         		<xsl:value-of select = "." /> 
      		</span> 
      	<br /> 
   	</xsl:template>  

   	<xsl:template match = "firstname"> 
      		First Name:<span style = "color:blue;"> 
         		<xsl:value-of select = "." /> 
      		</span> 
      	<br /> 
   	</xsl:template>  

   	<xsl:template match = "lastname"> 
      		Last Name:<span style = "color:green;"> 
         		<xsl:value-of select = "." /> 
      		</span> 
      	<br /> 
   	</xsl:template>  

     	<xsl:template match = "marks"> 
      		Marks:<span style = "color:red;"> 
         		<xsl:value-of select = "." /> 
      		</span> 
      	<br /> 
   	</xsl:template>  
	
</xsl:stylesheet>