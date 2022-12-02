package javaquiz;

public class Car implements Vehicle{
    int maxSpeed;
    int currentSpeed;
    String fuel;
    int amountOfFuel;

    public Car(){}

    public Car(int maxSpeed, String fuel) {
        this.maxSpeed = maxSpeed;
        this.fuel = fuel;
    }

    public Car(int maxSpeed,int currentSpeed, String fuel, int amountOfFuel) {
        this.maxSpeed = maxSpeed;
        this.currentSpeed = currentSpeed;
        this.fuel = fuel;
        this.amountOfFuel = amountOfFuel;
    }

    @Override
    public void powerOn() {
        System.out.println("시동을 켭니다.");
    }

    @Override
    public void powerOff() {
        System.out.println("시동을 끕니다.");
    }

    @Override
    public void accelerate() {
        System.out.println("엑셀 페달을 밟습니다.");
    }

    @Override
    public void brake() {
        System.out.println("브레이크 페달을 밟습니다.");
    }
}
