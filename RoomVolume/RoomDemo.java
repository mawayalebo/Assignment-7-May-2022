package RoomVolume;

public class RoomDemo {
    
    public static void main(String[] args) {
        //instances of rooms, and display the volume of room.
        Room r1 = new Room(10, 20, 15);
        Room r2 = new Room(5, 10, 20);
        
        System.out.println("Volume of r1 is " + r1.volume());
        System.out.println("Volume of r2 is " + r2.volume());
    }
}
