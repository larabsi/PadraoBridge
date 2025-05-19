public class ProfessorFactory implements CargoFactory {

    @Override
    public Cargo criarCargo(float salarioBase) {
        return new Professor(salarioBase);
    }

    @Override
    public Escolaridade criarEscolaridade() {
        return Doutorado.getInstance(); // Exemplo de escolaridade
    }
}