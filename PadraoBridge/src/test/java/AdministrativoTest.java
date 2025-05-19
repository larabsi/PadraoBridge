import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AdministrativoTest {

    @Test
    void deveRetornarSalarioAdministrativoComEnsinoMedio() {
        Escolaridade escolaridade = EnsinoMedio.getInstance();
        Administrativo administrativo = new Administrativo(1000.0f);
        administrativo.setEscolaridade(escolaridade);
        assertEquals(1000.0f, administrativo.calcularSalario(), 0.01f);
    }

    @Test
    void deveRetornarSalarioAdministrativoComGraduacao() {
        Escolaridade escolaridade = Graduacao.getInstance();
        Administrativo administrativo = new Administrativo(1000.0f);
        administrativo.setEscolaridade(escolaridade);
        assertEquals(1000.0f, administrativo.calcularSalario(), 0.01f);
    }

    @Test
    void deveRetornarSalarioAdministrativoComMestrado() {
        Escolaridade escolaridade = Mestrado.getInstance();
        Administrativo administrativo = new Administrativo(1000.0f);
        administrativo.setEscolaridade(escolaridade);
        assertEquals(1000.0f, administrativo.calcularSalario(), 0.01f);
    }

    @Test
    void deveRetornarSalarioAdministrativoComDoutorado() {
        Escolaridade escolaridade = Doutorado.getInstance();
        Administrativo administrativo = new Administrativo(1000.0f);
        administrativo.setEscolaridade(escolaridade);
        assertEquals(1000.0f, administrativo.calcularSalario(), 0.01f);
    }
}

