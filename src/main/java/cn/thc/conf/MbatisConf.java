package cn.thc.conf;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;

/**
 * Created by thc on 2017/2/24
 */
@Configuration
public class MbatisConf {

    @Value("${datasource.driverClass}")
    private String driverClass;
    @Value("${datasource.jdbcUrl}")
    private String jdbcUrl;
    @Value("${datasource.user}")
    private String user;
    @Value("${datasource.password}")
    private String password;
    @Value("${datasource.initialPoolSize}")
    private int initialPoolSize;
    @Value("${datasource.maxStatements}")
    private int maxStatements;
    @Value("${datasource.maxPoolSize}")
    private int maxPoolSize;

    @Bean
    public DataSource dataSource() throws PropertyVetoException {
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        dataSource.setDriverClass(driverClass);
        dataSource.setJdbcUrl(jdbcUrl);
        dataSource.setUser(user);
        dataSource.setPassword(password);
        dataSource.setInitialPoolSize(initialPoolSize);
        dataSource.setMaxStatements(maxStatements);
        dataSource.setMaxPoolSize(maxPoolSize);
        dataSource.setIdleConnectionTestPeriod(18000);
        dataSource.setMaxIdleTime(25000);
        return dataSource;
    }

}
