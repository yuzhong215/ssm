package configService;

import com.alibaba.druid.pool.DruidDataSource;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

@Configuration
@ComponentScan("service")
@MapperScan("mappers")
@EnableTransactionManagement
public class SpringConfigService {

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

    //声明式事务管理
    @Bean
    public DataSourceTransactionManager getDataSourceTransactionManager(
            @Qualifier("getDataSource") DataSource dataSource
    ){
        DataSourceTransactionManager transactionManager = new DataSourceTransactionManager();
        transactionManager.setDataSource(dataSource);
        return transactionManager;
    }
}
