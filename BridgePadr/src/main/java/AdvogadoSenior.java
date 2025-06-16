public class AdvogadoSenior extends Cargo{

    public AdvogadoSenior(float salarioBase) {
        super(salarioBase);
    };

    public float calcularSalario() {
        return this.salarioBase * (2 + this.tipoProcesso.percentualAumento());
    }
}