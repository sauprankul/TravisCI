package edu.ucsd.cs110.temperature;

/**
 * Created by saurabh on 2/15/17.
 */
public class Fahrenheit extends Temperature
{
    public Fahrenheit(float t)
    {
        super(t);
    }

    @Override
    public Temperature toCelsius() {
        return new Celsius((float)((getValue() - 32) * (5.0/9.0)));
    }

    @Override
    public Temperature toFahrenheit() {
        return this;
    }

    public String toString()
    {
        return Float.toString(getValue()) + " F";
    }
}
