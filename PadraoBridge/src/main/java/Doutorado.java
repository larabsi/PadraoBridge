public class Doutorado implements Escolaridade {

    private static final Doutorado instance = new Doutorado();

    private Doutorado() {}

    public static Doutorado getInstance() {
        return instance;
    }
    public float percentualAumento() {
        return 0.3f;
    }
}