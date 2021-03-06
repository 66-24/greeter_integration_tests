import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class GreeterIT {
    @Test
    public void given_name_should_return_initials() {
        final String initials = new Greeter().getInitials("Mickey Mouse");
        assertThat(initials).isEqualTo("MM");
    }
}
