public class WaterBottle {


    private int volume = 100;

    public int getVolume() {
        return this.volume;
    }

    public void setVolume(int newVolume) {
        this.volume = newVolume;
    }

    public void drink() {
        int currentVolume = this.getVolume();
        int newVolume = currentVolume - 10;
        this.setVolume(newVolume);
    }

    public void empty() {
        this.setVolume(0);
    }

    public void fill() {
        this.setVolume(100);
    }
}
