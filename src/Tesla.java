public class Tesla extends ElectricCar{
    private boolean isAutoPilotEnabled;
    private boolean isFullSelfDrivingEnabled;
    private boolean isTeslaTheatreEnabled;

    protected Tesla(){
        this("","",null, 0, false,false,false);
    }
    protected Tesla (String id, String model, Manufacturer manufacturer, double batteryCapacity, boolean isAutoPilotEnabled, boolean isFullSelfDrivingEnabled, boolean isTeslaTheatreEnabled){
        super(id, model, manufacturer, batteryCapacity);
        this.isAutoPilotEnabled = isAutoPilotEnabled;
        this.isFullSelfDrivingEnabled =isFullSelfDrivingEnabled;
        this.isTeslaTheatreEnabled =isTeslaTheatreEnabled;
    }

    public boolean isAutoPilotEnabled() {
        return isAutoPilotEnabled;
    }

    public boolean isFullSelfDrivingEnabled() {
        return isFullSelfDrivingEnabled;
    }

    public boolean isTeslaTheatreEnabled() {
        return isTeslaTheatreEnabled;
    }

    public void setAutoPilotEnabled(boolean isAutoPilotEnabled) {
        this.isAutoPilotEnabled = isAutoPilotEnabled;
    }

    public void setFullSelfDrivingEnabled(boolean isFullSelfDrivingEnabled) {
        this.isFullSelfDrivingEnabled = isFullSelfDrivingEnabled;
    }

    public void setTeslaTheatreEnabled(boolean isTeslaTheatreEnabled) {
        this.isTeslaTheatreEnabled = isTeslaTheatreEnabled;
    }

    @Override
    public String toString() {
        return super.toString() + "\nAuto Pilot Enabled: " + (isAutoPilotEnabled ? "Yes":"No") + "\nFull Self Driving Enabled: " + (isFullSelfDrivingEnabled? "Yes":"No") + "\nTesla Theatre Enabled: " + (isTeslaTheatreEnabled? "Yes":"No");
    }
}
