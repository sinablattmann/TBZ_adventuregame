/**
 * Creatures can be assigned to Rooms
 * @author sina
 */
public class Creature {
  private String name;
  private String description;
  private Item defeatItem;

  public Creature(String name, String description, Item defeatItem) {
    this.name = name;
    this.description = description;
    this.defeatItem = defeatItem;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Item getDefeatItem() {
    return defeatItem;
  }

  public void setDefeatItem(Item defeatItem) {
    this.defeatItem = defeatItem;
  }
}
