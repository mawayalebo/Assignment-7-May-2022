//class "room" with "height", "width" and "breadth" fields.
package RoomVolume;

class Room {
    int height;
    int width;
    int breadth;
    //constructor
    Room(int h, int w, int b) {
        height = h;
        width = w;
        breadth = b;
    }
    //method to calculate volume
    int volume() {
        return height * width * breadth;
    }
}