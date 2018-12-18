import org.junit.jupiter.api.Test;

public class GreeterIT {
    @Test
    public void given_name_should_return_initials() {
        final String initials = new Greeter().getInitials("Mickey Mouse");
        System.out.println(initials);
    }
}
