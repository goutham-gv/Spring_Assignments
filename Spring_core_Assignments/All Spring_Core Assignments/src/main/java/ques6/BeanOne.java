package ques6;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Component;


@Component
public class BeanOne {
   
   private BeanTwo beanTwo;

   @Required
   @Resource  // @Inject or @Autowire can be used too
   public void setBeanTwo(BeanTwo beanTwo) {
      this.beanTwo = beanTwo;
   }
   
   public void doSomething(){
      System.out.println("Inside do doSomething() method of BeanOne");
      beanTwo.doSomething();
   }
}