package com.yencheng.event.management.configuration

import com.zaxxer.hikari.HikariDataSource
import org.jooq.DSLContext
import org.jooq.SQLDialect
import org.jooq.impl.DSL
import org.springframework.jdbc.datasource.TransactionAwareDataSourceProxy
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import javax.sql.DataSource

@Configuration
class DataSourceConfiguration {

    @Bean
    fun dataResource(): DataSource {
        val dataSource = HikariDataSource()
        dataSource.jdbcUrl = "jdbc:mysql://localhost:3306/event"
        dataSource.username = "root"
        dataSource.password = "root"
        return dataSource
    }

    @Bean
    fun dslContext(dataSource: DataSource): DSLContext{
        return DSL.using(TransactionAwareDataSourceProxy(dataSource), SQLDialect.MYSQL)
    }
}