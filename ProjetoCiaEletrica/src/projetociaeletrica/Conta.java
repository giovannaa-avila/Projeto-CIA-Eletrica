package projetociaeletrica;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Conta {
    
    public int LeitAnt;
    public int LeitAtual;
    public double tusd= 0.3;
    public double te= 0.29;
    public double total;
    public double ValorParcial;
    public String Bandeira;
    public int difLeitura;
    
       public int leitura (int LeitAnt, int leituraAtual){
           
           int diferenca = leituraAtual - LeitAnt;
           this.setDifLeitura(diferenca);
           return diferenca;
    }
    
    public double cobranca (int quantidade, double tusd, double te){
        
        double CalTe = quantidade * te;
        double CalTusd = quantidade * tusd;
        
        double Parcial = CalTe + CalTusd;
        
        return Parcial;
        
    }
    
    public double verificaBandeira (int quantidade, double Parcial){
        
        double Total;
        
        if (quantidade < 100){
            Total = Parcial; 
            Bandeira = "Bandeira Verde";
                 
        }
        else if (quantidade >= 100 && quantidade < 150){
            Total = (quantidade * 0.013)+ Parcial;
            Bandeira = "Bandeira Amarela";
            
        }
        else if (quantidade >= 150 && quantidade < 200){
            Total = (quantidade * 0.042)+ Parcial;
            Bandeira = "Bandeira Vermelha 1";
           
        }
        else {
            Total = (quantidade * 0.062)+ Parcial;
            Bandeira = "Bandeira Vermelha 2";
            
        } 
        return Total;
        
    }
    
    public void Conta(double total){
        
        DecimalFormat df = new DecimalFormat("#.00");
        
        JOptionPane.showMessageDialog(null,"Cia Elétrica \n"
                + "Consumo Anterior: " + this.getLeitAnt()+ "  \n"
                + "Consumo Atual: " + this.getLeitAtual()+ "  \n"
                + "Quantidade Consumida: " + this.getDifLeitura()+ " \n"
                + "Bandeira: " + this.getBandeira()+ "\n"
                + "Valor Parcial: " + df.format(this.getValorParcial())+ "\n"
                + "Valor Total: " + df.format(this.getTotal()));
        
    }
     
    public int getLeitAnt(){
        return LeitAnt;
    }
    
    public void setLeitAnt(int LeitAnt){
        this.LeitAnt = LeitAnt;
    }
    
    public int getLeitAtual(){
        return LeitAtual;
    }
    
    public void setLeitAtual(int LeitAtual){
        this.LeitAtual = LeitAtual;
    }
    
    public double getTusd(){
        return tusd;
    }
    
    public void setTusd(double tusd){
        this.tusd = tusd;
    }
    
    public double getTe(){
        return te;
    }
    
    public void setTe(double te){
        this.te = tusd;
    }
    
    public double getTotal(){
        return total;
    }
    
    public void setTotal(double total){
        this.total = total;
    }
    
    public double getValorParcial(){
        return ValorParcial;
    }
    
    public void setValorParcial(double ValorParcial){
        this.ValorParcial = ValorParcial;
    }
    
    public String getBandeira(){
        return Bandeira;
    }
    
    public void setBandeira(String Bandeira){
        this.Bandeira = Bandeira;
    }
    
    public int getDifLeitura(){
        return difLeitura;
    }
    
    public void setDifLeitura(int difLeitura){
        this.difLeitura = difLeitura;
    }
    
    
    
}
