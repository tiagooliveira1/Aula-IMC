package com.tiago;
import com.opet.util.Reader;

public class IMC
{

    public static void main(String[] args) throws Exception
    {
        // TODO Auto-generated method stub
        System.out.print("Informe a sua altura:");
        double altura = Reader.readDouble();
        System.out.print("Informe seu peso:");
        double peso = Reader.readDouble();
        System.out.print("Informe seu sexo:(M=masculino F=feminino)");
        String sexo = Reader.readString();

        double imc = (int) altura*peso;
        String texto = "";

        if(sexo=="F") {
            if(imc < 20)
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

        System.out.print(texto+"asss");


    }

}
