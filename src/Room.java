import java.util.ArrayList;
import java.util.HashMap;

/**
 * In this class you can set the exits of Rooms as well as assigning an Item or a creature
 * @author Sina
 */
public class Room {
  private String welcomeMessage;
  private String description;
  private HashMap exits;
  private ArrayList<Item> items;
  private Creature creature;

  public Room(String description, String welcomeMessage) {
    this.description = description;
    this.welcomeMessage = welcomeMessage;
    this.items = new ArrayList<Item>();
    exits = new HashMap();
  }

  /**
   * is called to set the exits of each room
   * @param north
   * @param east
   * @param south
   * @param west
   */
  public void setExits(Room north, Room east, Room south, Room west) {
    if (north != null)
      exits.put("north", north);
    if (east != null)
      exits.put("east", east);
    if (south != null)
      exits.put("south", south);
    if (west != null)
      exits.put("west", west);
  }

  /**
   * assigns an item to a room
   * @param item
   */
  public void setItem(Item item){
    if(item != null)
      items.add(item);
  }

  /**
   * is used to go to the next room
   * @param direction
   * @return
   */
  public Room nextRoom(String direction)
  {
    return (Room)exits.get(direction);
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public HashMap getExits() {
    return exits;
  }

  public void setExits(HashMap exits) {
    this.exits = exits;
  }

  public String getWelcomeMessage() {
    return welcomeMessage;
  }

  public void setWelcomeMessage(String welcomeMessage) {
    this.welcomeMessage = welcomeMessage;
  }

  public ArrayList getItems() {
    return items;
  }

  public void setItems(ArrayList<Item> items) {
    this.items = items;
  }

  public Creature getCreature() {
    return creature;
  }

  public void setCreature(Creature creature) {
    this.creature = creature;
  }
}
