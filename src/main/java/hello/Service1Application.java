package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.web.filter.ShallowEtagHeaderFilter;

@SpringBootApplication
public class Service1Application {

	public static void main(String[] args) {
		SpringApplication.run(Service1Application.class, args);
	}
	 @Bean
	  public ShallowEtagHeaderFilter shallowEtagHeaderFilter() {
	    return new ShallowEtagHeaderFilter();
	  }

	  @Bean
	  public FilterRegistrationBean<ShallowEtagHeaderFilter> shallowEtagHeaderFilterRegistration(ShallowEtagHeaderFilter shallowEtagHeaderFilter) {
	    FilterRegistrationBean<ShallowEtagHeaderFilter> result = new FilterRegistrationBean<>();
	    result.setFilter(shallowEtagHeaderFilter);
	    result.addUrlPatterns("/api/*");
	    result.setName("shallowEtagHeaderFilter");
	    result.setOrder(1);
	    return result;
	  }
}
