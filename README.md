<html>
<head>
<h1>
Soap Based Database Manipulation
<h1>
</head>
<body>
<h2>Welcome!</h2>
<div>This is my first attempt at SOA based java program. This program manipulates databases depending upon the client/admin request. To obtain a wsdl go to <a href="http://datamanipulation-rohatgisanat.rhcloud.com/MIS/AdminSide">Admin and Client WSDL </a>. Go ahead and create your own client app to manipulate data.SOA ensures interorperability that mean sthat client app can be language independant.yay! 
</div>
<div>
<h3>Admin Side Operations</h3>
<ul>
<li><h4>The program allows the admin side client to <b>add</b> tuple from the database.</h4>
The names are sorted into 4 tables depending on the first letter of the first name of the name stored into the database.This allows easier and faster searches for the client access.
</li>
<li><h4>The program allows the admin side client to <b>remove</b> tuple from the database.</h4></li>
</ul>
</div>
<div>
<h3>Client Side Operations</h3>
The program allows the client side client to:<ul>
<li><h4> Count the no. of people with the name given in the database</h4> The program seraches only a single table depending upon the first letter of the first name being searched </li>
<li><h4>Count the total no. of entries in the database</h4></li>
</ul>
</div>
<h3>Deployment:</h3>
To deploy the program on server startup. Download the  .war file in the dist folder and place it in your tomcat/webapps folder.

<h3>Database:</h3>
The program stores the name and the ages of people in a database.The database has four tables within it. The program sorts the names according to its first letter and stores it in the specific table.
The program uses JDBC to manipulate database.
<div>
<h3>Points to remember:</h3>
<ul>
<li>Uses tomcat server for deployment.</li>
<li>The uploaded code has already been uploaded at Openshift Cloud and therefore uses few of the system environment variables provided by them. Replace them with your own variables when working with your local copy.</li>
<li>When working on your own copy,database would have to be created externally.A copy of the database is uploaded.</li>
<li><h6>This is a netbeans project download the repository and import it into netbeans to work on it.  </h6></li>
<li> The code  for ADMIN/Client has also been uploaded under the folder<a href="https://github.com/sanatrohatgi/Cloud-Soap/tree/master/Client_Admin%20codes"> Client_Admin codes</a>. These are not required to run the server side services. as the WSDL will do that providing language independance.<a href="https://github.com/sanatrohatgi/Cloud-Soap/tree/master/Client_Admin%20codes/Client%20side%20code"> Client side code</a> and <a href="https://github.com/sanatrohatgi/Cloud-Soap/tree/master/Client_Admin%20codes/Admin%20side%20code"> Admin side code</a> are both seperate independant netbeans Java projects and should be treated as such.  </li>
</ul>
</div> 
</body>
</html>
