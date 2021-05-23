package hello.core.BeanFind;

import hello.core.AppConfig;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

 class ApplicationContextInfoTest {

    AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);

    @Test
    @DisplayName("모든 빈 출력하기기")
    void fineAllBean() {
        String[] BeanDefinitionName = ac.getBeanDefinitionNames();
        for (String beanDefinationName : BeanDefinitionName) {
            Object bean = ac.getBean(beanDefinationName);
            System.out.println("name = " + beanDefinationName + " object = " + bean);
        }
    }

    @Test
    @DisplayName("애플리케이션 빈 출력하기기")
    void fineApplicationBean() {
        String[] BeanDefinitionName = ac.getBeanDefinitionNames();
        for (String beanDefinationName : BeanDefinitionName) {
            BeanDefinition beanDefinition =  ac.getBeanDefinition(beanDefinationName);


            if(beanDefinition.getRole() == BeanDefinition.ROLE_APPLICATION) {
                Object bean = ac.getBean(beanDefinationName);
                System.out.println("name = " + beanDefinationName + " object = " + bean);
            }
        }
    }

}
