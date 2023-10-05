package com.github.mablinov.bankcardname;

public class Account {
    private final String name;

    public Account(String name) {

        this.name = name;
    }

    public boolean checkNameToEmboss() {
        if (name.length()>=3 & name.length()<=19){
            if (name.equals(name.trim())){
                if(1==name.replaceAll("[^ ]", "").length()){
                    return true;
                }
           }
        }
        return false;
    }

}
/*
             Этот метод должен проверять, что сохранённая через конструктор строка соответствует требованиям.
             Если строка удовлетворяет условиям, метод возвращает true, иначе — false.
         */
