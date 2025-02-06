package repo;

import model.Car;

public class CarRepo {

    private int sizeArr;
    private Car[] cars;

    public CarRepo(int sizeArr) {
        this.sizeArr = sizeArr;
        this.cars = new Car[sizeArr];
    }

    public CarRepo(){
        cars = new Car[5];
        cars[0] = new Car.CarBuilder().setModel("Ferrari").setReleaseDate(1995).setHorsepower(190).build();
        cars[1] = new Car.CarBuilder().setModel("Porsche").setReleaseDate(1995).setHorsepower(170).build();
        cars[2] = new Car.CarBuilder().setModel("Toyota").setReleaseDate(1998).setHorsepower(150).build();
        cars[3] = new Car.CarBuilder().setModel("Ford").setReleaseDate(1993).setHorsepower(175).build();
        cars[4] = new Car.CarBuilder().setModel("Chevrolet").setReleaseDate(1991).setHorsepower(180).build();
    }

    public Car[] getCars() {
        return cars;
    }

    public void addCar(Car car, int indCar){
        cars[indCar] = car;
    }

    public Car getCar(int id){
        Car car = null;
        if(id < cars.length) {
            car = cars[id];
        }
        return car;
    }

}
