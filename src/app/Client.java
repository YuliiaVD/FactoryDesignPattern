package app;

public class Client {

    public static void main(String[] args) {

        Client client = new Client();
        client.run("Pla");

    }

    public void run(String type) {
        if(type.equals("Car")) {
            TransportFactory carFactory = new CarFactory();
            Transport car = carFactory.createTransport();
            car.move();
        } else if (type.equals("Plane")) {
            TransportFactory planeFactory = new PlaneFactory();
            Transport plane = planeFactory.createTransport();
            plane.move();
        } else {
            System.out.println("The type is not exiting");
        }
    }


}
