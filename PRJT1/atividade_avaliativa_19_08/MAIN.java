/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividade_avaliativa_19_08;

/**
 *
 * @author Joao Pedro MW
 */
public class MAIN extends Moradia_Abstract {
    public static void main(String[] args) {
        Parede Parede_Quarto = new Parede();
        Parede Parede_Banheiro = new Parede();
        Parede Parede_Cozinha = new Parede();
        Espelho Espelho_Corredor = new Espelho();
        Telha TelhadoAreaExterna = new Telha();
        Telha TelhadoAreaInterna  = new Telha();
        
        Parede_Quarto.setParede_altura(3);
        Parede_Quarto.setParede_largura(6);
        Parede_Quarto.setFuncao_acabamento("Quadrado");
        Parede_Banheiro.setParede_altura(3);
        Parede_Banheiro.setParede_largura(7);
        Parede_Banheiro.setFuncao_acabamento("Bolinha");
        Parede_Cozinha.setParede_altura(3);
        Parede_Cozinha.setParede_largura(4);
        Parede_Cozinha.setFuncao_acabamento("Circulo");
        
        Espelho_Corredor.setEspelho_altura(2);
        Espelho_Corredor.setEspelho_largura(1);
        
        TelhadoAreaInterna.setTipo_telha("Ceramica");
        TelhadoAreaExterna.setTipo_telha("Madeira");
        double Cozinha;
        Cozinha = Parede_Cozinha.getParede_altura() * Parede_Cozinha.getParede_largura();
        double Quarto;
        Quarto = Parede_Quarto.getParede_altura() * Parede_Quarto.getParede_largura();
        double Banheiro;
        Banheiro = Parede_Banheiro.getParede_altura() * Parede_Banheiro.getParede_largura();
        System.out.println(
        "Área da parede da cozinha: " + Cozinha + "\n"+
        "Área da parede do quarto: " + Quarto + "\n"+
        "Área da parede do banheiro: " + Banheiro + "\n" + "\n" +
        "Tela area externa: " + TelhadoAreaExterna.getTipo_telha() + "\n" +
        "Tela area interna: " + TelhadoAreaInterna.getTipo_telha() + "\n" +
        "Tamanho do Espelho: " + Espelho_Corredor.getEspelho_altura()
                * Espelho_Corredor.getEspelho_largura()
        );
        
        
               
        
}
}
