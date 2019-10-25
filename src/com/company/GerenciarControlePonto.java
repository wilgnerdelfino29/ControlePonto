package com.company;

import java.time.LocalDate;
import java.time.LocalDateTime;

//1
public class GerenciarControlePonto {

    public static void main(String[] args) {
        GerenciarControlePonto g = new GerenciarControlePonto();
        int defIdFunc = 1;
        int defIdRegistro = 1;

        //Cadastro dos funcionarios

        //8 - novo gerente
        Gerente ger1 = new Gerente();
        ger1.setIdFunc(defIdFunc++);
        ger1.setNome("Roberto Magalhães");
        ger1.setEmail("contato@rmagalhaes.com");
        ger1.setDocumento("842742950");
        ger1.setLogin("rmagal");
        ger1.setSenha("123654");

        //9 - nova secretaria
        Secretaria sec1 = new Secretaria();
        sec1.setIdFunc(defIdFunc++);
        sec1.setNome("Ana Julia");
        sec1.setEmail("anajulia.contato@outlook.com");
        sec1.setDocumento("403235145");
        sec1.setRamal("22");
        sec1.setTelefone("38311800");

        //10 - novo operador
        Operador ope1 = new Operador();
        ope1.setIdFunc(defIdFunc++);
        ope1.setNome("Carlos Nascimento");
        ope1.setEmail("carlinhosnsc.02@gmail.com");
        ope1.setDocumento("395893849");
        ope1.setValorHora(30.00);

        //Início de Registros de Entrada e Saída

        //11 - Entrada gerente
        RegistroPonto reg1 = new RegistroPonto();
        reg1.setIdRegPonto(defIdRegistro++);
        reg1.setFunc(ger1);
        reg1.setDataRegistro(LocalDate.now());
        reg1.setHoraEntrada((LocalDateTime.now()));
        reg1.apresentarRegistroPonto();

        g.sleeping();

        //12 - Entrada operador
        RegistroPonto reg2 = new RegistroPonto();
        reg2.setIdRegPonto(defIdRegistro++);
        reg2.setFunc(ope1);
        reg2.setDataRegistro(LocalDate.now());
        reg2.setHoraEntrada((LocalDateTime.now()));
        reg2.apresentarRegistroPonto();

        g.sleeping();

        //13 - Entrada secretaria
        RegistroPonto reg3 = new RegistroPonto();
        reg3.setIdRegPonto(defIdRegistro++);
        reg3.setFunc(sec1);
        reg3.setDataRegistro(LocalDate.now());
        reg3.setHoraEntrada((LocalDateTime.now()));
        reg3.apresentarRegistroPonto();

        g.sleeping();

        //14 - Saída gerente
        RegistroPonto reg4 = new RegistroPonto();
        reg4 = reg1;
        reg4.setHoraSaida((LocalDateTime.now()));
        reg4.apresentarRegistroPonto();

        g.sleeping();

        //15 - Saída operador
        RegistroPonto reg5 = new RegistroPonto();
        reg5 = reg2;
        reg5.setHoraSaida((LocalDateTime.now()));
        reg5.apresentarRegistroPonto();

        g.sleeping();

        //16 - Saída secretaria
        RegistroPonto reg6 = new RegistroPonto();
        reg6 = reg3;
        reg6.setHoraSaida((LocalDateTime.now()));
        reg6.apresentarRegistroPonto();
    }

    public void sleeping(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
