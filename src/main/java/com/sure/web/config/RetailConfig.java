package com.sure.web.config;

import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.annotation.EnableTransactionManagement;



/**
 * @author Surendra Kumar
 * @purpose This class is used to Provide Database Connection.
 */


@Configuration
@EnableJpaRepositories("com.sure.web.repo")
@ComponentScan("com.sure.web")
@EnableTransactionManagement
public class RetailConfig {
	
	@Autowired
	private Environment env;
	private static final Logger LOGGER = LoggerFactory.getLogger(RetailConfig.class);

	@Bean
	public DriverManagerDataSource dataSource() {
		LOGGER.info("RetailConfig dataSource method Start.>> TimeStamp: "+ System.currentTimeMillis());
		
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName(env.getProperty("spring.datasource.driverClassName"));
		dataSource.setUrl(env.getProperty("spring.datasource.url"));
		dataSource.setUsername(env.getProperty("spring.datasource.username"));
		dataSource.setPassword(env.getProperty("spring.datasource.password"));
		
		LOGGER.info("RetailConfig dataSource method END.>> TimeStamp: "+ System.currentTimeMillis());
		return dataSource;
	}

	@Bean
	public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
		
		LOGGER.info("RetailConfig entityManagerFactory method Start.>> TimeStamp: "+ System.currentTimeMillis());
		LocalContainerEntityManagerFactoryBean factory = new LocalContainerEntityManagerFactoryBean();
		Properties hibernateProperties = new Properties();
		hibernateProperties.setProperty("hibernate.dialect", env.getProperty("hibernate.dialect"));
		hibernateProperties.setProperty("hibernate.show_sql", env.getProperty("hibernate.show_sql"));
		hibernateProperties.setProperty("hibernate.format_sql", env.getProperty("hibernate.format_sql"));
		hibernateProperties.setProperty("hibernate.hbm2ddl.auto", env.getProperty("hibernate.hbm2ddl.auto"));
		factory.setPackagesToScan(env.getProperty("wm.package.basepackage"));
		factory.setDataSource(dataSource());
		factory.setJpaProperties(hibernateProperties);
		HibernateJpaVendorAdapter jpaVendorAdapter = new HibernateJpaVendorAdapter();
		factory.setJpaVendorAdapter(jpaVendorAdapter);
		LOGGER.info("RetailConfig entityManagerFactory method END.>> TimeStamp: "+ System.currentTimeMillis());
		return factory;
	}

}
