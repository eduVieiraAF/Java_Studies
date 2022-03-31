import javax.swing.*;

public class MessageDialog {

    public static void main(String[] args){
        String name = JOptionPane.showInputDialog("Enter your name:");
        JOptionPane.showMessageDialog(null, "Hi " + name.toUpperCase());
        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
        JOptionPane.showMessageDialog(null, "Your name is " + name.toUpperCase() +
                " and you're " + age + " y.o.");

        if (age < 12){
            JOptionPane.showMessageDialog(null, "you're an INFANT");}

        if (age >= 12 && age <= 19){
            JOptionPane.showMessageDialog(null, "You're a teenager and you're a rebel.");}

        if (age > 20 && age <= 45){
            JOptionPane.showMessageDialog(null,
                    "You're (or should be) a hard-working fully developed adult.");}

        if (age > 45 && age < 100){
            JOptionPane.showMessageDialog(null, "GRUMPY OLD FART ALERT!");}

        if (age >=100){
            JOptionPane.showMessageDialog(null, "You're a cursed mummy");
        }
    }
}
