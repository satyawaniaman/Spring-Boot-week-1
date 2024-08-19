package com.week1Introduction.introductionToSpringBoot;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name="deploy.env",havingValue = "production")
public class ProdDB implements DB{
    public String getData(){
        return "Production data";
    }
}
