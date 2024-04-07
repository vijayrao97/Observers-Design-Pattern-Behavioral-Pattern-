//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Weather w = new Weather();
        CurrentDisplay cd = new CurrentDisplay(w);
        AvgDisplay ad = new AvgDisplay(w);
        w.setMeasurement(10,20);
        w.notifyObserver();
    }
}