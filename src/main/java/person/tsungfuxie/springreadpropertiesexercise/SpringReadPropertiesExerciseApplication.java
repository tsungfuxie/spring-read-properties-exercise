package person.tsungfuxie.springreadpropertiesexercise;

import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import person.tsungfuxie.springreadpropertiesexercise.properties.DemoReadProperties;

@SpringBootApplication
public class SpringReadPropertiesExerciseApplication implements ApplicationRunner {

	private static Logger logger = LoggerFactory.getLogger(SpringReadPropertiesExerciseApplication.class);
	
	@Autowired
	private DemoReadProperties demoReadProperties;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringReadPropertiesExerciseApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		// TODO Auto-generated method stub
		logger.info("Hello world!");
		logger.info("====================Read Configuration===================");
		logger.info("user name = {}", demoReadProperties.getConfigTypeUserName());
		logger.info("user id = {}", demoReadProperties.getConfigTypeUserId());
		logger.info("user mail = {}", demoReadProperties.getConfigTypeUserMail());
		logger.info("ConfigTypeDemoDefault = {}", demoReadProperties.getConfigTypeDemoDefault());
		logger.info("StringArrayWithDefaults(length = {}) = [{}]", demoReadProperties.getConfigTypeStringArrayWithDefaults().length, String.join(",", demoReadProperties.getConfigTypeStringArrayWithDefaults()));
		logger.info("IntArrayWithDefaults(length = {}) = [{}]", demoReadProperties.getConfigTypeIntArrayWithDefaults().length, String.join(",", demoReadProperties.getConfigTypeIntArrayWithDefaults()));
		logger.info("spelWithSystemPropertiesValue = {}", demoReadProperties.getSpelWithSystemPropertiesValue());
		
	}
	
//	@Bean
//	public CommandLineRunner commandLineRunner(ApplicationContext context) {
//		return args -> {
//			logger.info("Let's inspect the beans provided by Spring Boot:");
//			String[] beanNames = context.getBeanDefinitionNames();
//			Arrays.sort(beanNames);
//			for (String beanName : beanNames) {
//				logger.info(beanName);
//			}
//		};
//	}

}
