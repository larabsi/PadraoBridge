import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ProfessorTest {

    @Test
    void deveRetornarSalarioProfessorComEnsinoMedio() {
        Escolaridade escolaridade = EnsinoMedio.getInstance(); // Singleton
        Professor professor = new Professor(50.0f);
        professor.setEscolaridade(escolaridade);
        professor.setNumAulas(2);
        assertEquals(100.0f, professor.calcularSalario(), 0.01f);
    }

    @Test
    void deveRetornarSalarioProfessorComGraduacao() {
        Escolaridade escolaridade = Graduacao.getInstance(); // Singleton
        Professor professor = new Professor(50.0f);
        professor.setEscolaridade(escolaridade);
        professor.setNumAulas(2);
        assertEquals(110.0f, professor.calcularSalario(), 0.01f);
    }

    @Test
    void deveRetornarSalarioProfessorComMestrado() {
        Escolaridade escolaridade = Mestrado.getInstance(); // Singleton
        Professor professor = new Professor(50.0f);
        professor.setEscolaridade(escolaridade);
        professor.setNumAulas(2);
        assertEquals(120.0f, professor.calcularSalario(), 0.01f);
    }

    @Test
    void deveRetornarSalarioProfessorComDoutorado() {
        Escolaridade escolaridade = Doutorado.getInstance(); // Singleton
        Professor professor = new Professor(50.0f);
        professor.setEscolaridade(escolaridade);
        professor.setNumAulas(2);
        assertEquals(130.0f, professor.calcularSalario(), 0.01f);
    }
}