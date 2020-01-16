package pt.raphaelneves.solidprinciple.openclose.implementations.good.models;

import pt.raphaelneves.solidprinciple.openclose.implementations.good.formatters.IMessageFormatter;

public class HtmlEmail extends Email {
    public HtmlEmail(IMessageFormatter formatter) {
        super(formatter);
    }

    @Override
    public void send(String message, String subject) {
        String formatedMessage = formatter.format(message);
        // DO MORE HTML EMAIL BASED LOGIC
        // SEND COMMAND
    }
}
