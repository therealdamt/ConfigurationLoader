package xyz.damt.config;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(value = ElementType.FIELD)
public @interface ConfigProperty {

    /**
     * ConfigProperty Interface
     * Used in classes to register the config
     *
     * @return
     */

    String config() default "config";
    String path();

}
