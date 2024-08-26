public class PrimeiraClasse {

    public static void main(String args[]) {
        Cliente cliente = new Cliente();
        cliente.cadastrarEndereco("rua");
        cliente.setCodigo(123);
        cliente.setNome("Arthur");
        cliente.imprimirEndereco();
//        System.out.println(cliente.getNome());
//        System.out.println(cliente.getCodigo());'
    }
}
