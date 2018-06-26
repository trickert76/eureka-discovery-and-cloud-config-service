package my.server.sds;

//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * By default when Spring Security is on the classpath it will require that a valid CSRF token be 
 * sent with every request to the app. Eureka clients will not generally possess a valid cross site 
 * request forgery (CSRF) token you will need to disable this requirement for the /eureka/** endpoints
 * 
 * https://cloud.spring.io/spring-cloud-netflix/multi/multi_spring-cloud-eureka-server.html
 */
//@EnableWebSecurity
//class EurekaSecurityConfiguration extends WebSecurityConfigurerAdapter {
//  /**
//   * ignore authenticate für /eureka/
//   */
//  @Override
//  protected void configure(HttpSecurity http) throws Exception {
//    http.csrf().ignoringAntMatchers("/eureka/**");
//    super.configure(http);
//  }
//}