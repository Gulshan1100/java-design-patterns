package creational_design_patterns.builder.example.builders;

import creational_design_patterns.builder.example.cars.CarType;
import creational_design_patterns.builder.example.components.Engine;
import creational_design_patterns.builder.example.components.GPSNavigator;
import creational_design_patterns.builder.example.components.Transmission;
import creational_design_patterns.builder.example.components.TripComputer;

public interface Builder {
    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}
