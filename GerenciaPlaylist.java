import java.util.ArrayList;
import static javax.swing.JOptionPane.showMessageDialog;
import static javax.swing.JOptionPane.showInputDialog;
import static java.lang.Integer.parseInt;
public class GerenciaPlaylist {
  public static void main(String[] args) {
    var musicas = new ArrayList<Musica>();
    var menu = "1-Adicionar\n2-Ver músicas\n3-Avaliar música\n4-Excluir música\n0-Sair";
    int op;
    do{
      op = parseInt(showInputDialog(menu));
      switch(op){
        case 1: {
          //1. Pegar os dados da música
          var titulo = showInputDialog("Título?");
          //2. Construir um objeto Musica
          var musica = new Musica(titulo);
          //3. Adicionar na coleção com add
          musicas.add(musica);
          //4. Avisar o usuário que deu certo
          showMessageDialog(null, "Ok, adicionou!");
          break;
        }

      }
    }while (op != 0);

  }

}

// class Pessego{}
