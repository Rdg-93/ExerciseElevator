package br.com.letscode.Application;

import br.com.letscode.Model.Elevador;

public class Main {

    public static void main(String[] args){

        Elevador elevator = new Elevador(5,10);

        elevator.sobe();
        elevator.entraPessoa();
        elevator.entraPessoa();
        elevator.saiPessoa();
        elevator.desce();
        elevator.desce();
        elevator.desce();
        System.out.println(elevator.toString());

    }
}
