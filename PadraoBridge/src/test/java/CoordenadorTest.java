import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CoordenadorTest {

    @Test
    void deveRetornarSalarioCoordenadorComEnsinoMedio() {
        Escolaridade escolaridade = EnsinoMedio.getInstance(); // Singleton
        Coordenador coordenador = new Coordenador(2000.0f);
        coordenador.setEscolaridade(escolaridade);
        assertEquals(2000.0f, coordenador.calcularSalario(), 0.01f);
    }

    @Test
    void deveRetornarSalarioCoordenadorComGraduacao() {
        Escolaridade escolaridade = Graduacao.getInstance(); // Singleton
        Coordenador coordenador = new Coordenador(2000.0f);
        coordenador.setEscolaridade(escolaridade);
        assertEquals(2200.0f, coordenador.calcularSalario(), 0.01f);
    }

    @Test
    void deveRetornarSalarioCoordenadorComMestrado() {
        Escolaridade escolaridade = Mestrado.getInstance(); // Singleton
        Coordenador coordenador = new Coordenador(2000.0f);
        coordenador.setEscolaridade(escolaridade);
        assertEquals(2400.0f, coordenador.calcularSalario(), 0.01f);
    }

    @Test
    void deveRetornarSalarioCoordenadorComDoutorado() {
        Escolaridade escolaridade = Doutorado.getInstance(); // Singleton
        Coordenador coordenador = new Coordenador(2000.0f);
        coordenador.setEscolaridade(escolaridade);
        assertEquals(2600.0f, coordenador.calcularSalario(), 0.01f);
    }
}