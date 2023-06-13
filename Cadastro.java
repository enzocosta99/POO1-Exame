import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cadastro {

    private List <Funcionario> listfuncionario;
    private List <Projeto> listprojeto;
    private List <Cargo> listcargo;

    Scanner scan;
    public Cadastro (){
        listprojeto = new ArrayList<>();
        listprojeto = new ArrayList<>();
        scan = new Scanner(System.in);
    }

    public Cadastro(List<Funcionario> listfuncionario, List<Projeto> listprojeto, List<Cargo> listcargo) {
        this.listfuncionario = listfuncionario;
        this.listprojeto = listprojeto;
        this.listcargo = listcargo;
    }

    public List<Funcionario> getListfuncionario() {
        return listfuncionario;
    }

    public void setListfuncionario(List<Funcionario> listfuncionario) {
        this.listfuncionario = listfuncionario;
    }

    public List<Projeto> getListprojeto() {
        return listprojeto;
    }

    public void setListprojeto(List<Projeto> listprojeto) {
        this.listprojeto = listprojeto;
    }

    public List<Cargo> getListcargo() {
        return listcargo;
    }

    public void setListcargo(List<Cargo> listcargo) {
        this.listcargo = listcargo;
    }

    public void addFuncionario(){
        Funcionario f = new Funcionario();
        System.out.println("Informe o código do funcionario: ");
        f.setCod_funcionario(scan.nextInt());
        scan.nextLine();
        System.out.println("Informe o nome do funcionario: ");
        Pessoa p = new Pessoa();
        p.setNome(scan.nextLine());
        System.out.println("Informe o cidade do funcionario: ");
        Endereco e = new Endereco();
        e.setCidade(scan.nextLine());

//        f.setPessoa(scan.nextLine());
        getListfuncionario().add(f);
    }

    public void addCargo(){
        Cargo c = new Cargo();
        System.out.println("Informe o código do cargo: ");
        c.setCod_cargo(scan.nextInt());
        scan.nextLine();
        System.out.println("Informe o nome do cargo: ");
        c.setNom_cargo(scan.nextLine());
        getListcargo().add(c);
    }

//    public void addFuncCargo(){
//        FuncCargo f = new FuncCargo();
//        System.out.println("Informe a data do cargo: ");
//        f.setFunc(scan.nextInt());
//        pedido.addItem(listProduto);
//        pedido.setTotal();
//        listPedido.add(pedido);
//    }
//    public void cadastro(List<FuncCargo> funcCargo){
//        Cargo cargo1 = new FuncCargo();
//        System.out.println("Informe o codigo do cargo: ");
//        funcCargo(scan.nextInt());
//        System.out.println("Informe o código do Produto: ");
//        Integer codigo = scan.nextInt();
//        item.setProduto(getProdutoByCodigo(codigo, listProduto));
//        if (item.getProduto() != null){
//            System.out.println("Informe quantidade: ");
//            item.setQuantidade(scan.nextInt());
//            getItens().add(item);
//        } else {
//            System.out.println("Produto não encontrado");
//        }
//
//    }

}

