/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package br.comparattionstring;

/**
 *
 * @author Marce
 */
public class ComparattionString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nome1 =("teste");
        String nome2 =("teste");
        String nome3 = new String("teste");
        
        String resu1 = nome1 == nome2 ? "igual" : "diferente";
        System.out.println(resu1); // resultado é IGUAL
        
        String resu2 = nome1 == nome3 ? "igual" : "Diferente";
        System.out.println(resu2); // reusltado é DIFERENTE / nao deu certo /estrutura diferente / conteudo igual

        String resu3 = nome1.equals(nome3) ? "igual" : "diferente";
        System.out.println(resu3); // .equals e utilizado para verificar objeto estanciado/estruturas diferenets
    }
    
}
