public class AdvogadoPleno extends Cargo{

    public AdvogadoPleno(float salarioBase){
        super(salarioBase);
    }
    public float calcularSalario() {
        return this.salarioBase * (1 + this.tipoProcesso.percentualAumento());
    }
}