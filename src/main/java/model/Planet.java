package model;

public class Planet implements ICore{
    Core core;
    double mass;
    double radius;

    public Planet(double mass, double radius) {
        this.mass = mass;
        this.radius = radius;
    }

    public Planet(Core core, double mass, double radius) {
        super();
        this.radius = radius;
    }

    public Core getCore() {
        return core;
    }

    public void setMassAndRadius(double mass, double radius){
        this.mass = mass;
        this.radius = radius;
    }

    public void setCore(Core core) {
        this.core = core;
    }

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getDensity() {
        return this.mass / getVolume();
    }

    @Override
    public double getVolume() {
        return (4.0 / 3) * Math.PI * Math.pow(this.radius, 3);
    }

    @Override
    public String toString() {
        return "Planet{" +
                "\n mass = " + mass +
                ",\n radius = " + radius +
                ",\n density = " + getDensity() +
                ",\n volume = " + getVolume()+
                "\n}";
    }
}
