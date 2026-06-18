public class DeviceManager {

    public static void main(String[] args) {

        ElectronicDevice[] devices = {
                new Printer(),
                new Scanner()
        };

        for(ElectronicDevice d : devices) {
            d.powerOn();
        }
    }
}