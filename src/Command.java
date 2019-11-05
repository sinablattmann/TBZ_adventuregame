/**
 * a command consists of two words
 * @author Sina
 */
public class Command {
  private String commandWord;
  private String secondWord;

  public Command(String firstWord, String secondWord) {
    this.commandWord = firstWord;
    this.secondWord = secondWord;
  }

  public boolean isUnknown() {
    return (commandWord == null);
  }

  public boolean hasSecondWord() {
    return (secondWord != null);
  }

  public String getCommandWord() {
    return commandWord;
  }

  public String getSecondWord() {
    return secondWord;
  }
}
