/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.maria.junit5.mdc;

/**
 *
 * @author maeh
 */
public class Mdc {
    
    /*
      Há duas formas de determinar o máximo divisor comum de dois números:

      1)A primeira é fatorar os números e a partir daí, pegar os fatores comuns 
       a todos números e deixá-los com o menor expoente que o fator analisado 
       apresentar entre todos os números.
      
      2)A segunda consiste em escrever os dois números, separados por um traço 
        vertical; em seguida, compara-se os números, e em baixo do maior deles 
        coloca-se a diferença entre os dois. Agora compara-se o último número 
        que se escreveu, com o que ficou na outra coluna, repetindo-se o 
        processo até que se obtenha igualdade entre os números nas duas 
        colunas, que é o resultado procurado
     */
    
    public static int segundaFormaCalculoMdc(int num1, int num2){
         while(num1 != num2){
            if(num1 > num2){
                num1 = num1 - num2;
            }else{
                num2 = num2 - num1;
            }
        }
        
        return num1;
    }
    
    public static void main(String[] args) {
        
    }

}
