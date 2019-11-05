import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * this class is used to check and process the commands
 * @author Sina
 */
public class Parser {

  private CommandWords commands;

  public Parser() {
    commands = new CommandWords();
  }

  /**
   * checks if the command is valid and returns the wanted command
   * @return the wanted command
   */
  public Command getCommand() throws CommandNotValidException{
    String inputLine = "";
    System.out.print("> ");
    BufferedReader reader =
            new BufferedReader(new InputStreamReader(System.in));
    try {
      inputLine = reader.readLine();
    } catch (java.io.IOException exc) {
      System.out.println("There was an error");
    }
    String[] allWords = inputLine.split("\\W+");
    if (commands.isCommandValid(allWords[0])) {
      if (allWords.length > 1) {
        return new Command(allWords[0], allWords[1]);
      } else {
        return new Command(allWords[0], null);
      }
    }else{
      throw new CommandNotValidException();
    }
  }

}
