package com.santa.cafe.beverage;

import com.santa.cafe.beverage.model.Beverage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BeverageService {

    @Autowired
    BeverageRepository beverageRepository;

    public List<Beverage> getBeverages() {
        return beverageRepository.findAll();
    }
}
