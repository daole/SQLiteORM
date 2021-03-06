package com.dreamdigitizers.androidsqliteorm.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD})
public @interface Relationship {
    boolean optional() default false;
    Class<?> foreignTableClass() default void.class;
    String foreignColumnName() default "";
}
