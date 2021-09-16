import java.util.HashSet;
import java.util.Set;

public class FilaDeDoacoes {

    public static void main(String[] args) {
        Set<String> listaDeDoacao = new HashSet<>();

        listaDeDoacao.add("Pacote de Bolacha");
        listaDeDoacao.add("Macarrão");
        listaDeDoacao.add("Banana");
        listaDeDoacao.add("Arroz");
        listaDeDoacao.add("Carne");

        listaDeDoacao.add("Moletom");
        listaDeDoacao.add("Cachecol");
        listaDeDoacao.add("Gorro");
        listaDeDoacao.add("Jaqueta");
        listaDeDoacao.add("Calça");

        listaDeDoacao.remove("Macarrão");

        listaDeDoacao.remove("Calça");

        for(String valorRemovido:listaDeDoacao){
            System.out.println(valorRemovido);
        }

        Set<String> doacaoCAC = new HashSet<>();

        doacaoCAC.add("Cimento");
        doacaoCAC.add("Argamassa");
        doacaoCAC.add("Caibros");
        doacaoCAC.add("Cal");
        doacaoCAC.add("Pedras");
        doacaoCAC.add("Caminhão de água");
        doacaoCAC.add("Betoneira");
        doacaoCAC.add("Serviço de obras A - Arquiteto");
        doacaoCAC.add("Serviço de obras B - Chefe de obras");
        doacaoCAC.add("Serviço de obras C - Pedreiro");

        doacaoCAC.remove("Serviço de obras A - Arquiteto");
        doacaoCAC.remove("Argamassa");
        doacaoCAC.remove("Caminhão de água");

        for (String remover:doacaoCAC){
            System.out.println(remover);
        }


    }
}
