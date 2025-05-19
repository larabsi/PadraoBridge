public class AdministrativoFactory implements CargoFactory {

    @Override
    public Cargo criarCargo(float salarioBase) {
        return new Administrativo(salarioBase);
    }

    @Override
    public Escolaridade criarEscolaridade() {
        return Graduacao.getInstance();
    }
}