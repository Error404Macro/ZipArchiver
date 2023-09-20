package command;
import archiver.Console;
public class ExitCommand implements Command {
    @Override
    public void execute() throws Exception {
        Console.writeMessage("До встречи!");
    }
}
