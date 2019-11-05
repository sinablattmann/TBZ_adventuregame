import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Tests {
  @Test
  public void isCommandValidShouldReturnTrue() {
    CommandWords commandWords = new CommandWords();
    assertTrue(commandWords.isCommandValid("help"));
    assertTrue(commandWords.isCommandValid("go"));
  }

  @Test
  public void ifDirectionIsNorthShouldGoNorth() {
    Room room = new Room("idk", "hey");
    Room northRoom = new Room("northRoom", "idk man");
    room.setExits(northRoom, null, null, null);
    assertEquals(room.nextRoom("north"), northRoom);
  }

}
