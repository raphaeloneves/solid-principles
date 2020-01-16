package pt.raphaelneves.solidprinciple.openclose.implementations.good;

import pt.raphaelneves.solidprinciple.openclose.implementations.good.formatters.EncryptedMessageFormatter;
import pt.raphaelneves.solidprinciple.openclose.implementations.good.formatters.HtmlMessageFormatter;
import pt.raphaelneves.solidprinciple.openclose.implementations.good.formatters.TextMessageFormatter;
import pt.raphaelneves.solidprinciple.openclose.implementations.good.models.Email;
import pt.raphaelneves.solidprinciple.openclose.implementations.good.models.EncryptedEmail;
import pt.raphaelneves.solidprinciple.openclose.implementations.good.models.HtmlEmail;
import pt.raphaelneves.solidprinciple.openclose.implementations.good.models.TextEmail;

public class Client {
    public static void main(String[] args) {
        Email textEmail = new TextEmail(new TextMessageFormatter());
        textEmail.send("Hello world",  "This is a text message");

        Email encryptedEmail = new EncryptedEmail(new EncryptedMessageFormatter());
        encryptedEmail.send("Hello world",  "This is an ecrypted message");

        Email htmlEmail = new HtmlEmail(new HtmlMessageFormatter());
        htmlEmail.send("Hello world",  "This is a HTML message");
    }
}
