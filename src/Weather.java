import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class Weather implements Provider {

    float temp, humidity;
    List<Observer> observers = new ArrayList<>();

    @Override
    public void register(Observer o) {
        observers.add(o);
        System.out.println("Observer added "+o.getClass());
    }

    @Override
    public void remove(Observer o) {
        observers.remove(o);
        System.out.println("Observer removed "+o.getClass());
    }

    @Override
    public void notifyObserver() {
        for(Observer o : observers){
            o.update(temp,humidity);
        }
    }

    public void setMeasurement(float temp, float humidity){
        this.temp = temp;
        this.humidity = humidity;
    }

}
