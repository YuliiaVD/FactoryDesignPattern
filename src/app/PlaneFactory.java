package app;

public class PlaneFactory extends TransportFactory{

    @Override
    Transport createTransport() {
        return new Plane();
    }

}
