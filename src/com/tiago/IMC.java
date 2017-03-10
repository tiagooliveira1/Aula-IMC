package com.tiago;
import com.opet.util.Reader;

public class IMC
{

    public static void main(String[] args) throws Exception
    {
        /* este While serve para que o programa se repita infinitamente */
        while(true) {
            System.out.print("Informe a sua altura em metros:");
            double altura = Reader.readDouble();
            System.out.print("Informe seu peso:");
            double peso = Reader.readDouble();
            System.out.print("Informe seu sexo:(M=masculino F=feminino)");
            String sexo = Reader.readString();
            /* converte a letra informada para maiúsculo, para conseguir comparar com =="F" ou =="M" */
            sexo = sexo.toUpperCase();
            /* Calcula o IMC */
            double imc = peso / (altura*altura); //(Math.pow(altura, 2) );
            /* Declara uma variável para guardar o texto a ser impresso ao usuário */
            String texto = "";

            /* A função compareTo converte as strings em número, e subtrai um pelo outro
             * Se o resultado for 0, então as strings são iguais */
            if(sexo.compareTo("F")==0) {
                if(imc < 19)
                  texto = "Abaixo do peso";
                else if(imc <= 25)
                    texto = "Peso normal";
                else if(imc <= 27)
                    texto = "Acima do peso";
                else if(imc <= 32)
                    texto = "Obesidade I";
                else
                    texto = "Obesidade II";
            }
            /* Se usuário informou M */
            if(sexo.compareTo("M")==0) {
                if(imc < 20)
                    texto = "Abaixo do peso";
                  else if(imc <= 26)
                      texto = "Peso normal";
                  else if(imc <= 27)
                      texto = "Acima do peso";
                  else if(imc <= 31)
                      texto = "Obesidade I";
                  else
                      texto = "Obesidade II";
            }
            System.out.println("Seu IMC:"+ Math.round(imc)+" - "+texto);
        }
    }

}
