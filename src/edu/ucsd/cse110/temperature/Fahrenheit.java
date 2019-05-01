package edu.ucsd.cse110.temperature;
public class Fahrenheit extends Temperature
{
    public Fahrenheit(float t)
    {
        super(t);
    }

    @Override
    public Temperature toCelsius() {
        float cel = (float)((this.getValue() - 32) / 1.8);
        return new Fahrenheit(cel);
    }

    @Override
    public Temperature toFahrenheit() {
        return this;
    }

    public String toString()
    {
        return this.getValue() + " F";
    }
}