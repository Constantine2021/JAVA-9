package by.bsu.lab9;

import by.bsu.lab9.taxi.Taxi;
import by.bsu.lab9.connector.Serializer;
import by.bsu.lab9.taxi.exception.CarException;

import java.io.InvalidObjectException;

public class Main {
    public static void main(String[] args) throws InvalidObjectException, CarException {
        String filename = "/Users/kosta/IdeaProjects//Lab9/src/main/resources/serialize.txt";
        Taxi taxi = new Taxi(1.0, 2.0, 3.0);
        System.out.println("Before serializing");
        System.out.println(taxi);
        Serializer.serialize(taxi, filename);
        Taxi deserializedTaxi = (Taxi) Serializer.deserialize(filename);
        System.out.println("After serializing");
        System.out.println(deserializedTaxi);
    }
}

