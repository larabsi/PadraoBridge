public class Graduacao implements Escolaridade {

    private static final Graduacao instance =new Graduacao();
    private Graduacao() {}

    public static Graduacao getInstance() {
        return instance;
    }
    public float percentualAumento() {
        return 0.1f;
    }
}