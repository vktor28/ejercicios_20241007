
public class AssertEqualsExample {
    public static void main(String[] args) throws Exception {
        String pais  = "venezuela";
        assert pais.equals("España") : "El país debe ser España. Has introduicido " + pais;
        System.out.println("El pais es: " + pais);
    }
}
/*
 * pwd
 * ls
 * cd src
 * java -ea NumeroPositivo.java
 */