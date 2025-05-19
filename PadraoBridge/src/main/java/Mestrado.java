public class Mestrado implements Escolaridade {

    private static final Mestrado instance = new Mestrado();

    private Mestrado() {}

    public static Mestrado getInstance() {
        return instance;
    }
    public float percentualAumento() {
        return 0.2f;
    }
}