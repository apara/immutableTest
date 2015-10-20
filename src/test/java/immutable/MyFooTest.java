package immutable;

import org.junit.Test;

/**
 * Created by aparansky on 10/20/15.
 */
public class MyFooTest {
    @Test
    public void fromMethodsShouldExist() {

        ImmutableFooImpl.builder().from(
            new Foo() {
                @Override
                public int getA() {
                    return 0;
                }

                @Override
                public int getB() {
                    return 0;
                }
            }
        );

        ImmutableFooImpl.builder().from(
            ImmutableFooImpl
                .builder()
                .a(1)
                .b(2)
                .build()
        );
    }
}
