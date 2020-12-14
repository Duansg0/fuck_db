//package com.duansg.fuck.db.config;
//
//import org.apache.ibatis.session.SqlSessionFactory;
//import org.apache.shardingsphere.driver.api.yaml.YamlShardingSphereDataSourceFactory;
//import org.mybatis.spring.SqlSessionFactoryBean;
//import org.mybatis.spring.SqlSessionTemplate;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Primary;
//import org.springframework.jdbc.datasource.DataSourceTransactionManager;
//import org.springframework.transaction.support.TransactionTemplate;
//import javax.sql.DataSource;
//import java.io.File;
//import java.io.IOException;
//import java.sql.SQLException;
//
///**
// * ShardingDataSourceConfig
// *
// * @author Duansg
// * @version 1.0
// * @date 2020/12/10 下午9:38
// */
//@Configuration
//public class ShardingDataSourceMybatisConfig {
//
//    @Bean
//    @Primary
//    public DataSource getDataSource() throws SQLException, IOException {
//        File file = new File(Thread.currentThread().getClass().getResource("/sharding-databases.yml").getFile());
//        return YamlShardingSphereDataSourceFactory.createDataSource(file);
//    }
//
//    @Primary
//    @Bean("sqlSessionFactory")
//    public SqlSessionFactory sqlSessionFactory() throws Exception {
//        SqlSessionFactoryBean sqlSessionFactory = new SqlSessionFactoryBean();
//        sqlSessionFactory.setDataSource(getDataSource());
//        return sqlSessionFactory.getObject();
//    }
//
//    @Primary
//    @Bean("transactionManager")
//    public DataSourceTransactionManager transactionManager(DataSource dataSource) {
//        return new DataSourceTransactionManager(dataSource);
//    }
//
//    @Primary
//    @Bean("sqlSessionTemplate")
//    public SqlSessionTemplate sqlSessionTemplate(@Qualifier("sqlSessionFactory") SqlSessionFactory sqlSessionFactory) {
//        return new SqlSessionTemplate(sqlSessionFactory);
//    }
//
//    @Bean("transactionTemplate")
//    @Primary
//    public TransactionTemplate initTransactionTemplate(@Qualifier("transactionManager") DataSourceTransactionManager dataSourceTransactionManager) throws Exception {
//        return new TransactionTemplate(dataSourceTransactionManager);
//    }
//
//}
