package model;

public class SunSystem {

    public static Planet getPlanetByName(Planets planetName) {
        Planet planet = new Planet(0, 0);

        switch (planetName) {
            case MERCURY:
                planet.setMassAndRadius(0.32868 * Math.pow(10, 24), 2.439 * Math.pow(10, 6));
                break;
            case VENEER:
                planet.setMassAndRadius(4.81068 * Math.pow(10, 24), 6.052 * Math.pow(10, 6));
                break;
            case EARTH:
                planet.setMassAndRadius(5.9760 * Math.pow(10, 24), 6.378 * Math.pow(10, 6));
                break;
            case MARS:
                planet.setMassAndRadius(0.63345 * Math.pow(10, 24), 3.488 * Math.pow(10, 6));
                break;
            case JUPITER:
                planet.setMassAndRadius(1876.64328 * Math.pow(10, 24), 71.300 * Math.pow(10, 6));
                break;
            case SATURN:
                planet.setMassAndRadius(561.80376 * Math.pow(10, 24), 60.100 * Math.pow(10, 6));
                break;
            case URAN:
                planet.setMassAndRadius(86.05440 * Math.pow(10, 24), 26.500 * Math.pow(10, 6));
                break;
            case NEPTUNE:
                planet.setMassAndRadius(101.59200 * Math.pow(10, 24), 24.750 * Math.pow(10, 6));
                break;
            case PLUTO:
                planet.setMassAndRadius(0.01195 * Math.pow(10, 24), 2.000 * Math.pow(10, 6));
                break;
        }

        return planet;
    }
}
