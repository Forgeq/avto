package com.company;

public class Main {

    public static void main(String[] args) {
        avto avto1 = new avto();
        avto1.setAvto_chek(true);
        avto1.setAvto_name("Toyota");
        avto1.setName("Зубенко Михаил Петрович");
        avto1.setNum_place(23);
        avto1.setPay_chek(true);
        System.out.println("Номер места -> " + avto1.getNum_place());
        System.out.println("ФИО владельца авто ->" + avto1.getName());
        System.out.println("Марка авто ->" + avto1.getAvto_name());
        System.out.println("Отметка о наличии -> " + avto1.getAvto_chek());
        System.out.println("Отметка об оплате -> "  + avto1.getPay_chek());

    }
}

class avto {
    private int num_place;
    private String name;
    private String avto_name;
    private  boolean avto_chek;
    private boolean pay_chek;

    public int getNum_place() {
        return num_place;
    }

    public void setNum_place(int num_place) {
        this.num_place = num_place;
        if(num_place < 0)
            System.out.println("try again");
        else
            this.num_place = num_place;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        if(name.isEmpty())
            System.out.println("try again");
        else
            this.name = name;
    }

    public String getAvto_name() {
        return avto_name;

    }

    public void setAvto_name(String avto_name) {
        this.avto_name = avto_name;
        if(avto_name.isEmpty())
            System.out.println("try again");
        else
            this.avto_name = avto_name;
    }

    public boolean getAvto_chek() {
        return avto_chek;
    }

    public void setAvto_chek(boolean avto_chek) {
        this.avto_chek = avto_chek;
        if(avto_chek)
            this.avto_chek = avto_chek;
        else
            System.out.println("try again");

    }

    public boolean getPay_chek() {
        return pay_chek;
    }

    public void setPay_chek(boolean pay_chek) {
        this.pay_chek = pay_chek;
        if(pay_chek)
            this.pay_chek = pay_chek;
        else
            System.out.println("try again");



    }
}
