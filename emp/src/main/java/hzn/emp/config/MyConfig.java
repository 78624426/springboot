package hzn.emp.config;

import com.alibaba.druid.pool.DruidDataSource;
import hzn.emp.bean.LoginInterceptor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.sql.DataSource;

@Configuration
public class MyConfig implements WebMvcConfigurer{
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/showLogin").setViewName("login");
        //registry.addViewController("/showEmps").setViewName("emps");
    }

    @Bean//把把返回的对象放入spring的容器中
    @ConfigurationProperties(prefix = "spring.datasource")//会到yml中获取属性值注入
    public DataSource druid(){
        return new DruidDataSource();
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginInterceptor()).addPathPatterns("/**").excludePathPatterns("/login","/showLogin");
    }
}
