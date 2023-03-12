
public class Pessoa extends Object {
	public String nome;
	public String cpf;
	public String data_nascimento;
    public String rg;
    public String endereco;
    public String bairro;
    public String telefone;
    public String nome_mae;
    public String nome_pai;
 
    public String cadCompleto(){
        return "Seja bem vindo(a)"+ nome +"! Informações: CPF: "+ cpf +", rg: "+ rg +
         ", data de nascimento: "+ data_nascimento + " telefone: "+ telefone +" endereço: "+ endereco + bairro + " !";
 }
}


