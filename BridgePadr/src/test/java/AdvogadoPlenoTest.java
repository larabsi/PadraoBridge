import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AdvogadoPlenoTest {

    @Test
    void deveRetornarSalarioAdvogadoPlenoComProcessoTrabalhista(){
        Cargo advogadoPleno = new AdvogadoPleno(1000.0f);
        Civel tipoProcessoGanho = Civel.getInstance();

        advogadoPleno.setTipoProcesso(tipoProcessoGanho);
        advogadoPleno.calcularSalario();
        assertEquals(1100.0f, advogadoPleno.calcularSalario(), 0.01f);;
    }
    @Test
    void deveRetornarSalarioAdvogadoPlenoComProcessoCivel(){
        Cargo advogadoPleno = new AdvogadoPleno(1000.0f);
        Civel tipoProcessoGanho = Civel.getInstance();

        advogadoPleno.setTipoProcesso(tipoProcessoGanho);
        advogadoPleno.calcularSalario();

        assertEquals(1100.0f, advogadoPleno.calcularSalario(), 0.01f);
    }

    @Test
    void deveRetornarSalarioAdvogadoPlenoComProcessoPenal(){
        Cargo advogadoPleno = new AdvogadoPleno(1000.0f);
        Civel tipoProcessoGanho = Civel.getInstance();

        advogadoPleno.setTipoProcesso(tipoProcessoGanho);
        advogadoPleno.calcularSalario();

        assertEquals(1100.0f, advogadoPleno.calcularSalario(), 0.01f);;
    }


}
