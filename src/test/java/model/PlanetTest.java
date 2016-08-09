package model;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlanetTest {
    @Test
    public void planetObjectShouldReturnParametersOfPlanetEarth() throws Exception {
        Planet planet = SunSystem.getPlanetByName(Planets.EARTH);

        assertEquals(planet.getMass(), 5.975999999999999E24, 10);
        assertEquals(planet.getRadius(), 6378000.0, 10);
        assertEquals(planet.getDensity(), 5498.80646732255, 10);
        assertEquals(planet.getVolume(), 1.0867812925428892E21, 10);
    }
}
