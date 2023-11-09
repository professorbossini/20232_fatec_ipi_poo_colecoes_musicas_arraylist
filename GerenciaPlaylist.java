import java.util.ArrayList;
import static javax.swing.JOptionPane.showMessageDialog;
import static javax.swing.JOptionPane.showInputDialog;
import static java.lang.Integer.parseInt;
import java.util.Collections;
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
        case 2:{
          var sb = new StringBuilder("");
          //for each ou enhanced for (C#: foreach)
          Collections.sort(musicas); // in-place
          for (Musica m : musicas){
            sb
            .append(m)
            .append("\n")
            .append("*********************")
            .append("\n");
          }
          //refaça com o for normal
          // for (int i = 1; i <= musicas.size(); ++i){
          //   sb
          //   .append(musicas.get(i - 1))
          //   .append("\n")
          //   .append("****************************");
          // }
          showMessageDialog(null, sb); //[t1, t2, t3]
          break;
        }
        case 3:{
          //ordenar por avaliação
          Collections.sort(musicas, new ComparadorPorTitulo());
          var sb = new StringBuilder("");
          for (Musica m : musicas){
            sb
            .append(m)
            .append("\n")
            .append("*********************")
            .append("\n");
          }
        }
      }
    }while (op != 0);

  }

}

// class Pessego{}
