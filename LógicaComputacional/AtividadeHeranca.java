package objeto;

import java.util.ArrayList;
import javax.swing.JOptionPane;


public class Objeto {

  
    public static void main(String[] args) {
            cadastraAluno();
            cadastraPessoa();   
      
          
    }
    public static void cadastraPessoa(){
          int qnt = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de pessoas que você quer cadastrar"));
          ArrayList<Pessoa> lista = new ArrayList<>();
          for(int i = 0; i < qnt; i++){
              String nome = JOptionPane.showInputDialog
            ("Digite o nome:");
            int idade = Integer.parseInt(JOptionPane.showInputDialog
            ("Digite a idade de: "+nome));
            String cpf = JOptionPane.showInputDialog
            ("Digite o CPF de: "+nome);
            Pessoa p = new Pessoa(nome, cpf, idade);
            lista.add(p);
          }
          for(Pessoa p: lista){
               JOptionPane.showMessageDialog(null,"Nome: "+p.getNome()+
             "\nIdade: "+p.getIdade()+"\nCPF: "+p.getCpf());
          }
    }
    public static void cadastraAluno(){
        int qnt = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de pessoas que você quer cadastrar"));
          ArrayList<Aluno> lista = new ArrayList<>();
          for(int i = 0; i < qnt; i++){
            String nome = JOptionPane.showInputDialog
            ("Digite o nome:");
            int idade = Integer.parseInt(JOptionPane.showInputDialog
            ("Digite a idade de: "+nome));
            String cpf = JOptionPane.showInputDialog
            ("Digite o CPF de: "+nome);
            String matricula = JOptionPane.showInputDialog("Digite a matricula do aluno");
            Aluno c = new Aluno(matricula, nome, cpf, idade);
            lista.add(c);
    }
          for(Aluno c: lista){
               JOptionPane.showMessageDialog(null,"Nome: "+c.getNome()+
             "\nIdade: "+c.getIdade()+"\nCPF: "+c.getCpf()+"\nMatricula: "+c.matricula );
          }
}
}
