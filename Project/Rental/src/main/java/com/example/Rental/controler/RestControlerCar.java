package com.example.Rental.controler;

import com.example.Rental.entity.Car;
import com.example.Rental.service.CarServicesImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api")
public class RestControlerCar {

        public CarServicesImpl userService;
        //quick and dirty:inject employee dao(use constructor injection)
        @Autowired
        public RestControlerCar(CarServicesImpl theUserService){
                userService=theUserService;
        }
        //expose "/cars" and return list of cars
        @GetMapping("/cars")
        public List<Car>findAll(){
            return userService.findAll();
        }
        @PostMapping("/cars/add")
        public Car addCar(@RequestBody Car theCar){
                theCar.setId(0);
                userService.save(theCar);
                return theCar;
        }
}




