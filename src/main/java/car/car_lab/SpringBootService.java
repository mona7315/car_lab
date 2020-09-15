package car.car_lab;

import java.util.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@SpringBootApplication
@RestController
@EnableAutoConfiguration


public class SpringBootService {
	ArrayList<Car> cars = new ArrayList<Car>();
	public static void main(String[] args) {
		SpringApplication.run(SpringBootService.class, args);
	}
	@RequestMapping(value = "/car", method = RequestMethod.POST)
	public ResponseEntity<ArrayList<Car>> createCar(@RequestBody ArrayList<Car> dataCars) {
		cars = dataCars;
		return new ResponseEntity<ArrayList<Car>>(cars, HttpStatus.OK);
	}
	@RequestMapping(value = "/car/{index}", method = RequestMethod.PATCH)
	public ResponseEntity<ArrayList<Car>> patchCar(@RequestBody Car dataCar, @PathVariable("index") int index) {
		cars.set(index - 1,  dataCar);
		return new ResponseEntity<ArrayList<Car>>(cars, HttpStatus.OK);
	}
	@RequestMapping(value = "/car/{index}")
	public ResponseEntity<Car> getCar(@PathVariable("index") int index) {
		return new ResponseEntity<Car>(cars.get(index - 1), HttpStatus.OK);
	}
	@RequestMapping(value = "/car/{index}", method = RequestMethod.DELETE)
	public ResponseEntity<ArrayList<Car>> deleteCar(@PathVariable("index") int index) {
		cars.remove(index - 1);
		return new ResponseEntity<ArrayList<Car>>(cars, HttpStatus.OK);
	}
}		

//@RequestMapping(value = "/", method = RequestMethod.POST)
//public String hello(@RequestBody Object Car) {
//return String.format("{\"payload\":\"%s\"}", Car);
//
//	
//}

//@RequestMapping(value = "/car")
//public ResponseEntity<Car> get() {
//Car car = new Car();
//car.setColor("Gray");
//car.setType("SUV");
//car.setDisplacement(2000);
//car.hasSunroof(true);
//car.setSpeed(80);
//
//
//return new ResponseEntity<Car>(car, HttpStatus.OK);
//
//}





