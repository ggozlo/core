package hello.core.beanDefination;

import hello.core.AppConfig;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class BeanDefinatitionTest {
   GenericXmlApplicationContext context = new GenericXmlApplicationContext("appConfig.xml");

   @Test
    @DisplayName("빈 설정 메타정보 확인")
    void findApplicationBean() {
       String[] beanDefinitionNames = context.getBeanDefinitionNames();
       for (String beanDefinitionName : beanDefinitionNames) {
           BeanDefinition beanDefinition = context.getBeanDefinition(beanDefinitionName);

            if(beanDefinition.getRole()==BeanDefinition.ROLE_APPLICATION) {
                System.out.println("beanDefinitionName = " + beanDefinitionName +
                " beanDefinition = "+beanDefinition);


            }
       }
   }

}
