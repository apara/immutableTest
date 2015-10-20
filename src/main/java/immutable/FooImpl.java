package immutable;

import org.immutables.value.Value;

/**
 * Created by aparansky on 10/20/15.
 */
@MyImmutableStyle
@Value.Immutable
public abstract class FooImpl implements Foo {

    /** Uncomment the following to see the build failure
     */

    //@Override
    //public abstract int getA();

    @Override
    public abstract int getB();
}
