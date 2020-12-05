import java.util.Map;

public class Main {

    public static void main(String[] args)
    {
        System.out.println("Hello World!");
        Cesar cipher = new Cesar();
        StringBuilder cipherMessage = cipher.cipher("srobdoskdehwf vxewlwxwlrq flskhuv", 23);
        System.out.println("Шифр = srobdoskdehwf vxewlwxwlrq flskhuv " + " Перевод = " + cipherMessage);

        Map<Character,Character> map = SimpleChange.getKey(cipherMessage.toString(),"KjgyVgkcVWZqdX nsWnqdqsqdji XdkcZmn");
        System.out.println(map);

        StringBuilder fio = cipher.cipher("Shemberov Vladimir", 1);
        System.out.println("shemberov vladimir = "+ fio);
        StringBuilder cipherfio = cipher.cipher(fio.toString(), 25);
        System.out.println(cipherfio);
    }
}
