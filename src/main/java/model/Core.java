package model;

public class Core implements ICore {
    double mass;
    double radius;

    public Core(double mass, double radius) {
        this.mass = mass;
        this.radius = radius;
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
}
