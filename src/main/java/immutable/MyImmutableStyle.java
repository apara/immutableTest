package immutable;

import org.immutables.value.Value;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


/**
 * Created by aparansky on 7/16/15.
 */
@Retention(RetentionPolicy.CLASS)
@Target({ElementType.PACKAGE, ElementType.TYPE})
@org.immutables.value.Value.Style(
    visibility = Value.Style.ImplementationVisibility.SAME,
    builder = "builder",
    typeBuilder = "Immutable*Builder",
    get = {"is*", "get*"},
    //init="set*",
    //strictBuilder = true, //prevents the use of new Builder().from() as from needs to populate builder first
    typeAbstract = "*",
    typeImmutable = "Immutable*"
)
public @interface MyImmutableStyle {
}

