package app;

public class Client {

    public static void main(String[] args) {

        Client client = new Client();
        client.run("Car");

    }

    public void run(String type) {
        if(type == "Car") {
            TransportFactory carFactory = new CarFactory();
            Transport car = carFactory.createTransport();
            car.move();
        } else if (type == "Plane") {
            TransportFactory planeFactory = new PlaneFactory();
            Transport plane = planeFactory.createTransport();
            plane.move();
        } else {
            System.out.println("The type is not exiting");
        }
    }


}
