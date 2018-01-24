package org.superbiz.moviefun;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public ServletRegistrationBean getServletRegistrationBean(ActionServlet actionServlet) {
        ServletRegistrationBean registrationBean = new ServletRegistrationBean(actionServlet);
        registrationBean.addUrlMappings("/moviefun/*");
        return registrationBean;
    }
}
