package by.bsu.lab9.taxi;

import by.bsu.lab9.taxi.exception.CarException;

import java.io.Serializable;

public class Taxi extends Car {

    public Taxi(){
        super();
    }

    public Taxi(double price, double speed, double gallonConsume) throws CarException {
        super(price, speed, gallonConsume);
    }


    @Override
    public String toString(){
        return "Price: ".concat(String.valueOf(super.getPrice()))
                .concat(" ").concat("Speed: ").concat(String.valueOf(super.getSpeed()))
                .concat(" ").concat("Gallon consumption: ").concat(String.valueOf(super.getGallonConsume()));
    }
}

