"C:\Program Files\Eclipse Adoptium\jdk-21.0.5.11-hotspot\bin\java.exe" -Dmaven.multiModuleProjectDirectory=C:\Users\xfran\Desktop\2TDSPV\Entrega-CheckPoint\JAVA-CP4-CALMARKET\calmarket -Djansi.passthrough=true -Dmaven.home=C:\Users\xfran\.m2\wrapper\dists\apache-maven-3.9.11-bin\6mqf5t809d9geo83kj4ttckcbc\apache-maven-3.9.11 -Dclassworlds.conf=C:\Users\xfran\.m2\wrapper\dists\apache-maven-3.9.11-bin\6mqf5t809d9geo83kj4ttckcbc\apache-maven-3.9.11\bin\m2.conf "-Dmaven.ext.class.path=C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.3.3\plugins\maven\lib\maven-event-listener.jar" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.3.3\lib\idea_rt.jar=53710" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath C:\Users\xfran\.m2\wrapper\dists\apache-maven-3.9.11-bin\6mqf5t809d9geo83kj4ttckcbc\apache-maven-3.9.11\boot\plexus-classworlds-2.9.0.jar;C:\Users\xfran\.m2\wrapper\dists\apache-maven-3.9.11-bin\6mqf5t809d9geo83kj4ttckcbc\apache-maven-3.9.11\boot\plexus-classworlds.license org.codehaus.classworlds.Launcher -Didea.version=2024.3.5 spring-boot:run -Dspring-boot.run.arguments=--debug
[INFO] Scanning for projects...
[INFO] 
[INFO] -----------------------< br.com.fiap:calmarket >------------------------
[INFO] Building calmarket 0.0.1-SNAPSHOT
[INFO]   from pom.xml
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] >>> spring-boot:3.5.4:run (default-cli) > test-compile @ calmarket >>>
[INFO] 
[INFO] --- resources:3.3.1:resources (default-resources) @ calmarket ---
[INFO] Copying 1 resource from src\main\resources to target\classes
[INFO] Copying 0 resource from src\main\resources to target\classes
[INFO] 
[INFO] --- compiler:3.14.0:compile (default-compile) @ calmarket ---
[INFO] Nothing to compile - all classes are up to date.
[INFO] 
[INFO] --- resources:3.3.1:testResources (default-testResources) @ calmarket ---
[INFO] skip non existing resourceDirectory C:\Users\xfran\Desktop\2TDSPV\Entrega-CheckPoint\JAVA-CP4-CALMARKET\calmarket\src\test\resources
[INFO] 
[INFO] --- compiler:3.14.0:testCompile (default-testCompile) @ calmarket ---
[INFO] Nothing to compile - all classes are up to date.
[INFO] 
[INFO] <<< spring-boot:3.5.4:run (default-cli) < test-compile @ calmarket <<<
[INFO] 
[INFO] 
[INFO] --- spring-boot:3.5.4:run (default-cli) @ calmarket ---
[INFO] Attaching agents: []

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/

 :: Spring Boot ::                (v3.5.4)

