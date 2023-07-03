/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package preparativoex;

import Banco.Banco_Prepare;
import Model.Pessoa;
import Telas.Tela_Principal;

/**
 *
 * @author lucas
 */
public class Preparativoex {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pessoa pessoa = new Pessoa();
        pessoa.setID(1);
        pessoa.setNome("LucasAntunes");
        pessoa.setIdade(23);
        pessoa.setCPF("081.081.081-80");
        Banco.Banco_Prepare bd = new Banco_Prepare();
        bd.Remover(pessoa);
        System.out.println(" OK");

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_Principal().setVisible(true);
            }
        });
 

    }
    
}
