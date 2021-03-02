
/**
 * Generados de nombres de Star Wars
 * 
 * @author (Pablo Molero Rodriguez) 
 * @version (02.03.21)
 */
public class NameGenerator
{
    private final int APELLIDO_1_4 = 4;     //Primer apellido - 4 primeras letras
    private final int NOMBRE_3 = 3;         //Nombre - 3 primeras letras
    private final int APELLIDO_2_2 = 2;     //Segundo apellido - 2 primeras letras
    private final int NOMBRE_5 = 5;         //Nombre - 5 primeras letras  
    

    /**
     * Constructor for objects of class NameGenerator
     */
    public NameGenerator()
    {
        
    }

    /**
     * Generate StarWars Name
     * 
     * @param  Nombre
     * @param  Apellido 1
     * @param  Apellido 2
     * @return StarWars Name 
     */
    public String generateStarWarsName(String name, String surName1, String surName2)
    {
        String nameStarWars = "";
        String surNameStarWars = "";
        nameStarWars = surName1.substring(0,APELLIDO_1_4);
        nameStarWars = nameStarWars + name.substring(0,NOMBRE_3).toLowerCase();
        surNameStarWars = surName2.substring(0,APELLIDO_2_2);
        surNameStarWars = surNameStarWars + name.substring(0,NOMBRE_5).toLowerCase();
        return nameStarWars + " " + surNameStarWars;
    }
}
