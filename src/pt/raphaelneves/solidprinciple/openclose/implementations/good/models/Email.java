package pt.raphaelneves.solidprinciple.openclose.implementations.good.models;

import pt.raphaelneves.solidprinciple.openclose.implementations.good.formatters.IMessageFormatter;

public abstract class Email {

    protected final IMessageFormatter formatter;

    public Email(IMessageFormatter formatter) {
        this.formatter = formatter;
    }

    public abstract void send(String message, String subject);
}
