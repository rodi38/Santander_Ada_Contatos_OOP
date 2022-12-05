import model.Contato;
import model.Endereco;
import model.Telefone;
import enums.TipoContato;
import enums.TipoEndereco;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Endereco> enderecosFlavio = new ArrayList<>();
        ArrayList<Telefone> telefonesFlavio = new ArrayList<>();
        enderecosFlavio.add(new Endereco(TipoEndereco.Residencial, "Rua quintin das Cunhas 85"));
        enderecosFlavio.add(new Endereco(TipoEndereco.Comercial, "Aldeota rua 937"));
        telefonesFlavio.add(new Telefone("73", "9 8839-0027", "Flavio do discord"));
        telefonesFlavio.add(new Telefone("73", "9 8349-4909", "Flavio do discord 2"));
        Contato flavio = new Contato("Flavio", "Bispo", "flavio@email.com",
                TipoContato.Pessoal, enderecosFlavio, telefonesFlavio);


        System.out.println(flavio);

        System.out.println("\n\n" + "Nome completo: " + flavio.getNomeCompleto() +
                "\nNumeros completos: "
                +flavio.getTelefones().get(0).getTelefoneCompleto() +  " | "
                + flavio.getTelefones().get(1).getTelefoneCompleto()+
                "\nEndereços completos: " + flavio.getEnderecos().get(0).getEnderecoCompleto() + " | "
                +  flavio.getEnderecos().get(1).getEnderecoCompleto());


    }
}
