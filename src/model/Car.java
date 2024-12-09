package model;

public class Car {

    private String model;
    private int releaseDate;
    private int horsepower;

    // Паттерн проектирования: Строитель -->
    public Car(CarBuilder carBuilder) {
        this.model = carBuilder.model;
        this.releaseDate = carBuilder.releaseDate;
        this.horsepower = carBuilder.horsepower;
    }
    // Паттерн проектирования: Строитель <--


    public String getModel() {
        return model;
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    public int getHorsepower() {
        return horsepower;
    }

    @Override
    public String toString() {
        return String.format("Марка автомабила: %s, год выпуска: %d, лошадиных сил: %d", this.model, this.releaseDate, this.horsepower);
    }

    // Паттерн проектирования: Строитель -->
    public static class CarBuilder{

        private String model;
        private int releaseDate;
        private int horsepower;

        public CarBuilder setModel(String model) {
            this.model = model;
            return this;
        }

        public CarBuilder setReleaseDate(int releaseDate) {
            this.releaseDate = releaseDate;
            return this;
        }

        public CarBuilder setHorsepower(int horsepower) {
            this.horsepower = horsepower;
            return this;
        }

        public Car build(){
            return new Car(this);
        }
    }
    // Паттерн проектирования: Строитель <--

}