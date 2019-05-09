# Spring Boot Git Demo
## update: 2019/05/09
### import gradle project from [spring starter](https://start.spring.io/)
    * import web dependence
### change port
1. application.properties
    ```
    server.port = 8080
    ```
2. java jvm parameter
   ``` 
   java -Dserver.port = 8080 
   ```
3. command line argument
    ```
    --server.port = 8080
    ```
 
### enable tomcat web support
1. add dependencies (from starter to start-web)
    ```
    implementation 'org.springframework.boot:spring-boot-starter-web'
    ```
2. add SLF4J Logger
    ```
    private static final Logger LOGGER = LoggerFactory.getLogger(.class);
    LOGGER.info("console");
    ```
3. add GET and POST Method
    ```
    @RequestMapping(value = "/", method = RequestMethod.GET)
    @RequestMapping(value = "/", method = RequestMethod.POST)
    ```