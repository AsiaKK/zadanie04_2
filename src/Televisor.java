public class Televisor {

    boolean isTurnOn;

    public void turnOn() {
        System.out.println("Someone turned on televisor.");
        isTurnOn = true;
    }

    public void turnOff() {
        System.out.println("Someone turned off televisor.");
        isTurnOn = false;
    }

    public void showStatus() {
        System.out.println("Is televisor turned on? -> " + isTurnOn);
    }
}
