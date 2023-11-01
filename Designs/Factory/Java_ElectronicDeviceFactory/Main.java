public class Main {
    public static void main(String[] args) {
        ElectronicDeviceFactory samsungFactory = new SamsungDeviceFactory();
        ElectronicDeviceFactory appleFactory = new AppleDeviceFactory();

        ElectronicDevice s23 = samsungFactory.createDevice(Devices.SMARTPHONE, "S23", 2000, "10 Remaining");
        ElectronicDevice macbook = appleFactory.createDevice(Devices.LAPTOP, "Macbook m1 pro", 1700, "3 Remaining");



        System.out.print(s23.Summery());
        System.out.println("=============================");
        System.out.print(macbook.Summery());
    }
}