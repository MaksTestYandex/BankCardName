package com.github.mablinov.bankcardname;

public class Praktikum {


    public static void main(String[] args) {
        String cardHolderName = "Павел Иванов";
        Account account = new Account(cardHolderName);
        Boolean check;
        if (account.checkNameToEmboss()) check = true;
        else check = false;
        System.out.println(check);
        /*
             В этом методе заложи логику работы с классом Account.
             Нужно создать экземпляр класса Account: в качестве аргумента передать тестируемое имя 
             и вызвать метод, который проверяет, можно ли использовать фамилию и имя для печати на банковской карте.
         */
    }

}
