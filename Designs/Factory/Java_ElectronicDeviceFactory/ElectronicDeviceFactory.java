public abstract class ElectronicDeviceFactory {
    public abstract ElectronicDevice createDevice(Devices device, String model, Integer price, String description);
}


class SamsungDeviceFactory extends ElectronicDeviceFactory{
    @Override
    public ElectronicDevice createDevice(Devices device, String model, Integer price, String description) {
        ElectronicDevice dev = null;
        switch (device) {
            case Devices.SMARTPHONE -> dev = new Smartphone(model, price, description);
            case Devices.LAPTOP -> dev = new Laptop(model, price, description);
            case Devices.TABLET -> dev = new Tablet(model, price, description);
        }
        dev.setBrand("Samsung");
        return dev;
    }
}

class AppleDeviceFactory extends ElectronicDeviceFactory{
    @Override
    public ElectronicDevice createDevice(Devices device, String model, Integer price, String description) {
        ElectronicDevice dev = null;
        switch (device) {
            case Devices.SMARTPHONE -> dev = new Smartphone(model, price, description);
            case Devices.LAPTOP -> dev = new Laptop(model, price, description);
            case Devices.TABLET -> dev = new Tablet(model, price, description);
        }
        dev.setBrand("Apple");
        return dev;
    }
}