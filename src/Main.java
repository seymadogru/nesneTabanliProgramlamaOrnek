public class Main {
    public static void main(String[] args){
        int[] numbers1 = {12, 13, 14};
        int[] numbers2 = {25, 26, 27};
        numbers1 = numbers2;
        numbers2[0]=50;
        System.out.println("numbers1'in 0. indexi şudur; "+numbers1[0]);

        int sayi1 =10;
        int sayi2 =20;
        sayi1=sayi2;
        sayi2= 30;
        System.out.println("sayi1'in değeri şudur; "+sayi1);

        System.out.println("-------------------------------------------------------------");


        CustomerManager customerManager1 = new CustomerManager(new Customer(), new MilitaryCreditManager());
        customerManager1.giveCredit();
    }
}



