package pl.adcom.teai_jdbctemplate_car.config;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.*;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

@Configuration
public class DbConfig {

    @Bean
    public DataSource getDataSource(){
        DataSourceBuilder dataSourceBuilder =
                DataSourceBuilder.create();
        dataSourceBuilder.url("*******************");
        dataSourceBuilder.username("*************");
        dataSourceBuilder.password("*********************");
        dataSourceBuilder.driverClassName("com.mysql.cj.jdbc.Driver");

        return dataSourceBuilder.build();
    }

    @Bean
    public JdbcTemplate getJdbcTemplate(){
        return new JdbcTemplate(getDataSource());
    }
}