
package notifikasi;


public class Main {
    public static void main(String[] args) {
        String emailPenerima = "belajarjava.com";
        String nomerHp = "+628111111111";
        String mobileId = "android-123456";

        EmailNotification emailNotif = new EmailNotification();
        SMSNotification smsNotif = new SMSNotification();
        PushNotification pushNotif = new PushNotification();

        String message = "Hubungi gmail : belajarjavamenyenangkan.com";
        
        emailNotif.sendMessage(emailPenerima, message);
        smsNotif.sendMessage(nomerHp, message);
        pushNotif.sendMessage(mobileId, message);
    }
}
