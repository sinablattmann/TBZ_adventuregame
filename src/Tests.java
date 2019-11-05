import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * This class is used to test methods
 * @author Sina
 */
public class Tests {

  /**
   * checks if true is returned when the command is valid
   */
  @Test
  public void isCommandValidShouldReturnTrue() {
    CommandWords commandWords = new CommandWords();
    assertTrue(commandWords.isCommandValid("help"));
    assertTrue(commandWords.isCommandValid("go"));
  }

  /**
   * checks if the direction is correct
   */
  @Test
  public void ifDirectionIsNorthShouldGoNorth() {
    Room room = new Room("idk", "hey");
    Room northRoom = new Room("northRoom", "idk man");
    room.setExits(northRoom, null, null, null);
    assertEquals(room.nextRoom("north"), northRoom);
  }

}
