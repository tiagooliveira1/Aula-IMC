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
            /* converte a letra informada para mai�sculo, para conseguir comparar com =="F" ou =="M" */
            sexo = sexo.toUpperCase();
            /* Calcula o IMC */
            double imc = peso / (altura*altura); //(Math.pow(altura, 2) );
            /* Declara uma vari�vel para guardar o texto a ser impresso ao usu�rio */
            String texto = "";

            /* A fun��o compareTo converte as strings em n�mero, e subtrai um pelo outro
             * Se o resultado for 0, ent�o as strings s�o iguais */
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
            /* Se usu�rio informou M */
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
