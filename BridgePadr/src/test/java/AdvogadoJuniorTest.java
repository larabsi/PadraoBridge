import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AdvogadoJuniorTest {
    @Test
    void deveRetornarSalarioAdvogadoJuniorComProcessoTrabalhista(){
        Cargo advogadoJunior = new AdvogadoJunior(1000.0f);
        Civel tipoProcessoGanho = Civel.getInstance();

        advogadoJunior.setTipoProcesso(tipoProcessoGanho);
        advogadoJunior.calcularSalario();
        assertEquals(1000.0f, advogadoJunior.calcularSalario(), 0.01f);
    }
    @Test
    void deveRetornarSalarioAdvogadoJuniorComProcessoCivel(){
        Cargo advogadoJunior = new AdvogadoJunior(1000.0f);
        Civel tipoProcessoGanho = Civel.getInstance();

        advogadoJunior.setTipoProcesso(tipoProcessoGanho);
        advogadoJunior.calcularSalario();

        assertEquals(1000.0f, advogadoJunior.calcularSalario(), 0.01f);
    }

    @Test
    void deveRetornarSalarioAdvogadoJuniorComProcessoPenal(){
        Cargo advogadoJunior = new AdvogadoJunior(1000.0f);
        Civel tipoProcessoGanho = Civel.getInstance();
        advogadoJunior.setTipoProcesso(tipoProcessoGanho);
        advogadoJunior.calcularSalario();

        assertEquals(1000.0f, advogadoJunior.calcularSalario(), 0.01f);
    }


}
