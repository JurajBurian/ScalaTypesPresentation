package jubu

/**
	* @author jubu
	*/
trait Vehicle

trait SpaceVehicle extends Vehicle

trait AirVehicle extends Vehicle

trait LandVehicle extends Vehicle

trait WaterVehicle extends Vehicle

trait Rocket extends SpaceVehicle
trait Shuttle extends SpaceVehicle

trait Balloon extends AirVehicle
trait Aircraft extends AirVehicle

trait Car extends LandVehicle
trait Bike extends LandVehicle

trait  Ship extends WaterVehicle
trait Submarine extends WaterVehicle


trait PersonalCar extends Car
trait Truck extends Car
trait Formula extends Car

trait MountainBike extends Bike
trait RoadBike extends Bike
