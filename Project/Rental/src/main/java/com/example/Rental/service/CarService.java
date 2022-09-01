package com.example.Rental.service;

import com.example.Rental.entity.Car;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface CarService {
    public List<Car>findAll();
    public List<Car>findByBrand(int theBrand);

    public List<Car>findByColour(int theColour);
    public List<Car>findByType(int theType);
    public List<Car>findByAvailability(boolean theAvailability);
    public List<Car>findByAntecedents(boolean theAntecedents);
    public List<Car>findByYear(int theYear);



}
