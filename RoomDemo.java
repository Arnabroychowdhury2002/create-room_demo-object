// Room class
class Room {
    double height;
    double length;
    double breadth;

    // Method to set values for height, length, and breadth
    void setValues(double h, double l, double b) {
        height = h;
        length = l;
        breadth = b;
    }

    // Method to calculate and return the volume
    double calculateVolume() {
        return height * length * breadth;
    }
}

// RoomDemo class
public class RoomDemo {
    public static void main(String[] args) {
        // Creating an object of the Room class
        Room myRoom = new Room();

        // Setting values for height, length, and breadth
        myRoom.setValues(3.0, 4.0, 5.0);

        // Calculating and printing the volume
        double volume = myRoom.calculateVolume();
        System.out.println("Volume of the room: " + volume);
    }
}