2025-08-10T02:30:11.905-03:00  INFO 22184 --- [calmarket] [  restartedMain] b.c.fiap.calmarket.CalmarketApplication  : Starting CalmarketApplication using Java 21.0.5 with PID 22184 (C:\Users\xfran\Desktop\2TDSPV\Entrega-CheckPoint\JAVA-CP4-CALMARKET\calmarket\target\classes started by xfran in C:\Users\xfran\Desktop\2TDSPV\Entrega-CheckPoint\JAVA-CP4-CALMARKET\calmarket)
2025-08-10T02:30:11.907-03:00  INFO 22184 --- [calmarket] [  restartedMain] b.c.fiap.calmarket.CalmarketApplication  : No active profile set, falling back to 1 default profile: "default"
2025-08-10T02:30:11.908-03:00 DEBUG 22184 --- [calmarket] [  restartedMain] o.s.boot.SpringApplication               : Loading source class br.com.fiap.calmarket.CalmarketApplication
2025-08-10T02:30:11.937-03:00 DEBUG 22184 --- [calmarket] [  restartedMain] o.s.b.devtools.restart.ChangeableUrls    : Matching URLs for reloading : [file:/C:/Users/xfran/Desktop/2TDSPV/Entrega-CheckPoint/JAVA-CP4-CALMARKET/calmarket/target/classes/]
2025-08-10T02:30:11.937-03:00 DEBUG 22184 --- [calmarket] [  restartedMain] o.s.b.d.settings.DevToolsSettings        : Included patterns for restart : []
2025-08-10T02:30:11.937-03:00 DEBUG 22184 --- [calmarket] [  restartedMain] o.s.b.d.settings.DevToolsSettings        : Excluded patterns for restart : [/spring-boot-starter-[\w-]+/, /spring-boot/(bin|build|out)/, /spring-boot-starter/(bin|build|out)/, /spring-boot-devtools/(bin|build|out)/, /spring-boot-actuator/(bin|build|out)/, /spring-boot-autoconfigure/(bin|build|out)/]
2025-08-10T02:30:11.937-03:00  INFO 22184 --- [calmarket] [  restartedMain] .e.DevToolsPropertyDefaultsPostProcessor : Devtools property defaults active! Set 'spring.devtools.add-properties' to 'false' to disable
2025-08-10T02:30:11.937-03:00  INFO 22184 --- [calmarket] [  restartedMain] .e.DevToolsPropertyDefaultsPostProcessor : For additional web related logging consider setting the 'logging.level.web' property to 'DEBUG'
2025-08-10T02:30:11.937-03:00 DEBUG 22184 --- [calmarket] [  restartedMain] ConfigServletWebServerApplicationContext : Refreshing org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext@66ad6755
2025-08-10T02:30:12.442-03:00  INFO 22184 --- [calmarket] [  restartedMain] .s.d.r.c.RepositoryConfigurationDelegate : Bootstrapping Spring Data JPA repositories in DEFAULT mode.
2025-08-10T02:30:12.452-03:00 DEBUG 22184 --- [calmarket] [  restartedMain] o.s.b.a.AutoConfigurationPackages        : @EnableAutoConfiguration was declared on a class in the package 'br.com.fiap.calmarket'. Automatic @Repository and @Entity scanning is enabled.
2025-08-10T02:30:12.455-03:00  INFO 22184 --- [calmarket] [  restartedMain] .s.d.r.c.RepositoryConfigurationDelegate : Finished Spring Data repository scanning in 8 ms. Found 0 JPA repository interfaces.
2025-08-10T02:30:12.718-03:00 DEBUG 22184 --- [calmarket] [  restartedMain] .s.b.w.e.t.TomcatServletWebServerFactory : Code archive: C:\Users\xfran\.m2\repository\org\springframework\boot\spring-boot\3.5.4\spring-boot-3.5.4.jar
2025-08-10T02:30:12.718-03:00 DEBUG 22184 --- [calmarket] [  restartedMain] .s.b.w.e.t.TomcatServletWebServerFactory : Code archive: C:\Users\xfran\.m2\repository\org\springframework\boot\spring-boot\3.5.4\spring-boot-3.5.4.jar
2025-08-10T02:30:12.718-03:00 DEBUG 22184 --- [calmarket] [  restartedMain] .s.b.w.e.t.TomcatServletWebServerFactory : None of the document roots [src/main/webapp, public, static] point to a directory and will be ignored.
2025-08-10T02:30:12.744-03:00  INFO 22184 --- [calmarket] [  restartedMain] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port 8080 (http)
2025-08-10T02:30:12.753-03:00  INFO 22184 --- [calmarket] [  restartedMain] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
2025-08-10T02:30:12.754-03:00  INFO 22184 --- [calmarket] [  restartedMain] o.apache.catalina.core.StandardEngine    : Starting Servlet engine: [Apache Tomcat/10.1.43]
2025-08-10T02:30:12.779-03:00  INFO 22184 --- [calmarket] [  restartedMain] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
2025-08-10T02:30:12.779-03:00 DEBUG 22184 --- [calmarket] [  restartedMain] w.s.c.ServletWebServerApplicationContext : Published root WebApplicationContext as ServletContext attribute with name [org.springframework.web.context.WebApplicationContext.ROOT]
2025-08-10T02:30:12.780-03:00  INFO 22184 --- [calmarket] [  restartedMain] w.s.c.ServletWebServerApplicationContext : Root WebApplicationContext: initialization completed in 842 ms
2025-08-10T02:30:12.794-03:00 DEBUG 22184 --- [calmarket] [  restartedMain] o.s.b.w.s.ServletContextInitializerBeans : Mapping filters: characterEncodingFilter urls=[/*] order=-2147483648, formContentFilter urls=[/*] order=-9900, requestContextFilter urls=[/*] order=-105
2025-08-10T02:30:12.794-03:00 DEBUG 22184 --- [calmarket] [  restartedMain] o.s.b.w.s.ServletContextInitializerBeans : Mapping servlets: dispatcherServlet urls=[/]
2025-08-10T02:30:12.806-03:00 DEBUG 22184 --- [calmarket] [  restartedMain] o.s.b.w.s.f.OrderedRequestContextFilter  : Filter 'requestContextFilter' configured for use
2025-08-10T02:30:12.807-03:00 DEBUG 22184 --- [calmarket] [  restartedMain] s.b.w.s.f.OrderedCharacterEncodingFilter : Filter 'characterEncodingFilter' configured for use
2025-08-10T02:30:12.807-03:00 DEBUG 22184 --- [calmarket] [  restartedMain] o.s.b.w.s.f.OrderedFormContentFilter     : Filter 'formContentFilter' configured for use
2025-08-10T02:30:12.869-03:00  INFO 22184 --- [calmarket] [  restartedMain] o.hibernate.jpa.internal.util.LogHelper  : HHH000204: Processing PersistenceUnitInfo [name: default]
2025-08-10T02:30:12.896-03:00  INFO 22184 --- [calmarket] [  restartedMain] org.hibernate.Version                    : HHH000412: Hibernate ORM core version 6.6.22.Final
2025-08-10T02:30:12.912-03:00  INFO 22184 --- [calmarket] [  restartedMain] o.h.c.internal.RegionFactoryInitiator    : HHH000026: Second-level cache disabled
2025-08-10T02:30:13.072-03:00  INFO 22184 --- [calmarket] [  restartedMain] o.s.o.j.p.SpringPersistenceUnitInfo      : No LoadTimeWeaver setup: ignoring JPA class transformer
2025-08-10T02:30:13.088-03:00  INFO 22184 --- [calmarket] [  restartedMain] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Starting...
2025-08-10T02:30:13.292-03:00  INFO 22184 --- [calmarket] [  restartedMain] com.zaxxer.hikari.pool.HikariPool        : HikariPool-1 - Added connection com.mysql.cj.jdbc.ConnectionImpl@4da0de36
2025-08-10T02:30:13.293-03:00  INFO 22184 --- [calmarket] [  restartedMain] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Start completed.
2025-08-10T02:30:13.319-03:00  WARN 22184 --- [calmarket] [  restartedMain] org.hibernate.orm.deprecation            : HHH90000025: MySQL8Dialect does not need to be specified explicitly using 'hibernate.dialect' (remove the property setting and it will be selected by default)
2025-08-10T02:30:13.321-03:00  WARN 22184 --- [calmarket] [  restartedMain] org.hibernate.orm.deprecation            : HHH90000026: MySQL8Dialect has been deprecated; use org.hibernate.dialect.MySQLDialect instead
2025-08-10T02:30:13.329-03:00  INFO 22184 --- [calmarket] [  restartedMain] org.hibernate.orm.connections.pooling    : HHH10001005: Database info:
	Database JDBC URL [Connecting through datasource 'HikariDataSource (HikariPool-1)']
	Database driver: undefined/unknown
	Database version: 8.0
	Autocommit mode: undefined/unknown
	Isolation level: undefined/unknown
	Minimum pool size: undefined/unknown
	Maximum pool size: undefined/unknown
2025-08-10T02:30:13.811-03:00  INFO 22184 --- [calmarket] [  restartedMain] o.h.e.t.j.p.i.JtaPlatformInitiator       : HHH000489: No JTA platform available (set 'hibernate.transaction.jta.platform' to enable JTA platform integration)
2025-08-10T02:30:13.854-03:00  INFO 22184 --- [calmarket] [  restartedMain] j.LocalContainerEntityManagerFactoryBean : Initialized JPA EntityManagerFactory for persistence unit 'default'
2025-08-10T02:30:14.005-03:00  WARN 22184 --- [calmarket] [  restartedMain] JpaBaseConfiguration$JpaWebConfiguration : spring.jpa.open-in-view is enabled by default. Therefore, database queries may be performed during view rendering. Explicitly configure spring.jpa.open-in-view to disable this warning
2025-08-10T02:30:14.103-03:00 DEBUG 22184 --- [calmarket] [  restartedMain] s.w.s.m.m.a.RequestMappingHandlerMapping : 12 mappings in 'requestMappingHandlerMapping'
2025-08-10T02:30:14.150-03:00 DEBUG 22184 --- [calmarket] [  restartedMain] o.s.w.s.handler.SimpleUrlHandlerMapping  : Patterns [/webjars/**, /**, /swagger-ui*/*swagger-initializer.js, /swagger-ui*/**] in 'resourceHandlerMapping'
2025-08-10T02:30:14.173-03:00 DEBUG 22184 --- [calmarket] [  restartedMain] s.w.s.m.m.a.RequestMappingHandlerAdapter : ControllerAdvice beans: 0 @ModelAttribute, 0 @InitBinder, 1 RequestBodyAdvice, 1 ResponseBodyAdvice
2025-08-10T02:30:14.202-03:00 DEBUG 22184 --- [calmarket] [  restartedMain] .m.m.a.ExceptionHandlerExceptionResolver : ControllerAdvice beans: 1 @ExceptionHandler, 1 ResponseBodyAdvice
2025-08-10T02:30:14.215-03:00  WARN 22184 --- [calmarket] [  restartedMain] ConfigServletWebServerApplicationContext : Exception encountered during context initialization - cancelling refresh attempt: org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'modelConverterRegistrar' defined in class path resource [org/springdoc/core/configuration/SpringDocConfiguration.class]: Unsatisfied dependency expressed through method 'modelConverterRegistrar' parameter 0: Error creating bean with name 'collectionModelContentConverter' defined in class path resource [org/springdoc/core/configuration/SpringDocHateoasConfiguration.class]: Unsatisfied dependency expressed through method 'collectionModelContentConverter' parameter 0: Error creating bean with name 'hateoasHalProvider': Invocation of init method failed
2025-08-10T02:30:14.215-03:00  INFO 22184 --- [calmarket] [  restartedMain] j.LocalContainerEntityManagerFactoryBean : Closing JPA EntityManagerFactory for persistence unit 'default'
2025-08-10T02:30:14.218-03:00  INFO 22184 --- [calmarket] [  restartedMain] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Shutdown initiated...
2025-08-10T02:30:14.226-03:00  INFO 22184 --- [calmarket] [  restartedMain] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Shutdown completed.
2025-08-10T02:30:14.227-03:00  INFO 22184 --- [calmarket] [  restartedMain] o.apache.catalina.core.StandardService   : Stopping service [Tomcat]
2025-08-10T02:30:14.231-03:00 DEBUG 22184 --- [calmarket] [  restartedMain] o.s.boot.devtools.restart.Restarter      : Creating new Restarter for thread Thread[#1,main,5,main]
2025-08-10T02:30:14.231-03:00 DEBUG 22184 --- [calmarket] [  restartedMain] o.s.boot.devtools.restart.Restarter      : Immediately restarting application
2025-08-10T02:30:14.232-03:00 DEBUG 22184 --- [calmarket] [  restartedMain] o.s.boot.devtools.restart.Restarter      : Starting application br.com.fiap.calmarket.CalmarketApplication with URLs [file:/C:/Users/xfran/Desktop/2TDSPV/Entrega-CheckPoint/JAVA-CP4-CALMARKET/calmarket/target/classes/]
2025-08-10T02:30:14.240-03:00 DEBUG 22184 --- [calmarket] [  restartedMain] .s.b.a.l.ConditionEvaluationReportLogger : 


============================
CONDITIONS EVALUATION REPORT
============================


Positive matches:
-----------------

   AopAutoConfiguration matched:
      - @ConditionalOnBooleanProperty (spring.aop.auto=true) matched (OnPropertyCondition)

   AopAutoConfiguration.AspectJAutoProxyingConfiguration matched:
      - @ConditionalOnClass found required class 'org.aspectj.weaver.Advice' (OnClassCondition)

   AopAutoConfiguration.AspectJAutoProxyingConfiguration.CglibAutoProxyConfiguration matched:
      - @ConditionalOnBooleanProperty (spring.aop.proxy-target-class=true) matched (OnPropertyCondition)

   ApplicationAvailabilityAutoConfiguration#applicationAvailability matched:
      - @ConditionalOnMissingBean (types: org.springframework.boot.availability.ApplicationAvailability; SearchStrategy: all) did not find any beans (OnBeanCondition)

   DataSourceAutoConfiguration matched:
      - @ConditionalOnClass found required classes 'javax.sql.DataSource', 'org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType' (OnClassCondition)
      - @ConditionalOnMissingBean (types: ?; SearchStrategy: all) did not find any beans (OnBeanCondition)

   DataSourceAutoConfiguration.PooledDataSourceConfiguration matched:
      - AnyNestedCondition 1 matched 1 did not; NestedCondition on DataSourceAutoConfiguration.PooledDataSourceCondition.PooledDataSourceAvailable PooledDataSource found supported DataSource; NestedCondition on DataSourceAutoConfiguration.PooledDataSourceCondition.ExplicitType @ConditionalOnProperty (spring.datasource.type) did not find property 'spring.datasource.type' (DataSourceAutoConfiguration.PooledDataSourceCondition)
      - @ConditionalOnMissingBean (types: javax.sql.DataSource,javax.sql.XADataSource; SearchStrategy: all) did not find any beans (OnBeanCondition)

   DataSourceAutoConfiguration.PooledDataSourceConfiguration#jdbcConnectionDetails matched:
      - @ConditionalOnMissingBean (types: org.springframework.boot.autoconfigure.jdbc.JdbcConnectionDetails; SearchStrategy: all) did not find any beans (OnBeanCondition)

   DataSourceConfiguration.Hikari matched:
      - @ConditionalOnClass found required class 'com.zaxxer.hikari.HikariDataSource' (OnClassCondition)
      - @ConditionalOnProperty (spring.datasource.type=com.zaxxer.hikari.HikariDataSource) matched (OnPropertyCondition)
      - @ConditionalOnMissingBean (types: javax.sql.DataSource; SearchStrategy: all) did not find any beans (OnBeanCondition)

   DataSourceInitializationConfiguration matched:
      - @ConditionalOnClass found required class 'org.springframework.jdbc.datasource.init.DatabasePopulator' (OnClassCondition)
      - @ConditionalOnSingleCandidate (types: javax.sql.DataSource; SearchStrategy: all) found a single bean 'dataSource'; @ConditionalOnMissingBean (types: org.springframework.boot.autoconfigure.sql.init.SqlDataSourceScriptDatabaseInitializer,org.springframework.boot.autoconfigure.sql.init.SqlR2dbcScriptDatabaseInitializer; SearchStrategy: all) did not find any beans (OnBeanCondition)

   DataSourcePoolMetadataProvidersConfiguration.HikariPoolDataSourceMetadataProviderConfiguration matched:
      - @ConditionalOnClass found required class 'com.zaxxer.hikari.HikariDataSource' (OnClassCondition)

   DataSourceTransactionManagerAutoConfiguration matched:
      - @ConditionalOnClass found required classes 'javax.sql.DataSource', 'org.springframework.jdbc.core.JdbcTemplate', 'org.springframework.transaction.TransactionManager' (OnClassCondition)

   DataSourceTransactionManagerAutoConfiguration.JdbcTransactionManagerConfiguration matched:
      - @ConditionalOnSingleCandidate (types: javax.sql.DataSource; SearchStrategy: all) found a single bean 'dataSource' (OnBeanCondition)

   DevToolsDataSourceAutoConfiguration matched:
      - @ConditionalOnClass found required class 'javax.sql.DataSource' (OnClassCondition)
      - Devtools devtools enabled. (OnEnabledDevToolsCondition)
      - DevTools DataSource Condition found auto-configured DataSource (DevToolsDataSourceAutoConfiguration.DevToolsDataSourceCondition)

   DevToolsDataSourceAutoConfiguration.DatabaseShutdownExecutorEntityManagerFactoryDependsOnPostProcessor matched:
      - @ConditionalOnClass found required class 'org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean' (OnClassCondition)
      - @ConditionalOnBean (types: org.springframework.orm.jpa.AbstractEntityManagerFactoryBean; SearchStrategy: all) found bean '&entityManagerFactory' (OnBeanCondition)

   DispatcherServletAutoConfiguration matched:
      - @ConditionalOnClass found required class 'org.springframework.web.servlet.DispatcherServlet' (OnClassCondition)
      - found 'session' scope (OnWebApplicationCondition)

   DispatcherServletAutoConfiguration.DispatcherServletConfiguration matched:
      - @ConditionalOnClass found required class 'jakarta.servlet.ServletRegistration' (OnClassCondition)
      - Default DispatcherServlet did not find dispatcher servlet beans (DispatcherServletAutoConfiguration.DefaultDispatcherServletCondition)

   DispatcherServletAutoConfiguration.DispatcherServletRegistrationConfiguration matched:
      - @ConditionalOnClass found required class 'jakarta.servlet.ServletRegistration' (OnClassCondition)
      - DispatcherServlet Registration did not find servlet registration bean (DispatcherServletAutoConfiguration.DispatcherServletRegistrationCondition)

   DispatcherServletAutoConfiguration.DispatcherServletRegistrationConfiguration#dispatcherServletRegistration matched:
      - @ConditionalOnBean (names: dispatcherServlet types: org.springframework.web.servlet.DispatcherServlet; SearchStrategy: all) found bean 'dispatcherServlet' (OnBeanCondition)

   EmbeddedWebServerFactoryCustomizerAutoConfiguration matched:
      - @ConditionalOnWebApplication (required) found 'session' scope (OnWebApplicationCondition)
      - @ConditionalOnWarDeployment the application is not deployed as a WAR file. (OnWarDeploymentCondition)

   EmbeddedWebServerFactoryCustomizerAutoConfiguration.TomcatWebServerFactoryCustomizerConfiguration matched:
      - @ConditionalOnClass found required classes 'org.apache.catalina.startup.Tomcat', 'org.apache.coyote.UpgradeProtocol' (OnClassCondition)

   ErrorMvcAutoConfiguration matched:
      - @ConditionalOnClass found required classes 'jakarta.servlet.Servlet', 'org.springframework.web.servlet.DispatcherServlet' (OnClassCondition)
      - found 'session' scope (OnWebApplicationCondition)

   ErrorMvcAutoConfiguration#basicErrorController matched:
      - @ConditionalOnMissingBean (types: org.springframework.boot.web.servlet.error.ErrorController; SearchStrategy: current) did not find any beans (OnBeanCondition)

   ErrorMvcAutoConfiguration#errorAttributes matched:
      - @ConditionalOnMissingBean (types: org.springframework.boot.web.servlet.error.ErrorAttributes; SearchStrategy: current) did not find any beans (OnBeanCondition)

   ErrorMvcAutoConfiguration.DefaultErrorViewResolverConfiguration#conventionErrorViewResolver matched:
      - @ConditionalOnBean (types: org.springframework.web.servlet.DispatcherServlet; SearchStrategy: all) found bean 'dispatcherServlet'; @ConditionalOnMissingBean (types: org.springframework.boot.autoconfigure.web.servlet.error.ErrorViewResolver; SearchStrategy: all) did not find any beans (OnBeanCondition)

   ErrorMvcAutoConfiguration.WhitelabelErrorViewConfiguration matched:
      - @ConditionalOnBooleanProperty (server.error.whitelabel.enabled=true) matched (OnPropertyCondition)
      - ErrorTemplate Missing did not find error template view (ErrorMvcAutoConfiguration.ErrorTemplateMissingCondition)

   ErrorMvcAutoConfiguration.WhitelabelErrorViewConfiguration#beanNameViewResolver matched:
      - @ConditionalOnMissingBean (types: org.springframework.web.servlet.view.BeanNameViewResolver; SearchStrategy: all) did not find any beans (OnBeanCondition)

   ErrorMvcAutoConfiguration.WhitelabelErrorViewConfiguration#defaultErrorView matched:
      - @ConditionalOnMissingBean (names: error; SearchStrategy: all) did not find any beans (OnBeanCondition)

   GenericCacheConfiguration matched:
      - Cache org.springframework.boot.autoconfigure.cache.GenericCacheConfiguration automatic cache type (CacheCondition)

   HibernateJpaAutoConfiguration matched:
      - @ConditionalOnClass found required classes 'org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean', 'jakarta.persistence.EntityManager', 'org.hibernate.engine.spi.SessionImplementor' (OnClassCondition)

   HibernateJpaConfiguration matched:
      - @ConditionalOnSingleCandidate (types: javax.sql.DataSource; SearchStrategy: all) found a single bean 'dataSource' (OnBeanCondition)

   HttpClientAutoConfiguration matched:
      - @ConditionalOnClass found required class 'org.springframework.http.client.ClientHttpRequestFactory' (OnClassCondition)
      - NoneNestedConditions 0 matched 1 did not; NestedCondition on NotReactiveWebApplicationCondition.ReactiveWebApplication did not find reactive web application classes (NotReactiveWebApplicationCondition)

   HttpClientAutoConfiguration#clientHttpRequestFactoryBuilder matched:
      - @ConditionalOnMissingBean (types: org.springframework.boot.http.client.ClientHttpRequestFactoryBuilder<?>; SearchStrategy: all) did not find any beans (OnBeanCondition)

   HttpClientAutoConfiguration#clientHttpRequestFactorySettings matched:
      - @ConditionalOnMissingBean (types: org.springframework.boot.http.client.ClientHttpRequestFactorySettings; SearchStrategy: all) did not find any beans (OnBeanCondition)

   HttpEncodingAutoConfiguration matched:
      - @ConditionalOnClass found required class 'org.springframework.web.filter.CharacterEncodingFilter' (OnClassCondition)
      - found 'session' scope (OnWebApplicationCondition)
      - @ConditionalOnBooleanProperty (server.servlet.encoding.enabled=true) matched (OnPropertyCondition)

   HttpEncodingAutoConfiguration#characterEncodingFilter matched:
      - @ConditionalOnMissingBean (types: org.springframework.web.filter.CharacterEncodingFilter; SearchStrategy: all) did not find any beans (OnBeanCondition)

   HttpMessageConvertersAutoConfiguration matched:
      - @ConditionalOnClass found required class 'org.springframework.http.converter.HttpMessageConverter' (OnClassCondition)
      - NoneNestedConditions 0 matched 1 did not; NestedCondition on HttpMessageConvertersAutoConfiguration.NotReactiveWebApplicationCondition.ReactiveWebApplication did not find reactive web application classes (HttpMessageConvertersAutoConfiguration.NotReactiveWebApplicationCondition)

   HttpMessageConvertersAutoConfiguration#messageConverters matched:
      - @ConditionalOnMissingBean (types: org.springframework.boot.autoconfigure.http.HttpMessageConverters; SearchStrategy: all) did not find any beans (OnBeanCondition)

   HttpMessageConvertersAutoConfiguration.StringHttpMessageConverterConfiguration matched:
      - @ConditionalOnClass found required class 'org.springframework.http.converter.StringHttpMessageConverter' (OnClassCondition)

   HttpMessageConvertersAutoConfiguration.StringHttpMessageConverterConfiguration#stringHttpMessageConverter matched:
      - @ConditionalOnMissingBean (types: org.springframework.http.converter.StringHttpMessageConverter; SearchStrategy: all) did not find any beans (OnBeanCondition)

   HypermediaAutoConfiguration matched:
      - @ConditionalOnClass found required classes 'org.springframework.hateoas.EntityModel', 'org.springframework.web.bind.annotation.RequestMapping', 'org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter', 'org.springframework.plugin.core.Plugin' (OnClassCondition)
      - @ConditionalOnWebApplication (required) found 'session' scope (OnWebApplicationCondition)

   HypermediaAutoConfiguration#applicationJsonHalConfiguration matched:
      - @ConditionalOnClass found required class 'com.fasterxml.jackson.databind.ObjectMapper' (OnClassCondition)
      - @ConditionalOnBooleanProperty (spring.hateoas.use-hal-as-default-json-media-type=true) matched (OnPropertyCondition)
      - @ConditionalOnMissingBean (types: org.springframework.hateoas.mediatype.hal.HalConfiguration; SearchStrategy: all) did not find any beans (OnBeanCondition)

   HypermediaAutoConfiguration.HypermediaConfiguration matched:
      - @ConditionalOnClass found required class 'com.fasterxml.jackson.databind.ObjectMapper' (OnClassCondition)
      - @ConditionalOnMissingBean (types: org.springframework.hateoas.client.LinkDiscoverers; SearchStrategy: all) did not find any beans (OnBeanCondition)

   JacksonAutoConfiguration matched:
      - @ConditionalOnClass found required class 'com.fasterxml.jackson.databind.ObjectMapper' (OnClassCondition)

   JacksonAutoConfiguration.Jackson2ObjectMapperBuilderCustomizerConfiguration matched:
      - @ConditionalOnClass found required class 'org.springframework.http.converter.json.Jackson2ObjectMapperBuilder' (OnClassCondition)

   JacksonAutoConfiguration.JacksonObjectMapperBuilderConfiguration matched:
      - @ConditionalOnClass found required class 'org.springframework.http.converter.json.Jackson2ObjectMapperBuilder' (OnClassCondition)

   JacksonAutoConfiguration.JacksonObjectMapperBuilderConfiguration#jacksonObjectMapperBuilder matched:
      - @ConditionalOnMissingBean (types: org.springframework.http.converter.json.Jackson2ObjectMapperBuilder; SearchStrategy: all) did not find any beans (OnBeanCondition)

   JacksonAutoConfiguration.JacksonObjectMapperConfiguration matched:
      - @ConditionalOnClass found required class 'org.springframework.http.converter.json.Jackson2ObjectMapperBuilder' (OnClassCondition)

   JacksonAutoConfiguration.JacksonObjectMapperConfiguration#jacksonObjectMapper matched:
      - @ConditionalOnMissingBean (types: com.fasterxml.jackson.databind.ObjectMapper; SearchStrategy: all) did not find any beans (OnBeanCondition)

   JacksonAutoConfiguration.ParameterNamesModuleConfiguration matched:
      - @ConditionalOnClass found required class 'com.fasterxml.jackson.module.paramnames.ParameterNamesModule' (OnClassCondition)

   JacksonAutoConfiguration.ParameterNamesModuleConfiguration#parameterNamesModule matched:
      - @ConditionalOnMissingBean (types: com.fasterxml.jackson.module.paramnames.ParameterNamesModule; SearchStrategy: all) did not find any beans (OnBeanCondition)

   JacksonHttpMessageConvertersConfiguration.MappingJackson2HttpMessageConverterConfiguration matched:
      - @ConditionalOnClass found required class 'com.fasterxml.jackson.databind.ObjectMapper' (OnClassCondition)
      - @ConditionalOnPreferredJsonMapper JACKSON no property was configured and Jackson is the default (OnPreferredJsonMapperCondition)
      - @ConditionalOnBean (types: com.fasterxml.jackson.databind.ObjectMapper; SearchStrategy: all) found bean 'jacksonObjectMapper' (OnBeanCondition)

   JacksonHttpMessageConvertersConfiguration.MappingJackson2HttpMessageConverterConfiguration#mappingJackson2HttpMessageConverter matched:
      - @ConditionalOnMissingBean (types: org.springframework.http.converter.json.MappingJackson2HttpMessageConverter ignored: org.springframework.hateoas.server.mvc.TypeConstrainedMappingJackson2HttpMessageConverter,?; SearchStrategy: all) did not find any beans (OnBeanCondition)

   JdbcClientAutoConfiguration matched:
      - @ConditionalOnSingleCandidate (types: org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate; SearchStrategy: all) found a single bean 'namedParameterJdbcTemplate'; @ConditionalOnMissingBean (types: org.springframework.jdbc.core.simple.JdbcClient; SearchStrategy: all) did not find any beans (OnBeanCondition)

   JdbcTemplateAutoConfiguration matched:
      - @ConditionalOnClass found required classes 'javax.sql.DataSource', 'org.springframework.jdbc.core.JdbcTemplate' (OnClassCondition)
      - @ConditionalOnSingleCandidate (types: javax.sql.DataSource; SearchStrategy: all) found a single bean 'dataSource' (OnBeanCondition)

   JdbcTemplateConfiguration matched:
      - @ConditionalOnMissingBean (types: org.springframework.jdbc.core.JdbcOperations; SearchStrategy: all) did not find any beans (OnBeanCondition)

   JpaBaseConfiguration#entityManagerFactory matched:
      - @ConditionalOnMissingBean (types: org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean,jakarta.persistence.EntityManagerFactory; SearchStrategy: all) did not find any beans (OnBeanCondition)

   JpaBaseConfiguration#entityManagerFactoryBuilder matched:
      - @ConditionalOnMissingBean (types: org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder; SearchStrategy: all) did not find any beans (OnBeanCondition)

   JpaBaseConfiguration#jpaVendorAdapter matched:
      - @ConditionalOnMissingBean (types: org.springframework.orm.jpa.JpaVendorAdapter; SearchStrategy: all) did not find any beans (OnBeanCondition)

   JpaBaseConfiguration#transactionManager matched:
      - @ConditionalOnMissingBean (types: org.springframework.transaction.TransactionManager; SearchStrategy: all) did not find any beans (OnBeanCondition)

   JpaBaseConfiguration.JpaWebConfiguration matched:
      - @ConditionalOnClass found required class 'org.springframework.web.servlet.config.annotation.WebMvcConfigurer' (OnClassCondition)
      - found 'session' scope (OnWebApplicationCondition)
      - @ConditionalOnBooleanProperty (spring.jpa.open-in-view=true) matched (OnPropertyCondition)
      - @ConditionalOnMissingBean (types: org.springframework.orm.jpa.support.OpenEntityManagerInViewInterceptor,org.springframework.orm.jpa.support.OpenEntityManagerInViewFilter; SearchStrategy: all) did not find any beans (OnBeanCondition)

   JpaBaseConfiguration.PersistenceManagedTypesConfiguration matched:
      - @ConditionalOnMissingBean (types: org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean,jakarta.persistence.EntityManagerFactory; SearchStrategy: all) did not find any beans (OnBeanCondition)

   JpaBaseConfiguration.PersistenceManagedTypesConfiguration#persistenceManagedTypes matched:
      - @ConditionalOnMissingBean (types: org.springframework.orm.jpa.persistenceunit.PersistenceManagedTypes; SearchStrategy: all) did not find any beans (OnBeanCondition)

   JpaRepositoriesAutoConfiguration matched:
      - @ConditionalOnClass found required class 'org.springframework.data.jpa.repository.JpaRepository' (OnClassCondition)
      - @ConditionalOnBooleanProperty (spring.data.jpa.repositories.enabled=true) matched (OnPropertyCondition)
      - @ConditionalOnBean (types: javax.sql.DataSource; SearchStrategy: all) found bean 'dataSource'; @ConditionalOnMissingBean (types: org.springframework.data.jpa.repository.support.JpaRepositoryFactoryBean,org.springframework.data.jpa.repository.config.JpaRepositoryConfigExtension; SearchStrategy: all) did not find any beans (OnBeanCondition)

   JtaAutoConfiguration matched:
      - @ConditionalOnClass found required class 'jakarta.transaction.Transaction' (OnClassCondition)
      - @ConditionalOnBooleanProperty (spring.jta.enabled=true) matched (OnPropertyCondition)

   LifecycleAutoConfiguration#defaultLifecycleProcessor matched:
      - @ConditionalOnMissingBean (names: lifecycleProcessor; SearchStrategy: current) did not find any beans (OnBeanCondition)

   LocalDevToolsAutoConfiguration matched:
      - Initialized Restarter Condition available and initialized (OnInitializedRestarterCondition)

   LocalDevToolsAutoConfiguration.LiveReloadConfiguration matched:
      - @ConditionalOnBooleanProperty (spring.devtools.livereload.enabled=true) matched (OnPropertyCondition)

   LocalDevToolsAutoConfiguration.LiveReloadConfiguration#liveReloadServer matched:
      - @ConditionalOnMissingBean (types: org.springframework.boot.devtools.livereload.LiveReloadServer; SearchStrategy: all) did not find any beans (OnBeanCondition)

   LocalDevToolsAutoConfiguration.RestartConfiguration matched:
      - @ConditionalOnBooleanProperty (spring.devtools.restart.enabled=true) matched (OnPropertyCondition)

   LocalDevToolsAutoConfiguration.RestartConfiguration#classPathFileSystemWatcher matched:
      - @ConditionalOnMissingBean (types: org.springframework.boot.devtools.classpath.ClassPathFileSystemWatcher; SearchStrategy: all) did not find any beans (OnBeanCondition)

   LocalDevToolsAutoConfiguration.RestartConfiguration#classPathRestartStrategy matched:
      - @ConditionalOnMissingBean (types: org.springframework.boot.devtools.classpath.ClassPathRestartStrategy; SearchStrategy: all) did not find any beans (OnBeanCondition)

   LocalDevToolsAutoConfiguration.RestartConfiguration#conditionEvaluationDeltaLoggingListener matched:
      - @ConditionalOnBooleanProperty (spring.devtools.restart.log-condition-evaluation-delta=true) matched (OnPropertyCondition)

   MultipartAutoConfiguration matched:
      - @ConditionalOnClass found required classes 'jakarta.servlet.Servlet', 'org.springframework.web.multipart.support.StandardServletMultipartResolver', 'jakarta.servlet.MultipartConfigElement' (OnClassCondition)
      - found 'session' scope (OnWebApplicationCondition)
      - @ConditionalOnBooleanProperty (spring.servlet.multipart.enabled=true) matched (OnPropertyCondition)

   MultipartAutoConfiguration#multipartConfigElement matched:
      - @ConditionalOnMissingBean (types: jakarta.servlet.MultipartConfigElement; SearchStrategy: all) did not find any beans (OnBeanCondition)

   MultipartAutoConfiguration#multipartResolver matched:
      - @ConditionalOnMissingBean (types: org.springframework.web.multipart.MultipartResolver; SearchStrategy: all) did not find any beans (OnBeanCondition)

   NamedParameterJdbcTemplateConfiguration matched:
      - @ConditionalOnSingleCandidate (types: org.springframework.jdbc.core.JdbcTemplate; SearchStrategy: all) found a single bean 'jdbcTemplate'; @ConditionalOnMissingBean (types: org.springframework.jdbc.core.namedparam.NamedParameterJdbcOperations; SearchStrategy: all) did not find any beans (OnBeanCondition)

   NoOpCacheConfiguration matched:
      - Cache org.springframework.boot.autoconfigure.cache.NoOpCacheConfiguration automatic cache type (CacheCondition)

   PersistenceExceptionTranslationAutoConfiguration matched:
      - @ConditionalOnClass found required class 'org.springframework.dao.annotation.PersistenceExceptionTranslationPostProcessor' (OnClassCondition)

   PersistenceExceptionTranslationAutoConfiguration#persistenceExceptionTranslationPostProcessor matched:
      - @ConditionalOnBooleanProperty (spring.dao.exceptiontranslation.enabled=true) matched (OnPropertyCondition)
      - @ConditionalOnMissingBean (types: org.springframework.dao.annotation.PersistenceExceptionTranslationPostProcessor; SearchStrategy: all) did not find any beans (OnBeanCondition)

   PropertyPlaceholderAutoConfiguration#propertySourcesPlaceholderConfigurer matched:
      - @ConditionalOnMissingBean (types: org.springframework.context.support.PropertySourcesPlaceholderConfigurer; SearchStrategy: current) did not find any beans (OnBeanCondition)

   RestClientAutoConfiguration matched:
      - @ConditionalOnClass found required class 'org.springframework.web.client.RestClient' (OnClassCondition)
      - AnyNestedCondition 1 matched 1 did not; NestedCondition on NotReactiveWebApplicationOrVirtualThreadsExecutorEnabledCondition.VirtualThreadsExecutorEnabled found non-matching nested conditions @ConditionalOnThreading did not find VIRTUAL; NestedCondition on NotReactiveWebApplicationOrVirtualThreadsExecutorEnabledCondition.NotReactiveWebApplication NoneNestedConditions 0 matched 1 did not; NestedCondition on NotReactiveWebApplicationCondition.ReactiveWebApplication did not find reactive web application classes (NotReactiveWebApplicationOrVirtualThreadsExecutorEnabledCondition)

   RestClientAutoConfiguration#httpMessageConvertersRestClientCustomizer matched:
      - @ConditionalOnMissingBean (types: org.springframework.boot.autoconfigure.web.client.HttpMessageConvertersRestClientCustomizer; SearchStrategy: all) did not find any beans (OnBeanCondition)

   RestClientAutoConfiguration#restClientBuilder matched:
      - @ConditionalOnMissingBean (types: org.springframework.web.client.RestClient$Builder; SearchStrategy: all) did not find any beans (OnBeanCondition)

   RestClientAutoConfiguration#restClientBuilderConfigurer matched:
      - @ConditionalOnMissingBean (types: org.springframework.boot.autoconfigure.web.client.RestClientBuilderConfigurer; SearchStrategy: all) did not find any beans (OnBeanCondition)

   RestClientAutoConfiguration#restClientSsl matched:
      - @ConditionalOnBean (types: org.springframework.boot.ssl.SslBundles; SearchStrategy: all) found bean 'sslBundleRegistry'; @ConditionalOnMissingBean (types: org.springframework.boot.autoconfigure.web.client.RestClientSsl; SearchStrategy: all) did not find any beans (OnBeanCondition)

   RestTemplateAutoConfiguration matched:
      - @ConditionalOnClass found required class 'org.springframework.web.client.RestTemplate' (OnClassCondition)
      - NoneNestedConditions 0 matched 1 did not; NestedCondition on NotReactiveWebApplicationCondition.ReactiveWebApplication did not find reactive web application classes (NotReactiveWebApplicationCondition)

   RestTemplateAutoConfiguration#restTemplateBuilder matched:
      - @ConditionalOnMissingBean (types: org.springframework.boot.web.client.RestTemplateBuilder; SearchStrategy: all) did not find any beans (OnBeanCondition)

   ServletWebServerFactoryAutoConfiguration matched:
      - @ConditionalOnClass found required class 'jakarta.servlet.ServletRequest' (OnClassCondition)
      - found 'session' scope (OnWebApplicationCondition)

   ServletWebServerFactoryAutoConfiguration#tomcatServletWebServerFactoryCustomizer matched:
      - @ConditionalOnClass found required class 'org.apache.catalina.startup.Tomcat' (OnClassCondition)

   ServletWebServerFactoryConfiguration.EmbeddedTomcat matched:
      - @ConditionalOnClass found required classes 'jakarta.servlet.Servlet', 'org.apache.catalina.startup.Tomcat', 'org.apache.coyote.UpgradeProtocol' (OnClassCondition)
      - @ConditionalOnMissingBean (types: org.springframework.boot.web.servlet.server.ServletWebServerFactory; SearchStrategy: current) did not find any beans (OnBeanCondition)

   SimpleCacheConfiguration matched:
      - Cache org.springframework.boot.autoconfigure.cache.SimpleCacheConfiguration automatic cache type (CacheCondition)

   SpringDataWebAutoConfiguration matched:
      - @ConditionalOnClass found required classes 'org.springframework.data.web.PageableHandlerMethodArgumentResolver', 'org.springframework.web.servlet.config.annotation.WebMvcConfigurer' (OnClassCondition)
      - found 'session' scope (OnWebApplicationCondition)
      - @ConditionalOnMissingBean (types: org.springframework.data.web.PageableHandlerMethodArgumentResolver; SearchStrategy: all) did not find any beans (OnBeanCondition)

   SpringDataWebAutoConfiguration#pageableCustomizer matched:
      - @ConditionalOnMissingBean (types: org.springframework.data.web.config.PageableHandlerMethodArgumentResolverCustomizer; SearchStrategy: all) did not find any beans (OnBeanCondition)

   SpringDataWebAutoConfiguration#sortCustomizer matched:
      - @ConditionalOnMissingBean (types: org.springframework.data.web.config.SortHandlerMethodArgumentResolverCustomizer; SearchStrategy: all) did not find any beans (OnBeanCondition)

   SpringDataWebAutoConfiguration#springDataWebSettings matched:
      - @ConditionalOnMissingBean (types: org.springframework.data.web.config.SpringDataWebSettings; SearchStrategy: all) did not find any beans (OnBeanCondition)

   SpringDocConfigProperties matched:
      - @ConditionalOnProperty (springdoc.api-docs.enabled) matched (OnPropertyCondition)
      - @ConditionalOnBean (types: org.springdoc.core.configuration.SpringDocConfiguration; SearchStrategy: all) found bean 'org.springdoc.core.configuration.SpringDocConfiguration' (OnBeanCondition)

   SpringDocConfiguration matched:
      - @ConditionalOnWebApplication (required) found 'session' scope (OnWebApplicationCondition)
      - @ConditionalOnProperty (springdoc.api-docs.enabled) matched (OnPropertyCondition)

   SpringDocConfiguration#fileSupportConverter matched:
      - @ConditionalOnMissingBean (types: org.springdoc.core.converters.FileSupportConverter; SearchStrategy: all) did not find any beans (OnBeanCondition)

   SpringDocConfiguration#openAPIBuilder matched:
      - @ConditionalOnMissingBean (types: org.springdoc.core.service.OpenAPIService; SearchStrategy: all) did not find any beans (OnBeanCondition)

   SpringDocConfiguration#operationBuilder matched:
      - @ConditionalOnMissingBean (types: org.springdoc.core.service.OperationService; SearchStrategy: all) did not find any beans (OnBeanCondition)

   SpringDocConfiguration#parameterBuilder matched:
      - @ConditionalOnMissingBean (types: org.springdoc.core.service.GenericParameterService; SearchStrategy: all) did not find any beans (OnBeanCondition)

   SpringDocConfiguration#polymorphicModelConverter matched:
      - @ConditionalOnProperty (springdoc.model-converters.polymorphic-converter.enabled) matched (OnPropertyCondition)
      - @ConditionalOnMissingBean (types: org.springdoc.core.converters.PolymorphicModelConverter; SearchStrategy: all) did not find any beans (OnBeanCondition)

   SpringDocConfiguration#requestBodyBuilder matched:
      - @ConditionalOnMissingBean (types: org.springdoc.core.service.RequestBodyService; SearchStrategy: all) did not find any beans (OnBeanCondition)

   SpringDocConfiguration#responseSupportConverter matched:
      - @ConditionalOnMissingBean (types: org.springdoc.core.converters.ResponseSupportConverter; SearchStrategy: all) did not find any beans (OnBeanCondition)

   SpringDocConfiguration#schemaPropertyDeprecatingConverter matched:
      - @ConditionalOnProperty (springdoc.model-converters.deprecating-converter.enabled) matched (OnPropertyCondition)
      - @ConditionalOnMissingBean (types: org.springdoc.core.converters.SchemaPropertyDeprecatingConverter; SearchStrategy: all) did not find any beans (OnBeanCondition)

   SpringDocConfiguration#securityParser matched:
      - @ConditionalOnMissingBean (types: org.springdoc.core.service.SecurityService; SearchStrategy: all) did not find any beans (OnBeanCondition)

   SpringDocConfiguration#springDocCustomizers matched:
      - @ConditionalOnMissingBean (types: org.springdoc.core.customizers.SpringDocCustomizers; SearchStrategy: all) did not find any beans (OnBeanCondition)

   SpringDocConfiguration#springDocProviders matched:
      - @ConditionalOnMissingBean (types: org.springdoc.core.providers.SpringDocProviders; SearchStrategy: all) did not find any beans (OnBeanCondition)

   SpringDocConfiguration#springdocObjectMapperProvider matched:
      - @ConditionalOnMissingBean (types: org.springdoc.core.providers.ObjectMapperProvider; SearchStrategy: all) did not find any beans (OnBeanCondition)

   SpringDocConfiguration.QuerydslProvider matched:
      - @ConditionalOnClass found required class 'org.springframework.data.querydsl.binding.QuerydslBindingsFactory' (OnClassCondition)

   SpringDocConfiguration.QuerydslProvider#queryDslQuerydslPredicateOperationCustomizer matched:
      - @ConditionalOnMissingBean (types: org.springdoc.core.customizers.QuerydslPredicateOperationCustomizer; SearchStrategy: all) did not find any beans (OnBeanCondition)

   SpringDocConfiguration.SpringDocSpringDataWebPropertiesProvider matched:
      - @ConditionalOnClass found required class 'org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties' (OnClassCondition)

   SpringDocConfiguration.SpringDocSpringDataWebPropertiesProvider#springDataWebPropertiesProvider matched:
      - @ConditionalOnMissingBean (types: org.springdoc.core.providers.SpringDataWebPropertiesProvider; SearchStrategy: all) did not find any beans (OnBeanCondition)

   SpringDocConfiguration.WebConversionServiceConfiguration matched:
      - @ConditionalOnClass found required class 'org.springframework.boot.autoconfigure.web.format.WebConversionService' (OnClassCondition)

   SpringDocHateoasConfiguration matched:
      - @ConditionalOnClass found required class 'org.springframework.hateoas.server.LinkRelationProvider' (OnClassCondition)
      - @ConditionalOnWebApplication (required) found 'session' scope (OnWebApplicationCondition)
      - @ConditionalOnExpression (#{${springdoc.api-docs.enabled:true} and ${springdoc.enable-hateoas:true}}) resulted in true (OnExpressionCondition)
      - @ConditionalOnBean (types: org.springdoc.core.configuration.SpringDocConfiguration; SearchStrategy: all) found bean 'org.springdoc.core.configuration.SpringDocConfiguration' (OnBeanCondition)

   SpringDocHateoasConfiguration#collectionModelContentConverter matched:
      - @ConditionalOnMissingBean (types: org.springdoc.core.converters.CollectionModelContentConverter; SearchStrategy: all) did not find any beans (OnBeanCondition)

   SpringDocHateoasConfiguration#hateoasHalProvider matched:
      - @ConditionalOnMissingBean (types: org.springdoc.core.providers.HateoasHalProvider; SearchStrategy: all) did not find any beans (OnBeanCondition)

   SpringDocHateoasConfiguration#linksSchemaCustomizer matched:
      - @ConditionalOnMissingBean (names: linksSchemaCustomizer; SearchStrategy: all) did not find any beans (OnBeanCondition)

   SpringDocPageableConfiguration matched:
      - @ConditionalOnClass found required class 'org.springframework.data.domain.Pageable' (OnClassCondition)
      - @ConditionalOnWebApplication (required) found 'session' scope (OnWebApplicationCondition)
      - @ConditionalOnProperty (springdoc.api-docs.enabled) matched (OnPropertyCondition)
      - @ConditionalOnBean (types: org.springdoc.core.configuration.SpringDocConfiguration; SearchStrategy: all) found bean 'org.springdoc.core.configuration.SpringDocConfiguration' (OnBeanCondition)

   SpringDocPageableConfiguration#delegatingMethodParameterCustomizer matched:
      - @ConditionalOnMissingBean (types: org.springdoc.core.customizers.DelegatingMethodParameterCustomizer; SearchStrategy: all) did not find any beans (OnBeanCondition)

   SpringDocPageableConfiguration#pageOpenAPIConverter matched:
      - @ConditionalOnClass found required classes 'org.springframework.data.web.PagedModel', 'org.springframework.data.web.config.SpringDataWebSettings' (OnClassCondition)
      - @ConditionalOnMissingBean (types: org.springdoc.core.converters.PageOpenAPIConverter; SearchStrategy: all) did not find any beans (OnBeanCondition)

   SpringDocPageableConfiguration#pageableOpenAPIConverter matched:
      - @ConditionalOnProperty (springdoc.model-converters.pageable-converter.enabled) matched (OnPropertyCondition)
      - @ConditionalOnMissingBean (types: org.springdoc.core.converters.PageableOpenAPIConverter; SearchStrategy: all) did not find any beans (OnBeanCondition)

   SpringDocSortConfiguration matched:
      - @ConditionalOnClass found required class 'org.springframework.data.domain.Sort' (OnClassCondition)
      - @ConditionalOnWebApplication (required) found 'session' scope (OnWebApplicationCondition)
      - @ConditionalOnProperty (springdoc.api-docs.enabled) matched (OnPropertyCondition)
      - @ConditionalOnBean (types: org.springdoc.core.configuration.SpringDocConfiguration; SearchStrategy: all) found bean 'org.springdoc.core.configuration.SpringDocConfiguration' (OnBeanCondition)

   SpringDocSortConfiguration#sortOpenAPIConverter matched:
      - @ConditionalOnProperty (springdoc.sort-converter.enabled) matched (OnPropertyCondition)
      - @ConditionalOnMissingBean (types: org.springdoc.core.converters.SortOpenAPIConverter; SearchStrategy: all) did not find any beans (OnBeanCondition)

   SpringDocUIConfiguration matched:
      - @ConditionalOnWebApplication (required) found 'session' scope (OnWebApplicationCondition)
      - @ConditionalOnBean (types: org.springdoc.core.configuration.SpringDocConfiguration; SearchStrategy: all) found bean 'org.springdoc.core.configuration.SpringDocConfiguration' (OnBeanCondition)

   SpringDocWebMvcConfiguration matched:
      - found 'session' scope (OnWebApplicationCondition)
      - @ConditionalOnProperty (springdoc.api-docs.enabled) matched (OnPropertyCondition)
      - @ConditionalOnBean (types: org.springdoc.core.configuration.SpringDocConfiguration; SearchStrategy: all) found bean 'org.springdoc.core.configuration.SpringDocConfiguration' (OnBeanCondition)

   SpringDocWebMvcConfiguration#openApiResource matched:
      - @ConditionalOnExpression (#{(${springdoc.use-management-port:false} == false ) and ${springdoc.enable-default-api-docs:true}}) resulted in true (OnExpressionCondition)
      - @ConditionalOnMissingBean (types: org.springdoc.webmvc.api.OpenApiWebMvcResource; SearchStrategy: all) did not find any beans (OnBeanCondition)

   SpringDocWebMvcConfiguration#requestBuilder matched:
      - @ConditionalOnMissingBean (types: org.springdoc.webmvc.core.service.RequestService; SearchStrategy: all) did not find any beans (OnBeanCondition)

   SpringDocWebMvcConfiguration#responseBuilder matched:
      - @ConditionalOnMissingBean (types: org.springdoc.core.service.GenericResponseService; SearchStrategy: all) did not find any beans (OnBeanCondition)

   SpringDocWebMvcConfiguration#springWebProvider matched:
      - @ConditionalOnMissingBean (types: org.springdoc.core.providers.SpringWebProvider; SearchStrategy: all) did not find any beans (OnBeanCondition)

   SpringDocWebMvcConfiguration.SpringDocWebMvcRouterConfiguration matched:
      - @ConditionalOnClass found required class 'org.springframework.web.servlet.function.RouterFunction' (OnClassCondition)

   SpringDocWebMvcConfiguration.SpringDocWebMvcRouterConfiguration#routerFunctionProvider matched:
      - @ConditionalOnMissingBean (types: org.springdoc.webmvc.core.providers.RouterFunctionWebMvcProvider; SearchStrategy: all) did not find any beans (OnBeanCondition)

   SqlInitializationAutoConfiguration matched:
      - @ConditionalOnBooleanProperty (spring.sql.init.enabled=true) matched (OnPropertyCondition)
      - NoneNestedConditions 0 matched 1 did not; NestedCondition on SqlInitializationAutoConfiguration.SqlInitializationModeCondition.ModeIsNever @ConditionalOnProperty (spring.sql.init.mode=never) did not find property 'spring.sql.init.mode' (SqlInitializationAutoConfiguration.SqlInitializationModeCondition)

   SslAutoConfiguration#sslBundleRegistry matched:
      - @ConditionalOnMissingBean (types: org.springframework.boot.ssl.SslBundleRegistry,org.springframework.boot.ssl.SslBundles; SearchStrategy: all) did not find any beans (OnBeanCondition)

   SwaggerConfig matched:
      - found 'session' scope (OnWebApplicationCondition)
      - @ConditionalOnProperty (springdoc.swagger-ui.enabled) matched (OnPropertyCondition)
      - @ConditionalOnBean (types: org.springdoc.core.configuration.SpringDocConfiguration; SearchStrategy: all) found bean 'org.springdoc.core.configuration.SpringDocConfiguration' (OnBeanCondition)

   SwaggerConfig#indexPageTransformer matched:
      - @ConditionalOnMissingBean (types: org.springdoc.webmvc.ui.SwaggerIndexTransformer; SearchStrategy: all) did not find any beans (OnBeanCondition)

   SwaggerConfig#swaggerConfigResource matched:
      - @ConditionalOnProperty (springdoc.use-management-port=false) matched (OnPropertyCondition)
      - @ConditionalOnMissingBean (types: org.springdoc.webmvc.ui.SwaggerConfigResource; SearchStrategy: all) did not find any beans (OnBeanCondition)

   SwaggerConfig#swaggerResourceResolver matched:
      - @ConditionalOnMissingBean (types: org.springdoc.webmvc.ui.SwaggerResourceResolver; SearchStrategy: all) did not find any beans (OnBeanCondition)

   SwaggerConfig#swaggerWebMvcConfigurer matched:
      - @ConditionalOnMissingBean (types: org.springdoc.webmvc.ui.SwaggerWebMvcConfigurer; SearchStrategy: all) did not find any beans (OnBeanCondition)

   SwaggerConfig#swaggerWelcome matched:
      - @ConditionalOnProperty (springdoc.use-management-port=false) matched (OnPropertyCondition)
      - @ConditionalOnMissingBean (types: org.springdoc.webmvc.ui.SwaggerWelcomeWebMvc; SearchStrategy: all) did not find any beans (OnBeanCondition)

   SwaggerUiConfigParameters matched:
      - @ConditionalOnProperty (springdoc.swagger-ui.enabled) matched (OnPropertyCondition)
      - @ConditionalOnBean (types: org.springdoc.core.configuration.SpringDocConfiguration; SearchStrategy: all) found bean 'org.springdoc.core.configuration.SpringDocConfiguration' (OnBeanCondition)

   SwaggerUiConfigProperties matched:
      - @ConditionalOnProperty (springdoc.swagger-ui.enabled) matched (OnPropertyCondition)
      - @ConditionalOnBean (types: org.springdoc.core.configuration.SpringDocConfiguration; SearchStrategy: all) found bean 'org.springdoc.core.configuration.SpringDocConfiguration' (OnBeanCondition)

   SwaggerUiOAuthProperties matched:
      - @ConditionalOnProperty (springdoc.swagger-ui.enabled) matched (OnPropertyCondition)
      - @ConditionalOnBean (types: org.springdoc.core.configuration.SpringDocConfiguration; SearchStrategy: all) found bean 'org.springdoc.core.configuration.SpringDocConfiguration' (OnBeanCondition)

   TaskExecutionAutoConfiguration matched:
      - @ConditionalOnClass found required class 'org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor' (OnClassCondition)

   TaskExecutorConfigurations.AsyncConfigurerConfiguration matched:
      - @ConditionalOnMissingBean (types: org.springframework.scheduling.annotation.AsyncConfigurer; SearchStrategy: all) did not find any beans (OnBeanCondition)

   TaskExecutorConfigurations.AsyncConfigurerConfiguration#applicationTaskExecutorAsyncConfigurer matched:
      - @ConditionalOnMissingBean (types: org.springframework.scheduling.annotation.AsyncConfigurer; SearchStrategy: all) did not find any beans (OnBeanCondition)

   TaskExecutorConfigurations.SimpleAsyncTaskExecutorBuilderConfiguration#simpleAsyncTaskExecutorBuilder matched:
      - @ConditionalOnMissingBean (types: org.springframework.boot.task.SimpleAsyncTaskExecutorBuilder; SearchStrategy: all) did not find any beans (OnBeanCondition)
      - @ConditionalOnThreading found PLATFORM (OnThreadingCondition)

   TaskExecutorConfigurations.TaskExecutorConfiguration matched:
      - AnyNestedCondition 1 matched 1 did not; NestedCondition on TaskExecutorConfigurations.OnExecutorCondition.ModelCondition @ConditionalOnProperty (spring.task.execution.mode=force) did not find property 'spring.task.execution.mode'; NestedCondition on TaskExecutorConfigurations.OnExecutorCondition.ExecutorBeanCondition @ConditionalOnMissingBean (types: java.util.concurrent.Executor; SearchStrategy: all) did not find any beans (TaskExecutorConfigurations.OnExecutorCondition)

   TaskExecutorConfigurations.TaskExecutorConfiguration#applicationTaskExecutor matched:
      - @ConditionalOnThreading found PLATFORM (OnThreadingCondition)

   TaskExecutorConfigurations.ThreadPoolTaskExecutorBuilderConfiguration#threadPoolTaskExecutorBuilder matched:
      - @ConditionalOnMissingBean (types: org.springframework.boot.task.ThreadPoolTaskExecutorBuilder; SearchStrategy: all) did not find any beans (OnBeanCondition)

   TaskSchedulingAutoConfiguration matched:
      - @ConditionalOnClass found required class 'org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler' (OnClassCondition)

   TaskSchedulingConfigurations.SimpleAsyncTaskSchedulerBuilderConfiguration#simpleAsyncTaskSchedulerBuilder matched:
      - @ConditionalOnMissingBean (types: org.springframework.boot.task.SimpleAsyncTaskSchedulerBuilder; SearchStrategy: all) did not find any beans (OnBeanCondition)
      - @ConditionalOnThreading found PLATFORM (OnThreadingCondition)

   TaskSchedulingConfigurations.ThreadPoolTaskSchedulerBuilderConfiguration#threadPoolTaskSchedulerBuilder matched:
      - @ConditionalOnMissingBean (types: org.springframework.boot.task.ThreadPoolTaskSchedulerBuilder; SearchStrategy: all) did not find any beans (OnBeanCondition)

   TransactionAutoConfiguration matched:
      - @ConditionalOnClass found required class 'org.springframework.transaction.PlatformTransactionManager' (OnClassCondition)

   TransactionAutoConfiguration.EnableTransactionManagementConfiguration matched:
      - @ConditionalOnBean (types: org.springframework.transaction.TransactionManager; SearchStrategy: all) found bean 'transactionManager'; @ConditionalOnMissingBean (types: org.springframework.transaction.annotation.AbstractTransactionManagementConfiguration; SearchStrategy: all) did not find any beans (OnBeanCondition)

   TransactionAutoConfiguration.EnableTransactionManagementConfiguration.CglibAutoProxyConfiguration matched:
      - @ConditionalOnBooleanProperty (spring.aop.proxy-target-class=true) matched (OnPropertyCondition)

   TransactionAutoConfiguration.TransactionTemplateConfiguration matched:
      - @ConditionalOnSingleCandidate (types: org.springframework.transaction.PlatformTransactionManager; SearchStrategy: all) found a single bean 'transactionManager' (OnBeanCondition)

   TransactionAutoConfiguration.TransactionTemplateConfiguration#transactionTemplate matched:
      - @ConditionalOnMissingBean (types: org.springframework.transaction.support.TransactionOperations; SearchStrategy: all) did not find any beans (OnBeanCondition)

   TransactionManagerCustomizationAutoConfiguration matched:
      - @ConditionalOnClass found required class 'org.springframework.transaction.PlatformTransactionManager' (OnClassCondition)

   TransactionManagerCustomizationAutoConfiguration#platformTransactionManagerCustomizers matched:
      - @ConditionalOnMissingBean (types: org.springframework.boot.autoconfigure.transaction.TransactionManagerCustomizers; SearchStrategy: all) did not find any beans (OnBeanCondition)

   ValidationAutoConfiguration matched:
      - @ConditionalOnClass found required class 'jakarta.validation.executable.ExecutableValidator' (OnClassCondition)
      - @ConditionalOnResource found location classpath:META-INF/services/jakarta.validation.spi.ValidationProvider (OnResourceCondition)

   ValidationAutoConfiguration#defaultValidator matched:
      - @ConditionalOnMissingBean (types: jakarta.validation.Validator; SearchStrategy: all) did not find any beans (OnBeanCondition)

   ValidationAutoConfiguration#methodValidationPostProcessor matched:
      - @ConditionalOnMissingBean (types: org.springframework.validation.beanvalidation.MethodValidationPostProcessor; SearchStrategy: current) did not find any beans (OnBeanCondition)

   WebMvcAutoConfiguration matched:
      - @ConditionalOnClass found required classes 'jakarta.servlet.Servlet', 'org.springframework.web.servlet.DispatcherServlet', 'org.springframework.web.servlet.config.annotation.WebMvcConfigurer' (OnClassCondition)
      - found 'session' scope (OnWebApplicationCondition)
      - @ConditionalOnMissingBean (types: org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport; SearchStrategy: all) did not find any beans (OnBeanCondition)

   WebMvcAutoConfiguration#formContentFilter matched:
      - @ConditionalOnBooleanProperty (spring.mvc.formcontent.filter.enabled=true) matched (OnPropertyCondition)
      - @ConditionalOnMissingBean (types: org.springframework.web.filter.FormContentFilter; SearchStrategy: all) did not find any beans (OnBeanCondition)

   WebMvcAutoConfiguration.EnableWebMvcConfiguration#flashMapManager matched:
      - @ConditionalOnMissingBean (names: flashMapManager; SearchStrategy: all) did not find any beans (OnBeanCondition)

   WebMvcAutoConfiguration.EnableWebMvcConfiguration#localeResolver matched:
      - @ConditionalOnMissingBean (names: localeResolver; SearchStrategy: all) did not find any beans (OnBeanCondition)

   WebMvcAutoConfiguration.EnableWebMvcConfiguration#themeResolver matched:
      - @ConditionalOnMissingBean (names: themeResolver; SearchStrategy: all) did not find any beans (OnBeanCondition)

   WebMvcAutoConfiguration.EnableWebMvcConfiguration#viewNameTranslator matched:
      - @ConditionalOnMissingBean (names: viewNameTranslator; SearchStrategy: all) did not find any beans (OnBeanCondition)

   WebMvcAutoConfiguration.WebMvcAutoConfigurationAdapter#defaultViewResolver matched:
      - @ConditionalOnMissingBean (types: org.springframework.web.servlet.view.InternalResourceViewResolver; SearchStrategy: all) did not find any beans (OnBeanCondition)

   WebMvcAutoConfiguration.WebMvcAutoConfigurationAdapter#requestContextFilter matched:
      - @ConditionalOnMissingBean (types: org.springframework.web.context.request.RequestContextListener,org.springframework.web.filter.RequestContextFilter; SearchStrategy: all) did not find any beans (OnBeanCondition)

   WebMvcAutoConfiguration.WebMvcAutoConfigurationAdapter#viewResolver matched:
      - @ConditionalOnBean (types: org.springframework.web.servlet.ViewResolver; SearchStrategy: all) found beans 'defaultViewResolver', 'beanNameViewResolver', 'mvcViewResolver'; @ConditionalOnMissingBean (names: viewResolver types: org.springframework.web.servlet.view.ContentNegotiatingViewResolver; SearchStrategy: all) did not find any beans (OnBeanCondition)

   WebSocketServletAutoConfiguration matched:
      - @ConditionalOnClass found required classes 'jakarta.servlet.Servlet', 'jakarta.websocket.server.ServerContainer' (OnClassCondition)
      - found 'session' scope (OnWebApplicationCondition)

   WebSocketServletAutoConfiguration.TomcatWebSocketConfiguration matched:
      - @ConditionalOnClass found required classes 'org.apache.catalina.startup.Tomcat', 'org.apache.tomcat.websocket.server.WsSci' (OnClassCondition)

   WebSocketServletAutoConfiguration.TomcatWebSocketConfiguration#websocketServletWebServerCustomizer matched:
      - @ConditionalOnMissingBean (names: websocketServletWebServerCustomizer; SearchStrategy: all) did not find any beans (OnBeanCondition)


Negative matches:
-----------------

   ActiveMQAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'jakarta.jms.ConnectionFactory' (OnClassCondition)

   AopAutoConfiguration.AspectJAutoProxyingConfiguration.JdkDynamicAutoProxyConfiguration:
      Did not match:
         - @ConditionalOnBooleanProperty (spring.aop.proxy-target-class=false) did not find property 'spring.aop.proxy-target-class' (OnPropertyCondition)

   AopAutoConfiguration.ClassProxyingConfiguration:
      Did not match:
         - @ConditionalOnMissingClass found unwanted class 'org.aspectj.weaver.Advice' (OnClassCondition)

   ArtemisAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'jakarta.jms.ConnectionFactory' (OnClassCondition)

   BatchAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'org.springframework.batch.core.launch.JobLauncher' (OnClassCondition)

   Cache2kCacheConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'org.cache2k.Cache2kBuilder' (OnClassCondition)

   CacheAutoConfiguration:
      Did not match:
         - @ConditionalOnBean (types: org.springframework.cache.interceptor.CacheAspectSupport; SearchStrategy: all) did not find any beans of type org.springframework.cache.interceptor.CacheAspectSupport (OnBeanCondition)
      Matched:
         - @ConditionalOnClass found required class 'org.springframework.cache.CacheManager' (OnClassCondition)

   CacheAutoConfiguration.CacheManagerEntityManagerFactoryDependsOnPostProcessor:
      Did not match:
         - Ancestor org.springframework.boot.autoconfigure.cache.CacheAutoConfiguration did not match (ConditionEvaluationReport.AncestorsMatchedCondition)
      Matched:
         - @ConditionalOnClass found required class 'org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean' (OnClassCondition)

   CaffeineCacheConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'com.github.benmanes.caffeine.cache.Caffeine' (OnClassCondition)

   CassandraAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'com.datastax.oss.driver.api.core.CqlSession' (OnClassCondition)

   CassandraDataAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'com.datastax.oss.driver.api.core.CqlSession' (OnClassCondition)

   CassandraReactiveDataAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'com.datastax.oss.driver.api.core.CqlSession' (OnClassCondition)

   CassandraReactiveRepositoriesAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'org.springframework.data.cassandra.ReactiveSession' (OnClassCondition)

   CassandraRepositoriesAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'com.datastax.oss.driver.api.core.CqlSession' (OnClassCondition)

   org.springframework.boot.autoconfigure.http.client.reactive.ClientHttpConnectorAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'reactor.core.publisher.Mono' (OnClassCondition)

   org.springframework.boot.autoconfigure.web.reactive.function.client.ClientHttpConnectorAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'org.springframework.web.reactive.function.client.WebClient' (OnClassCondition)

   CodecsAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'org.springframework.web.reactive.function.client.WebClient' (OnClassCondition)

   CouchbaseAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'com.couchbase.client.java.Cluster' (OnClassCondition)

   CouchbaseCacheConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'com.couchbase.client.java.Cluster' (OnClassCondition)

   CouchbaseDataAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'com.couchbase.client.java.Bucket' (OnClassCondition)

   CouchbaseReactiveDataAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'com.couchbase.client.java.Cluster' (OnClassCondition)

   CouchbaseReactiveRepositoriesAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'com.couchbase.client.java.Cluster' (OnClassCondition)

   CouchbaseRepositoriesAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'com.couchbase.client.java.Bucket' (OnClassCondition)

   DataSourceAutoConfiguration.EmbeddedDatabaseConfiguration:
      Did not match:
         - EmbeddedDataSource spring.datasource.url is set (DataSourceAutoConfiguration.EmbeddedDatabaseCondition)

   DataSourceCheckpointRestoreConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'org.crac.Resource' (OnClassCondition)

   DataSourceConfiguration.Dbcp2:
      Did not match:
         - @ConditionalOnClass did not find required class 'org.apache.commons.dbcp2.BasicDataSource' (OnClassCondition)

   DataSourceConfiguration.Generic:
      Did not match:
         - @ConditionalOnProperty (spring.datasource.type) did not find property 'spring.datasource.type' (OnPropertyCondition)

   DataSourceConfiguration.OracleUcp:
      Did not match:
         - @ConditionalOnClass did not find required classes 'oracle.ucp.jdbc.PoolDataSourceImpl', 'oracle.jdbc.OracleConnection' (OnClassCondition)

   DataSourceConfiguration.Tomcat:
      Did not match:
         - @ConditionalOnClass did not find required class 'org.apache.tomcat.jdbc.pool.DataSource' (OnClassCondition)

   DataSourceJmxConfiguration:
      Did not match:
         - @ConditionalOnBooleanProperty (spring.jmx.enabled=true) did not find property 'spring.jmx.enabled' (OnPropertyCondition)

   DataSourcePoolMetadataProvidersConfiguration.CommonsDbcp2PoolDataSourceMetadataProviderConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'org.apache.commons.dbcp2.BasicDataSource' (OnClassCondition)

   DataSourcePoolMetadataProvidersConfiguration.OracleUcpPoolDataSourceMetadataProviderConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required classes 'oracle.ucp.jdbc.PoolDataSource', 'oracle.jdbc.OracleConnection' (OnClassCondition)

   DataSourcePoolMetadataProvidersConfiguration.TomcatDataSourcePoolMetadataProviderConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'org.apache.tomcat.jdbc.pool.DataSource' (OnClassCondition)

   DataSourceTransactionManagerAutoConfiguration.JdbcTransactionManagerConfiguration#transactionManager:
      Did not match:
         - @ConditionalOnMissingBean (types: org.springframework.transaction.TransactionManager; SearchStrategy: all) found beans of type 'org.springframework.transaction.TransactionManager' transactionManager (OnBeanCondition)

   DevToolsR2dbcAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'io.r2dbc.spi.ConnectionFactory' (OnClassCondition)

   DispatcherServletAutoConfiguration.DispatcherServletConfiguration#multipartResolver:
      Did not match:
         - @ConditionalOnBean (types: org.springframework.web.multipart.MultipartResolver; SearchStrategy: all) did not find any beans of type org.springframework.web.multipart.MultipartResolver (OnBeanCondition)

   ElasticsearchClientAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'co.elastic.clients.elasticsearch.ElasticsearchClient' (OnClassCondition)

   ElasticsearchDataAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'org.springframework.data.elasticsearch.client.elc.ElasticsearchTemplate' (OnClassCondition)

   ElasticsearchRepositoriesAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'org.springframework.data.elasticsearch.repository.ElasticsearchRepository' (OnClassCondition)

   ElasticsearchRestClientAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'org.elasticsearch.client.RestClientBuilder' (OnClassCondition)

   EmbeddedLdapAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'com.unboundid.ldap.listener.InMemoryDirectoryServer' (OnClassCondition)

   EmbeddedWebServerFactoryCustomizerAutoConfiguration.JettyWebServerFactoryCustomizerConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required classes 'org.eclipse.jetty.server.Server', 'org.eclipse.jetty.util.Loader', 'org.eclipse.jetty.ee10.webapp.WebAppContext' (OnClassCondition)

   EmbeddedWebServerFactoryCustomizerAutoConfiguration.NettyWebServerFactoryCustomizerConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'reactor.netty.http.server.HttpServer' (OnClassCondition)

   EmbeddedWebServerFactoryCustomizerAutoConfiguration.TomcatWebServerFactoryCustomizerConfiguration#tomcatVirtualThreadsProtocolHandlerCustomizer:
      Did not match:
         - @ConditionalOnThreading did not find VIRTUAL (OnThreadingCondition)

   EmbeddedWebServerFactoryCustomizerAutoConfiguration.UndertowWebServerFactoryCustomizerConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required classes 'io.undertow.Undertow', 'org.xnio.SslClientAuthMode' (OnClassCondition)

   ErrorWebFluxAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'org.springframework.web.reactive.config.WebFluxConfigurer' (OnClassCondition)

   FlywayAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'org.flywaydb.core.Flyway' (OnClassCondition)

   FreeMarkerAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'freemarker.template.Configuration' (OnClassCondition)

   GraphQlAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'graphql.GraphQL' (OnClassCondition)

   GraphQlQueryByExampleAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'graphql.GraphQL' (OnClassCondition)

   GraphQlQuerydslAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'com.querydsl.core.Query' (OnClassCondition)

   GraphQlRSocketAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'graphql.GraphQL' (OnClassCondition)

   GraphQlReactiveQueryByExampleAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'graphql.GraphQL' (OnClassCondition)

   GraphQlReactiveQuerydslAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'com.querydsl.core.Query' (OnClassCondition)

   GraphQlWebFluxAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'graphql.GraphQL' (OnClassCondition)

   GraphQlWebFluxSecurityAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'graphql.GraphQL' (OnClassCondition)

   GraphQlWebMvcAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'graphql.GraphQL' (OnClassCondition)

   GraphQlWebMvcSecurityAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'graphql.GraphQL' (OnClassCondition)

   GroovyTemplateAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'groovy.text.markup.MarkupTemplateEngine' (OnClassCondition)

   GsonAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'com.google.gson.Gson' (OnClassCondition)

   GsonHttpMessageConvertersConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'com.google.gson.Gson' (OnClassCondition)

   H2ConsoleAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'org.h2.server.web.JakartaWebServlet' (OnClassCondition)

   HazelcastAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'com.hazelcast.core.HazelcastInstance' (OnClassCondition)

   HazelcastCacheConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'com.hazelcast.core.HazelcastInstance' (OnClassCondition)

   HazelcastJpaDependencyAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'com.hazelcast.core.HazelcastInstance' (OnClassCondition)

   HttpHandlerAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'org.springframework.web.reactive.DispatcherHandler' (OnClassCondition)

   InfinispanCacheConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'org.infinispan.spring.embedded.provider.SpringEmbeddedCacheManager' (OnClassCondition)

   IntegrationAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'org.springframework.integration.config.EnableIntegration' (OnClassCondition)

   JCacheCacheConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'javax.cache.Caching' (OnClassCondition)

   JacksonHttpMessageConvertersConfiguration.MappingJackson2XmlHttpMessageConverterConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'com.fasterxml.jackson.dataformat.xml.XmlMapper' (OnClassCondition)

   JdbcRepositoriesAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'org.springframework.data.jdbc.repository.config.AbstractJdbcConfiguration' (OnClassCondition)

   JerseyAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'org.glassfish.jersey.server.spring.SpringComponentProvider' (OnClassCondition)

   JmsAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'jakarta.jms.Message' (OnClassCondition)

   JmxAutoConfiguration:
      Did not match:
         - @ConditionalOnBooleanProperty (spring.jmx.enabled=true) did not find property 'spring.jmx.enabled' (OnPropertyCondition)
      Matched:
         - @ConditionalOnClass found required class 'org.springframework.jmx.export.MBeanExporter' (OnClassCondition)

   JndiConnectionFactoryAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'org.springframework.jms.core.JmsTemplate' (OnClassCondition)

   JndiDataSourceAutoConfiguration:
      Did not match:
         - @ConditionalOnProperty (spring.datasource.jndi-name) did not find property 'spring.datasource.jndi-name' (OnPropertyCondition)
      Matched:
         - @ConditionalOnClass found required classes 'javax.sql.DataSource', 'org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType' (OnClassCondition)

   JndiJtaConfiguration:
      Did not match:
         - @ConditionalOnJndi JNDI environment is not available (OnJndiCondition)
      Matched:
         - @ConditionalOnClass found required class 'org.springframework.transaction.jta.JtaTransactionManager' (OnClassCondition)

   JooqAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'org.jooq.DSLContext' (OnClassCondition)

   JpaRepositoriesAutoConfiguration#entityManagerFactoryBootstrapExecutorCustomizer:
      Did not match:
         - AnyNestedCondition 0 matched 2 did not; NestedCondition on JpaRepositoriesAutoConfiguration.BootstrapExecutorCondition.LazyBootstrapMode @ConditionalOnProperty (spring.data.jpa.repositories.bootstrap-mode=lazy) did not find property 'spring.data.jpa.repositories.bootstrap-mode'; NestedCondition on JpaRepositoriesAutoConfiguration.BootstrapExecutorCondition.DeferredBootstrapMode @ConditionalOnProperty (spring.data.jpa.repositories.bootstrap-mode=deferred) did not find property 'spring.data.jpa.repositories.bootstrap-mode' (JpaRepositoriesAutoConfiguration.BootstrapExecutorCondition)

   JsonbAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'jakarta.json.bind.Jsonb' (OnClassCondition)

   JsonbHttpMessageConvertersConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'jakarta.json.bind.Jsonb' (OnClassCondition)

   KafkaAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'org.springframework.kafka.core.KafkaTemplate' (OnClassCondition)

   LdapAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'org.springframework.ldap.core.ContextSource' (OnClassCondition)

   LdapRepositoriesAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'org.springframework.data.ldap.repository.LdapRepository' (OnClassCondition)

   LiquibaseAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'liquibase.change.DatabaseChange' (OnClassCondition)

   MailSenderAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'jakarta.mail.internet.MimeMessage' (OnClassCondition)

   MailSenderValidatorAutoConfiguration:
      Did not match:
         - @ConditionalOnSingleCandidate did not find required type 'org.springframework.mail.javamail.JavaMailSenderImpl' (OnBeanCondition)

   MessageSourceAutoConfiguration:
      Did not match:
         - ResourceBundle did not find bundle with basename messages (MessageSourceAutoConfiguration.ResourceBundleCondition)

   MongoAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'com.mongodb.client.MongoClient' (OnClassCondition)

   MongoDataAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'com.mongodb.client.MongoClient' (OnClassCondition)

   MongoReactiveAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'com.mongodb.reactivestreams.client.MongoClient' (OnClassCondition)

   MongoReactiveDataAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'com.mongodb.reactivestreams.client.MongoClient' (OnClassCondition)

   MongoReactiveRepositoriesAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'com.mongodb.reactivestreams.client.MongoClient' (OnClassCondition)

   MongoRepositoriesAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'com.mongodb.client.MongoClient' (OnClassCondition)

   MultipleOpenApiSupportConfiguration:
      Did not match:
         - AnyNestedCondition 0 matched 2 did not; NestedCondition on MultipleOpenApiSupportCondition.OnActuatorDifferentPort @ConditionalOnProperty (springdoc.show-actuator) did not find property 'springdoc.show-actuator'; NestedCondition on MultipleOpenApiSupportCondition.OnMultipleOpenApiSupportCondition AnyNestedCondition 0 matched 3 did not; NestedCondition on MultipleOpenApiGroupsCondition.OnListGroupedOpenApiBean @ConditionalOnBean (types: org.springdoc.core.models.GroupedOpenApi; SearchStrategy: all) did not find any beans of type org.springdoc.core.models.GroupedOpenApi; NestedCondition on MultipleOpenApiGroupsCondition.OnGroupConfigProperty @ConditionalOnProperty (springdoc.group-configs[0].group) did not find property 'springdoc.group-configs[0].group'; NestedCondition on MultipleOpenApiGroupsCondition.OnGroupedOpenApiBean @ConditionalOnBean (types: org.springdoc.core.models.GroupedOpenApi; SearchStrategy: all) did not find any beans of type org.springdoc.core.models.GroupedOpenApi (MultipleOpenApiSupportCondition)
      Matched:
         - found 'session' scope (OnWebApplicationCondition)
         - @ConditionalOnProperty (springdoc.api-docs.enabled) matched (OnPropertyCondition)

   MultipleOpenApiSupportConfiguration.SpringDocWebMvcActuatorDifferentConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'org.springframework.boot.actuate.endpoint.web.servlet.WebMvcEndpointHandlerMapping' (OnClassCondition)
         - Ancestor org.springdoc.webmvc.core.configuration.MultipleOpenApiSupportConfiguration did not match (ConditionEvaluationReport.AncestorsMatchedCondition)

   MustacheAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'com.samskivert.mustache.Mustache' (OnClassCondition)

   Neo4jAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'org.neo4j.driver.Driver' (OnClassCondition)

   Neo4jDataAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'org.neo4j.driver.Driver' (OnClassCondition)

   Neo4jReactiveDataAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'org.neo4j.driver.Driver' (OnClassCondition)

   Neo4jReactiveRepositoriesAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'org.neo4j.driver.Driver' (OnClassCondition)

   Neo4jRepositoriesAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'org.neo4j.driver.Driver' (OnClassCondition)

   NettyAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'io.netty.util.NettyRuntime' (OnClassCondition)

   OAuth2AuthorizationServerAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'org.springframework.security.oauth2.server.authorization.OAuth2Authorization' (OnClassCondition)

   OAuth2AuthorizationServerJwtAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'com.nimbusds.jose.jwk.source.JWKSource' (OnClassCondition)

   OAuth2ClientAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'org.springframework.security.oauth2.client.registration.ClientRegistration' (OnClassCondition)

   OAuth2ClientWebSecurityAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'org.springframework.security.config.annotation.web.configuration.EnableWebSecurity' (OnClassCondition)

   OAuth2ResourceServerAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'org.springframework.security.oauth2.server.resource.authentication.BearerTokenAuthenticationToken' (OnClassCondition)

   ProjectInfoAutoConfiguration#buildProperties:
      Did not match:
         - @ConditionalOnResource did not find resource '${spring.info.build.location:classpath:META-INF/build-info.properties}' (OnResourceCondition)

   ProjectInfoAutoConfiguration#gitProperties:
      Did not match:
         - GitResource did not find git info at classpath:git.properties (ProjectInfoAutoConfiguration.GitResourceAvailableCondition)

   PulsarAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'org.apache.pulsar.client.api.PulsarClient' (OnClassCondition)

   PulsarReactiveAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'org.apache.pulsar.client.api.PulsarClient' (OnClassCondition)

   QuartzAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'org.quartz.Scheduler' (OnClassCondition)

   R2dbcAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'io.r2dbc.spi.ConnectionFactory' (OnClassCondition)

   R2dbcDataAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'org.springframework.data.r2dbc.core.R2dbcEntityTemplate' (OnClassCondition)

   R2dbcInitializationConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required classes 'io.r2dbc.spi.ConnectionFactory', 'org.springframework.r2dbc.connection.init.DatabasePopulator' (OnClassCondition)

   R2dbcProxyAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'io.r2dbc.proxy.ProxyConnectionFactory' (OnClassCondition)

   R2dbcRepositoriesAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'io.r2dbc.spi.ConnectionFactory' (OnClassCondition)

   R2dbcTransactionManagerAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'org.springframework.r2dbc.connection.R2dbcTransactionManager' (OnClassCondition)

   RSocketGraphQlClientAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'graphql.GraphQL' (OnClassCondition)

   RSocketMessagingAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'io.rsocket.RSocket' (OnClassCondition)

   RSocketRequesterAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'io.rsocket.RSocket' (OnClassCondition)

   RSocketSecurityAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'org.springframework.security.rsocket.core.SecuritySocketAcceptorInterceptor' (OnClassCondition)

   RSocketServerAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'io.rsocket.core.RSocketServer' (OnClassCondition)

   RSocketStrategiesAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'io.netty.buffer.PooledByteBufAllocator' (OnClassCondition)

   RabbitAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'com.rabbitmq.client.Channel' (OnClassCondition)

   ReactiveElasticsearchClientAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'co.elastic.clients.transport.ElasticsearchTransport' (OnClassCondition)

   ReactiveElasticsearchRepositoriesAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'reactor.core.publisher.Mono' (OnClassCondition)

   ReactiveMultipartAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'org.springframework.web.reactive.config.WebFluxConfigurer' (OnClassCondition)

   ReactiveOAuth2ClientAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'reactor.core.publisher.Flux' (OnClassCondition)

   ReactiveOAuth2ClientWebSecurityAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'reactor.core.publisher.Flux' (OnClassCondition)

   ReactiveOAuth2ResourceServerAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'org.springframework.security.config.annotation.web.reactive.EnableWebFluxSecurity' (OnClassCondition)

   ReactiveSecurityAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'reactor.core.publisher.Flux' (OnClassCondition)

   ReactiveUserDetailsServiceAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'org.springframework.security.authentication.ReactiveAuthenticationManager' (OnClassCondition)

   ReactiveWebServerFactoryAutoConfiguration:
      Did not match:
         - @ConditionalOnWebApplication did not find reactive web application classes (OnWebApplicationCondition)

   ReactorAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'reactor.core.publisher.Hooks' (OnClassCondition)

   RedisAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'org.springframework.data.redis.core.RedisOperations' (OnClassCondition)

   RedisCacheConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'org.springframework.data.redis.connection.RedisConnectionFactory' (OnClassCondition)

   RedisReactiveAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'reactor.core.publisher.Flux' (OnClassCondition)

   RedisRepositoriesAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'org.springframework.data.redis.repository.configuration.EnableRedisRepositories' (OnClassCondition)

   RemoteDevToolsAutoConfiguration:
      Did not match:
         - @ConditionalOnProperty (spring.devtools.remote.secret) did not find property 'spring.devtools.remote.secret' (OnPropertyCondition)
      Matched:
         - @ConditionalOnClass found required classes 'jakarta.servlet.Filter', 'org.springframework.http.server.ServerHttpRequest' (OnClassCondition)

   RepositoryRestMvcAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'org.springframework.data.rest.webmvc.config.RepositoryRestMvcConfiguration' (OnClassCondition)

   Saml2RelyingPartyAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'org.springframework.security.saml2.provider.service.registration.RelyingPartyRegistrationRepository' (OnClassCondition)

   SecurityAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'org.springframework.security.authentication.DefaultAuthenticationEventPublisher' (OnClassCondition)

   SecurityFilterAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'org.springframework.security.config.http.SessionCreationPolicy' (OnClassCondition)

   SendGridAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'com.sendgrid.SendGrid' (OnClassCondition)

   ServletWebServerFactoryAutoConfiguration.ForwardedHeaderFilterConfiguration:
      Did not match:
         - @ConditionalOnProperty (server.forward-headers-strategy=framework) did not find property 'server.forward-headers-strategy' (OnPropertyCondition)

   ServletWebServerFactoryConfiguration.EmbeddedJetty:
      Did not match:
         - @ConditionalOnClass did not find required classes 'org.eclipse.jetty.server.Server', 'org.eclipse.jetty.util.Loader', 'org.eclipse.jetty.ee10.webapp.WebAppContext' (OnClassCondition)

   ServletWebServerFactoryConfiguration.EmbeddedUndertow:
      Did not match:
         - @ConditionalOnClass did not find required classes 'io.undertow.Undertow', 'org.xnio.SslClientAuthMode' (OnClassCondition)

   SessionAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'org.springframework.session.Session' (OnClassCondition)

   SpringApplicationAdminJmxAutoConfiguration:
      Did not match:
         - @ConditionalOnBooleanProperty (spring.application.admin.enabled=true) did not find property 'spring.application.admin.enabled' (OnPropertyCondition)

   SpringDocConfiguration#propertiesResolverForSchema:
      Did not match:
         - @ConditionalOnProperty (springdoc.api-docs.resolve-schema-properties) did not find property 'springdoc.api-docs.resolve-schema-properties' (OnPropertyCondition)

   SpringDocConfiguration#propertyCustomizingConverter:
      Did not match:
         - @ConditionalOnBean (types: org.springdoc.core.customizers.PropertyCustomizer; SearchStrategy: all) did not find any beans of type org.springdoc.core.customizers.PropertyCustomizer (OnBeanCondition)

   SpringDocConfiguration#springdocBeanFactoryPostProcessor:
      Did not match:
         - AnyNestedCondition 0 matched 2 did not; NestedCondition on CacheOrGroupedOpenApiCondition.OnCacheDisabled found non-matching nested conditions @ConditionalOnProperty (springdoc.cache.disabled) did not find property 'springdoc.cache.disabled'; NestedCondition on CacheOrGroupedOpenApiCondition.OnMultipleOpenApiSupportCondition AnyNestedCondition 0 matched 2 did not; NestedCondition on MultipleOpenApiSupportCondition.OnActuatorDifferentPort @ConditionalOnProperty (springdoc.show-actuator) did not find property 'springdoc.show-actuator'; NestedCondition on MultipleOpenApiSupportCondition.OnMultipleOpenApiSupportCondition AnyNestedCondition 0 matched 3 did not; NestedCondition on MultipleOpenApiGroupsCondition.OnListGroupedOpenApiBean @ConditionalOnBean (types: org.springdoc.core.models.GroupedOpenApi; SearchStrategy: all) did not find any beans of type org.springdoc.core.models.GroupedOpenApi; NestedCondition on MultipleOpenApiGroupsCondition.OnGroupConfigProperty @ConditionalOnProperty (springdoc.group-configs[0].group) did not find property 'springdoc.group-configs[0].group'; NestedCondition on MultipleOpenApiGroupsCondition.OnGroupedOpenApiBean @ConditionalOnBean (types: org.springdoc.core.models.GroupedOpenApi; SearchStrategy: all) did not find any beans of type org.springdoc.core.models.GroupedOpenApi (CacheOrGroupedOpenApiCondition)
      Matched:
         - @ConditionalOnClass found required class 'org.springframework.boot.context.properties.bind.BindResult' (OnClassCondition)

   SpringDocConfiguration#springdocBeanFactoryPostProcessor2:
      Did not match:
         - @ConditionalOnMissingClass found unwanted class 'org.springframework.boot.context.properties.bind.BindResult' (OnClassCondition)

   SpringDocConfiguration.SpringDocActuatorConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'org.springframework.boot.actuate.autoconfigure.endpoint.web.WebEndpointProperties' (OnClassCondition)

   SpringDocConfiguration.SpringDocRepositoryRestConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'org.springframework.data.rest.core.config.RepositoryRestConfiguration' (OnClassCondition)

   SpringDocConfiguration.SpringDocWebFluxSupportConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'reactor.core.publisher.Flux' (OnClassCondition)

   SpringDocDataRestConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'org.springframework.data.rest.core.config.RepositoryRestConfiguration' (OnClassCondition)

   SpringDocFunctionCatalogConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'org.springframework.cloud.function.web.function.FunctionEndpointInitializer' (OnClassCondition)

   SpringDocGroovyConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'groovy.lang.MetaClass' (OnClassCondition)

   SpringDocJacksonKotlinModuleConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'com.fasterxml.jackson.module.kotlin.KotlinModule' (OnClassCondition)

   SpringDocJavadocConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'com.github.therapi.runtimejavadoc.CommentFormatter' (OnClassCondition)

   SpringDocKotlinConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'kotlin.coroutines.Continuation' (OnClassCondition)

   SpringDocKotlinxConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'kotlinx.coroutines.flow.Flow' (OnClassCondition)

   SpringDocSecurityConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'org.springframework.security.web.SecurityFilterChain' (OnClassCondition)

   SpringDocSortConfiguration#delegatingMethodParameterCustomizer:
      Did not match:
         - @ConditionalOnMissingBean (types: org.springdoc.core.customizers.DelegatingMethodParameterCustomizer; SearchStrategy: all) found beans of type 'org.springdoc.core.customizers.DelegatingMethodParameterCustomizer' delegatingMethodParameterCustomizer (OnBeanCondition)

   SpringDocWebMvcConfiguration.SpringDocWebMvcActuatorConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'org.springframework.boot.actuate.endpoint.web.servlet.WebMvcEndpointHandlerMapping' (OnClassCondition)

   SwaggerConfig#springWebProvider:
      Did not match:
         - @ConditionalOnMissingBean (types: org.springdoc.core.providers.SpringWebProvider; SearchStrategy: all) found beans of type 'org.springdoc.core.providers.SpringWebProvider' springWebProvider (OnBeanCondition)

   SwaggerConfig#swaggerUiConfigParameters:
      Did not match:
         - @ConditionalOnMissingBean (types: org.springdoc.core.properties.SwaggerUiConfigParameters; SearchStrategy: all) found beans of type 'org.springdoc.core.properties.SwaggerUiConfigParameters' org.springdoc.core.properties.SwaggerUiConfigParameters (OnBeanCondition)

   SwaggerConfig#swaggerUiHome:
      Did not match:
         - @ConditionalOnProperty (springdoc.swagger-ui.use-root-path=true) did not find property 'springdoc.swagger-ui.use-root-path' (OnPropertyCondition)

   SwaggerConfig.SwaggerActuatorWelcomeConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'org.springframework.boot.actuate.endpoint.web.servlet.WebMvcEndpointHandlerMapping' (OnClassCondition)

   TaskExecutorConfigurations.SimpleAsyncTaskExecutorBuilderConfiguration#simpleAsyncTaskExecutorBuilderVirtualThreads:
      Did not match:
         - @ConditionalOnMissingBean (types: org.springframework.boot.task.SimpleAsyncTaskExecutorBuilder; SearchStrategy: all) found beans of type 'org.springframework.boot.task.SimpleAsyncTaskExecutorBuilder' simpleAsyncTaskExecutorBuilder (OnBeanCondition)

   TaskExecutorConfigurations.TaskExecutorConfiguration#applicationTaskExecutorVirtualThreads:
      Did not match:
         - @ConditionalOnThreading did not find VIRTUAL (OnThreadingCondition)

   TaskSchedulingAutoConfiguration#scheduledBeanLazyInitializationExcludeFilter:
      Did not match:
         - @ConditionalOnBean (names: org.springframework.context.annotation.internalScheduledAnnotationProcessor; SearchStrategy: all) did not find any beans named org.springframework.context.annotation.internalScheduledAnnotationProcessor (OnBeanCondition)

   TaskSchedulingConfigurations.SimpleAsyncTaskSchedulerBuilderConfiguration#simpleAsyncTaskSchedulerBuilderVirtualThreads:
      Did not match:
         - @ConditionalOnMissingBean (types: org.springframework.boot.task.SimpleAsyncTaskSchedulerBuilder; SearchStrategy: all) found beans of type 'org.springframework.boot.task.SimpleAsyncTaskSchedulerBuilder' simpleAsyncTaskSchedulerBuilder (OnBeanCondition)

   TaskSchedulingConfigurations.TaskSchedulerConfiguration:
      Did not match:
         - @ConditionalOnBean (names: org.springframework.context.annotation.internalScheduledAnnotationProcessor; SearchStrategy: all) did not find any beans named org.springframework.context.annotation.internalScheduledAnnotationProcessor (OnBeanCondition)

   ThymeleafAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'org.thymeleaf.spring6.SpringTemplateEngine' (OnClassCondition)

   TransactionAutoConfiguration#transactionalOperator:
      Did not match:
         - @ConditionalOnSingleCandidate (types: org.springframework.transaction.ReactiveTransactionManager; SearchStrategy: all) did not find any beans (OnBeanCondition)

   TransactionAutoConfiguration.AspectJTransactionManagementConfiguration:
      Did not match:
         - @ConditionalOnBean (types: org.springframework.transaction.aspectj.AbstractTransactionAspect; SearchStrategy: all) did not find any beans of type org.springframework.transaction.aspectj.AbstractTransactionAspect (OnBeanCondition)

   TransactionAutoConfiguration.EnableTransactionManagementConfiguration.JdkDynamicAutoProxyConfiguration:
      Did not match:
         - @ConditionalOnBooleanProperty (spring.aop.proxy-target-class=false) did not find property 'spring.aop.proxy-target-class' (OnPropertyCondition)

   UserDetailsServiceAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'org.springframework.security.authentication.AuthenticationManager' (OnClassCondition)

   WebClientAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'org.springframework.web.reactive.function.client.WebClient' (OnClassCondition)

   WebFluxAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'org.springframework.web.reactive.config.WebFluxConfigurer' (OnClassCondition)

   WebMvcAutoConfiguration#hiddenHttpMethodFilter:
      Did not match:
         - @ConditionalOnBooleanProperty (spring.mvc.hiddenmethod.filter.enabled=true) did not find property 'spring.mvc.hiddenmethod.filter.enabled' (OnPropertyCondition)

   WebMvcAutoConfiguration.ProblemDetailsErrorHandlingConfiguration:
      Did not match:
         - @ConditionalOnBooleanProperty (spring.mvc.problemdetails.enabled=true) did not find property 'spring.mvc.problemdetails.enabled' (OnPropertyCondition)

   WebMvcAutoConfiguration.ResourceChainCustomizerConfiguration:
      Did not match:
         - @ConditionalOnEnabledResourceChain did not find class org.webjars.WebJarVersionLocator (OnEnabledResourceChainCondition)

   WebMvcAutoConfiguration.WebMvcAutoConfigurationAdapter#beanNameViewResolver:
      Did not match:
         - @ConditionalOnMissingBean (types: org.springframework.web.servlet.view.BeanNameViewResolver; SearchStrategy: all) found beans of type 'org.springframework.web.servlet.view.BeanNameViewResolver' beanNameViewResolver (OnBeanCondition)

   WebServiceTemplateAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'org.springframework.oxm.Marshaller' (OnClassCondition)

   WebServicesAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'org.springframework.ws.transport.http.MessageDispatcherServlet' (OnClassCondition)

   WebSessionIdResolverAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'reactor.core.publisher.Mono' (OnClassCondition)

   WebSocketMessagingAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer' (OnClassCondition)

   WebSocketReactiveAutoConfiguration:
      Did not match:
         - @ConditionalOnWebApplication did not find reactive web application classes (OnWebApplicationCondition)

   WebSocketServletAutoConfiguration.JettyWebSocketConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'org.eclipse.jetty.ee10.websocket.jakarta.server.config.JakartaWebSocketServletContainerInitializer' (OnClassCondition)

   WebSocketServletAutoConfiguration.UndertowWebSocketConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required class 'io.undertow.websockets.jsr.Bootstrap' (OnClassCondition)

   XADataSourceAutoConfiguration:
      Did not match:
         - @ConditionalOnBean (types: org.springframework.boot.jdbc.XADataSourceWrapper; SearchStrategy: all) did not find any beans of type org.springframework.boot.jdbc.XADataSourceWrapper (OnBeanCondition)
      Matched:
         - @ConditionalOnClass found required classes 'javax.sql.DataSource', 'jakarta.transaction.TransactionManager', 'org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType' (OnClassCondition)


Exclusions:
-----------

    None


Unconditional classes:
----------------------

    org.springframework.boot.autoconfigure.context.ConfigurationPropertiesAutoConfiguration

    org.springframework.boot.autoconfigure.ssl.SslAutoConfiguration

    org.springframework.boot.autoconfigure.context.PropertyPlaceholderAutoConfiguration

    org.springframework.boot.autoconfigure.context.LifecycleAutoConfiguration

    org.springdoc.core.configuration.SpringDocSpecPropertiesConfiguration

    org.springframework.boot.autoconfigure.availability.ApplicationAvailabilityAutoConfiguration

    org.springframework.boot.autoconfigure.info.ProjectInfoAutoConfiguration



2025-08-10T02:30:14.267-03:00 DEBUG 22184 --- [calmarket] [  restartedMain] o.s.b.d.LoggingFailureAnalysisReporter   : Application failed to start due to an exception

java.lang.NoSuchMethodError: 'boolean org.springframework.boot.autoconfigure.hateoas.HateoasProperties.getUseHalAsDefaultJsonMediaType()'
	at org.springdoc.core.providers.HateoasHalProvider.isHalEnabled(HateoasHalProvider.java:78) ~[springdoc-openapi-starter-common-2.6.0.jar:2.6.0]
	at org.springdoc.core.providers.HateoasHalProvider.init(HateoasHalProvider.java:66) ~[springdoc-openapi-starter-common-2.6.0.jar:2.6.0]
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:103) ~[na:na]
	at java.base/java.lang.reflect.Method.invoke(Method.java:580) ~[na:na]
	at org.springframework.beans.factory.annotation.InitDestroyAnnotationBeanPostProcessor$LifecycleMethod.invoke(InitDestroyAnnotationBeanPostProcessor.java:457) ~[spring-beans-6.2.9.jar:6.2.9]
	at org.springframework.beans.factory.annotation.InitDestroyAnnotationBeanPostProcessor$LifecycleMetadata.invokeInitMethods(InitDestroyAnnotationBeanPostProcessor.java:401) ~[spring-beans-6.2.9.jar:6.2.9]
	at org.springframework.beans.factory.annotation.InitDestroyAnnotationBeanPostProcessor.postProcessBeforeInitialization(InitDestroyAnnotationBeanPostProcessor.java:219) ~[spring-beans-6.2.9.jar:6.2.9]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.applyBeanPostProcessorsBeforeInitialization(AbstractAutowireCapableBeanFactory.java:429) ~[spring-beans-6.2.9.jar:6.2.9]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.initializeBean(AbstractAutowireCapableBeanFactory.java:1818) ~[spring-beans-6.2.9.jar:6.2.9]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:607) ~[spring-beans-6.2.9.jar:6.2.9]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:529) ~[spring-beans-6.2.9.jar:6.2.9]
	at org.springframework.beans.factory.support.AbstractBeanFactory.lambda$doGetBean$0(AbstractBeanFactory.java:339) ~[spring-beans-6.2.9.jar:6.2.9]
	at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:373) ~[spring-beans-6.2.9.jar:6.2.9]
	at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:337) ~[spring-beans-6.2.9.jar:6.2.9]
	at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:202) ~[spring-beans-6.2.9.jar:6.2.9]
	at org.springframework.beans.factory.config.DependencyDescriptor.resolveCandidate(DependencyDescriptor.java:254) ~[spring-beans-6.2.9.jar:6.2.9]
	at org.springframework.beans.factory.support.DefaultListableBeanFactory.doResolveDependency(DefaultListableBeanFactory.java:1745) ~[spring-beans-6.2.9.jar:6.2.9]
	at org.springframework.beans.factory.support.DefaultListableBeanFactory.resolveDependency(DefaultListableBeanFactory.java:1628) ~[spring-beans-6.2.9.jar:6.2.9]
	at org.springframework.beans.factory.support.ConstructorResolver.resolveAutowiredArgument(ConstructorResolver.java:913) ~[spring-beans-6.2.9.jar:6.2.9]
	at org.springframework.beans.factory.support.ConstructorResolver.createArgumentArray(ConstructorResolver.java:791) ~[spring-beans-6.2.9.jar:6.2.9]
	at org.springframework.beans.factory.support.ConstructorResolver.instantiateUsingFactoryMethod(ConstructorResolver.java:546) ~[spring-beans-6.2.9.jar:6.2.9]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.instantiateUsingFactoryMethod(AbstractAutowireCapableBeanFactory.java:1375) ~[spring-beans-6.2.9.jar:6.2.9]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBeanInstance(AbstractAutowireCapableBeanFactory.java:1205) ~[spring-beans-6.2.9.jar:6.2.9]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:569) ~[spring-beans-6.2.9.jar:6.2.9]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:529) ~[spring-beans-6.2.9.jar:6.2.9]
	at org.springframework.beans.factory.support.AbstractBeanFactory.lambda$doGetBean$0(AbstractBeanFactory.java:339) ~[spring-beans-6.2.9.jar:6.2.9]
	at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:373) ~[spring-beans-6.2.9.jar:6.2.9]
	at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:337) ~[spring-beans-6.2.9.jar:6.2.9]
	at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:202) ~[spring-beans-6.2.9.jar:6.2.9]
	at org.springframework.beans.factory.config.DependencyDescriptor.resolveCandidate(DependencyDescriptor.java:254) ~[spring-beans-6.2.9.jar:6.2.9]
	at org.springframework.beans.factory.support.DefaultListableBeanFactory.addCandidateEntry(DefaultListableBeanFactory.java:1996) ~[spring-beans-6.2.9.jar:6.2.9]
	at org.springframework.beans.factory.support.DefaultListableBeanFactory.findAutowireCandidates(DefaultListableBeanFactory.java:1960) ~[spring-beans-6.2.9.jar:6.2.9]
	at org.springframework.beans.factory.support.DefaultListableBeanFactory.resolveMultipleBeanCollection(DefaultListableBeanFactory.java:1850) ~[spring-beans-6.2.9.jar:6.2.9]
	at org.springframework.beans.factory.support.DefaultListableBeanFactory.resolveMultipleBeans(DefaultListableBeanFactory.java:1818) ~[spring-beans-6.2.9.jar:6.2.9]
	at org.springframework.beans.factory.support.DefaultListableBeanFactory.doResolveDependency(DefaultListableBeanFactory.java:1694) ~[spring-beans-6.2.9.jar:6.2.9]
	at org.springframework.beans.factory.support.DefaultListableBeanFactory.createOptionalDependency(DefaultListableBeanFactory.java:2338) ~[spring-beans-6.2.9.jar:6.2.9]
	at org.springframework.beans.factory.support.DefaultListableBeanFactory.resolveDependency(DefaultListableBeanFactory.java:1612) ~[spring-beans-6.2.9.jar:6.2.9]
	at org.springframework.beans.factory.support.ConstructorResolver.resolveAutowiredArgument(ConstructorResolver.java:913) ~[spring-beans-6.2.9.jar:6.2.9]
	at org.springframework.beans.factory.support.ConstructorResolver.createArgumentArray(ConstructorResolver.java:791) ~[spring-beans-6.2.9.jar:6.2.9]
	at org.springframework.beans.factory.support.ConstructorResolver.instantiateUsingFactoryMethod(ConstructorResolver.java:546) ~[spring-beans-6.2.9.jar:6.2.9]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.instantiateUsingFactoryMethod(AbstractAutowireCapableBeanFactory.java:1375) ~[spring-beans-6.2.9.jar:6.2.9]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBeanInstance(AbstractAutowireCapableBeanFactory.java:1205) ~[spring-beans-6.2.9.jar:6.2.9]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:569) ~[spring-beans-6.2.9.jar:6.2.9]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:529) ~[spring-beans-6.2.9.jar:6.2.9]
	at org.springframework.beans.factory.support.AbstractBeanFactory.lambda$doGetBean$0(AbstractBeanFactory.java:339) ~[spring-beans-6.2.9.jar:6.2.9]
	at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:373) ~[spring-beans-6.2.9.jar:6.2.9]
	at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:337) ~[spring-beans-6.2.9.jar:6.2.9]
	at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:202) ~[spring-beans-6.2.9.jar:6.2.9]
	at org.springframework.beans.factory.support.DefaultListableBeanFactory.instantiateSingleton(DefaultListableBeanFactory.java:1222) ~[spring-beans-6.2.9.jar:6.2.9]
	at org.springframework.beans.factory.support.DefaultListableBeanFactory.preInstantiateSingleton(DefaultListableBeanFactory.java:1188) ~[spring-beans-6.2.9.jar:6.2.9]
	at org.springframework.beans.factory.support.DefaultListableBeanFactory.preInstantiateSingletons(DefaultListableBeanFactory.java:1123) ~[spring-beans-6.2.9.jar:6.2.9]
	at org.springframework.context.support.AbstractApplicationContext.finishBeanFactoryInitialization(AbstractApplicationContext.java:987) ~[spring-context-6.2.9.jar:6.2.9]
	at org.springframework.context.support.AbstractApplicationContext.refresh(AbstractApplicationContext.java:627) ~[spring-context-6.2.9.jar:6.2.9]
	at org.springframework.boot.web.servlet.context.ServletWebServerApplicationContext.refresh(ServletWebServerApplicationContext.java:146) ~[spring-boot-3.5.4.jar:3.5.4]
	at org.springframework.boot.SpringApplication.refresh(SpringApplication.java:752) ~[spring-boot-3.5.4.jar:3.5.4]
	at org.springframework.boot.SpringApplication.refreshContext(SpringApplication.java:439) ~[spring-boot-3.5.4.jar:3.5.4]
	at org.springframework.boot.SpringApplication.run(SpringApplication.java:318) ~[spring-boot-3.5.4.jar:3.5.4]
	at org.springframework.boot.SpringApplication.run(SpringApplication.java:1361) ~[spring-boot-3.5.4.jar:3.5.4]
	at org.springframework.boot.SpringApplication.run(SpringApplication.java:1350) ~[spring-boot-3.5.4.jar:3.5.4]
	at br.com.fiap.calmarket.CalmarketApplication.main(CalmarketApplication.java:10) ~[classes/:na]
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:103) ~[na:na]
	at java.base/java.lang.reflect.Method.invoke(Method.java:580) ~[na:na]
	at org.springframework.boot.devtools.restart.RestartLauncher.run(RestartLauncher.java:50) ~[spring-boot-devtools-3.5.4.jar:3.5.4]

2025-08-10T02:30:14.269-03:00 ERROR 22184 --- [calmarket] [  restartedMain] o.s.b.d.LoggingFailureAnalysisReporter   : 

***************************
APPLICATION FAILED TO START
***************************

Description:

An attempt was made to call a method that does not exist. The attempt was made from the following location:

    org.springdoc.core.providers.HateoasHalProvider.isHalEnabled(HateoasHalProvider.java:78)

The following method did not exist:

    'boolean org.springframework.boot.autoconfigure.hateoas.HateoasProperties.getUseHalAsDefaultJsonMediaType()'

The calling method's class, org.springdoc.core.providers.HateoasHalProvider, was loaded from the following location:

    jar:file:/C:/Users/xfran/.m2/repository/org/springdoc/springdoc-openapi-starter-common/2.6.0/springdoc-openapi-starter-common-2.6.0.jar!/org/springdoc/core/providers/HateoasHalProvider.class

The called method's class, org.springframework.boot.autoconfigure.hateoas.HateoasProperties, is available from the following locations:

    jar:file:/C:/Users/xfran/.m2/repository/org/springframework/boot/spring-boot-autoconfigure/3.5.4/spring-boot-autoconfigure-3.5.4.jar!/org/springframework/boot/autoconfigure/hateoas/HateoasProperties.class

The called method's class hierarchy was loaded from the following locations:

    org.springframework.boot.autoconfigure.hateoas.HateoasProperties: file:/C:/Users/xfran/.m2/repository/org/springframework/boot/spring-boot-autoconfigure/3.5.4/spring-boot-autoconfigure-3.5.4.jar


Action:

Correct the classpath of your application so that it contains compatible versions of the classes org.springdoc.core.providers.HateoasHalProvider and org.springframework.boot.autoconfigure.hateoas.HateoasProperties

[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  4.471 s
[INFO] Finished at: 2025-08-10T02:30:14-03:00
[INFO] ------------------------------------------------------------------------

Process finished with exit code 0
