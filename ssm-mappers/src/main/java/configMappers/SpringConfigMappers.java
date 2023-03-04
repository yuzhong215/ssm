package configMappers;

import com.alibaba.druid.pool.DruidDataSource;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
@ComponentScan("pojo")
public class SpringConfigMappers {

    //数据源
    @Bean
    public DataSource getDataSource(
            @Value("com.mysql.cj.jdbc.Driver") String driverClassName,
            @Value("jdbc:mysql://127.0.0.1:3306/freetext?useServerPrepStmts=true")String url,
            @Value("root")String username,
            @Value("123456")String password)
    {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName(driverClassName);
        dataSource.setUrl(url);
        dataSource.setUsername(username);
        dataSource.setPassword(password);
        return dataSource;
    }

    //SqlSessionFactoryBean
    @Bean
    public SqlSessionFactoryBean getSqlSessionFactoryBean(
            @Qualifier("getDataSource") DataSource dataSource
    ){
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource);
        return sqlSessionFactoryBean;
    }

}
