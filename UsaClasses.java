public class UsaClasses {


    public static void main (String [] args) {
        //Pessoa p = new Pessoa ();
        Pessoa p;
        Carro c;
        Livro l;
        c = new Carro();
        p = new Pessoa();
        l = new Livro();
         
      


        p.nome = "Fulano";
        p.idade = 25;
        p.renda = 1000;
        p.cpf = "000.000.000-00";
        p.endereço = "Rua sei la das contas";
        p.telefone = "00 0000-0000";
        p.altura = 000;
        p.escolaridade = "Ensino Medio";
        p.experiencia = "Mercado Familia";
        p.profissão = "Atendente de caixa";

        c.modelo = "Fiat uno";
        c.marca = "Fiat";
        c.cor = "cinza";
        c.ano_de_fabricação = 2010f;
        c.potenciaCv = 66f;
        c.tipo_de_combustivel = "Alcool";
        c.numero_de_portas = 2f;
        c.cambio = "Manual";
        c.tração = "dianteira";
        c.consumo_medio_kml = 10.1f;

        l.titulo = "Harry Potter e a Pedra Filosofal";
        l.autor = " J.K. Rowling";
        l.ano_de_Publicacao = 1997;
        l.editora = "Bloomsbury (no Reino Unido)";
        l.genero = "Fantasia";
        l.numero_de_Paginas = 223;
        l.disponivel = "Sim, amplamente disponível";
        l.preço= 35;
        l.idioma = "portugues";
        l.isbn = "varido";
 
    
    
        
        System.out.println("Nome: " + p.nome);
        System.out.println("Idade:" + p.idade);
        System.out.println("Renda: " + p.renda);
        System.out.println("Cpf:" + p.cpf);
        System.out.println("Endereço:" + p.endereço);
        System.out.println("Telefone: " + p.telefone);
        System.out.println("Altura: " + p.altura);
        System.out.println("Escolaridade:" + p.escolaridade);
        System.out.println("Experiencia: " + p.experiencia);
        System.out.println("Profissão: " + p.profissão);
        
        System.out.println("Modelo: " + c.modelo);
        System.out.println("Marca:" + c.marca);
        System.out.println("Cor: " + c.cor);
        System.out.println("Ano de fabricação:" + c.ano_de_fabricação);
        System.out.println("PotenciaCv:" + c.potenciaCv);
        System.out.println("Tipo de combustivel: " + c.tipo_de_combustivel);
        System.out.println("Numero de portas: " + c.numero_de_portas);
        System.out.println("Cambio:" + c.cambio);
        System.out.println("Tração: " + c.tração);
        System.out.println("Consumo medio de kml: " + c.consumo_medio_kml);

        System.out.println("Titulo: " + l.titulo);
        System.out.println("Autor:" + l.autor);
        System.out.println("Ano de publicação: " + l.ano_de_Publicacao);
        System.out.println("Editora:" + l.editora);
        System.out.println("Genero:" + l.genero);
        System.out.println("Numero de paginas: " + l.numero_de_Paginas);
        System.out.println("Disponivel: " + l.disponivel);
        System.out.println("Preço:" + l.preço);
        System.out.println("Idioma: " + l.idioma);
        System.out.println("Isbn: " + l.isbn);

        



       


        



        
    }
}


  