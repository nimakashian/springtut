package ch3.p2;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class MagicCondition implements Condition {
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        Environment env=conditionContext.getEnvironment();
        System.out.println(env.getProperty("magic"));
        return env.containsProperty("magic");
//        return true;
    }
}
