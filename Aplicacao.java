import java.util.ArrayList;
import java.util.Date;

public class Aplicacao {

    public static void main(String[] args) {

        ArrayList<FuncionarioCargo> funcionarioCargoList = new ArrayList<>();
        ArrayList<FuncionarioProjeto> funcionarioProjetoList = new ArrayList<>();

        Funcionario funcionario1 = new Funcionario(1, new Date(01/01/2020), "12345", new Pessoa("Funcionario Um", new Date(01/01/2001)));
        Funcionario funcionario2 = new Funcionario(2, new Date(02/02/2020), "67891", new Pessoa("Funcionario Dois", new Date(02/02/2002)));
        Funcionario funcionario3 = new Funcionario(3, new Date(03/03/2020), "01112", new Pessoa("Funcionario Tres", new Date(03/03/2003)));

        Cargo cargo1 = new Cargo(1, "Porteiro");
        Cargo cargo2 = new Cargo(2, "Analista de Sistemas");

        Projeto projeto1 = new Projeto(1, "Projeto 1", "Projeto 1", new Date(01/01/2023), new Date(02/02/2023));
        Projeto projeto2 = new Projeto(2, "Projeto 2", "Projeto 2", new Date(02/02/2023), new Date(03/03/2023));

        Despesa despesa1 = new Despesa(1, 1, new Date(01/01/2023), 100, "Despesa 1");
        Despesa despesa2 = new Despesa(2, 1, new Date(02/01/2023), 200, "Despesa 2");
        Despesa despesa3 = new Despesa(3, 1, new Date(03/01/2023), 300, "Despesa 3");
        Despesa despesa4 = new Despesa(4, 2, new Date(01/02/2023), 400, "Despesa 4");
        Despesa despesa5 = new Despesa(5, 2, new Date(03/02/2023), 500, "Despesa 5");

        criarFuncionarioCargo(funcionario1, cargo1, new Date(01/01/2023), funcionarioCargoList);
        criarFuncionarioCargo(funcionario2, cargo2, new Date(02/02/2023), funcionarioCargoList);
        criarFuncionarioCargo(funcionario3, cargo2, new Date(03/03/2000), funcionarioCargoList);
        criarFuncionarioProjeto(funcionario1, projeto1, funcionarioProjetoList);
        criarFuncionarioProjeto(funcionario2, projeto1, funcionarioProjetoList);
        criarFuncionarioProjeto(funcionario3, projeto2, funcionarioProjetoList);

        funcionarioCargoList.forEach(f -> System.out.println("Código do funcionário: " + f.getFuncionario().getCodigoFuncionario() + "\nCódigo do cargo: " + f.getCargo().getCodigoCargo()));
        funcionarioProjetoList.forEach(f -> System.out.println("Código do funcionário: " + f.getFuncionario().getCodigoFuncionario() + "\nNúmero do projeto: " + f.getProjeto().getNumeroProjeto()));

    }

    public static void criarFuncionarioCargo(Funcionario funcionario, Cargo cargo, Date dataInicioFuncionarioCargo, ArrayList<FuncionarioCargo> funcionarioCargoList) {

        FuncionarioCargo funcionarioCargo = new FuncionarioCargo(funcionario, cargo, dataInicioFuncionarioCargo);
        funcionarioCargoList.add(funcionarioCargo);

    };

    public static void criarFuncionarioProjeto(Funcionario funcionario, Projeto projeto, ArrayList<FuncionarioProjeto> funcionarioProjetoList) {

        FuncionarioProjeto funcionarioProjeto = new FuncionarioProjeto(funcionario, projeto);
        funcionarioProjetoList.add(funcionarioProjeto);

    }

}
