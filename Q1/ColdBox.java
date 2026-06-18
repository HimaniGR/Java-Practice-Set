public class ColdBox extends StorageUnit implements Refrigerated {

    public ColdBox(int id, double capacity) {
        super(id, capacity);
    }

    @Override
    public void adjustTemp(int temp) {
        System.out.println("Temperature adjusted to " + temp + "°C");
    }
}
