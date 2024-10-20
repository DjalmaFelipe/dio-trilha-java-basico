package iphone;

public class Iphone2g {

    private boolean power = false;
    private boolean bloqueioDeTela = false;
    private boolean mute = false;
    private boolean wifi;
    private int volume = 0;

    public boolean isWifi() {
        return wifi;
    }

    public void setWifi(boolean wifi) {
        this.wifi = wifi;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean isMute() {
        return mute;
    }

    public void setMute(boolean mute) {
        this.mute = mute;
    }

    public boolean isPower() {
        return power;
    }

    public void setPower(boolean power) {
        this.power = power;
    }

    public boolean isBloqueioDeTela() {
        return bloqueioDeTela;
    }

    public void setBloqueioDeTela(boolean bloqueioDeTela) {
        this.bloqueioDeTela = bloqueioDeTela;
    }
}
