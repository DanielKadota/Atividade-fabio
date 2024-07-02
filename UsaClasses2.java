package UsaclassesComAtributos;
public class UsaClasses2 {
    public static void main(String[] args) {

        Pessoa2 p = new Pessoa2("Daniel", 18, 1000);
            
        System.out.println("Nome: "+p.nome);
        System.out.println("Idade: "+p.idade);
        System.out.println("Renda: "+p.renda);
        
        System.out.println("----------------------------------------------------------");

        Carro2 c = new Carro2("HB20: ", "Traseira", 2015, "Preto" );
        System.out.println("Modelo: " + c.modelo );
        System.out.println("Tração: " + c.traçao);
        System.out.println("Ano: " + c.ano);
        System.out.println("Cor: " + c.cor);
        System.out.println("----------------------------------------------------------");
        

        Livro2 l = new Livro2("Harry Potter e o Calice de Fogo", "J.K Rowling", 640, "Fantasia" );
            System.out.println("Titulo: " + l.titulo);
            System.out.println("Autor: " + l.autor);
            System.out.println("Páginas: " + l.paginas);
            System.out.println("Gênero: " + l.genero);
            System.out.println("------------------------------------------------------");

    }
}
