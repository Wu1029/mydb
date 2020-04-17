package cn.kgc.bdqn.itrip;

import cn.kgc.mp.entity.Employee;
import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.LambdaUpdateWrapper;
import com.baomidou.mybatisplus.core.toolkit.StringPool;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.InjectionConfig;
import com.baomidou.mybatisplus.generator.config.*;
import com.baomidou.mybatisplus.generator.config.po.TableFill;
import com.baomidou.mybatisplus.generator.config.po.TableInfo;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ItripApplicationTests {

    public static void main(String[] args) {
        // 代码生成器
        AutoGenerator mpg = new AutoGenerator();

        // 全局配置
        GlobalConfig gc = new GlobalConfig();
        gc.setOutputDir("E:/study_project/itrip/src/main/java")
                .setActiveRecord(true)
                .setAuthor("jie")
                .setIdType(IdType.AUTO)
                .setServiceName("%sService")
                .setBaseResultMap(true)
                .setBaseColumnList(true);

        //2.数据源配置
        DataSourceConfig dataSourceConfig = new DataSourceConfig();
        dataSourceConfig.setDbType(DbType.MYSQL)    //告诉他数据库类型
                .setDriverName("com.mysql.jdbc.Driver")
                .setUrl("jdbc:mysql:///employee?serverTimezone=UTC")
                .setUsername("root")
                .setPassword("root");
        //3.策略配置
        StrategyConfig strategyConfig = new StrategyConfig();
        strategyConfig.setCapitalMode(true) //全局大写
                .setControllerMappingHyphenStyle(true) //驼峰命名规则
                .setNaming(NamingStrategy.underline_to_camel)
                .setTablePrefix("tbl_")
                .setInclude("tbl_employee");
        //4.包名策略
        PackageConfig packageConfig = new PackageConfig();
        packageConfig.setParent("cn.kgc.mp")
                .setEntity("entity")
                .setMapper("mapper")
                .setXml("mapper")
                .setController("controller")
                .setService("service")
                .setServiceImpl("service.impl");
        //5.整合
        AutoGenerator autoGenerator = new AutoGenerator();
        autoGenerator.setPackageInfo(packageConfig)
                .setGlobalConfig(gc)
                .setStrategy(strategyConfig)
                .setDataSource(dataSourceConfig);
        //6.执行
        autoGenerator.execute();
    }


    @Test
    public void contextLoads() {
    }
}
