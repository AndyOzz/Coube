public class Main {

    public static void main(String[] args) {
        Encryption enc = new Encryption("Тест!");
        System.out.println("Зашифрованное сообщение: "+enc.getEncText());

        Decryption desc = new Decryption(enc.getEncText());
        System.out.println("Расшированное сообщение: "+desc.getDescText());
    }
}
