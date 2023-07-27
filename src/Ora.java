public class Ora extends ElectricCar{
    private boolean hasPanaromicSunroof;
    private boolean hasWirelessCharging;
    protected Ora(){
        this("","",null,0,false,false);
    }
    protected Ora (String id, String model, Manufacturer manufacturer, double batteryCapacity, boolean hasPanaromicSunroof, boolean hasWirelessCharging){
        super(id, model, manufacturer, batteryCapacity);
        this.hasPanaromicSunroof = hasPanaromicSunroof;
        this.hasWirelessCharging =hasWirelessCharging;
    }

    public boolean isHasPanaromicSunroof() {
        return hasPanaromicSunroof;
    }

    public boolean isHasWirelessCharging() {
        return hasWirelessCharging;
    }

    public void setHasPanaromicSunroof(boolean hasPanaromicSunroof) {
        this.hasPanaromicSunroof = hasPanaromicSunroof;
    }

    public void setHasWirelessCharging(boolean hasWirelessCharging) {
        this.hasWirelessCharging = hasWirelessCharging;
    }

    @Override
    public String toString() {
        return super.toString() + "\nPanaromic Sunroof: " + (hasPanaromicSunroof? "Yes":"No") + "\nWireless Charging Enabled: " + (hasWirelessCharging? "Yes":"No");
    }
}
