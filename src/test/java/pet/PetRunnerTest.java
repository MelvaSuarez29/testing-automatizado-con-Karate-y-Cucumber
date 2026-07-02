package pet;


import com.intuit.karate.junit5.Karate;

public class PetRunnerTest {
    /*
    * Ejecuta el feature pet-crud.feature
    * */
    @Karate.Test
    Karate testPetCrud(){return Karate.run("pet-crud").relativeTo(getClass());}
}
