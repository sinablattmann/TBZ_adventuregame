/**
 * This class has all the commands as final Strings, checks also if command is valid
 * @author Sina
 */
public class CommandWords {
  public static final String[] validCommands = {
          "help", "go", "exit", "show"
  };

  public CommandWords() {

  }

  /**
   *  checks if command is valid
   * @param commandWord
   * @return true if it's valid
   */
  public boolean isCommandValid(String commandWord) {
    for (int i = 0; i < validCommands.length; i++) {
      if (commandWord.equals(validCommands[i])) {
        return true;
      }
    }
    return false;
  }

  /**
   * shows all valid commands
   */
  public void showAll(){
    for(int i = 0; i < validCommands.length; i++){
      System.out.println(validCommands[i]);
    }
  }
}
