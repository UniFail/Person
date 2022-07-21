package domain;

public class TrackDriver extends Driver{
    public TrackDriver(String name, String surname, String passport, String driverLicenseNumber) {
        super(name, surname, passport, driverLicenseNumber);
    }

    @Override
    public void setDriverLicenseNumber(String driverLicenseNumber) {
        if (driverLicenseNumber != null && getDriverLicenseNumber().startsWith("2")) {
            super.setDriverLicenseNumber(driverLicenseNumber);
        }
    }
}
