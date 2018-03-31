package demo;

import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;

import javax.validation.constraints.Size;

@ShellComponent
public class AddingCommandDemo {

    @ShellMethod("Add two integers together.")
    public int add(int a, int b) {
        return a + b;
    }

    @ShellMethod("Display stuff.")
    public String echo(int a, int b, int c) {
        return String.format("You said a=%d, b=%d, c=%d", a, b, c);
    }

    @ShellMethod("Say hello.")
    public String greet(@ShellOption(defaultValue="World") String who) {
        return "Hello " + who;
    }

    @ShellMethod("Change password.")
    public String changePassword(@Size(min = 8, max = 40) String password) {
        return "Password successfully set to " + password;
    }
}
