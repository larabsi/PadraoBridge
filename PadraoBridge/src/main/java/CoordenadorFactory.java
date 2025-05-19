public class CoordenadorFactory implements CargoFactory {

    @Override
    public Cargo criarCargo(float salarioBase) {
        return new Coordenador(salarioBase);
    }

    @Override
    public Escolaridade criarEscolaridade() {
        return Mestrado.getInstance(); // Exemplo de escolaridade
    }
}
