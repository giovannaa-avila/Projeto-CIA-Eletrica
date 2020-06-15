package projetociaeletrica;

import javax.swing.JOptionPane;

public class ProjetoCiaEletrica {
    public static void main(String[] args) {
        
        Conta dados = new Conta();
        
        dados.setLeitAnt(Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da leitura anterior:")));
        dados.setLeitAtual(Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da leitura atual:")));
        
    int quantidade = dados.leitura(dados.getLeitAnt(), dados.getLeitAtual());
    
    double Parcial = dados.cobranca(quantidade, dados.getTusd(), dados.getTe());
    
    dados.setTotal(dados.verificaBandeira(quantidade, Parcial));
    
    dados.Conta(dados.getTotal());
        
    }
    
}
