public class EnsinoMedio implements Escolaridade {

    private static final EnsinoMedio instance = new EnsinoMedio();

    private EnsinoMedio() {}

    public static EnsinoMedio getInstance() {
        return instance;
    }

    public float percentualAumento() {
        return 0.0f;
    }
}