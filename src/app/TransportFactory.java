package app;

public abstract class TransportFactory {

    public Transport create() {
        Transport transport = createTransport();
        transport.move();
        return transport;
    }

    abstract Transport createTransport();
}
