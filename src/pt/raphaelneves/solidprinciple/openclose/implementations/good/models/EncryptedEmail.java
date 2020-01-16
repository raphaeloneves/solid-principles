package pt.raphaelneves.solidprinciple.openclose.implementations.good.models;

import pt.raphaelneves.solidprinciple.openclose.implementations.good.formatters.IMessageFormatter;

public class EncryptedEmail extends Email {
    public EncryptedEmail(IMessageFormatter formatter) {
        super(formatter);
    }

    @Override
    public void send(String message, String subject) {
        String formatedMessage = formatter.format(message);
        // DO MORE ENCRYPTED EMAIL BASED LOGIC
        // SEND COMMAND
    }
}
