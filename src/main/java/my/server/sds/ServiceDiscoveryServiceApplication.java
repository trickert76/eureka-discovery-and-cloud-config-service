package my.server.sds;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.WebApplicationInitializer;

/**
 * This is a Eureka Discovery Service.
 * It also contains a Cloud configuration service.
 */
@EnableEurekaServer
@EnableConfigServer
@Configuration
@EnableAutoConfiguration
@EnableDiscoveryClient
@SpringBootApplication
public class ServiceDiscoveryServiceApplication extends SpringBootServletInitializer implements WebApplicationInitializer {

  /**
   * Da wir die Anwendung vom SpringBoot ServletInitializer abhaengig machen, muessen wir diesem auch
   * eine Konfiguration anvertrauen.
   */
  @Override
  protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
      return application.sources(ServiceDiscoveryServiceApplication.class);
  }
	
  /**
   * Startet die Anwendung im Single User Betrieb.
   */
  public static void main(String[] args) {
    SpringApplication.run( ServiceDiscoveryServiceApplication.class );
  }
}