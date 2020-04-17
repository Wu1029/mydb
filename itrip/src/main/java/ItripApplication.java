/*
import org.mybatis.spring.annotation.MapperScan;*/
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;
/*import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.interceptor.TransactionInterceptor;*/

@SpringBootApplication
@EnableTransactionManagement
@ComponentScan("cn.kgc")      //扫描注解元素
@MapperScan("cn.kgc.bdqn.dao")      //Mybatis的DAO所在包
public class ItripApplication {

    public static void main(String[] args) {
        SpringApplication.run(ItripApplication.class, args);
    }

    /*public static final String transactionExecution = "execution (* cn.kgc.bdqn.service..*(..))";

    @Autowired
    private DataSource dataSource;

    //声明式事务

    @Bean
    public DefaultPointcutAdvisor defaultPointcutAdvisor() {

        AspectJExpressionPointcut pointcut = new AspectJExpressionPointcut();

        pointcut.setExpression(transactionExecution);

        DefaultPointcutAdvisor advisor = new DefaultPointcutAdvisor();

        advisor.setPointcut(pointcut);

        Properties attributes = new Properties();

        attributes.setProperty("get*", "PROPAGATION_REQUIRED,-Exception");

        attributes.setProperty("add*", "PROPAGATION_REQUIRED,-Exception");

        attributes.setProperty("update*", "PROPAGATION_REQUIRED,-Exception");

        attributes.setProperty("delete*", "PROPAGATION_REQUIRED,-Exception");

        TransactionInterceptor txAdvice = new TransactionInterceptor(new DataSourceTransactionManager(dataSource), attributes);

        advisor.setAdvice(txAdvice);

        return advisor;

    }*/
}
