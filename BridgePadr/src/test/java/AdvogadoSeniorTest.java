import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AdvogadoSeniorTest {

    @Test
    void deveRetornarSalarioAdvogadoSrComProcessoTrabalhista(){
        Cargo advogadoSenior = new AdvogadoSenior(1000.0f);
        Civel tipoProcessoGanho = Civel.getInstance();

        advogadoSenior.setTipoProcesso(tipoProcessoGanho);
        advogadoSenior.calcularSalario();
        assertEquals(2100.0f, advogadoSenior.calcularSalario(), 0.01f);
    }
    @Test
    void deveRetornarSalarioAdvogadoSeniorComProcessoCivel(){
        Cargo advogadoSenior = new AdvogadoSenior(1000.0f);
        Civel tipoProcessoGanho = Civel.getInstance();

        advogadoSenior.setTipoProcesso(tipoProcessoGanho);
        advogadoSenior.calcularSalario();

        assertEquals(2100.0f, advogadoSenior.calcularSalario(), 0.01f);
    }

    @Test
    void deveRetornarSalarioAdvogadoSeniorComProcessoPenal(){
        Cargo advogadoSenior = new AdvogadoSenior(1000.0f);
        Civel tipoProcessoGanho = Civel.getInstance();

        advogadoSenior.setTipoProcesso(tipoProcessoGanho);
        advogadoSenior.calcularSalario();

        assertEquals(2100.0f, advogadoSenior.calcularSalario(), 0.01f);
    }

}
