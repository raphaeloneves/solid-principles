package pt.raphaelneves.solidprinciple.openclose.implementations.good.models;

import pt.raphaelneves.solidprinciple.openclose.implementations.good.formatters.IMessageFormatter;

public class TextEmail extends Email {

    public TextEmail(IMessageFormatter formatter) {
        super(formatter);
    }

    @Override
    public void send(String message, String subject) {
        String formatedMessage = formatter.format(message);
        // DO MORE TEXT EMAIL BASED LOGIC
        // SEND COMMAND
    }
}
