**Working with Spring** - 
  Open Eclipse IDE
  1. File->New-> New project -> Name the project and package and click on the finish.
  2. File->New->Class - > Class name -> click on the finish
  3. File - > New -> package -> Name the package -> click on the finish.
  4. File -> New -> File -> Name the xml file "applicationContext.xml" -> click on the finish.
  5. 5. Start with first Java class.

**Spring Container** -> 
  It is the heart of the Spring.  
  To build Spring container we need a POJO class.
  It is used to make an object of defined class.
  To access the object we need Application Context(New) or BeanFactory(Old).+
  Application Context is an interface.
  Application Context need various JAR file to access the objects.

**Required JAR files -**
  1. spring-aop
  2. spring-beans
  3. spring-context
  4. commons-logging
  5. spring-core
  6. spring-expression
  
   
**Dependencies Injection -**
1. Dependency Injection is a design pattern used in the Spring Framework to achieve Inversion of Control(IoC)
2. Its main task is to inject the dependencies, means injeting one object (a dependency) into another object
3. We can achieve Dependency Inject by 2 ways ->
     1. Setter Method DI
     2. Constructor DI

**We can't make object of an interface.**
