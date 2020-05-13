package modules.transporttype;

public enum TransportType {
    WALK("walk"),
    CAR("car"),
    BUS("bus"),
    BIKE("bike");

    private String value;

    private TransportType(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }
}