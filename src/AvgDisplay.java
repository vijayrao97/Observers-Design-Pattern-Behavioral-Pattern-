
public class AvgDisplay implements Observer {

    float temp, humidity;
    private Provider p;
    public AvgDisplay(Provider p){
        this.p = p;
        p.register(this);
    }

    @Override
    public void update(float temp, float humidity) {
        this.temp = temp;
        this.humidity = humidity;
        display();
    }

    public void display(){
        System.out.println("Temp "+temp+" humidity "+humidity+" class "+this.getClass());
    }

    public void deRegister(){
        this.p.remove(this);
    }

}
