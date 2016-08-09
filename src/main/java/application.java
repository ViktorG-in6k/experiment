import model.Planet;
import model.Planets;
import model.SunSystem;

public class application {
    public static void main(String[] args) {
        Planet planet = SunSystem.getPlanetByName(Planets.EARTH);
        System.out.print(planet);
    }
}
