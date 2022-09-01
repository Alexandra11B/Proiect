package com.example.Rental.service;

import com.example.Rental.entity.Car;
import com.example.Rental.repository.CarRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CarServicesImpl implements CarService {

    private CarRepository carRepository;
    private CarServicesImpl(CarRepository theCarRepository){
        carRepository=theCarRepository;
    }
    @Override
    public List<Car> findAll() {
        return null;
    }

    @Override
    public List<Car> findByBrand(int theBrand) {
        return null;
    }

    @Override
    public List<Car> findByColour(int theColour) {
        return null;
    }

    @Override
    public List<Car> findByType(int theType) {
        return null;
    }

    @Override
    public List<Car> findByAvailability(boolean theAvailability) {
        return null;
    }

    @Override
    public List<Car> findByAntecedents(boolean theAntecedents) {
        return null;
    }

    @Override
    public List<Car> findByYear(int theYear) {
        return null;
    }

    public void save(Car theCar) {
        carRepository.save(theCar);
    }
}
