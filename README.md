# Car sharing
This is a simple app 
that representation the **Car Sharing**.

![img](carsharing.jpg)

The application has such functions as: 
- Register or login as a ``Driver``.
- View information 
about ``Drivers``, ``Cars``, 
``Cars Manufacturers``, which ``Car`` 
  is registered to 
  the ``Driver``.
- Add new ``Drivers``, ``Cars`` and 
``Manufacturers``.
- Register ``Driver`` in different ``Cars``.
- Remove information from the database. 

## Technologies used:
- Java
- JDBC
- Servlets
- MySql
- Tomcat
- JSP
- HTML
- CSS
- Apache Maven
- JSTL

## Setup
1. Configure ``Apache Tomcat``.
2. Install ``MySQL`` and ``MySQL Workbench``.
3. Create a schema and all the necessary tables by using the script from ***resources/init_db.sql*** in ``MySQL Workbench``.
4. In the ***taxi/util/ConnectionUtil.java*** class change the ``"USER", "PASSWORD", "URL", "JDBC_DRIVER"`` properties to 
   the ones you specified when installing ``MySQL``. 
5. Start the application
